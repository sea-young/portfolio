package io.security.portfolio.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.security.portfolio.dto.TeamMemberResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ListTeamMembers200Response
 */

@JsonTypeName("listTeamMembers_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class ListTeamMembers200Response {

  private Boolean success;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid TeamMemberResponse> data = new ArrayList<>();

  public ListTeamMembers200Response success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * 요청 성공 여부
   * @return success
   */
  
  @Schema(name = "success", description = "요청 성공 여부", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ListTeamMembers200Response message(String message) {
    this.message = JsonNullable.of(message);
    return this;
  }

  /**
   * 추가 메시지 (없으면 null)
   * @return message
   */
  
  @Schema(name = "message", description = "추가 메시지 (없으면 null)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public JsonNullable<String> getMessage() {
    return message;
  }

  public void setMessage(JsonNullable<String> message) {
    this.message = message;
  }

  public ListTeamMembers200Response data(List<@Valid TeamMemberResponse> data) {
    this.data = data;
    return this;
  }

  public ListTeamMembers200Response addDataItem(TeamMemberResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid TeamMemberResponse> getData() {
    return data;
  }

  public void setData(List<@Valid TeamMemberResponse> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTeamMembers200Response listTeamMembers200Response = (ListTeamMembers200Response) o;
    return Objects.equals(this.success, listTeamMembers200Response.success) &&
        equalsNullable(this.message, listTeamMembers200Response.message) &&
        Objects.equals(this.data, listTeamMembers200Response.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, hashCodeNullable(message), data);
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
    sb.append("class ListTeamMembers200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

