package io.security.portfolio.security.policy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AuthorizationDecision {

    public enum Decision {
        PERMIT, DENY, ABSTAIN // ABSTAIN: 나는 관여 안 함 (판단 보류)
    }

    private final Decision decision;
    private final String reason;

    public static AuthorizationDecision permit(String reason) {
        return new AuthorizationDecision(Decision.PERMIT, reason);
    }

    public static AuthorizationDecision deny(String reason) {
        return new AuthorizationDecision(Decision.DENY, reason);
    }

    public static AuthorizationDecision abstain() {
        return new AuthorizationDecision(Decision.ABSTAIN, null);
    }
}