/*
 * ForgeRock IDM Miscellaneous API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.misc.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReconCancelResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.022Z")
public class ReconCancelResponse {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("_id")
  private String id = null;

  public ReconCancelResponse action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action name
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action name")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ReconCancelResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Action status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Action status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReconCancelResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Recon ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Recon ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconCancelResponse reconCancelResponse = (ReconCancelResponse) o;
    return Objects.equals(this.action, reconCancelResponse.action) &&
        Objects.equals(this.status, reconCancelResponse.status) &&
        Objects.equals(this.id, reconCancelResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, status, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconCancelResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
