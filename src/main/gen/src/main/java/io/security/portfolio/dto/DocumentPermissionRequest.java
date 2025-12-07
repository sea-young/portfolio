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
 * DocumentPermissionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class DocumentPermissionRequest {

  private String granteeType;

  private Long granteeId;

  private String action;

  private String effect;

  public DocumentPermissionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DocumentPermissionRequest(String granteeType, Long granteeId, String action, String effect) {
    this.granteeType = granteeType;
    this.granteeId = granteeId;
    this.action = action;
    this.effect = effect;
  }

  public DocumentPermissionRequest granteeType(String granteeType) {
    this.granteeType = granteeType;
    return this;
  }

  /**
   * USER, TEAM, ROLE
   * @return granteeType
   */
  @NotNull 
  @Schema(name = "granteeType", description = "USER, TEAM, ROLE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("granteeType")
  public String getGranteeType() {
    return granteeType;
  }

  public void setGranteeType(String granteeType) {
    this.granteeType = granteeType;
  }

  public DocumentPermissionRequest granteeId(Long granteeId) {
    this.granteeId = granteeId;
    return this;
  }

  /**
   * Get granteeId
   * @return granteeId
   */
  @NotNull 
  @Schema(name = "granteeId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("granteeId")
  public Long getGranteeId() {
    return granteeId;
  }

  public void setGranteeId(Long granteeId) {
    this.granteeId = granteeId;
  }

  public DocumentPermissionRequest action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @NotNull 
  @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DocumentPermissionRequest effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * PERMIT 또는 DENY
   * @return effect
   */
  @NotNull 
  @Schema(name = "effect", description = "PERMIT 또는 DENY", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPermissionRequest documentPermissionRequest = (DocumentPermissionRequest) o;
    return Objects.equals(this.granteeType, documentPermissionRequest.granteeType) &&
        Objects.equals(this.granteeId, documentPermissionRequest.granteeId) &&
        Objects.equals(this.action, documentPermissionRequest.action) &&
        Objects.equals(this.effect, documentPermissionRequest.effect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granteeType, granteeId, action, effect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPermissionRequest {\n");
    sb.append("    granteeType: ").append(toIndentedString(granteeType)).append("\n");
    sb.append("    granteeId: ").append(toIndentedString(granteeId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

