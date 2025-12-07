package io.security.portfolio.security.policy;


import io.security.portfolio.domain.user.User;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthorizationContext {
    private final User user;            // 요청한 사용자
    private final String resourceType;  // 대상 리소스 타입 (예: "DOCUMENT")
    private final Long resourceId;      // 대상 리소스 ID
    private final String action;        // 하려는 행동 (예: "document:read")
}