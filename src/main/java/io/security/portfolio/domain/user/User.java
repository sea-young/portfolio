package io.security.portfolio.domain.user;

import io.security.portfolio.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "username", "email"})
public class User extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String username;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(length = 100)
    private String department;

    @Column(name = "job_level", length = 50)
    private String jobLevel;

    // 1~5, 클수록 민감. null 불가(기본값 처리 필요)
    @Column(name = "security_grade", nullable = false)
    private Integer securityGrade;

    // 생성자, 빌더 등...
    @Builder
    public User(String username, String email, Integer securityGrade) {
        this.username = username;
        this.email = email;
        this.securityGrade = securityGrade != null ? securityGrade : 1;
    }
}