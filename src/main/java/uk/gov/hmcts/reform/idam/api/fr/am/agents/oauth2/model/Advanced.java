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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Advanced
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T07:40:50.788+01:00")
public class Advanced {
  @JsonProperty("name")
  private List<String> name = null;

  @JsonProperty("descriptions")
  private List<String> descriptions = null;

  @JsonProperty("requestUris")
  private List<String> requestUris = null;

  @JsonProperty("responseTypes")
  private List<String> responseTypes = null;

  @JsonProperty("contacts")
  private List<String> contacts = null;

  @JsonProperty("customProperties")
  private List<String> customProperties = null;

  @JsonProperty("tokenEndpointAuthMethod")
  private String tokenEndpointAuthMethod = null;

  @JsonProperty("sectorIdentifierUri")
  private String sectorIdentifierUri = null;

  @JsonProperty("subjectType")
  private String subjectType = null;

  @JsonProperty("updateAccessToken")
  private String updateAccessToken = null;

  @JsonProperty("isConsentImplied")
  private Boolean isConsentImplied = null;

  @JsonProperty("mixUpMitigation")
  private Boolean mixUpMitigation = null;

  public Advanced name(List<String> name) {
    this.name = name;
    return this;
  }

  public Advanced addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * A client name that may be relevant to the resource owner when considering approval.&lt;br&gt;&lt;br&gt;The name may be entered as a single string or as pipe separated strings for locale and localized name; e.g. \&quot;en|The ExampleCo Intranet\&quot;. Locale strings are in the format &lt;code&gt;language + \&quot;_\&quot; + country + \&quot;_\&quot; + variant&lt;/code&gt;, e.g. en, en_GB, en_US_WIN. If the locale is omitted, the name is displayed to all users having undefined locales. e.g. \&quot;The ExampleCo Intranet\&quot;.
   * @return name
   **/
  @ApiModelProperty(value = "A client name that may be relevant to the resource owner when considering approval.<br><br>The name may be entered as a single string or as pipe separated strings for locale and localized name; e.g. \"en|The ExampleCo Intranet\". Locale strings are in the format <code>language + \"_\" + country + \"_\" + variant</code>, e.g. en, en_GB, en_US_WIN. If the locale is omitted, the name is displayed to all users having undefined locales. e.g. \"The ExampleCo Intranet\".")
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public Advanced descriptions(List<String> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public Advanced addDescriptionsItem(String descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

  /**
   * A description of the client or other information that may be relevant to the resource owner when considering approval.&lt;br&gt;&lt;br&gt;The description may be entered as a single string or as pipe separated strings for locale and localized name; e.g. \&quot;en|The company intranet is requesting the following access permission\&quot;. Locale strings are in the format &lt;code&gt;language + \&quot;_\&quot; + country + \&quot;_\&quot; + variant&lt;/code&gt;, e.g. en, en_GB, en_US_WIN. If the locale is omitted, the description is displayed to all users having undefined locales. e.g. \&quot;The company intranet is requesting the following access permission\&quot;.
   * @return descriptions
   **/
  @ApiModelProperty(value = "A description of the client or other information that may be relevant to the resource owner when considering approval.<br><br>The description may be entered as a single string or as pipe separated strings for locale and localized name; e.g. \"en|The company intranet is requesting the following access permission\". Locale strings are in the format <code>language + \"_\" + country + \"_\" + variant</code>, e.g. en, en_GB, en_US_WIN. If the locale is omitted, the description is displayed to all users having undefined locales. e.g. \"The company intranet is requesting the following access permission\".")
  public List<String> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<String> descriptions) {
    this.descriptions = descriptions;
  }

  public Advanced requestUris(List<String> requestUris) {
    this.requestUris = requestUris;
    return this;
  }

  public Advanced addRequestUrisItem(String requestUrisItem) {
    if (this.requestUris == null) {
      this.requestUris = new ArrayList<>();
    }
    this.requestUris.add(requestUrisItem);
    return this;
  }

  /**
   * Array of request_uri values that are pre-registered by the RP for use at the OP.&lt;br&gt;&lt;br&gt;The entire Request URI MUST NOT exceed 512 ASCII characters. Otherwise the value will be ignored.
   * @return requestUris
   **/
  @ApiModelProperty(value = "Array of request_uri values that are pre-registered by the RP for use at the OP.<br><br>The entire Request URI MUST NOT exceed 512 ASCII characters. Otherwise the value will be ignored.")
  public List<String> getRequestUris() {
    return requestUris;
  }

  public void setRequestUris(List<String> requestUris) {
    this.requestUris = requestUris;
  }

  public Advanced responseTypes(List<String> responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

  public Advanced addResponseTypesItem(String responseTypesItem) {
    if (this.responseTypes == null) {
      this.responseTypes = new ArrayList<>();
    }
    this.responseTypes.add(responseTypesItem);
    return this;
  }

  /**
   * Response types this client will support and use.
   * @return responseTypes
   **/
  @ApiModelProperty(value = "Response types this client will support and use.")
  public List<String> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<String> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public Advanced contacts(List<String> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Advanced addContactsItem(String contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Email addresses of users who can administrate this client.
   * @return contacts
   **/
  @ApiModelProperty(value = "Email addresses of users who can administrate this client.")
  public List<String> getContacts() {
    return contacts;
  }

  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }

  public Advanced customProperties(List<String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Advanced addCustomPropertiesItem(String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

  /**
   * Additional properties that allow users to augment the set of properties supported by the OAuth2 Client. &lt;br&gt; Examples: &lt;br&gt; customproperty&#x3D;custom-value1 &lt;br&gt; customlist[0]&#x3D;customlist-value-0 &lt;br&gt; customlist[1]&#x3D;customlist-value-1 &lt;br&gt; custommap[key1]&#x3D;custommap-value-1 &lt;br&gt; custommap[key2]&#x3D;custommap-value-2
   * @return customProperties
   **/
  @ApiModelProperty(value = "Additional properties that allow users to augment the set of properties supported by the OAuth2 Client. <br> Examples: <br> customproperty=custom-value1 <br> customlist[0]=customlist-value-0 <br> customlist[1]=customlist-value-1 <br> custommap[key1]=custommap-value-1 <br> custommap[key2]=custommap-value-2")
  public List<String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(List<String> customProperties) {
    this.customProperties = customProperties;
  }

  public Advanced tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

  /**
   * The authentication method with which a client authenticates to the authorization server at the token endpoint. The authentication method applies to OIDC requests with the openid scope.
   * @return tokenEndpointAuthMethod
   **/
  @ApiModelProperty(value = "The authentication method with which a client authenticates to the authorization server at the token endpoint. The authentication method applies to OIDC requests with the openid scope.")
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public Advanced sectorIdentifierUri(String sectorIdentifierUri) {
    this.sectorIdentifierUri = sectorIdentifierUri;
    return this;
  }

  /**
   * The Host component of this URL is used in the computation of pairwise Subject Identifiers.
   * @return sectorIdentifierUri
   **/
  @ApiModelProperty(value = "The Host component of this URL is used in the computation of pairwise Subject Identifiers.")
  public String getSectorIdentifierUri() {
    return sectorIdentifierUri;
  }

  public void setSectorIdentifierUri(String sectorIdentifierUri) {
    this.sectorIdentifierUri = sectorIdentifierUri;
  }

  public Advanced subjectType(String subjectType) {
    this.subjectType = subjectType;
    return this;
  }

  /**
   * The subject type added to responses for this client.
   * @return subjectType
   **/
  @ApiModelProperty(value = "The subject type added to responses for this client.")
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public Advanced updateAccessToken(String updateAccessToken) {
    this.updateAccessToken = updateAccessToken;
    return this;
  }

  /**
   * The access token used to update the client.
   * @return updateAccessToken
   **/
  @ApiModelProperty(value = "The access token used to update the client.")
  public String getUpdateAccessToken() {
    return updateAccessToken;
  }

  public void setUpdateAccessToken(String updateAccessToken) {
    this.updateAccessToken = updateAccessToken;
  }

  public Advanced isConsentImplied(Boolean isConsentImplied) {
    this.isConsentImplied = isConsentImplied;
    return this;
  }

  /**
   * When enabled, the resource owner will not be asked for consent during authorization flows. The OAuth2 Provider must be configured to allow clients to skip consent.
   * @return isConsentImplied
   **/
  @ApiModelProperty(value = "When enabled, the resource owner will not be asked for consent during authorization flows. The OAuth2 Provider must be configured to allow clients to skip consent.")
  public Boolean isIsConsentImplied() {
    return isConsentImplied;
  }

  public void setIsConsentImplied(Boolean isConsentImplied) {
    this.isConsentImplied = isConsentImplied;
  }

  public Advanced mixUpMitigation(Boolean mixUpMitigation) {
    this.mixUpMitigation = mixUpMitigation;
    return this;
  }

  /**
   * Enables OAuth 2.0 mix-up mitigation on the authorization server side.&lt;br&gt;&lt;br&gt;Enable this setting only if this OAuth 2.0 client supports the &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/draft-ietf-oauth-mix-up-mitigation-01\&quot;&gt;OAuth 2.0 Mix-Up Mitigation draft&lt;/a&gt;, otherwise OpenAM will fail to validate access token requests received from this client.
   * @return mixUpMitigation
   **/
  @ApiModelProperty(value = "Enables OAuth 2.0 mix-up mitigation on the authorization server side.<br><br>Enable this setting only if this OAuth 2.0 client supports the <a href=\"https://tools.ietf.org/html/draft-ietf-oauth-mix-up-mitigation-01\">OAuth 2.0 Mix-Up Mitigation draft</a>, otherwise OpenAM will fail to validate access token requests received from this client.")
  public Boolean isMixUpMitigation() {
    return mixUpMitigation;
  }

  public void setMixUpMitigation(Boolean mixUpMitigation) {
    this.mixUpMitigation = mixUpMitigation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advanced advanced = (Advanced) o;
    return Objects.equals(this.name, advanced.name) &&
            Objects.equals(this.descriptions, advanced.descriptions) &&
            Objects.equals(this.requestUris, advanced.requestUris) &&
            Objects.equals(this.responseTypes, advanced.responseTypes) &&
            Objects.equals(this.contacts, advanced.contacts) &&
            Objects.equals(this.customProperties, advanced.customProperties) &&
            Objects.equals(this.tokenEndpointAuthMethod, advanced.tokenEndpointAuthMethod) &&
            Objects.equals(this.sectorIdentifierUri, advanced.sectorIdentifierUri) &&
            Objects.equals(this.subjectType, advanced.subjectType) &&
            Objects.equals(this.updateAccessToken, advanced.updateAccessToken) &&
            Objects.equals(this.isConsentImplied, advanced.isConsentImplied) &&
            Objects.equals(this.mixUpMitigation, advanced.mixUpMitigation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, descriptions, requestUris, responseTypes, contacts, customProperties, tokenEndpointAuthMethod, sectorIdentifierUri, subjectType, updateAccessToken, isConsentImplied, mixUpMitigation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advanced {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    requestUris: ").append(toIndentedString(requestUris)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    sectorIdentifierUri: ").append(toIndentedString(sectorIdentifierUri)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    updateAccessToken: ").append(toIndentedString(updateAccessToken)).append("\n");
    sb.append("    isConsentImplied: ").append(toIndentedString(isConsentImplied)).append("\n");
    sb.append("    mixUpMitigation: ").append(toIndentedString(mixUpMitigation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

