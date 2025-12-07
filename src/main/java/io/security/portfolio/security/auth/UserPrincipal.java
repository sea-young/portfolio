package io.security.portfolio.security.auth;

import io.security.portfolio.domain.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Getter
@RequiredArgsConstructor
public class UserPrincipal implements UserDetails {

    private final User user; // 우리의 도메인 User 객체를 품고 있음

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 실제로는 UserRole 테이블을 조회해서 권한을 채워야 함.
        // 여기서는 임시로 기본 권한 부여
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return ""; // 비밀번호는 DB에 저장된 해시값을 반환해야 하지만, 현재 예제에서는 생략
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }
}