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
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SuccessObject;

/**
 * If more requirements need fulfilling before the user registration process is completed, this response structure will be returned.
 */
@ApiModel(description = "If more requirements need fulfilling before the user registration process is completed, this response structure will be returned.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.636Z")
public class SelfServiceRegistrationResponse {
  @JsonProperty("status")
  private SuccessObject status = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("requirements")
  private Object requirements = null;

  public SelfServiceRegistrationResponse status(SuccessObject status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public SuccessObject getStatus() {
    return status;
  }

  public void setStatus(SuccessObject status) {
    this.status = status;
  }

  public SelfServiceRegistrationResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * A token for the process that must be returned with the next set of requirements when they have been fulfilled.
   * @return token
  **/
  @ApiModelProperty(required = true, value = "A token for the process that must be returned with the next set of requirements when they have been fulfilled.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public SelfServiceRegistrationResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the self service interaction.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the self service interaction.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SelfServiceRegistrationResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The stage description tag.
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "The stage description tag.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public SelfServiceRegistrationResponse requirements(Object requirements) {
    this.requirements = requirements;
    return this;
  }

   /**
   * A JSON Schema object that defines the input that must be submitted to the submitRequirements action.
   * @return requirements
  **/
  @ApiModelProperty(required = true, value = "A JSON Schema object that defines the input that must be submitted to the submitRequirements action.")
  public Object getRequirements() {
    return requirements;
  }

  public void setRequirements(Object requirements) {
    this.requirements = requirements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfServiceRegistrationResponse selfServiceRegistrationResponse = (SelfServiceRegistrationResponse) o;
    return Objects.equals(this.status, selfServiceRegistrationResponse.status) &&
        Objects.equals(this.token, selfServiceRegistrationResponse.token) &&
        Objects.equals(this.type, selfServiceRegistrationResponse.type) &&
        Objects.equals(this.tag, selfServiceRegistrationResponse.tag) &&
        Objects.equals(this.requirements, selfServiceRegistrationResponse.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, token, type, tag, requirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfServiceRegistrationResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

