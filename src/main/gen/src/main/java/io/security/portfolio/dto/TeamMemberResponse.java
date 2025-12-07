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
 * TeamMemberResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class TeamMemberResponse {

  private Long teamId;

  private Long userId;

  private String roleInTeam;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public TeamMemberResponse teamId(Long teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   */
  
  @Schema(name = "teamId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teamId")
  public Long getTeamId() {
    return teamId;
  }

  public void setTeamId(Long teamId) {
    this.teamId = teamId;
  }

  public TeamMemberResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public TeamMemberResponse roleInTeam(String roleInTeam) {
    this.roleInTeam = roleInTeam;
    return this;
  }

  /**
   * OWNER, MANAGER, MEMBER
   * @return roleInTeam
   */
  
  @Schema(name = "roleInTeam", description = "OWNER, MANAGER, MEMBER", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleInTeam")
  public String getRoleInTeam() {
    return roleInTeam;
  }

  public void setRoleInTeam(String roleInTeam) {
    this.roleInTeam = roleInTeam;
  }

  public TeamMemberResponse createdAt(OffsetDateTime createdAt) {
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
    TeamMemberResponse teamMemberResponse = (TeamMemberResponse) o;
    return Objects.equals(this.teamId, teamMemberResponse.teamId) &&
        Objects.equals(this.userId, teamMemberResponse.userId) &&
        Objects.equals(this.roleInTeam, teamMemberResponse.roleInTeam) &&
        Objects.equals(this.createdAt, teamMemberResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, userId, roleInTeam, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMemberResponse {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roleInTeam: ").append(toIndentedString(roleInTeam)).append("\n");
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

