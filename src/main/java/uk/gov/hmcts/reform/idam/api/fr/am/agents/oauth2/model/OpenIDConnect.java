/*
 * ForgeRock AM OAuth2Client API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OpenIDConnect
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.013Z")
public class OpenIDConnect {
  @JsonProperty("claims")
  private List<String> claims = null;

  @JsonProperty("postLogoutRedirectUri")
  private List<String> postLogoutRedirectUri = null;

  @JsonProperty("clientSessionUri")
  private String clientSessionUri = null;

  @JsonProperty("defaultMaxAge")
  private Integer defaultMaxAge = null;

  @JsonProperty("defaultMaxAgeEnabled")
  private Boolean defaultMaxAgeEnabled = null;

  @JsonProperty("jwtTokenLifetime")
  private Integer jwtTokenLifetime = null;

  public OpenIDConnect claims(List<String> claims) {
    this.claims = claims;
    return this;
  }

  public OpenIDConnect addClaimsItem(String claimsItem) {
    if (this.claims == null) {
      this.claims = new ArrayList<>();
    }
    this.claims.add(claimsItem);
    return this;
  }

   /**
   * List of claim name translations, which will override those specified for the AS. Claims are values that are presented to the user to inform them what data is being made available to the Client.&lt;br&gt;&lt;br&gt;Claims may be entered as simple strings or pipe separated strings representing the internal claim name, locale, and localized description; e.g. \&quot;name|en|Your full name\&quot;. Locale strings are in the format &lt;code&gt;language + \&quot;_\&quot; + country + \&quot;_\&quot; + variant&lt;/code&gt;, e.g. en, en_GB, en_US_WIN. If the locale and pipe is omitted, the description is displayed to all users having undefined locales. e.g. \&quot;name|Your full name\&quot;. &lt;i&gt;NB&lt;/i&gt; If the description is also omitted, nothing is displayed to all users, e.g. specifying \&quot;name|\&quot; would allow the claim \&quot;name\&quot; to be used by the client, but would not display it to the user when it was requested.&lt;p&gt;If a value is not given here, the value will be computed from the OAuth 2 Provider settings.&lt;/p&gt;
   * @return claims
  **/
  @ApiModelProperty(value = "List of claim name translations, which will override those specified for the AS. Claims are values that are presented to the user to inform them what data is being made available to the Client.<br><br>Claims may be entered as simple strings or pipe separated strings representing the internal claim name, locale, and localized description; e.g. \"name|en|Your full name\". Locale strings are in the format <code>language + \"_\" + country + \"_\" + variant</code>, e.g. en, en_GB, en_US_WIN. If the locale and pipe is omitted, the description is displayed to all users having undefined locales. e.g. \"name|Your full name\". <i>NB</i> If the description is also omitted, nothing is displayed to all users, e.g. specifying \"name|\" would allow the claim \"name\" to be used by the client, but would not display it to the user when it was requested.<p>If a value is not given here, the value will be computed from the OAuth 2 Provider settings.</p>")
  public List<String> getClaims() {
    return claims;
  }

  public void setClaims(List<String> claims) {
    this.claims = claims;
  }

  public OpenIDConnect postLogoutRedirectUri(List<String> postLogoutRedirectUri) {
    this.postLogoutRedirectUri = postLogoutRedirectUri;
    return this;
  }

  public OpenIDConnect addPostLogoutRedirectUriItem(String postLogoutRedirectUriItem) {
    if (this.postLogoutRedirectUri == null) {
      this.postLogoutRedirectUri = new ArrayList<>();
    }
    this.postLogoutRedirectUri.add(postLogoutRedirectUriItem);
    return this;
  }

   /**
   * URIs that can be redirected to after the client logout process.
   * @return postLogoutRedirectUri
  **/
  @ApiModelProperty(value = "URIs that can be redirected to after the client logout process.")
  public List<String> getPostLogoutRedirectUri() {
    return postLogoutRedirectUri;
  }

  public void setPostLogoutRedirectUri(List<String> postLogoutRedirectUri) {
    this.postLogoutRedirectUri = postLogoutRedirectUri;
  }

  public OpenIDConnect clientSessionUri(String clientSessionUri) {
    this.clientSessionUri = clientSessionUri;
    return this;
  }

   /**
   * This is the URI that will be used to check messages sent to the session management endpoints. This URI must match the origin of the message
   * @return clientSessionUri
  **/
  @ApiModelProperty(value = "This is the URI that will be used to check messages sent to the session management endpoints. This URI must match the origin of the message")
  public String getClientSessionUri() {
    return clientSessionUri;
  }

  public void setClientSessionUri(String clientSessionUri) {
    this.clientSessionUri = clientSessionUri;
  }

  public OpenIDConnect defaultMaxAge(Integer defaultMaxAge) {
    this.defaultMaxAge = defaultMaxAge;
    return this;
  }

   /**
   * Minimum value 1. Sets the maximum length of time in seconds a session may be active after the authorization service has succeeded before the user must actively re-authenticate.
   * @return defaultMaxAge
  **/
  @ApiModelProperty(value = "Minimum value 1. Sets the maximum length of time in seconds a session may be active after the authorization service has succeeded before the user must actively re-authenticate.")
  public Integer getDefaultMaxAge() {
    return defaultMaxAge;
  }

  public void setDefaultMaxAge(Integer defaultMaxAge) {
    this.defaultMaxAge = defaultMaxAge;
  }

  public OpenIDConnect defaultMaxAgeEnabled(Boolean defaultMaxAgeEnabled) {
    this.defaultMaxAgeEnabled = defaultMaxAgeEnabled;
    return this;
  }

   /**
   * Whether or not the default max age is enforced.
   * @return defaultMaxAgeEnabled
  **/
  @ApiModelProperty(value = "Whether or not the default max age is enforced.")
  public Boolean isDefaultMaxAgeEnabled() {
    return defaultMaxAgeEnabled;
  }

  public void setDefaultMaxAgeEnabled(Boolean defaultMaxAgeEnabled) {
    this.defaultMaxAgeEnabled = defaultMaxAgeEnabled;
  }

  public OpenIDConnect jwtTokenLifetime(Integer jwtTokenLifetime) {
    this.jwtTokenLifetime = jwtTokenLifetime;
    return this;
  }

   /**
   * The time in seconds a JWT is valid for. &lt;i&gt;NB&lt;/i&gt; If this field is set to zero, JWT Token Lifetime of the OAuth2 Provider is used instead of.
   * @return jwtTokenLifetime
  **/
  @ApiModelProperty(value = "The time in seconds a JWT is valid for. <i>NB</i> If this field is set to zero, JWT Token Lifetime of the OAuth2 Provider is used instead of.")
  public Integer getJwtTokenLifetime() {
    return jwtTokenLifetime;
  }

  public void setJwtTokenLifetime(Integer jwtTokenLifetime) {
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

