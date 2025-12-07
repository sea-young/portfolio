package io.security.portfolio.domain.document;

import io.security.portfolio.api.document.DocumentRequest;
import io.security.portfolio.common.exception.ApiException;
import io.security.portfolio.common.util.SecurityUtils;
import io.security.portfolio.domain.team.Team;
import io.security.portfolio.domain.team.TeamRepository;
import io.security.portfolio.domain.user.User;
import io.security.portfolio.security.policy.AuthorizationContext;
import io.security.portfolio.security.policy.AuthorizationDecision;
import io.security.portfolio.security.policy.PolicyEngine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DocumentService {

    private final DocumentRepository documentRepository;
    private final TeamRepository teamRepository;
    private final PolicyEngine policyEngine;
    private final SecurityUtils securityUtils;

    /**
     * 문서 상세 조회 (Policy Engine 적용)
     */
    public Document getDocument(Long documentId) {
        // 1. 문서 조회
        Document document = documentRepository.findById(documentId)
                .orElseThrow(() -> new ApiException(HttpStatus.NOT_FOUND, "문서를 찾을 수 없습니다."));

        // 2. 현재 사용자 가져오기
        User currentUser = securityUtils.getCurrentUser();

        // 3. 인가 컨텍스트(Context) 생성
        AuthorizationContext context = AuthorizationContext.builder()
                .user(currentUser)
                .resourceType("DOCUMENT")
                .resourceId(document.getId())
                .action("document:read") // "읽기" 액션
                .build();

        // 4. 정책 엔진 평가 (Evaluate)
        AuthorizationDecision decision = policyEngine.evaluate(context);

        // 5. 결과 처리
        if (decision.getDecision() == AuthorizationDecision.Decision.DENY) {
            throw new ApiException(HttpStatus.FORBIDDEN, "접근 거부: " + decision.getReason());
        }

        // PERMIT이거나 ABSTAIN(기본 정책에 따라 허용할지 말지 결정, 여기서는 ABSTAIN도 DENY로 처리했었음)
        // PolicyEngine.evaluate() 메서드 내부 로직에 따라 ABSTAIN 시 DENY를 리턴하도록 되어 있다면 위에서 걸러짐.

        return document;
    }

    /**
     * 문서 생성
     */
    @Transactional
    public Document createDocument(DocumentRequest request) {
        User currentUser = securityUtils.getCurrentUser();

        Team ownerTeam = teamRepository.findById(request.getOwnerTeamId())
                .orElseThrow(() -> new ApiException(HttpStatus.BAD_REQUEST, "존재하지 않는 팀입니다."));

        // TODO: 사용자가 해당 팀에 속해 있는지, 문서를 생성할 권한이 있는지 등 추가 검증 가능
        // AuthorizationContext createCheck = ... (document:create)

        Document document = Document.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .ownerTeam(ownerTeam)
                .author(currentUser)
                .classification(request.getClassification())
                .build();

        return documentRepository.save(document);
    }
}