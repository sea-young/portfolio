package io.security.portfolio.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DocumentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class DocumentRequest {

  private String title;

  private String content;

  private Long ownerTeamId;

  private String classification;

  public DocumentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DocumentRequest(String title, String content, Long ownerTeamId, String classification) {
    this.title = title;
    this.content = content;
    this.ownerTeamId = ownerTeamId;
    this.classification = classification;
  }

  public DocumentRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DocumentRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @NotNull 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public DocumentRequest ownerTeamId(Long ownerTeamId) {
    this.ownerTeamId = ownerTeamId;
    return this;
  }

  /**
   * 문서 소유 팀 ID
   * @return ownerTeamId
   */
  @NotNull 
  @Schema(name = "ownerTeamId", description = "문서 소유 팀 ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ownerTeamId")
  public Long getOwnerTeamId() {
    return ownerTeamId;
  }

  public void setOwnerTeamId(Long ownerTeamId) {
    this.ownerTeamId = ownerTeamId;
  }

  public DocumentRequest classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * PUBLIC, INTERNAL, CONFIDENTIAL, SECRET
   * @return classification
   */
  @NotNull 
  @Schema(name = "classification", description = "PUBLIC, INTERNAL, CONFIDENTIAL, SECRET", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("classification")
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentRequest documentRequest = (DocumentRequest) o;
    return Objects.equals(this.title, documentRequest.title) &&
        Objects.equals(this.content, documentRequest.content) &&
        Objects.equals(this.ownerTeamId, documentRequest.ownerTeamId) &&
        Objects.equals(this.classification, documentRequest.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, content, ownerTeamId, classification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    ownerTeamId: ").append(toIndentedString(ownerTeamId)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

