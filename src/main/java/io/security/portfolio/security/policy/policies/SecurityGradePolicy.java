package io.security.portfolio.security.policy.policies;

import io.security.portfolio.domain.document.Document;
import io.security.portfolio.domain.document.DocumentRepository;
import io.security.portfolio.security.policy.AuthorizationContext;
import io.security.portfolio.security.policy.AuthorizationDecision;
import io.security.portfolio.security.policy.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2) // 관리자 체크 다음으로 실행
@RequiredArgsConstructor
public class SecurityGradePolicy implements Policy {

    private final DocumentRepository documentRepository;

    @Override
    public boolean supports(String resourceType, String action) {
        return "DOCUMENT".equalsIgnoreCase(resourceType);
    }

    @Override
    public AuthorizationDecision check(AuthorizationContext context) {
        // 리소스 ID로 문서 조회
        Document document = documentRepository.findById(context.getResourceId())
                .orElse(null);

        if (document == null) {
            return AuthorizationDecision.deny("Document not found");
        }

        int userGrade = context.getUser().getSecurityGrade();
        int docGrade = getDocumentGrade(document.getClassification());

        if (userGrade < docGrade) {
            return AuthorizationDecision.deny("Security grade insufficient (User: " + userGrade + ", Doc: " + docGrade + ")");
        }

        // 등급이 충분하다고 해서 바로 PERMIT은 아님 (다른 ACL 정책도 통과해야 함)
        // 하지만 여기서는 "등급 미달이면 즉시 DENY"가 핵심이므로, 통과 시 ABSTAIN으로 넘깁니다.
        return AuthorizationDecision.abstain();
    }

    private int getDocumentGrade(Document.Classification classification) {
        return switch (classification) {
            case PUBLIC -> 1;
            case INTERNAL -> 2;
            case CONFIDENTIAL -> 3;
            case SECRET -> 4;
        };
    }
}