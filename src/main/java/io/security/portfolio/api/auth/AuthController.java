package io.security.portfolio.api.auth;

import io.security.portfolio.common.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    // TODO: AuthService 구현 후 주입 필요
    // private final AuthService authService;

    @PostMapping("/login")
    public ApiResponse<TokenResponse> login(@RequestBody LoginRequest request) {
        // TokenResponse token = authService.login(request);
        // return ApiResponse.success(token);
        return ApiResponse.success(null); // 임시 반환
    }

    @PostMapping("/refresh")
    public ApiResponse<TokenResponse> refresh(@RequestBody RefreshTokenRequest request) {
        // TokenResponse token = authService.refresh(request.getRefreshToken());
        // return ApiResponse.success(token);
        return ApiResponse.success(null);
    }

    // RefreshTokenRequest DTO는 간단하므로 Inner Class로 정의하거나 별도 파일로 분리 가능
    @lombok.Data
    static class RefreshTokenRequest {
        private String refreshToken;
    }
}