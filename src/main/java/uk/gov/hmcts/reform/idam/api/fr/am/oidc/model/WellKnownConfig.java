package uk.gov.hmcts.reform.idam.api.fr.am.oidc.model;

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
 * WellKnownConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-20T09:10:11.813+01:00")
public class WellKnownConfig {
  @JsonProperty("request_parameter_supported")
  private Boolean requestParameterSupported = false;

  @JsonProperty("claims_parameter_supported")
  private Boolean claimsParameterSupported = false;

  @JsonProperty("introspection_endpoint")
  private String introspectionEndpoint = null;

  @JsonProperty("check_session_iframe")
  private String checkSessionIframe = null;

  @JsonProperty("scopes_supported")
  private List<String> scopesSupported = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("id_token_encryption_enc_values_supported")
  private List<String> idTokenEncryptionEncValuesSupported = null;

  @JsonProperty("acr_values_supported")
  private List<String> acrValuesSupported = null;

  @JsonProperty("authorization_endpoint")
  private String authorizationEndpoint = null;

  @JsonProperty("request_object_encryption_enc_values_supported")
  private List<String> requestObjectEncryptionEncValuesSupported = null;

  @JsonProperty("rcs_request_encryption_alg_values_supported")
  private List<String> rcsRequestEncryptionAlgValuesSupported = null;

  @JsonProperty("claims_supported")
  private List<String> claimsSupported = null;

  @JsonProperty("rcs_request_signing_alg_values_supported")
  private List<String> rcsRequestSigningAlgValuesSupported = null;

  @JsonProperty("token_endpoint_auth_methods_supported")
  private List<String> tokenEndpointAuthMethodsSupported = null;

  @JsonProperty("token_endpoint")
  private String tokenEndpoint = null;

  @JsonProperty("response_types_supported")
  private List<String> responseTypesSupported = null;

  @JsonProperty("request_uri_parameter_supported")
  private Boolean requestUriParameterSupported = false;

  @JsonProperty("rcs_response_encryption_enc_values_supported")
  private List<String> rcsResponseEncryptionEncValuesSupported = null;

  @JsonProperty("end_session_endpoint")
  private String endSessionEndpoint = "";

  @JsonProperty("rcs_request_encryption_enc_values_supported")
  private List<String> rcsRequestEncryptionEncValuesSupported = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("rcs_response_encryption_alg_values_supported")
  private List<String> rcsResponseEncryptionAlgValuesSupported = null;

  @JsonProperty("userinfo_endpoint")
  private String userinfoEndpoint = null;

  @JsonProperty("id_token_encryption_alg_values_supported")
  private List<String> idTokenEncryptionAlgValuesSupported = null;

  @JsonProperty("jwks_uri")
  private String jwksUri = null;

  @JsonProperty("subject_types_supported")
  private List<String> subjectTypesSupported = null;

  @JsonProperty("id_token_signing_alg_values_supported")
  private List<String> idTokenSigningAlgValuesSupported = null;

  @JsonProperty("registration_endpoint")
  private String registrationEndpoint = null;

  @JsonProperty("request_object_signing_alg_values_supported")
  private List<String> requestObjectSigningAlgValuesSupported = null;

  @JsonProperty("request_object_encryption_alg_values_supported")
  private List<String> requestObjectEncryptionAlgValuesSupported = null;

  @JsonProperty("rcs_response_signing_alg_values_supported")
  private List<String> rcsResponseSigningAlgValuesSupported = null;

  public WellKnownConfig requestParameterSupported(Boolean requestParameterSupported) {
    this.requestParameterSupported = requestParameterSupported;
    return this;
  }

  /**
   * Get requestParameterSupported
   * @return requestParameterSupported
   **/
  @ApiModelProperty(value = "")
  public Boolean isRequestParameterSupported() {
    return requestParameterSupported;
  }

  public void setRequestParameterSupported(Boolean requestParameterSupported) {
    this.requestParameterSupported = requestParameterSupported;
  }

  public WellKnownConfig claimsParameterSupported(Boolean claimsParameterSupported) {
    this.claimsParameterSupported = claimsParameterSupported;
    return this;
  }

