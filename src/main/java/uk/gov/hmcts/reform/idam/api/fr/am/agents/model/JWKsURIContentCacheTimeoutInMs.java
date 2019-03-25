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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * To avoid loading the JWKS URI content for every token encryption, the JWKS content is cached. This timeout defines the maximum of time the JWKS URI content can be cached before being refreshed.
 */
@ApiModel(description = "To avoid loading the JWKS URI content for every token encryption, the JWKS content is cached. This timeout defines the maximum of time the JWKS URI content can be cached before being refreshed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class JWKsURIContentCacheTimeoutInMs {
  @JsonProperty("inherited")
  private Boolean inherited = null;

  @JsonProperty("value")
  private Integer value = null;

  public JWKsURIContentCacheTimeoutInMs inherited(Boolean inherited) {
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

  public JWKsURIContentCacheTimeoutInMs value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
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
    JWKsURIContentCacheTimeoutInMs jwKsURIContentCacheTimeoutInMs = (JWKsURIContentCacheTimeoutInMs) o;
    return Objects.equals(this.inherited, jwKsURIContentCacheTimeoutInMs.inherited) &&
        Objects.equals(this.value, jwKsURIContentCacheTimeoutInMs.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWKsURIContentCacheTimeoutInMs {\n");
    
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

