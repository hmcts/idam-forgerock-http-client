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
 * Returns either a completion status, or a token along with some more requirements.
 */
@ApiModel(description = "Returns either a completion status, or a token along with some more requirements.")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-29T16:19:52.490+01:00")
public class SubmitRequirementsResponse {
  @JsonProperty("token")
  private String token = null;

  public SubmitRequirementsResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token returned from the previous submitRequirements request.
   * @return token
  **/
  @ApiModelProperty(value = "The token returned from the previous submitRequirements request.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitRequirementsResponse submitRequirementsResponse = (SubmitRequirementsResponse) o;
    return Objects.equals(this.token, submitRequirementsResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitRequirementsResponse {\n");

    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