  /**
   * Get claimsParameterSupported
   * @return claimsParameterSupported
   **/
  @ApiModelProperty(value = "")
  public Boolean isClaimsParameterSupported() {
    return claimsParameterSupported;
  }

  public void setClaimsParameterSupported(Boolean claimsParameterSupported) {
    this.claimsParameterSupported = claimsParameterSupported;
  }

  public WellKnownConfig introspectionEndpoint(String introspectionEndpoint) {
    this.introspectionEndpoint = introspectionEndpoint;
    return this;
  }

  /**
   * Get introspectionEndpoint
   * @return introspectionEndpoint
   **/
  @ApiModelProperty(value = "")
  public String getIntrospectionEndpoint() {
    return introspectionEndpoint;
  }

  public void setIntrospectionEndpoint(String introspectionEndpoint) {
    this.introspectionEndpoint = introspectionEndpoint;
  }

  public WellKnownConfig checkSessionIframe(String checkSessionIframe) {
    this.checkSessionIframe = checkSessionIframe;
    return this;
  }

  /**
   * Get checkSessionIframe
   * @return checkSessionIframe
   **/
  @ApiModelProperty(value = "")
  public String getCheckSessionIframe() {
    return checkSessionIframe;
  }

  public void setCheckSessionIframe(String checkSessionIframe) {
    this.checkSessionIframe = checkSessionIframe;
  }

  public WellKnownConfig scopesSupported(List<String> scopesSupported) {
    this.scopesSupported = scopesSupported;
    return this;
  }

  public WellKnownConfig addScopesSupportedItem(String scopesSupportedItem) {
    if (this.scopesSupported == null) {
      this.scopesSupported = new ArrayList<>();
    }
    this.scopesSupported.add(scopesSupportedItem);
    return this;
  }

  /**
   * Get scopesSupported
   * @return scopesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getScopesSupported() {
    return scopesSupported;
  }

  public void setScopesSupported(List<String> scopesSupported) {
    this.scopesSupported = scopesSupported;
  }

  public WellKnownConfig issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   **/
  @ApiModelProperty(value = "")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public WellKnownConfig idTokenEncryptionEncValuesSupported(List<String> idTokenEncryptionEncValuesSupported) {
    this.idTokenEncryptionEncValuesSupported = idTokenEncryptionEncValuesSupported;
    return this;
  }

  public WellKnownConfig addIdTokenEncryptionEncValuesSupportedItem(String idTokenEncryptionEncValuesSupportedItem) {
    if (this.idTokenEncryptionEncValuesSupported == null) {
      this.idTokenEncryptionEncValuesSupported = new ArrayList<>();
    }
    this.idTokenEncryptionEncValuesSupported.add(idTokenEncryptionEncValuesSupportedItem);
    return this;
  }

