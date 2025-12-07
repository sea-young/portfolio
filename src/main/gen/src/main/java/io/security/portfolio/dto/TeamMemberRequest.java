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
 * TeamMemberRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class TeamMemberRequest {

  private Long userId;

  private String roleInTeam;

  public TeamMemberRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TeamMemberRequest(Long userId, String roleInTeam) {
    this.userId = userId;
    this.roleInTeam = roleInTeam;
  }

  public TeamMemberRequest userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @NotNull 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public TeamMemberRequest roleInTeam(String roleInTeam) {
    this.roleInTeam = roleInTeam;
    return this;
  }

  /**
   * OWNER, MANAGER, MEMBER
   * @return roleInTeam
   */
  @NotNull 
  @Schema(name = "roleInTeam", description = "OWNER, MANAGER, MEMBER", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roleInTeam")
  public String getRoleInTeam() {
    return roleInTeam;
  }

  public void setRoleInTeam(String roleInTeam) {
    this.roleInTeam = roleInTeam;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMemberRequest teamMemberRequest = (TeamMemberRequest) o;
    return Objects.equals(this.userId, teamMemberRequest.userId) &&
        Objects.equals(this.roleInTeam, teamMemberRequest.roleInTeam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, roleInTeam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMemberRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roleInTeam: ").append(toIndentedString(roleInTeam)).append("\n");
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

