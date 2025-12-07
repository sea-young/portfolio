package io.security.portfolio.api.document;

import io.security.portfolio.domain.document.Document.Classification;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DocumentRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotNull
    private Long ownerTeamId;

    @NotNull
    private Classification classification;
}