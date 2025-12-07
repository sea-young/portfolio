package io.security.portfolio.domain.documentpermission;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DocumentPermissionRepository extends JpaRepository<DocumentPermission, Long> {

    // DocumentPermissionAclPolicy에서 사용
    // 문서 ID와 액션(read/write)에 해당하는 모든 권한 규칙 조회
    List<DocumentPermission> findByDocumentIdAndAction(Long documentId, String action);
}