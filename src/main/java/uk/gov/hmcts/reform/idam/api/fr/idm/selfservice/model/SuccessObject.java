/*
 * ForgeRock IDM SelfService Registration API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * If all the requirements have been fulfilled and the user registration process is complete, this response structure will be used.
 */
@ApiModel(description = "If all the requirements have been fulfilled and the user registration process is complete, this response structure will be used.")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.636Z")
public class SuccessObject {
  @JsonProperty("success")
  private String success = null;

  public SuccessObject success(String success) {
    this.success = success;
    return this;
  }

   /**
   * Success Object
   * @return success
  **/
  @ApiModelProperty(required = true, value = "Success Object")
  public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessObject successObject = (SuccessObject) o;
    return Objects.equals(this.success, successObject.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessObject {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

