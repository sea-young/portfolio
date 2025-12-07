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
 * MeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-07T12:21:57.339446635+09:00[Asia/Seoul]", comments = "Generator version: 7.7.0")
public class MeResponse {

  private Long id;

  private String username;

  private String email;

  private JsonNullable<String> department = JsonNullable.<String>undefined();

  private JsonNullable<String> jobLevel = JsonNullable.<String>undefined();

  private Integer securityGrade;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public MeResponse id(Long id) {
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

  public MeResponse username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public MeResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MeResponse department(String department) {
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

  public MeResponse jobLevel(String jobLevel) {
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

  public MeResponse securityGrade(Integer securityGrade) {
    this.securityGrade = securityGrade;
    return this;
  }

  /**
   * 1~5, 숫자가 클수록 더 민감한 문서 접근 가능
   * @return securityGrade
   */
  
  @Schema(name = "securityGrade", description = "1~5, 숫자가 클수록 더 민감한 문서 접근 가능", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityGrade")
  public Integer getSecurityGrade() {
    return securityGrade;
  }

  public void setSecurityGrade(Integer securityGrade) {
    this.securityGrade = securityGrade;
  }

  public MeResponse createdAt(OffsetDateTime createdAt) {
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

  public MeResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeResponse meResponse = (MeResponse) o;
    return Objects.equals(this.id, meResponse.id) &&
        Objects.equals(this.username, meResponse.username) &&
        Objects.equals(this.email, meResponse.email) &&
        equalsNullable(this.department, meResponse.department) &&
        equalsNullable(this.jobLevel, meResponse.jobLevel) &&
        Objects.equals(this.securityGrade, meResponse.securityGrade) &&
        Objects.equals(this.createdAt, meResponse.createdAt) &&
        Objects.equals(this.updatedAt, meResponse.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, email, hashCodeNullable(department), hashCodeNullable(jobLevel), securityGrade, createdAt, updatedAt);
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
    sb.append("class MeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    jobLevel: ").append(toIndentedString(jobLevel)).append("\n");
    sb.append("    securityGrade: ").append(toIndentedString(securityGrade)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

