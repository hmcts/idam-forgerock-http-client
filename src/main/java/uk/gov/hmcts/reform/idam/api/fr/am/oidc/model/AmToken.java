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
 * AmToken
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:58.839Z")
public class AmToken {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("id_token")
  private String idToken = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("expires_in")
  private String expiresIn = null;

  public AmToken code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The access code
   * @return code
  **/
  @ApiModelProperty(value = "The access code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AmToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token
   * @return accessToken
  **/
  @ApiModelProperty(value = "The access token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AmToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * The refresh token
   * @return refreshToken
  **/
  @ApiModelProperty(value = "The refresh token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public AmToken scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scopes of the token
   * @return scope
  **/
  @ApiModelProperty(value = "The scopes of the token")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AmToken idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

   /**
   * The ID Token
   * @return idToken
  **/
  @ApiModelProperty(value = "The ID Token")
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  public AmToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type of token eg \&quot;Bearer\&quot;
   * @return tokenType
  **/
  @ApiModelProperty(value = "The type of token eg \"Bearer\"")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public AmToken expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The lifetime in seconds of the access token
   * @return expiresIn
  **/
  @ApiModelProperty(value = "The lifetime in seconds of the access token")
  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmToken amToken = (AmToken) o;
    return Objects.equals(this.code, amToken.code) &&
        Objects.equals(this.accessToken, amToken.accessToken) &&
        Objects.equals(this.refreshToken, amToken.refreshToken) &&
        Objects.equals(this.scope, amToken.scope) &&
        Objects.equals(this.idToken, amToken.idToken) &&
        Objects.equals(this.tokenType, amToken.tokenType) &&
        Objects.equals(this.expiresIn, amToken.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, accessToken, refreshToken, scope, idToken, tokenType, expiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmToken {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

