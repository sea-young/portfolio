package io.security.portfolio.security.policy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class PolicyEngine {

    private final List<Policy> policies; // 등록된 모든 Policy 구현체들이 주입됨

    public AuthorizationDecision evaluate(AuthorizationContext context) {
        // 1. 등록된 정책들을 순회
        for (Policy policy : policies) {
            if (policy.supports(context.getResourceType(), context.getAction())) {
                AuthorizationDecision result = policy.check(context);

                // 2. 명시적 PERMIT이나 DENY가 나오면 즉시 반환 (우선순위 전략)
                // 전략은 상황에 따라 다를 수 있음 (여기서는 First-Applicable Wins 전략 사용)
                if (result.getDecision() == AuthorizationDecision.Decision.PERMIT) {
                    log.info("Access GRANTED by policy: {} reason: {}", policy.getClass().getSimpleName(), result.getReason());
                    return result;
                }

                if (result.getDecision() == AuthorizationDecision.Decision.DENY) {
                    log.info("Access DENIED by policy: {} reason: {}", policy.getClass().getSimpleName(), result.getReason());
                    return result;
                }

                // ABSTAIN이면 다음 정책으로 넘어감
            }
        }

        // 3. 모든 정책이 ABSTAIN이면 기본적으로 거부 (Default Deny)
        return AuthorizationDecision.deny("No applicable policy found (Default Deny)");
    }
}