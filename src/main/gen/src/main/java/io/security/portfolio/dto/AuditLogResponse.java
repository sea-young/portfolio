package io.security.portfolio.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AuditLogResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class AuditLogResponse {

  private Long id;

  private Long actorId;

  private String action;

  private String resourceType;

  private Long resourceId;

  private String decision;

  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private JsonNullable<Object> extra = JsonNullable.<Object>undefined();

  public AuditLogResponse id(Long id) {
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

  public AuditLogResponse actorId(Long actorId) {
    this.actorId = actorId;
    return this;
  }

  /**
   * Get actorId
   * @return actorId
   */
  
  @Schema(name = "actorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actorId")
  public Long getActorId() {
    return actorId;
  }

  public void setActorId(Long actorId) {
    this.actorId = actorId;
  }

  public AuditLogResponse action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public AuditLogResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * DOCUMENT, TEAM, USER 등
   * @return resourceType
   */
  
  @Schema(name = "resourceType", description = "DOCUMENT, TEAM, USER 등", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public AuditLogResponse resourceId(Long resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
   */
  
  @Schema(name = "resourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public Long getResourceId() {
    return resourceId;
  }

  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }

  public AuditLogResponse decision(String decision) {
    this.decision = decision;
    return this;
  }

  /**
   * PERMIT, DENY
   * @return decision
   */
  
  @Schema(name = "decision", description = "PERMIT, DENY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decision")
  public String getDecision() {
    return decision;
  }

  public void setDecision(String decision) {
    this.decision = decision;
  }

  public AuditLogResponse reason(String reason) {
    this.reason = JsonNullable.of(reason);
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public JsonNullable<String> getReason() {
    return reason;
  }

  public void setReason(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public AuditLogResponse createdAt(OffsetDateTime createdAt) {
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

  public AuditLogResponse extra(Object extra) {
    this.extra = JsonNullable.of(extra);
    return this;
  }

  /**
   * 추가 컨텍스트/정책 평가 결과(JSON)
   * @return extra
   */
  
  @Schema(name = "extra", description = "추가 컨텍스트/정책 평가 결과(JSON)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra")
  public JsonNullable<Object> getExtra() {
    return extra;
  }

  public void setExtra(JsonNullable<Object> extra) {
    this.extra = extra;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogResponse auditLogResponse = (AuditLogResponse) o;
    return Objects.equals(this.id, auditLogResponse.id) &&
        Objects.equals(this.actorId, auditLogResponse.actorId) &&
        Objects.equals(this.action, auditLogResponse.action) &&
        Objects.equals(this.resourceType, auditLogResponse.resourceType) &&
        Objects.equals(this.resourceId, auditLogResponse.resourceId) &&
        Objects.equals(this.decision, auditLogResponse.decision) &&
        equalsNullable(this.reason, auditLogResponse.reason) &&
        Objects.equals(this.createdAt, auditLogResponse.createdAt) &&
        equalsNullable(this.extra, auditLogResponse.extra);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actorId, action, resourceType, resourceId, decision, hashCodeNullable(reason), createdAt, hashCodeNullable(extra));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

