/*
 * Forgerock AM Authentication API
 * An OAuth2 Client for Forgerock AM based on tests
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.oidc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AmAuthenticateToken
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:58.839Z")
public class AmAuthenticateToken {
  @JsonProperty("tokenId")
  private String tokenId = null;

  @JsonProperty("successUrl")
  private String successUrl = null;

  @JsonProperty("realm")
  private String realm = null;

  public AmAuthenticateToken tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * IPlanetDirectoryPro Token
   * @return tokenId
  **/
  @ApiModelProperty(value = "IPlanetDirectoryPro Token")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public AmAuthenticateToken successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Success redirect url
   * @return successUrl
  **/
  @ApiModelProperty(value = "Success redirect url")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  public AmAuthenticateToken realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Realm authenicated against
   * @return realm
  **/
  @ApiModelProperty(value = "Realm authenicated against")
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmAuthenticateToken amAuthenticateToken = (AmAuthenticateToken) o;
    return Objects.equals(this.tokenId, amAuthenticateToken.tokenId) &&
        Objects.equals(this.successUrl, amAuthenticateToken.successUrl) &&
        Objects.equals(this.realm, amAuthenticateToken.realm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, successUrl, realm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmAuthenticateToken {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
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

