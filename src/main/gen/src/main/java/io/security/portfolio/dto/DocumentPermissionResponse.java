package io.security.portfolio.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DocumentPermissionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class DocumentPermissionResponse {

  private Long id;

  private Long documentId;

  private String granteeType;

  private Long granteeId;

  private String action;

  private String effect;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public DocumentPermissionResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DocumentPermissionResponse documentId(Long documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * @return documentId
   */
  
  @Schema(name = "documentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentId")
  public Long getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Long documentId) {
    this.documentId = documentId;
  }

  public DocumentPermissionResponse granteeType(String granteeType) {
    this.granteeType = granteeType;
    return this;
  }

  /**
   * USER, TEAM, ROLE
   * @return granteeType
   */
  
  @Schema(name = "granteeType", description = "USER, TEAM, ROLE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granteeType")
  public String getGranteeType() {
    return granteeType;
  }

  public void setGranteeType(String granteeType) {
    this.granteeType = granteeType;
  }

  public DocumentPermissionResponse granteeId(Long granteeId) {
    this.granteeId = granteeId;
    return this;
  }

  /**
   * Get granteeId
   * @return granteeId
   */
  
  @Schema(name = "granteeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granteeId")
  public Long getGranteeId() {
    return granteeId;
  }

  public void setGranteeId(Long granteeId) {
    this.granteeId = granteeId;
  }

  public DocumentPermissionResponse action(String action) {
    this.action = action;
    return this;
  }

  /**
   * 예: document:read, document:write
   * @return action
   */
  
  @Schema(name = "action", description = "예: document:read, document:write", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DocumentPermissionResponse effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * PERMIT 또는 DENY
   * @return effect
   */
  
  @Schema(name = "effect", description = "PERMIT 또는 DENY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public DocumentPermissionResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @Valid 
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPermissionResponse documentPermissionResponse = (DocumentPermissionResponse) o;
    return Objects.equals(this.id, documentPermissionResponse.id) &&
        Objects.equals(this.documentId, documentPermissionResponse.documentId) &&
        Objects.equals(this.granteeType, documentPermissionResponse.granteeType) &&
        Objects.equals(this.granteeId, documentPermissionResponse.granteeId) &&
        Objects.equals(this.action, documentPermissionResponse.action) &&
        Objects.equals(this.effect, documentPermissionResponse.effect) &&
        Objects.equals(this.createdAt, documentPermissionResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentId, granteeType, granteeId, action, effect, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPermissionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    granteeType: ").append(toIndentedString(granteeType)).append("\n");
    sb.append("    granteeId: ").append(toIndentedString(granteeId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

