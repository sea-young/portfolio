package io.security.portfolio.domain.audit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "audit_logs", indexes = {
        @Index(name = "idx_actor_time", columnList = "actor_id, created_at"),
        @Index(name = "idx_resource_time", columnList = "resource_type, resource_id, created_at")
})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class AuditLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "actor_id", nullable = false)
    private Long actorId;

    @Column(nullable = false, length = 100)
    private String action;

    @Column(name = "resource_type", nullable = false, length = 50)
    private String resourceType; // DOCUMENT, TEAM ...

    @Column(name = "resource_id", nullable = false)
    private Long resourceId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private Decision decision;

    @Column(length = 255)
    private String reason;

    // JSON 변환 컨버터 적용
    @Convert(converter = MapToJsonConverter.class)
    @Column(columnDefinition = "json") // DB가 MySQL/PGSQL이면 json 타입, 아니면 text
    private Map<String, Object> extra;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public enum Decision {
        PERMIT, DENY
    }

    // --- JSON Converter (Inner Class or separate file) ---
    @Converter
    public static class MapToJsonConverter implements AttributeConverter<Map<String, Object>, String> {
        private static final ObjectMapper objectMapper = new ObjectMapper();

        @Override
        public String convertToDatabaseColumn(Map<String, Object> attribute) {
            if (attribute == null) return null;
            try {
                return objectMapper.writeValueAsString(attribute);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("JSON writing error", e);
            }
        }

        @Override
        public Map<String, Object> convertToEntityAttribute(String dbData) {
            if (dbData == null || dbData.isEmpty()) return null;
            try {
                return objectMapper.readValue(dbData, Map.class);
            } catch (IOException e) {
                throw new RuntimeException("JSON reading error", e);
            }
        }
    }
}