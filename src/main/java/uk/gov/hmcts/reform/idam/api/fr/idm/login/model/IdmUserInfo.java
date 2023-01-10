/*
 * API Explorer
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.login.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * IdmUserInfo
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-09T09:18:53.032+01:00")
public class IdmUserInfo {
  @JsonProperty("authorization")
  private Authorization authorization = null;

  @JsonProperty("authenticationId")
  private String authenticationId = null;

  public IdmUserInfo authorization(Authorization authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @ApiModelProperty(required = true, value = "")
  public Authorization getAuthorization() {
    return authorization;
  }

  public void setAuthorization(Authorization authorization) {
    this.authorization = authorization;
  }

  public IdmUserInfo authenticationId(String authenticationId) {
    this.authenticationId = authenticationId;
    return this;
  }

   /**
   * Resource ID (e.g., User ID)
   * @return authenticationId
  **/
  @ApiModelProperty(required = true, value = "Resource ID (e.g., User ID)")
  public String getAuthenticationId() {
    return authenticationId;
  }

  public void setAuthenticationId(String authenticationId) {
    this.authenticationId = authenticationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdmUserInfo idmUserInfo = (IdmUserInfo) o;
    return Objects.equals(this.authorization, idmUserInfo.authorization) &&
        Objects.equals(this.authenticationId, idmUserInfo.authenticationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, authenticationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdmUserInfo {\n");

    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    authenticationId: ").append(toIndentedString(authenticationId)).append("\n");
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

