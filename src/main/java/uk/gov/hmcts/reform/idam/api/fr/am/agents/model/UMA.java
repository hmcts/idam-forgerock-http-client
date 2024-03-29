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
 * UMA
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class UMA {
  @JsonProperty("claimsRedirectionUris")
  private ClaimsRedirectionURIs claimsRedirectionUris = null;

  public UMA claimsRedirectionUris(ClaimsRedirectionURIs claimsRedirectionUris) {
    this.claimsRedirectionUris = claimsRedirectionUris;
    return this;
  }

   /**
   * Get claimsRedirectionUris
   * @return claimsRedirectionUris
  **/
  @ApiModelProperty(value = "")
  public ClaimsRedirectionURIs getClaimsRedirectionUris() {
    return claimsRedirectionUris;
  }

  public void setClaimsRedirectionUris(ClaimsRedirectionURIs claimsRedirectionUris) {
    this.claimsRedirectionUris = claimsRedirectionUris;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UMA UMA = (UMA) o;
    return Objects.equals(this.claimsRedirectionUris, UMA.claimsRedirectionUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimsRedirectionUris);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UMA {\n");
    
    sb.append("    claimsRedirectionUris: ").append(toIndentedString(claimsRedirectionUris)).append("\n");
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

