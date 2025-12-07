package io.security.portfolio.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateUserRolesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class UpdateUserRolesRequest {

  @Valid
  private List<Long> roleIds = new ArrayList<>();

  public UpdateUserRolesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserRolesRequest(List<Long> roleIds) {
    this.roleIds = roleIds;
  }

  public UpdateUserRolesRequest roleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public UpdateUserRolesRequest addRoleIdsItem(Long roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

  /**
   * 해당 유저에게 부여할 글로벌 Role ID 목록
   * @return roleIds
   */
  @NotNull 
  @Schema(name = "roleIds", description = "해당 유저에게 부여할 글로벌 Role ID 목록", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roleIds")
  public List<Long> getRoleIds() {
    return roleIds;
  }

  public void setRoleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRolesRequest updateUserRolesRequest = (UpdateUserRolesRequest) o;
    return Objects.equals(this.roleIds, updateUserRolesRequest.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRolesRequest {\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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

