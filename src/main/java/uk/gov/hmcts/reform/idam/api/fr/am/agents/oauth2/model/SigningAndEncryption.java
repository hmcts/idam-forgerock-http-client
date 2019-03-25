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

/**
 * SigningAndEncryption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.026Z")
public class SigningAndEncryption {
  @JsonProperty("jwksUri")
  private String jwksUri = null;

  @JsonProperty("jwksCacheTimeout")
  private Integer jwksCacheTimeout = null;

  @JsonProperty("jwkStoreCacheMissCacheTime")
  private Integer jwkStoreCacheMissCacheTime = null;

  @JsonProperty("tokenEndpointAuthSigningAlgorithm")
  private String tokenEndpointAuthSigningAlgorithm = null;

  @JsonProperty("jwkSet")
  private String jwkSet = null;

  @JsonProperty("idTokenSignedResponseAlg")
  private String idTokenSignedResponseAlg = null;

  @JsonProperty("idTokenEncryptionEnabled")
  private Boolean idTokenEncryptionEnabled = null;

  @JsonProperty("idTokenEncryptionAlgorithm")
  private String idTokenEncryptionAlgorithm = null;

  @JsonProperty("idTokenEncryptionMethod")
  private String idTokenEncryptionMethod = null;

  @JsonProperty("idTokenPublicEncryptionKey")
  private String idTokenPublicEncryptionKey = null;

  @JsonProperty("clientJwtPublicKey")
  private String clientJwtPublicKey = null;

  @JsonProperty("publicKeyLocation")
  private String publicKeyLocation = null;

  @JsonProperty("userinfoResponseFormat")
  private String userinfoResponseFormat = null;

  @JsonProperty("userinfoSignedResponseAlg")
  private String userinfoSignedResponseAlg = null;

  @JsonProperty("userinfoEncryptedResponseAlg")
  private String userinfoEncryptedResponseAlg = null;

  @JsonProperty("userinfoEncryptedResponseEncryptionAlgorithm")
  private String userinfoEncryptedResponseEncryptionAlgorithm = null;

  @JsonProperty("requestParameterSignedAlg")
  private String requestParameterSignedAlg = null;

  @JsonProperty("requestParameterEncryptedAlg")
  private String requestParameterEncryptedAlg = null;

  @JsonProperty("requestParameterEncryptedEncryptionAlgorithm")
  private String requestParameterEncryptedEncryptionAlgorithm = null;

  public SigningAndEncryption jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

   /**
   * The uri that contains the client&#39;s public keys in Json Web Key format.
   * @return jwksUri
  **/
  @ApiModelProperty(value = "The uri that contains the client's public keys in Json Web Key format.")
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public SigningAndEncryption jwksCacheTimeout(Integer jwksCacheTimeout) {
    this.jwksCacheTimeout = jwksCacheTimeout;
    return this;
  }

   /**
   * To avoid loading the JWKS URI content for every token encryption, the JWKS content is cached. This timeout defines the maximum of time the JWKS URI content can be cached before being refreshed.
   * @return jwksCacheTimeout
  **/
  @ApiModelProperty(value = "To avoid loading the JWKS URI content for every token encryption, the JWKS content is cached. This timeout defines the maximum of time the JWKS URI content can be cached before being refreshed.")
  public Integer getJwksCacheTimeout() {
    return jwksCacheTimeout;
  }

  public void setJwksCacheTimeout(Integer jwksCacheTimeout) {
    this.jwksCacheTimeout = jwksCacheTimeout;
  }

  public SigningAndEncryption jwkStoreCacheMissCacheTime(Integer jwkStoreCacheMissCacheTime) {
    this.jwkStoreCacheMissCacheTime = jwkStoreCacheMissCacheTime;
    return this;
  }

   /**
   * To avoid loading the JWKS URI content for every token signature verification, especially when the kid is not in the jwks content already cached, the JWKS content will be cache for a minimum period of time. This cache miss cache time defines the minimum of time the JWKS URI content is cache.
   * @return jwkStoreCacheMissCacheTime
  **/
  @ApiModelProperty(value = "To avoid loading the JWKS URI content for every token signature verification, especially when the kid is not in the jwks content already cached, the JWKS content will be cache for a minimum period of time. This cache miss cache time defines the minimum of time the JWKS URI content is cache.")
  public Integer getJwkStoreCacheMissCacheTime() {
    return jwkStoreCacheMissCacheTime;
  }

  public void setJwkStoreCacheMissCacheTime(Integer jwkStoreCacheMissCacheTime) {
    this.jwkStoreCacheMissCacheTime = jwkStoreCacheMissCacheTime;
  }

  public SigningAndEncryption tokenEndpointAuthSigningAlgorithm(String tokenEndpointAuthSigningAlgorithm) {
    this.tokenEndpointAuthSigningAlgorithm = tokenEndpointAuthSigningAlgorithm;
    return this;
  }

   /**
   * The JWS algorithm that MUST be used for signing the JWT used to authenticate the Client at the Token Endpointfor the private_key_jwt and client_secret_jwt authentication methods. All Token Requests using these authentication methods from this Client MUST be rejected, if the JWT is not signed with this algorithm.
   * @return tokenEndpointAuthSigningAlgorithm
  **/
  @ApiModelProperty(value = "The JWS algorithm that MUST be used for signing the JWT used to authenticate the Client at the Token Endpointfor the private_key_jwt and client_secret_jwt authentication methods. All Token Requests using these authentication methods from this Client MUST be rejected, if the JWT is not signed with this algorithm.")
  public String getTokenEndpointAuthSigningAlgorithm() {
    return tokenEndpointAuthSigningAlgorithm;
  }

  public void setTokenEndpointAuthSigningAlgorithm(String tokenEndpointAuthSigningAlgorithm) {
    this.tokenEndpointAuthSigningAlgorithm = tokenEndpointAuthSigningAlgorithm;
  }

  public SigningAndEncryption jwkSet(String jwkSet) {
    this.jwkSet = jwkSet;
    return this;
  }

   /**
   * Raw JSON Web Key value containing the client&#39;s public keys.
   * @return jwkSet
  **/
  @ApiModelProperty(value = "Raw JSON Web Key value containing the client's public keys.")
  public String getJwkSet() {
    return jwkSet;
  }

  public void setJwkSet(String jwkSet) {
    this.jwkSet = jwkSet;
  }

  public SigningAndEncryption idTokenSignedResponseAlg(String idTokenSignedResponseAlg) {
    this.idTokenSignedResponseAlg = idTokenSignedResponseAlg;
    return this;
  }

   /**
   * Algorithm the ID Token for this client must be signed with.
   * @return idTokenSignedResponseAlg
  **/
  @ApiModelProperty(value = "Algorithm the ID Token for this client must be signed with.")
  public String getIdTokenSignedResponseAlg() {
    return idTokenSignedResponseAlg;
  }

  public void setIdTokenSignedResponseAlg(String idTokenSignedResponseAlg) {
    this.idTokenSignedResponseAlg = idTokenSignedResponseAlg;
  }

  public SigningAndEncryption idTokenEncryptionEnabled(Boolean idTokenEncryptionEnabled) {
    this.idTokenEncryptionEnabled = idTokenEncryptionEnabled;
    return this;
  }

   /**
   * Select to enable ID token encryption.
   * @return idTokenEncryptionEnabled
  **/
  @ApiModelProperty(value = "Select to enable ID token encryption.")
  public Boolean isIdTokenEncryptionEnabled() {
    return idTokenEncryptionEnabled;
  }

  public void setIdTokenEncryptionEnabled(Boolean idTokenEncryptionEnabled) {
    this.idTokenEncryptionEnabled = idTokenEncryptionEnabled;
  }

  public SigningAndEncryption idTokenEncryptionAlgorithm(String idTokenEncryptionAlgorithm) {
    this.idTokenEncryptionAlgorithm = idTokenEncryptionAlgorithm;
    return this;
  }

   /**
   * Algorithm the ID Token for this client must be encrypted with.
   * @return idTokenEncryptionAlgorithm
  **/
  @ApiModelProperty(value = "Algorithm the ID Token for this client must be encrypted with.")
  public String getIdTokenEncryptionAlgorithm() {
    return idTokenEncryptionAlgorithm;
  }

  public void setIdTokenEncryptionAlgorithm(String idTokenEncryptionAlgorithm) {
    this.idTokenEncryptionAlgorithm = idTokenEncryptionAlgorithm;
  }

  public SigningAndEncryption idTokenEncryptionMethod(String idTokenEncryptionMethod) {
    this.idTokenEncryptionMethod = idTokenEncryptionMethod;
    return this;
  }

   /**
   * Encryption method the ID Token for this client must be encrypted with.
   * @return idTokenEncryptionMethod
  **/
  @ApiModelProperty(value = "Encryption method the ID Token for this client must be encrypted with.")
  public String getIdTokenEncryptionMethod() {
    return idTokenEncryptionMethod;
  }

  public void setIdTokenEncryptionMethod(String idTokenEncryptionMethod) {
    this.idTokenEncryptionMethod = idTokenEncryptionMethod;
  }

  public SigningAndEncryption idTokenPublicEncryptionKey(String idTokenPublicEncryptionKey) {
    this.idTokenPublicEncryptionKey = idTokenPublicEncryptionKey;
    return this;
  }

   /**
   * A Base64 encoded public key for encrypting ID Tokens.
   * @return idTokenPublicEncryptionKey
  **/
  @ApiModelProperty(value = "A Base64 encoded public key for encrypting ID Tokens.")
  public String getIdTokenPublicEncryptionKey() {
    return idTokenPublicEncryptionKey;
  }

  public void setIdTokenPublicEncryptionKey(String idTokenPublicEncryptionKey) {
    this.idTokenPublicEncryptionKey = idTokenPublicEncryptionKey;
  }

  public SigningAndEncryption clientJwtPublicKey(String clientJwtPublicKey) {
    this.clientJwtPublicKey = clientJwtPublicKey;
    return this;
  }

   /**
   * A Base64 encoded X509 certificate, containing the public key, represented as a UTF-8 PEM file, of the key pair for signing the Client Bearer JWT.
   * @return clientJwtPublicKey
  **/
  @ApiModelProperty(value = "A Base64 encoded X509 certificate, containing the public key, represented as a UTF-8 PEM file, of the key pair for signing the Client Bearer JWT.")
  public String getClientJwtPublicKey() {
    return clientJwtPublicKey;
  }

  public void setClientJwtPublicKey(String clientJwtPublicKey) {
    this.clientJwtPublicKey = clientJwtPublicKey;
  }

  public SigningAndEncryption publicKeyLocation(String publicKeyLocation) {
    this.publicKeyLocation = publicKeyLocation;
    return this;
  }

   /**
   * Select the public key for this client to come from either the jwks_uri, manual jwks or X509 field.
   * @return publicKeyLocation
  **/
  @ApiModelProperty(value = "Select the public key for this client to come from either the jwks_uri, manual jwks or X509 field.")
  public String getPublicKeyLocation() {
    return publicKeyLocation;
  }

  public void setPublicKeyLocation(String publicKeyLocation) {
    this.publicKeyLocation = publicKeyLocation;
  }

  public SigningAndEncryption userinfoResponseFormat(String userinfoResponseFormat) {
    this.userinfoResponseFormat = userinfoResponseFormat;
    return this;
  }

   /**
   * The user info endpoint offers different output format. See http://openid.net/specs/openid-connect-core-1_0.html#UserInfoResponse
   * @return userinfoResponseFormat
  **/
  @ApiModelProperty(value = "The user info endpoint offers different output format. See http://openid.net/specs/openid-connect-core-1_0.html#UserInfoResponse")
  public String getUserinfoResponseFormat() {
    return userinfoResponseFormat;
  }

  public void setUserinfoResponseFormat(String userinfoResponseFormat) {
    this.userinfoResponseFormat = userinfoResponseFormat;
  }

  public SigningAndEncryption userinfoSignedResponseAlg(String userinfoSignedResponseAlg) {
    this.userinfoSignedResponseAlg = userinfoSignedResponseAlg;
    return this;
  }

   /**
   * JWS algorithm for signing UserInfo Responses. If this is specified, the response will be JWT &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7519\&quot;&gt;JWT&lt;/a&gt; serialized, and signed using JWS. The default, if omitted, is for the UserInfo Response to return the Claims as a UTF-8 encoded JSON object using the application/json content-type.
   * @return userinfoSignedResponseAlg
  **/
  @ApiModelProperty(value = "JWS algorithm for signing UserInfo Responses. If this is specified, the response will be JWT <a href=\"https://tools.ietf.org/html/rfc7519\">JWT</a> serialized, and signed using JWS. The default, if omitted, is for the UserInfo Response to return the Claims as a UTF-8 encoded JSON object using the application/json content-type.")
  public String getUserinfoSignedResponseAlg() {
    return userinfoSignedResponseAlg;
  }

  public void setUserinfoSignedResponseAlg(String userinfoSignedResponseAlg) {
    this.userinfoSignedResponseAlg = userinfoSignedResponseAlg;
  }

  public SigningAndEncryption userinfoEncryptedResponseAlg(String userinfoEncryptedResponseAlg) {
    this.userinfoEncryptedResponseAlg = userinfoEncryptedResponseAlg;
    return this;
  }

   /**
   * JWE algorithm for encrypting UserInfo Responses. If both signing and encryption are requested, the response will be signed then encrypted, with the result being a Nested JWT. The default, if omitted, is that no encryption is performed.
   * @return userinfoEncryptedResponseAlg
  **/
  @ApiModelProperty(value = "JWE algorithm for encrypting UserInfo Responses. If both signing and encryption are requested, the response will be signed then encrypted, with the result being a Nested JWT. The default, if omitted, is that no encryption is performed.")
  public String getUserinfoEncryptedResponseAlg() {
    return userinfoEncryptedResponseAlg;
  }

  public void setUserinfoEncryptedResponseAlg(String userinfoEncryptedResponseAlg) {
    this.userinfoEncryptedResponseAlg = userinfoEncryptedResponseAlg;
  }

  public SigningAndEncryption userinfoEncryptedResponseEncryptionAlgorithm(String userinfoEncryptedResponseEncryptionAlgorithm) {
    this.userinfoEncryptedResponseEncryptionAlgorithm = userinfoEncryptedResponseEncryptionAlgorithm;
    return this;
  }

   /**
   * JWE enc algorithm for encrypting UserInfo Responses. If userinfo encrypted response algorithm is specified, the default for this value is A128CBC-HS256. When user info encrypted response encryption is included, user info encrypted response algorithm MUST also be provided.&lt;br&gt;&lt;br&gt;OpenAM supports the following token encryption algorithms:&lt;ul&gt;&lt;li&gt;&lt;code&gt;A128GCM&lt;/code&gt;, &lt;code&gt;A192GCM&lt;/code&gt;, and &lt;code&gt;A256GCM&lt;/code&gt; - AES in Galois Counter Mode (GCM) authenticated encryption mode.&lt;/li&gt;&lt;li&gt;&lt;code&gt;A128CBC-HS256&lt;/code&gt;, &lt;code&gt;A192CBC-HS384&lt;/code&gt;, and &lt;code&gt;A256CBC-HS512&lt;/code&gt; - AES encryption in CBC mode, with HMAC-SHA-2 for integrity.&lt;/li&gt;&lt;/ul&gt;
   * @return userinfoEncryptedResponseEncryptionAlgorithm
  **/
  @ApiModelProperty(value = "JWE enc algorithm for encrypting UserInfo Responses. If userinfo encrypted response algorithm is specified, the default for this value is A128CBC-HS256. When user info encrypted response encryption is included, user info encrypted response algorithm MUST also be provided.<br><br>OpenAM supports the following token encryption algorithms:<ul><li><code>A128GCM</code>, <code>A192GCM</code>, and <code>A256GCM</code> - AES in Galois Counter Mode (GCM) authenticated encryption mode.</li><li><code>A128CBC-HS256</code>, <code>A192CBC-HS384</code>, and <code>A256CBC-HS512</code> - AES encryption in CBC mode, with HMAC-SHA-2 for integrity.</li></ul>")
  public String getUserinfoEncryptedResponseEncryptionAlgorithm() {
    return userinfoEncryptedResponseEncryptionAlgorithm;
  }

  public void setUserinfoEncryptedResponseEncryptionAlgorithm(String userinfoEncryptedResponseEncryptionAlgorithm) {
    this.userinfoEncryptedResponseEncryptionAlgorithm = userinfoEncryptedResponseEncryptionAlgorithm;
  }

  public SigningAndEncryption requestParameterSignedAlg(String requestParameterSignedAlg) {
    this.requestParameterSignedAlg = requestParameterSignedAlg;
    return this;
  }

   /**
   * JWS algorithm for signing the request parameter.
   * @return requestParameterSignedAlg
  **/
  @ApiModelProperty(value = "JWS algorithm for signing the request parameter.")
  public String getRequestParameterSignedAlg() {
    return requestParameterSignedAlg;
  }

  public void setRequestParameterSignedAlg(String requestParameterSignedAlg) {
    this.requestParameterSignedAlg = requestParameterSignedAlg;
  }

  public SigningAndEncryption requestParameterEncryptedAlg(String requestParameterEncryptedAlg) {
    this.requestParameterEncryptedAlg = requestParameterEncryptedAlg;
    return this;
  }

   /**
   * JWE algorithm for encrypting the request parameter.
   * @return requestParameterEncryptedAlg
  **/
  @ApiModelProperty(value = "JWE algorithm for encrypting the request parameter.")
  public String getRequestParameterEncryptedAlg() {
    return requestParameterEncryptedAlg;
  }

  public void setRequestParameterEncryptedAlg(String requestParameterEncryptedAlg) {
    this.requestParameterEncryptedAlg = requestParameterEncryptedAlg;
  }

  public SigningAndEncryption requestParameterEncryptedEncryptionAlgorithm(String requestParameterEncryptedEncryptionAlgorithm) {
    this.requestParameterEncryptedEncryptionAlgorithm = requestParameterEncryptedEncryptionAlgorithm;
    return this;
  }

   /**
   * JWE enc algorithm for encrypting the request parameter.&lt;br&gt;&lt;br&gt;OpenAM supports the following token encryption algorithms:&lt;ul&gt;&lt;li&gt;&lt;code&gt;A128GCM&lt;/code&gt;, &lt;code&gt;A192GCM&lt;/code&gt;, and &lt;code&gt;A256GCM&lt;/code&gt; - AES in Galois Counter Mode (GCM) authenticated encryption mode.&lt;/li&gt;&lt;li&gt;&lt;code&gt;A128CBC-HS256&lt;/code&gt;, &lt;code&gt;A192CBC-HS384&lt;/code&gt;, and &lt;code&gt;A256CBC-HS512&lt;/code&gt; - AES encryption in CBC mode, with HMAC-SHA-2 for integrity.&lt;/li&gt;&lt;/ul&gt;
   * @return requestParameterEncryptedEncryptionAlgorithm
  **/
  @ApiModelProperty(value = "JWE enc algorithm for encrypting the request parameter.<br><br>OpenAM supports the following token encryption algorithms:<ul><li><code>A128GCM</code>, <code>A192GCM</code>, and <code>A256GCM</code> - AES in Galois Counter Mode (GCM) authenticated encryption mode.</li><li><code>A128CBC-HS256</code>, <code>A192CBC-HS384</code>, and <code>A256CBC-HS512</code> - AES encryption in CBC mode, with HMAC-SHA-2 for integrity.</li></ul>")
  public String getRequestParameterEncryptedEncryptionAlgorithm() {
    return requestParameterEncryptedEncryptionAlgorithm;
  }

  public void setRequestParameterEncryptedEncryptionAlgorithm(String requestParameterEncryptedEncryptionAlgorithm) {
    this.requestParameterEncryptedEncryptionAlgorithm = requestParameterEncryptedEncryptionAlgorithm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningAndEncryption signingAndEncryption = (SigningAndEncryption) o;
    return Objects.equals(this.jwksUri, signingAndEncryption.jwksUri) &&
        Objects.equals(this.jwksCacheTimeout, signingAndEncryption.jwksCacheTimeout) &&
        Objects.equals(this.jwkStoreCacheMissCacheTime, signingAndEncryption.jwkStoreCacheMissCacheTime) &&
        Objects.equals(this.tokenEndpointAuthSigningAlgorithm, signingAndEncryption.tokenEndpointAuthSigningAlgorithm) &&
        Objects.equals(this.jwkSet, signingAndEncryption.jwkSet) &&
        Objects.equals(this.idTokenSignedResponseAlg, signingAndEncryption.idTokenSignedResponseAlg) &&
        Objects.equals(this.idTokenEncryptionEnabled, signingAndEncryption.idTokenEncryptionEnabled) &&
        Objects.equals(this.idTokenEncryptionAlgorithm, signingAndEncryption.idTokenEncryptionAlgorithm) &&
        Objects.equals(this.idTokenEncryptionMethod, signingAndEncryption.idTokenEncryptionMethod) &&
        Objects.equals(this.idTokenPublicEncryptionKey, signingAndEncryption.idTokenPublicEncryptionKey) &&
        Objects.equals(this.clientJwtPublicKey, signingAndEncryption.clientJwtPublicKey) &&
        Objects.equals(this.publicKeyLocation, signingAndEncryption.publicKeyLocation) &&
        Objects.equals(this.userinfoResponseFormat, signingAndEncryption.userinfoResponseFormat) &&
        Objects.equals(this.userinfoSignedResponseAlg, signingAndEncryption.userinfoSignedResponseAlg) &&
        Objects.equals(this.userinfoEncryptedResponseAlg, signingAndEncryption.userinfoEncryptedResponseAlg) &&
        Objects.equals(this.userinfoEncryptedResponseEncryptionAlgorithm, signingAndEncryption.userinfoEncryptedResponseEncryptionAlgorithm) &&
        Objects.equals(this.requestParameterSignedAlg, signingAndEncryption.requestParameterSignedAlg) &&
        Objects.equals(this.requestParameterEncryptedAlg, signingAndEncryption.requestParameterEncryptedAlg) &&
        Objects.equals(this.requestParameterEncryptedEncryptionAlgorithm, signingAndEncryption.requestParameterEncryptedEncryptionAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwksUri, jwksCacheTimeout, jwkStoreCacheMissCacheTime, tokenEndpointAuthSigningAlgorithm, jwkSet, idTokenSignedResponseAlg, idTokenEncryptionEnabled, idTokenEncryptionAlgorithm, idTokenEncryptionMethod, idTokenPublicEncryptionKey, clientJwtPublicKey, publicKeyLocation, userinfoResponseFormat, userinfoSignedResponseAlg, userinfoEncryptedResponseAlg, userinfoEncryptedResponseEncryptionAlgorithm, requestParameterSignedAlg, requestParameterEncryptedAlg, requestParameterEncryptedEncryptionAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningAndEncryption {\n");
    
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    jwksCacheTimeout: ").append(toIndentedString(jwksCacheTimeout)).append("\n");
    sb.append("    jwkStoreCacheMissCacheTime: ").append(toIndentedString(jwkStoreCacheMissCacheTime)).append("\n");
    sb.append("    tokenEndpointAuthSigningAlgorithm: ").append(toIndentedString(tokenEndpointAuthSigningAlgorithm)).append("\n");
    sb.append("    jwkSet: ").append(toIndentedString(jwkSet)).append("\n");
    sb.append("    idTokenSignedResponseAlg: ").append(toIndentedString(idTokenSignedResponseAlg)).append("\n");
    sb.append("    idTokenEncryptionEnabled: ").append(toIndentedString(idTokenEncryptionEnabled)).append("\n");
    sb.append("    idTokenEncryptionAlgorithm: ").append(toIndentedString(idTokenEncryptionAlgorithm)).append("\n");
    sb.append("    idTokenEncryptionMethod: ").append(toIndentedString(idTokenEncryptionMethod)).append("\n");
    sb.append("    idTokenPublicEncryptionKey: ").append(toIndentedString(idTokenPublicEncryptionKey)).append("\n");
    sb.append("    clientJwtPublicKey: ").append(toIndentedString(clientJwtPublicKey)).append("\n");
    sb.append("    publicKeyLocation: ").append(toIndentedString(publicKeyLocation)).append("\n");
    sb.append("    userinfoResponseFormat: ").append(toIndentedString(userinfoResponseFormat)).append("\n");
    sb.append("    userinfoSignedResponseAlg: ").append(toIndentedString(userinfoSignedResponseAlg)).append("\n");
    sb.append("    userinfoEncryptedResponseAlg: ").append(toIndentedString(userinfoEncryptedResponseAlg)).append("\n");
    sb.append("    userinfoEncryptedResponseEncryptionAlgorithm: ").append(toIndentedString(userinfoEncryptedResponseEncryptionAlgorithm)).append("\n");
    sb.append("    requestParameterSignedAlg: ").append(toIndentedString(requestParameterSignedAlg)).append("\n");
    sb.append("    requestParameterEncryptedAlg: ").append(toIndentedString(requestParameterEncryptedAlg)).append("\n");
    sb.append("    requestParameterEncryptedEncryptionAlgorithm: ").append(toIndentedString(requestParameterEncryptedEncryptionAlgorithm)).append("\n");
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

