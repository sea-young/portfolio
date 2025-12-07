package io.security.portfolio.security.policy.policies;


import io.security.portfolio.domain.role.UserRole;
import io.security.portfolio.domain.user.User;
import io.security.portfolio.domain.role.UserRoleRepository; // Repo 필요
import io.security.portfolio.security.policy.AuthorizationContext;
import io.security.portfolio.security.policy.AuthorizationDecision;
import io.security.portfolio.security.policy.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // 가장 먼저 실행되어야 함
@RequiredArgsConstructor
public class SystemAdminBypassPolicy implements Policy {

    private final UserRoleRepository userRoleRepository;

    @Override
    public boolean supports(String resourceType, String action) {
        return true; // 모든 요청에 대해 검사
    }

    @Override
    public AuthorizationDecision check(AuthorizationContext context) {
        User user = context.getUser();

        // 실제로는 User 엔티티 조회 시 fetch join으로 Role을 가져오거나, 여기서 조회
        boolean isAdmin = userRoleRepository.existsByUserIdAndRoleName(user.getId(), "SYSTEM_ADMIN");

        if (isAdmin) {
            return AuthorizationDecision.permit("User is SYSTEM_ADMIN");
        }

        return AuthorizationDecision.abstain(); // 관리자가 아니면 다음 정책에게 넘김
    }
}