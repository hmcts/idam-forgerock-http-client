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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * OpenIDConnect
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class OpenIDConnect {
  @JsonProperty("claims")
  private Claims claims = null;

  @JsonProperty("postLogoutRedirectUri")
  private PostLogoutRedirectURIs postLogoutRedirectUri = null;

  @JsonProperty("clientSessionUri")
  private ClientSessionURI clientSessionUri = null;

  @JsonProperty("defaultMaxAge")
  private DefaultMaxAge defaultMaxAge = null;

  @JsonProperty("defaultMaxAgeEnabled")
  private DefaultMaxAgeEnabled defaultMaxAgeEnabled = null;

  @JsonProperty("jwtTokenLifetime")
  private OpenIDConnectJWTTokenLifetimeSeconds jwtTokenLifetime = null;

  public OpenIDConnect claims(Claims claims) {
    this.claims = claims;
    return this;
  }

   /**
   * Get claims
   * @return claims
  **/
  @ApiModelProperty(value = "")
  public Claims getClaims() {
    return claims;
  }

  public void setClaims(Claims claims) {
    this.claims = claims;
  }

  public OpenIDConnect postLogoutRedirectUri(PostLogoutRedirectURIs postLogoutRedirectUri) {
    this.postLogoutRedirectUri = postLogoutRedirectUri;
    return this;
  }

   /**
   * Get postLogoutRedirectUri
   * @return postLogoutRedirectUri
  **/
  @ApiModelProperty(value = "")
  public PostLogoutRedirectURIs getPostLogoutRedirectUri() {
    return postLogoutRedirectUri;
  }

  public void setPostLogoutRedirectUri(PostLogoutRedirectURIs postLogoutRedirectUri) {
    this.postLogoutRedirectUri = postLogoutRedirectUri;
  }

  public OpenIDConnect clientSessionUri(ClientSessionURI clientSessionUri) {
    this.clientSessionUri = clientSessionUri;
    return this;
  }

   /**
   * Get clientSessionUri
   * @return clientSessionUri
  **/
  @ApiModelProperty(value = "")
  public ClientSessionURI getClientSessionUri() {
    return clientSessionUri;
  }

  public void setClientSessionUri(ClientSessionURI clientSessionUri) {
    this.clientSessionUri = clientSessionUri;
  }

  public OpenIDConnect defaultMaxAge(DefaultMaxAge defaultMaxAge) {
    this.defaultMaxAge = defaultMaxAge;
    return this;
  }

   /**
   * Get defaultMaxAge
   * @return defaultMaxAge
  **/
  @ApiModelProperty(value = "")
  public DefaultMaxAge getDefaultMaxAge() {
    return defaultMaxAge;
  }

  public void setDefaultMaxAge(DefaultMaxAge defaultMaxAge) {
    this.defaultMaxAge = defaultMaxAge;
  }

  public OpenIDConnect defaultMaxAgeEnabled(DefaultMaxAgeEnabled defaultMaxAgeEnabled) {
    this.defaultMaxAgeEnabled = defaultMaxAgeEnabled;
    return this;
  }

   /**
   * Get defaultMaxAgeEnabled
   * @return defaultMaxAgeEnabled
  **/
  @ApiModelProperty(value = "")
  public DefaultMaxAgeEnabled getDefaultMaxAgeEnabled() {
    return defaultMaxAgeEnabled;
  }

  public void setDefaultMaxAgeEnabled(DefaultMaxAgeEnabled defaultMaxAgeEnabled) {
    this.defaultMaxAgeEnabled = defaultMaxAgeEnabled;
  }

  public OpenIDConnect jwtTokenLifetime(OpenIDConnectJWTTokenLifetimeSeconds jwtTokenLifetime) {
    this.jwtTokenLifetime = jwtTokenLifetime;
    return this;
  }

   /**
   * Get jwtTokenLifetime
   * @return jwtTokenLifetime
  **/
  @ApiModelProperty(value = "")
  public OpenIDConnectJWTTokenLifetimeSeconds getJwtTokenLifetime() {
    return jwtTokenLifetime;
  }

  public void setJwtTokenLifetime(OpenIDConnectJWTTokenLifetimeSeconds jwtTokenLifetime) {
    this.jwtTokenLifetime = jwtTokenLifetime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenIDConnect openIDConnect = (OpenIDConnect) o;
    return Objects.equals(this.claims, openIDConnect.claims) &&
        Objects.equals(this.postLogoutRedirectUri, openIDConnect.postLogoutRedirectUri) &&
        Objects.equals(this.clientSessionUri, openIDConnect.clientSessionUri) &&
        Objects.equals(this.defaultMaxAge, openIDConnect.defaultMaxAge) &&
        Objects.equals(this.defaultMaxAgeEnabled, openIDConnect.defaultMaxAgeEnabled) &&
        Objects.equals(this.jwtTokenLifetime, openIDConnect.jwtTokenLifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, postLogoutRedirectUri, clientSessionUri, defaultMaxAge, defaultMaxAgeEnabled, jwtTokenLifetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIDConnect {\n");
    
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    postLogoutRedirectUri: ").append(toIndentedString(postLogoutRedirectUri)).append("\n");
    sb.append("    clientSessionUri: ").append(toIndentedString(clientSessionUri)).append("\n");
    sb.append("    defaultMaxAge: ").append(toIndentedString(defaultMaxAge)).append("\n");
    sb.append("    defaultMaxAgeEnabled: ").append(toIndentedString(defaultMaxAgeEnabled)).append("\n");
    sb.append("    jwtTokenLifetime: ").append(toIndentedString(jwtTokenLifetime)).append("\n");
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

