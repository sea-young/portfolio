package io.security.portfolio.domain.team;

import org.springframework.data.jpa.repository.JpaRepository;

// 복합키 타입(TeamMember.TeamMemberId) 명시
public interface TeamMemberRepository extends JpaRepository<TeamMember, TeamMember.TeamMemberId> {

    // 추후 TeamMemberCanReadTeamDocumentPolicy 등에서 사용 가능
    boolean existsByTeamIdAndUserId(Long teamId, Long userId);
}