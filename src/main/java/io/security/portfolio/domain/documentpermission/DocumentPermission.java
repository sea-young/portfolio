package io.security.portfolio.domain.documentpermission;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "document_permissions", indexes = {
        @Index(name = "idx_doc_id", columnList = "document_id"),
        @Index(name = "idx_grantee", columnList = "grantee_type, grantee_id"),
        @Index(name = "idx_doc_action", columnList = "document_id, action")
})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class DocumentPermission {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "document_id", nullable = false)
    private Long documentId;
    // 매핑 편의상 객체(@ManyToOne) 대신 ID로 들고 있어도 무방합니다. (ACL 조회 성능 고려)
    // 여기서는 ID 참조로 구현하여 결합도를 낮추는 방식을 택했습니다.

    @Enumerated(EnumType.STRING)
    @Column(name = "grantee_type", nullable = false, length = 20)
    private GranteeType granteeType;

    @Column(name = "grantee_id", nullable = false)
    private Long granteeId;

    @Column(nullable = false, length = 100)
    private String action; // "document:read", "document:write"

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private Effect effect; // PERMIT, DENY

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public enum GranteeType {
        USER, TEAM, ROLE
    }

    public enum Effect {
        PERMIT, DENY
    }
}