  /**
   * Get idTokenEncryptionEncValuesSupported
   * @return idTokenEncryptionEncValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getIdTokenEncryptionEncValuesSupported() {
    return idTokenEncryptionEncValuesSupported;
  }

  public void setIdTokenEncryptionEncValuesSupported(List<String> idTokenEncryptionEncValuesSupported) {
    this.idTokenEncryptionEncValuesSupported = idTokenEncryptionEncValuesSupported;
  }

  public WellKnownConfig acrValuesSupported(List<String> acrValuesSupported) {
    this.acrValuesSupported = acrValuesSupported;
    return this;
  }

  public WellKnownConfig addAcrValuesSupportedItem(String acrValuesSupportedItem) {
    if (this.acrValuesSupported == null) {
      this.acrValuesSupported = new ArrayList<>();
    }
    this.acrValuesSupported.add(acrValuesSupportedItem);
    return this;
  }

  /**
   * Get acrValuesSupported
   * @return acrValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getAcrValuesSupported() {
    return acrValuesSupported;
  }

  public void setAcrValuesSupported(List<String> acrValuesSupported) {
    this.acrValuesSupported = acrValuesSupported;
  }

  public WellKnownConfig authorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
    return this;
  }

  /**
   * Get authorizationEndpoint
   * @return authorizationEndpoint
   **/
  @ApiModelProperty(value = "")
  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }

  public void setAuthorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
  }

  public WellKnownConfig requestObjectEncryptionEncValuesSupported(List<String> requestObjectEncryptionEncValuesSupported) {
    this.requestObjectEncryptionEncValuesSupported = requestObjectEncryptionEncValuesSupported;
    return this;
  }

  public WellKnownConfig addRequestObjectEncryptionEncValuesSupportedItem(String requestObjectEncryptionEncValuesSupportedItem) {
    if (this.requestObjectEncryptionEncValuesSupported == null) {
      this.requestObjectEncryptionEncValuesSupported = new ArrayList<>();
    }
    this.requestObjectEncryptionEncValuesSupported.add(requestObjectEncryptionEncValuesSupportedItem);
    return this;
  }

  /**
   * Get requestObjectEncryptionEncValuesSupported
   * @return requestObjectEncryptionEncValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRequestObjectEncryptionEncValuesSupported() {
    return requestObjectEncryptionEncValuesSupported;
  }

  public void setRequestObjectEncryptionEncValuesSupported(List<String> requestObjectEncryptionEncValuesSupported) {
    this.requestObjectEncryptionEncValuesSupported = requestObjectEncryptionEncValuesSupported;
  }

  public WellKnownConfig rcsRequestEncryptionAlgValuesSupported(List<String> rcsRequestEncryptionAlgValuesSupported) {
    this.rcsRequestEncryptionAlgValuesSupported = rcsRequestEncryptionAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addRcsRequestEncryptionAlgValuesSupportedItem(String rcsRequestEncryptionAlgValuesSupportedItem) {
    if (this.rcsRequestEncryptionAlgValuesSupported == null) {
      this.rcsRequestEncryptionAlgValuesSupported = new ArrayList<>();
    }
    this.rcsRequestEncryptionAlgValuesSupported.add(rcsRequestEncryptionAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get rcsRequestEncryptionAlgValuesSupported
   * @return rcsRequestEncryptionAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRcsRequestEncryptionAlgValuesSupported() {
    return rcsRequestEncryptionAlgValuesSupported;
  }

  public void setRcsRequestEncryptionAlgValuesSupported(List<String> rcsRequestEncryptionAlgValuesSupported) {
    this.rcsRequestEncryptionAlgValuesSupported = rcsRequestEncryptionAlgValuesSupported;
  }

  public WellKnownConfig claimsSupported(List<String> claimsSupported) {
    this.claimsSupported = claimsSupported;
    return this;
  }

  public WellKnownConfig addClaimsSupportedItem(String claimsSupportedItem) {
    if (this.claimsSupported == null) {
      this.claimsSupported = new ArrayList<>();
    }
    this.claimsSupported.add(claimsSupportedItem);
    return this;
  }

  /**
   * Get claimsSupported
   * @return claimsSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getClaimsSupported() {
    return claimsSupported;
  }

  public void setClaimsSupported(List<String> claimsSupported) {
    this.claimsSupported = claimsSupported;
  }

  public WellKnownConfig rcsRequestSigningAlgValuesSupported(List<String> rcsRequestSigningAlgValuesSupported) {
    this.rcsRequestSigningAlgValuesSupported = rcsRequestSigningAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addRcsRequestSigningAlgValuesSupportedItem(String rcsRequestSigningAlgValuesSupportedItem) {
    if (this.rcsRequestSigningAlgValuesSupported == null) {
      this.rcsRequestSigningAlgValuesSupported = new ArrayList<>();
    }
    this.rcsRequestSigningAlgValuesSupported.add(rcsRequestSigningAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get rcsRequestSigningAlgValuesSupported
   * @return rcsRequestSigningAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRcsRequestSigningAlgValuesSupported() {
    return rcsRequestSigningAlgValuesSupported;
  }

  public void setRcsRequestSigningAlgValuesSupported(List<String> rcsRequestSigningAlgValuesSupported) {
    this.rcsRequestSigningAlgValuesSupported = rcsRequestSigningAlgValuesSupported;
  }

  public WellKnownConfig tokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
    this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    return this;
  }

  public WellKnownConfig addTokenEndpointAuthMethodsSupportedItem(String tokenEndpointAuthMethodsSupportedItem) {
    if (this.tokenEndpointAuthMethodsSupported == null) {
      this.tokenEndpointAuthMethodsSupported = new ArrayList<>();
    }
    this.tokenEndpointAuthMethodsSupported.add(tokenEndpointAuthMethodsSupportedItem);
    return this;
  }

  /**
   * Get tokenEndpointAuthMethodsSupported
   * @return tokenEndpointAuthMethodsSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getTokenEndpointAuthMethodsSupported() {
    return tokenEndpointAuthMethodsSupported;
  }

  public void setTokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
    this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
  }

  public WellKnownConfig tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * Get tokenEndpoint
   * @return tokenEndpoint
   **/
  @ApiModelProperty(value = "")
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }

  public WellKnownConfig responseTypesSupported(List<String> responseTypesSupported) {
    this.responseTypesSupported = responseTypesSupported;
    return this;
  }

  public WellKnownConfig addResponseTypesSupportedItem(String responseTypesSupportedItem) {
    if (this.responseTypesSupported == null) {
      this.responseTypesSupported = new ArrayList<>();
    }
    this.responseTypesSupported.add(responseTypesSupportedItem);
    return this;
  }

  /**
   * Get responseTypesSupported
   * @return responseTypesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getResponseTypesSupported() {
    return responseTypesSupported;
  }

  public void setResponseTypesSupported(List<String> responseTypesSupported) {
    this.responseTypesSupported = responseTypesSupported;
  }

  public WellKnownConfig requestUriParameterSupported(Boolean requestUriParameterSupported) {
    this.requestUriParameterSupported = requestUriParameterSupported;
    return this;
  }

  /**
   * Get requestUriParameterSupported
   * @return requestUriParameterSupported
   **/
  @ApiModelProperty(value = "")
  public Boolean isRequestUriParameterSupported() {
    return requestUriParameterSupported;
  }

  public void setRequestUriParameterSupported(Boolean requestUriParameterSupported) {
    this.requestUriParameterSupported = requestUriParameterSupported;
  }

  public WellKnownConfig rcsResponseEncryptionEncValuesSupported(List<String> rcsResponseEncryptionEncValuesSupported) {
    this.rcsResponseEncryptionEncValuesSupported = rcsResponseEncryptionEncValuesSupported;
    return this;
  }

  public WellKnownConfig addRcsResponseEncryptionEncValuesSupportedItem(String rcsResponseEncryptionEncValuesSupportedItem) {
    if (this.rcsResponseEncryptionEncValuesSupported == null) {
      this.rcsResponseEncryptionEncValuesSupported = new ArrayList<>();
    }
    this.rcsResponseEncryptionEncValuesSupported.add(rcsResponseEncryptionEncValuesSupportedItem);
    return this;
  }

  /**
   * Get rcsResponseEncryptionEncValuesSupported
   * @return rcsResponseEncryptionEncValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRcsResponseEncryptionEncValuesSupported() {
    return rcsResponseEncryptionEncValuesSupported;
  }

  public void setRcsResponseEncryptionEncValuesSupported(List<String> rcsResponseEncryptionEncValuesSupported) {
    this.rcsResponseEncryptionEncValuesSupported = rcsResponseEncryptionEncValuesSupported;
  }

  public WellKnownConfig endSessionEndpoint(String endSessionEndpoint) {
    this.endSessionEndpoint = endSessionEndpoint;
    return this;
  }

  /**
   * Get endSessionEndpoint
   * @return endSessionEndpoint
   **/
  @ApiModelProperty(value = "")
  public String getEndSessionEndpoint() {
    return endSessionEndpoint;
  }

  public void setEndSessionEndpoint(String endSessionEndpoint) {
    this.endSessionEndpoint = endSessionEndpoint;
  }

  public WellKnownConfig rcsRequestEncryptionEncValuesSupported(List<String> rcsRequestEncryptionEncValuesSupported) {
    this.rcsRequestEncryptionEncValuesSupported = rcsRequestEncryptionEncValuesSupported;
    return this;
  }

  public WellKnownConfig addRcsRequestEncryptionEncValuesSupportedItem(String rcsRequestEncryptionEncValuesSupportedItem) {
    if (this.rcsRequestEncryptionEncValuesSupported == null) {
      this.rcsRequestEncryptionEncValuesSupported = new ArrayList<>();
    }
    this.rcsRequestEncryptionEncValuesSupported.add(rcsRequestEncryptionEncValuesSupportedItem);
    return this;
  }

  /**
   * Get rcsRequestEncryptionEncValuesSupported
   * @return rcsRequestEncryptionEncValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRcsRequestEncryptionEncValuesSupported() {
    return rcsRequestEncryptionEncValuesSupported;
  }

  public void setRcsRequestEncryptionEncValuesSupported(List<String> rcsRequestEncryptionEncValuesSupported) {
    this.rcsRequestEncryptionEncValuesSupported = rcsRequestEncryptionEncValuesSupported;
  }

  public WellKnownConfig version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public WellKnownConfig rcsResponseEncryptionAlgValuesSupported(List<String> rcsResponseEncryptionAlgValuesSupported) {
    this.rcsResponseEncryptionAlgValuesSupported = rcsResponseEncryptionAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addRcsResponseEncryptionAlgValuesSupportedItem(String rcsResponseEncryptionAlgValuesSupportedItem) {
    if (this.rcsResponseEncryptionAlgValuesSupported == null) {
      this.rcsResponseEncryptionAlgValuesSupported = new ArrayList<>();
    }
    this.rcsResponseEncryptionAlgValuesSupported.add(rcsResponseEncryptionAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get rcsResponseEncryptionAlgValuesSupported
   * @return rcsResponseEncryptionAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRcsResponseEncryptionAlgValuesSupported() {
    return rcsResponseEncryptionAlgValuesSupported;
  }

  public void setRcsResponseEncryptionAlgValuesSupported(List<String> rcsResponseEncryptionAlgValuesSupported) {
    this.rcsResponseEncryptionAlgValuesSupported = rcsResponseEncryptionAlgValuesSupported;
  }

  public WellKnownConfig userinfoEndpoint(String userinfoEndpoint) {
    this.userinfoEndpoint = userinfoEndpoint;
    return this;
  }

  /**
   * Get userinfoEndpoint
   * @return userinfoEndpoint
   **/
  @ApiModelProperty(value = "")
  public String getUserinfoEndpoint() {
    return userinfoEndpoint;
  }

  public void setUserinfoEndpoint(String userinfoEndpoint) {
    this.userinfoEndpoint = userinfoEndpoint;
  }

  public WellKnownConfig idTokenEncryptionAlgValuesSupported(List<String> idTokenEncryptionAlgValuesSupported) {
    this.idTokenEncryptionAlgValuesSupported = idTokenEncryptionAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addIdTokenEncryptionAlgValuesSupportedItem(String idTokenEncryptionAlgValuesSupportedItem) {
    if (this.idTokenEncryptionAlgValuesSupported == null) {
      this.idTokenEncryptionAlgValuesSupported = new ArrayList<>();
    }
    this.idTokenEncryptionAlgValuesSupported.add(idTokenEncryptionAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get idTokenEncryptionAlgValuesSupported
   * @return idTokenEncryptionAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getIdTokenEncryptionAlgValuesSupported() {
    return idTokenEncryptionAlgValuesSupported;
  }

  public void setIdTokenEncryptionAlgValuesSupported(List<String> idTokenEncryptionAlgValuesSupported) {
    this.idTokenEncryptionAlgValuesSupported = idTokenEncryptionAlgValuesSupported;
  }

  public WellKnownConfig jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * Get jwksUri
   * @return jwksUri
   **/
  @ApiModelProperty(value = "")
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public WellKnownConfig subjectTypesSupported(List<String> subjectTypesSupported) {
    this.subjectTypesSupported = subjectTypesSupported;
    return this;
  }

  public WellKnownConfig addSubjectTypesSupportedItem(String subjectTypesSupportedItem) {
    if (this.subjectTypesSupported == null) {
      this.subjectTypesSupported = new ArrayList<>();
    }
    this.subjectTypesSupported.add(subjectTypesSupportedItem);
    return this;
  }

  /**
   * Get subjectTypesSupported
   * @return subjectTypesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getSubjectTypesSupported() {
    return subjectTypesSupported;
  }

  public void setSubjectTypesSupported(List<String> subjectTypesSupported) {
    this.subjectTypesSupported = subjectTypesSupported;
  }

  public WellKnownConfig idTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addIdTokenSigningAlgValuesSupportedItem(String idTokenSigningAlgValuesSupportedItem) {
    if (this.idTokenSigningAlgValuesSupported == null) {
      this.idTokenSigningAlgValuesSupported = new ArrayList<>();
    }
    this.idTokenSigningAlgValuesSupported.add(idTokenSigningAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get idTokenSigningAlgValuesSupported
   * @return idTokenSigningAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getIdTokenSigningAlgValuesSupported() {
    return idTokenSigningAlgValuesSupported;
  }

  public void setIdTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
  }

  public WellKnownConfig registrationEndpoint(String registrationEndpoint) {
    this.registrationEndpoint = registrationEndpoint;
    return this;
  }

  /**
   * Get registrationEndpoint
   * @return registrationEndpoint
   **/
  @ApiModelProperty(value = "")
  public String getRegistrationEndpoint() {
    return registrationEndpoint;
  }

  public void setRegistrationEndpoint(String registrationEndpoint) {
    this.registrationEndpoint = registrationEndpoint;
  }

  public WellKnownConfig requestObjectSigningAlgValuesSupported(List<String> requestObjectSigningAlgValuesSupported) {
    this.requestObjectSigningAlgValuesSupported = requestObjectSigningAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addRequestObjectSigningAlgValuesSupportedItem(String requestObjectSigningAlgValuesSupportedItem) {
    if (this.requestObjectSigningAlgValuesSupported == null) {
      this.requestObjectSigningAlgValuesSupported = new ArrayList<>();
    }
    this.requestObjectSigningAlgValuesSupported.add(requestObjectSigningAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get requestObjectSigningAlgValuesSupported
   * @return requestObjectSigningAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRequestObjectSigningAlgValuesSupported() {
    return requestObjectSigningAlgValuesSupported;
  }

  public void setRequestObjectSigningAlgValuesSupported(List<String> requestObjectSigningAlgValuesSupported) {
    this.requestObjectSigningAlgValuesSupported = requestObjectSigningAlgValuesSupported;
  }

  public WellKnownConfig requestObjectEncryptionAlgValuesSupported(List<String> requestObjectEncryptionAlgValuesSupported) {
    this.requestObjectEncryptionAlgValuesSupported = requestObjectEncryptionAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addRequestObjectEncryptionAlgValuesSupportedItem(String requestObjectEncryptionAlgValuesSupportedItem) {
    if (this.requestObjectEncryptionAlgValuesSupported == null) {
      this.requestObjectEncryptionAlgValuesSupported = new ArrayList<>();
    }
    this.requestObjectEncryptionAlgValuesSupported.add(requestObjectEncryptionAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get requestObjectEncryptionAlgValuesSupported
   * @return requestObjectEncryptionAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRequestObjectEncryptionAlgValuesSupported() {
    return requestObjectEncryptionAlgValuesSupported;
  }

  public void setRequestObjectEncryptionAlgValuesSupported(List<String> requestObjectEncryptionAlgValuesSupported) {
    this.requestObjectEncryptionAlgValuesSupported = requestObjectEncryptionAlgValuesSupported;
  }

  public WellKnownConfig rcsResponseSigningAlgValuesSupported(List<String> rcsResponseSigningAlgValuesSupported) {
    this.rcsResponseSigningAlgValuesSupported = rcsResponseSigningAlgValuesSupported;
    return this;
  }

  public WellKnownConfig addRcsResponseSigningAlgValuesSupportedItem(String rcsResponseSigningAlgValuesSupportedItem) {
    if (this.rcsResponseSigningAlgValuesSupported == null) {
      this.rcsResponseSigningAlgValuesSupported = new ArrayList<>();
    }
    this.rcsResponseSigningAlgValuesSupported.add(rcsResponseSigningAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get rcsResponseSigningAlgValuesSupported
   * @return rcsResponseSigningAlgValuesSupported
   **/
  @ApiModelProperty(value = "")
  public List<String> getRcsResponseSigningAlgValuesSupported() {
    return rcsResponseSigningAlgValuesSupported;
  }

  public void setRcsResponseSigningAlgValuesSupported(List<String> rcsResponseSigningAlgValuesSupported) {
    this.rcsResponseSigningAlgValuesSupported = rcsResponseSigningAlgValuesSupported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WellKnownConfig wellKnownConfig = (WellKnownConfig) o;
    return Objects.equals(this.requestParameterSupported, wellKnownConfig.requestParameterSupported) &&
            Objects.equals(this.claimsParameterSupported, wellKnownConfig.claimsParameterSupported) &&
            Objects.equals(this.introspectionEndpoint, wellKnownConfig.introspectionEndpoint) &&
            Objects.equals(this.checkSessionIframe, wellKnownConfig.checkSessionIframe) &&
            Objects.equals(this.scopesSupported, wellKnownConfig.scopesSupported) &&
            Objects.equals(this.issuer, wellKnownConfig.issuer) &&
            Objects.equals(this.idTokenEncryptionEncValuesSupported, wellKnownConfig.idTokenEncryptionEncValuesSupported) &&
            Objects.equals(this.acrValuesSupported, wellKnownConfig.acrValuesSupported) &&
            Objects.equals(this.authorizationEndpoint, wellKnownConfig.authorizationEndpoint) &&
            Objects.equals(this.requestObjectEncryptionEncValuesSupported, wellKnownConfig.requestObjectEncryptionEncValuesSupported) &&
            Objects.equals(this.rcsRequestEncryptionAlgValuesSupported, wellKnownConfig.rcsRequestEncryptionAlgValuesSupported) &&
            Objects.equals(this.claimsSupported, wellKnownConfig.claimsSupported) &&
            Objects.equals(this.rcsRequestSigningAlgValuesSupported, wellKnownConfig.rcsRequestSigningAlgValuesSupported) &&
            Objects.equals(this.tokenEndpointAuthMethodsSupported, wellKnownConfig.tokenEndpointAuthMethodsSupported) &&
            Objects.equals(this.tokenEndpoint, wellKnownConfig.tokenEndpoint) &&
            Objects.equals(this.responseTypesSupported, wellKnownConfig.responseTypesSupported) &&
            Objects.equals(this.requestUriParameterSupported, wellKnownConfig.requestUriParameterSupported) &&
            Objects.equals(this.rcsResponseEncryptionEncValuesSupported, wellKnownConfig.rcsResponseEncryptionEncValuesSupported) &&
            Objects.equals(this.endSessionEndpoint, wellKnownConfig.endSessionEndpoint) &&
            Objects.equals(this.rcsRequestEncryptionEncValuesSupported, wellKnownConfig.rcsRequestEncryptionEncValuesSupported) &&
            Objects.equals(this.version, wellKnownConfig.version) &&
            Objects.equals(this.rcsResponseEncryptionAlgValuesSupported, wellKnownConfig.rcsResponseEncryptionAlgValuesSupported) &&
            Objects.equals(this.userinfoEndpoint, wellKnownConfig.userinfoEndpoint) &&
            Objects.equals(this.idTokenEncryptionAlgValuesSupported, wellKnownConfig.idTokenEncryptionAlgValuesSupported) &&
            Objects.equals(this.jwksUri, wellKnownConfig.jwksUri) &&
            Objects.equals(this.subjectTypesSupported, wellKnownConfig.subjectTypesSupported) &&
            Objects.equals(this.idTokenSigningAlgValuesSupported, wellKnownConfig.idTokenSigningAlgValuesSupported) &&
            Objects.equals(this.registrationEndpoint, wellKnownConfig.registrationEndpoint) &&
            Objects.equals(this.requestObjectSigningAlgValuesSupported, wellKnownConfig.requestObjectSigningAlgValuesSupported) &&
            Objects.equals(this.requestObjectEncryptionAlgValuesSupported, wellKnownConfig.requestObjectEncryptionAlgValuesSupported) &&
            Objects.equals(this.rcsResponseSigningAlgValuesSupported, wellKnownConfig.rcsResponseSigningAlgValuesSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestParameterSupported, claimsParameterSupported, introspectionEndpoint, checkSessionIframe, scopesSupported, issuer, idTokenEncryptionEncValuesSupported, acrValuesSupported, authorizationEndpoint, requestObjectEncryptionEncValuesSupported, rcsRequestEncryptionAlgValuesSupported, claimsSupported, rcsRequestSigningAlgValuesSupported, tokenEndpointAuthMethodsSupported, tokenEndpoint, responseTypesSupported, requestUriParameterSupported, rcsResponseEncryptionEncValuesSupported, endSessionEndpoint, rcsRequestEncryptionEncValuesSupported, version, rcsResponseEncryptionAlgValuesSupported, userinfoEndpoint, idTokenEncryptionAlgValuesSupported, jwksUri, subjectTypesSupported, idTokenSigningAlgValuesSupported, registrationEndpoint, requestObjectSigningAlgValuesSupported, requestObjectEncryptionAlgValuesSupported, rcsResponseSigningAlgValuesSupported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WellKnownConfig {\n");

    sb.append("    requestParameterSupported: ").append(toIndentedString(requestParameterSupported)).append("\n");
    sb.append("    claimsParameterSupported: ").append(toIndentedString(claimsParameterSupported)).append("\n");
    sb.append("    introspectionEndpoint: ").append(toIndentedString(introspectionEndpoint)).append("\n");
    sb.append("    checkSessionIframe: ").append(toIndentedString(checkSessionIframe)).append("\n");
    sb.append("    scopesSupported: ").append(toIndentedString(scopesSupported)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    idTokenEncryptionEncValuesSupported: ").append(toIndentedString(idTokenEncryptionEncValuesSupported)).append("\n");
    sb.append("    acrValuesSupported: ").append(toIndentedString(acrValuesSupported)).append("\n");
    sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
    sb.append("    requestObjectEncryptionEncValuesSupported: ").append(toIndentedString(requestObjectEncryptionEncValuesSupported)).append("\n");
    sb.append("    rcsRequestEncryptionAlgValuesSupported: ").append(toIndentedString(rcsRequestEncryptionAlgValuesSupported)).append("\n");
    sb.append("    claimsSupported: ").append(toIndentedString(claimsSupported)).append("\n");
    sb.append("    rcsRequestSigningAlgValuesSupported: ").append(toIndentedString(rcsRequestSigningAlgValuesSupported)).append("\n");
    sb.append("    tokenEndpointAuthMethodsSupported: ").append(toIndentedString(tokenEndpointAuthMethodsSupported)).append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
    sb.append("    responseTypesSupported: ").append(toIndentedString(responseTypesSupported)).append("\n");
    sb.append("    requestUriParameterSupported: ").append(toIndentedString(requestUriParameterSupported)).append("\n");
    sb.append("    rcsResponseEncryptionEncValuesSupported: ").append(toIndentedString(rcsResponseEncryptionEncValuesSupported)).append("\n");
    sb.append("    endSessionEndpoint: ").append(toIndentedString(endSessionEndpoint)).append("\n");
    sb.append("    rcsRequestEncryptionEncValuesSupported: ").append(toIndentedString(rcsRequestEncryptionEncValuesSupported)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    rcsResponseEncryptionAlgValuesSupported: ").append(toIndentedString(rcsResponseEncryptionAlgValuesSupported)).append("\n");
    sb.append("    userinfoEndpoint: ").append(toIndentedString(userinfoEndpoint)).append("\n");
    sb.append("    idTokenEncryptionAlgValuesSupported: ").append(toIndentedString(idTokenEncryptionAlgValuesSupported)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    subjectTypesSupported: ").append(toIndentedString(subjectTypesSupported)).append("\n");
    sb.append("    idTokenSigningAlgValuesSupported: ").append(toIndentedString(idTokenSigningAlgValuesSupported)).append("\n");
    sb.append("    registrationEndpoint: ").append(toIndentedString(registrationEndpoint)).append("\n");
    sb.append("    requestObjectSigningAlgValuesSupported: ").append(toIndentedString(requestObjectSigningAlgValuesSupported)).append("\n");
    sb.append("    requestObjectEncryptionAlgValuesSupported: ").append(toIndentedString(requestObjectEncryptionAlgValuesSupported)).append("\n");
    sb.append("    rcsResponseSigningAlgValuesSupported: ").append(toIndentedString(rcsResponseSigningAlgValuesSupported)).append("\n");
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
