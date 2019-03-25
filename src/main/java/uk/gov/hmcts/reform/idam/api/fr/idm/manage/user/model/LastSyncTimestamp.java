/*
 * ForgeRock IDM Users API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Last Sync timestamp
 */
@ApiModel(description = "Last Sync timestamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public class LastSyncTimestamp {
  @JsonProperty("effectiveAssignments")
  private List<Object> effectiveAssignments = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public LastSyncTimestamp effectiveAssignments(List<Object> effectiveAssignments) {
    this.effectiveAssignments = effectiveAssignments;
    return this;
  }

  public LastSyncTimestamp addEffectiveAssignmentsItem(Object effectiveAssignmentsItem) {
    if (this.effectiveAssignments == null) {
      this.effectiveAssignments = new ArrayList<>();
    }
    this.effectiveAssignments.add(effectiveAssignmentsItem);
    return this;
  }

   /**
   * Effective Assignments
   * @return effectiveAssignments
  **/
  @ApiModelProperty(value = "Effective Assignments")
  public List<Object> getEffectiveAssignments() {
    return effectiveAssignments;
  }

  public void setEffectiveAssignments(List<Object> effectiveAssignments) {
    this.effectiveAssignments = effectiveAssignments;
  }

  public LastSyncTimestamp timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "Timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastSyncTimestamp lastSyncTimestamp = (LastSyncTimestamp) o;
    return Objects.equals(this.effectiveAssignments, lastSyncTimestamp.effectiveAssignments) &&
        Objects.equals(this.timestamp, lastSyncTimestamp.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveAssignments, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastSyncTimestamp {\n");
    
    sb.append("    effectiveAssignments: ").append(toIndentedString(effectiveAssignments)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

