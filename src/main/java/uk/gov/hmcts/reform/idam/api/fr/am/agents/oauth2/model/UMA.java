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
 * UMA
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.013Z")
public class UMA {
  @JsonProperty("claimsRedirectionUris")
  private List<String> claimsRedirectionUris = null;

  public UMA claimsRedirectionUris(List<String> claimsRedirectionUris) {
    this.claimsRedirectionUris = claimsRedirectionUris;
    return this;
  }

  public UMA addClaimsRedirectionUrisItem(String claimsRedirectionUrisItem) {
    if (this.claimsRedirectionUris == null) {
      this.claimsRedirectionUris = new ArrayList<>();
    }
    this.claimsRedirectionUris.add(claimsRedirectionUrisItem);
    return this;
  }

   /**
   * Redirection URIs for returning to the client from UMA claims collection (not yet supported). If multiple URIs are registered, the client MUST specify the URI that the user should be redirected to following approval. May not contain a fragment (#).
   * @return claimsRedirectionUris
  **/
  @ApiModelProperty(value = "Redirection URIs for returning to the client from UMA claims collection (not yet supported). If multiple URIs are registered, the client MUST specify the URI that the user should be redirected to following approval. May not contain a fragment (#).")
  public List<String> getClaimsRedirectionUris() {
    return claimsRedirectionUris;
  }

  public void setClaimsRedirectionUris(List<String> claimsRedirectionUris) {
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

