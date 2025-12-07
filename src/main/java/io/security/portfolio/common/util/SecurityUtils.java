package io.security.portfolio.common.util;

import io.security.portfolio.common.exception.ApiException;
import io.security.portfolio.domain.user.User;
import io.security.portfolio.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecurityUtils {

    private final UserRepository userRepository;

    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated() || authentication.getPrincipal().equals("anonymousUser")) {
            throw new ApiException(HttpStatus.UNAUTHORIZED, "로그인이 필요합니다.");
        }

        // 실제로는 UserPrincipal에서 ID를 꺼내 DB 조회를 최소화할 수도 있지만,
        // 여기서는 안전하게 username으로 DB에서 User 엔티티를 다시 조회합니다.
        String username = authentication.getName();
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new ApiException(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."));
    }
}