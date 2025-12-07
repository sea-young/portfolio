package io.security.portfolio.domain.role;

import io.security.portfolio.domain.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "user_roles")
@IdClass(UserRole.UserRoleId.class) // 복합키 클래스 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserRole {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    // 복합키 식별자 클래스
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserRoleId implements Serializable {
        private Long user; // 엔티티 필드명과 일치해야 함
        private Long role;
    }

    @Builder
    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }
}