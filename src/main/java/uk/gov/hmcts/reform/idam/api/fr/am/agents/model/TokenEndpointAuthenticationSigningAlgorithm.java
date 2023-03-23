/*
 * ForgeRock AM Agents API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.agents.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The JWS algorithm that MUST be used for signing the JWT used to authenticate the Client at the Token Endpointfor the private_key_jwt and client_secret_jwt authentication methods. All Token Requests using these authentication methods from this Client MUST be rejected, if the JWT is not signed with this algorithm.
 */
@ApiModel(description = "The JWS algorithm that MUST be used for signing the JWT used to authenticate the Client at the Token Endpointfor the private_key_jwt and client_secret_jwt authentication methods. All Token Requests using these authentication methods from this Client MUST be rejected, if the JWT is not signed with this algorithm.")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class TokenEndpointAuthenticationSigningAlgorithm {
  @JsonProperty("inherited")
  private Boolean inherited = null;

  @JsonProperty("value")
  private String value = null;

  public TokenEndpointAuthenticationSigningAlgorithm inherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

   /**
   * Get inherited
   * @return inherited
  **/
  @ApiModelProperty(value = "")
  public Boolean isInherited() {
    return inherited;
  }

  public void setInherited(Boolean inherited) {
    this.inherited = inherited;
  }

  public TokenEndpointAuthenticationSigningAlgorithm value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenEndpointAuthenticationSigningAlgorithm tokenEndpointAuthenticationSigningAlgorithm = (TokenEndpointAuthenticationSigningAlgorithm) o;
    return Objects.equals(this.inherited, tokenEndpointAuthenticationSigningAlgorithm.inherited) &&
        Objects.equals(this.value, tokenEndpointAuthenticationSigningAlgorithm.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenEndpointAuthenticationSigningAlgorithm {\n");
    
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

