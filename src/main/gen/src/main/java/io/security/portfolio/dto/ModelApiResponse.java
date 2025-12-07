package io.security.portfolio.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
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
 * ModelApiResponse
 */

@JsonTypeName("ApiResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class ModelApiResponse {

  private Boolean success;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private JsonNullable<Object> data = JsonNullable.<Object>undefined();

  public ModelApiResponse success(Boolean success) {
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

  public ModelApiResponse message(String message) {
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

  public ModelApiResponse data(Object data) {
    this.data = JsonNullable.of(data);
    return this;
  }

  /**
   * 실제 응답 데이터 (엔드포인트별로 타입 상이)
   * @return data
   */
  
  @Schema(name = "data", description = "실제 응답 데이터 (엔드포인트별로 타입 상이)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public JsonNullable<Object> getData() {
    return data;
  }

  public void setData(JsonNullable<Object> data) {
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
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.success, _apiResponse.success) &&
        equalsNullable(this.message, _apiResponse.message) &&
        equalsNullable(this.data, _apiResponse.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, hashCodeNullable(message), hashCodeNullable(data));
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
    sb.append("class ModelApiResponse {\n");
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

