package io.security.portfolio.domain.team;

import io.security.portfolio.domain.BaseTimeEntity;
import io.security.portfolio.domain.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "team_members")
@IdClass(TeamMember.TeamMemberId.class)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TeamMember {

    // BaseTimeEntity를 상속받거나 별도 created_at 필드 선언 (ERD에는 created_at만 있음)
    @Column(name = "created_at", nullable = false, updatable = false)
    private java.time.LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = java.time.LocalDateTime.now();
    }

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_in_team", nullable = false, length = 20)
    private TeamRole roleInTeam; // OWNER, MANAGER, MEMBER

    public enum TeamRole {
        OWNER, MANAGER, MEMBER
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TeamMemberId implements Serializable {
        private Long team;
        private Long user;
    }
}