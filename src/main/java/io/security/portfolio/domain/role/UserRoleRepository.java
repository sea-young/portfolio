package io.security.portfolio.domain.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// 복합키 타입(UserRole.UserRoleId) 명시
public interface UserRoleRepository extends JpaRepository<UserRole, UserRole.UserRoleId> {

    // SystemAdminBypassPolicy에서 사용
    @Query("SELECT CASE WHEN COUNT(ur) > 0 THEN true ELSE false END " +
            "FROM UserRole ur JOIN ur.role r " +
            "WHERE ur.user.id = :userId AND r.name = :roleName")
    boolean existsByUserIdAndRoleName(@Param("userId") Long userId, @Param("roleName") String roleName);
}
