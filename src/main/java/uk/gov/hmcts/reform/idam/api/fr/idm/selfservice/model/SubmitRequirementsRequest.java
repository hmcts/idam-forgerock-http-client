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

/**
 * Submit some fulfilled requirements. Returns either a completion status, or a token along with some more requirements. If requirements are returned, they should be submitted with the token as a fresh request to this action.
 */
@ApiModel(description = "Submit some fulfilled requirements. Returns either a completion status, or a token along with some more requirements. If requirements are returned, they should be submitted with the token as a fresh request to this action.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.943Z")
public class SubmitRequirementsRequest {
  @JsonProperty("token")
  private String token = null;

  @JsonProperty("input")
  private Object input = null;

  public SubmitRequirementsRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token returned from the previous submitRequirements request.
   * @return token
  **/
  @ApiModelProperty(required = true, value = "The token returned from the previous submitRequirements request.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public SubmitRequirementsRequest input(Object input) {
    this.input = input;
    return this;
  }

   /**
   * The input as collected from the user. This object must conform to the JSON Schema of the requirements property from the last response.
   * @return input
  **/
  @ApiModelProperty(required = true, value = "The input as collected from the user. This object must conform to the JSON Schema of the requirements property from the last response.")
  public Object getInput() {
    return input;
  }

  public void setInput(Object input) {
    this.input = input;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitRequirementsRequest submitRequirementsRequest = (SubmitRequirementsRequest) o;
    return Objects.equals(this.token, submitRequirementsRequest.token) &&
        Objects.equals(this.input, submitRequirementsRequest.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, input);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitRequirementsRequest {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

