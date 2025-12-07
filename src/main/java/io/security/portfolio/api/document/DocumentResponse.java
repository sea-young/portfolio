package io.security.portfolio.api.document;

import io.security.portfolio.domain.document.Document;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class DocumentResponse {
    private Long id;
    private String title;
    private String content;
    private Long ownerTeamId;
    private Long authorId;
    private Document.Classification classification;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static DocumentResponse from(Document document) {
        return DocumentResponse.builder()
                .id(document.getId())
                .title(document.getTitle())
                .content(document.getContent())
                .ownerTeamId(document.getOwnerTeam().getId())
                .authorId(document.getAuthor().getId())
                .classification(document.getClassification())
                .createdAt(document.getCreatedAt())
                .updatedAt(document.getUpdatedAt())
                .build();
    }
}