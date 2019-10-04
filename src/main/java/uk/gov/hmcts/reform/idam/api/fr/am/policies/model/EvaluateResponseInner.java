/*
 * OpenAM
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.policies.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * EvaluateResponseInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T13:59:55.834+01:00")
public class EvaluateResponseInner {
  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("actions")
  private ActionMap actions = null;

  @JsonProperty("attributes")
  private Object attributes = null;

  @JsonProperty("advices")
  private Object advices = null;

  public EvaluateResponseInner resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Specifies the root resource for the decisions to return
   * @return resource
  **/
  @ApiModelProperty(value = "Specifies the root resource for the decisions to return")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public EvaluateResponseInner actions(ActionMap actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(value = "")
  public ActionMap getActions() {
    return actions;
  }

  public void setActions(ActionMap actions) {
    this.actions = actions;
  }

  public EvaluateResponseInner attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * A map of attribute names to their values, if any response attributes are returned according to applicable policies
   * @return attributes
  **/
  @ApiModelProperty(value = "A map of attribute names to their values, if any response attributes are returned according to applicable policies")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public EvaluateResponseInner advices(Object advices) {
    this.advices = advices;
    return this;
  }

   /**
   * A map of advice names to their values, if any advice is returned according to applicable policies
   * @return advices
  **/
  @ApiModelProperty(value = "A map of advice names to their values, if any advice is returned according to applicable policies")
  public Object getAdvices() {
    return advices;
  }

  public void setAdvices(Object advices) {
    this.advices = advices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateResponseInner evaluateResponseInner = (EvaluateResponseInner) o;
    return Objects.equals(this.resource, evaluateResponseInner.resource) &&
        Objects.equals(this.actions, evaluateResponseInner.actions) &&
        Objects.equals(this.attributes, evaluateResponseInner.attributes) &&
        Objects.equals(this.advices, evaluateResponseInner.advices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, actions, attributes, advices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateResponseInner {\n");

    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    advices: ").append(toIndentedString(advices)).append("\n");
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
