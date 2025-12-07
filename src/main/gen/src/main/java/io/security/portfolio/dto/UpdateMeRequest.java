package io.security.portfolio.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * 내 프로필(ABAC 속성) 일부 수정 요청. 필드는 선택적으로 보낼 수 있음. 
 */

@Schema(name = "UpdateMeRequest", description = "내 프로필(ABAC 속성) 일부 수정 요청. 필드는 선택적으로 보낼 수 있음. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class UpdateMeRequest {

  private JsonNullable<String> department = JsonNullable.<String>undefined();

  private JsonNullable<String> jobLevel = JsonNullable.<String>undefined();

  private JsonNullable<Integer> securityGrade = JsonNullable.<Integer>undefined();

  public UpdateMeRequest department(String department) {
    this.department = JsonNullable.of(department);
    return this;
  }

  /**
   * Get department
   * @return department
   */
  
  @Schema(name = "department", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("department")
  public JsonNullable<String> getDepartment() {
    return department;
  }

  public void setDepartment(JsonNullable<String> department) {
    this.department = department;
  }

  public UpdateMeRequest jobLevel(String jobLevel) {
    this.jobLevel = JsonNullable.of(jobLevel);
    return this;
  }

  /**
   * Get jobLevel
   * @return jobLevel
   */
  
  @Schema(name = "jobLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobLevel")
  public JsonNullable<String> getJobLevel() {
    return jobLevel;
  }

  public void setJobLevel(JsonNullable<String> jobLevel) {
    this.jobLevel = jobLevel;
  }

  public UpdateMeRequest securityGrade(Integer securityGrade) {
    this.securityGrade = JsonNullable.of(securityGrade);
    return this;
  }

  /**
   * Get securityGrade
   * @return securityGrade
   */
  
  @Schema(name = "securityGrade", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityGrade")
  public JsonNullable<Integer> getSecurityGrade() {
    return securityGrade;
  }

  public void setSecurityGrade(JsonNullable<Integer> securityGrade) {
    this.securityGrade = securityGrade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMeRequest updateMeRequest = (UpdateMeRequest) o;
    return equalsNullable(this.department, updateMeRequest.department) &&
        equalsNullable(this.jobLevel, updateMeRequest.jobLevel) &&
        equalsNullable(this.securityGrade, updateMeRequest.securityGrade);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(department), hashCodeNullable(jobLevel), hashCodeNullable(securityGrade));
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
    sb.append("class UpdateMeRequest {\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    jobLevel: ").append(toIndentedString(jobLevel)).append("\n");
    sb.append("    securityGrade: ").append(toIndentedString(securityGrade)).append("\n");
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

