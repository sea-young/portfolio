package io.security.portfolio.security.policy;

public interface Policy {
    /**
     * 이 정책이 해당 리소스와 액션에 대해 판단을 내릴 수 있는지 확인
     */
    boolean supports(String resourceType, String action);

    /**
     * 실제 권한 검사 수행
     */
    AuthorizationDecision check(AuthorizationContext context);
}
