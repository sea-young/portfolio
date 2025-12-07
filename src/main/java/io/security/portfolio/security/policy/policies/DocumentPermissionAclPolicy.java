package io.security.portfolio.security.policy.policies;

import io.security.portfolio.domain.documentpermission.DocumentPermission;
import io.security.portfolio.domain.documentpermission.DocumentPermissionRepository;
import io.security.portfolio.domain.user.User;
import io.security.portfolio.security.policy.AuthorizationContext;
import io.security.portfolio.security.policy.AuthorizationDecision;
import io.security.portfolio.security.policy.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(3) // 가장 마지막에 구체적인 ACL 확인
@RequiredArgsConstructor
public class DocumentPermissionAclPolicy implements Policy {

    private final DocumentPermissionRepository permissionRepository;

    @Override
    public boolean supports(String resourceType, String action) {
        return "DOCUMENT".equalsIgnoreCase(resourceType);
    }

    @Override
    public AuthorizationDecision check(AuthorizationContext context) {
        User user = context.getUser();
        Long docId = context.getResourceId();
        String action = context.getAction();

        // 1. 해당 문서+액션에 대한 모든 권한 규칙 조회
        List<DocumentPermission> permissions = permissionRepository.findByDocumentIdAndAction(docId, action);

        for (DocumentPermission perm : permissions) {
            boolean isMatch = false;

            // Grantee 확인 (USER, TEAM, ROLE)
            switch (perm.getGranteeType()) {
                case USER:
                    if (perm.getGranteeId().equals(user.getId())) isMatch = true;
                    break;
                case TEAM:
                    // TODO: User가 해당 Team에 속해있는지 확인 (TeamMemberRepo 필요)
                    // 지금은 생략하거나 별도 서비스 호출 필요
                    break;
                case ROLE:
                    // TODO: User가 해당 Role(Global)을 가지고 있는지 확인
                    break;
            }

            if (isMatch) {
                if (perm.getEffect() == DocumentPermission.Effect.DENY) {
                    return AuthorizationDecision.deny("Explicitly DENIED by ACL");
                }
                if (perm.getEffect() == DocumentPermission.Effect.PERMIT) {
                    return AuthorizationDecision.permit("Explicitly PERMITTED by ACL");
                }
            }
        }

        return AuthorizationDecision.abstain(); // 매칭되는 ACL이 없으면 보류
    }
}