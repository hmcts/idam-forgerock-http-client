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
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * FailedPolicyRequirements
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.636Z")
public class FailedPolicyRequirements {
  @JsonProperty("policyRequirements")
  private List<PolicyRequirements> policyRequirements = null;

  @JsonProperty("property")
  private String property = null;

  public FailedPolicyRequirements policyRequirements(List<PolicyRequirements> policyRequirements) {
    this.policyRequirements = policyRequirements;
    return this;
  }

  public FailedPolicyRequirements addPolicyRequirementsItem(PolicyRequirements policyRequirementsItem) {
    if (this.policyRequirements == null) {
      this.policyRequirements = new ArrayList<>();
    }
    this.policyRequirements.add(policyRequirementsItem);
    return this;
  }

   /**
   * Get policyRequirements
   * @return policyRequirements
  **/
  @ApiModelProperty(value = "")
  public List<PolicyRequirements> getPolicyRequirements() {
    return policyRequirements;
  }

  public void setPolicyRequirements(List<PolicyRequirements> policyRequirements) {
    this.policyRequirements = policyRequirements;
  }

  public FailedPolicyRequirements property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(value = "")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedPolicyRequirements failedPolicyRequirements = (FailedPolicyRequirements) o;
    return Objects.equals(this.policyRequirements, failedPolicyRequirements.policyRequirements) &&
        Objects.equals(this.property, failedPolicyRequirements.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyRequirements, property);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedPolicyRequirements {\n");
    
    sb.append("    policyRequirements: ").append(toIndentedString(policyRequirements)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

