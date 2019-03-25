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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.FailedPolicyRequirements;

/**
 * ValidateObjectResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.636Z")
public class ValidateObjectResponse {
  @JsonProperty("result")
  private Boolean result = null;

  @JsonProperty("failedPolicyRequirements")
  private List<FailedPolicyRequirements> failedPolicyRequirements = null;

  public ValidateObjectResponse result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public ValidateObjectResponse failedPolicyRequirements(List<FailedPolicyRequirements> failedPolicyRequirements) {
    this.failedPolicyRequirements = failedPolicyRequirements;
    return this;
  }

  public ValidateObjectResponse addFailedPolicyRequirementsItem(FailedPolicyRequirements failedPolicyRequirementsItem) {
    if (this.failedPolicyRequirements == null) {
      this.failedPolicyRequirements = new ArrayList<>();
    }
    this.failedPolicyRequirements.add(failedPolicyRequirementsItem);
    return this;
  }

   /**
   * Array of matching items
   * @return failedPolicyRequirements
  **/
  @ApiModelProperty(value = "Array of matching items")
  public List<FailedPolicyRequirements> getFailedPolicyRequirements() {
    return failedPolicyRequirements;
  }

  public void setFailedPolicyRequirements(List<FailedPolicyRequirements> failedPolicyRequirements) {
    this.failedPolicyRequirements = failedPolicyRequirements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateObjectResponse validateObjectResponse = (ValidateObjectResponse) o;
    return Objects.equals(this.result, validateObjectResponse.result) &&
        Objects.equals(this.failedPolicyRequirements, validateObjectResponse.failedPolicyRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, failedPolicyRequirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateObjectResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    failedPolicyRequirements: ").append(toIndentedString(failedPolicyRequirements)).append("\n");
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
