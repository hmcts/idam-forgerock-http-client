/*
 * ForgeRock IDM Users API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UserAuthzRoles
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public class IdmUserAuthzRoles {
  @JsonProperty("_ref")
  private String ref = null;

  @JsonProperty("_refProperties")
  private AuthorizationRolesItemsRefProperties refProperties = null;

  public IdmUserAuthzRoles ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * References a relationship from a managed object
   * @return ref
  **/
  @ApiModelProperty(value = "References a relationship from a managed object")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public IdmUserAuthzRoles refProperties(AuthorizationRolesItemsRefProperties refProperties) {
    this.refProperties = refProperties;
    return this;
  }

   /**
   * Get refProperties
   * @return refProperties
  **/
  @ApiModelProperty(value = "")
  public AuthorizationRolesItemsRefProperties getRefProperties() {
    return refProperties;
  }

  public void setRefProperties(AuthorizationRolesItemsRefProperties refProperties) {
    this.refProperties = refProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdmUserAuthzRoles userAuthzRoles = (IdmUserAuthzRoles) o;
    return Objects.equals(this.ref, userAuthzRoles.ref) &&
        Objects.equals(this.refProperties, userAuthzRoles.refProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, refProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthzRoles {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    refProperties: ").append(toIndentedString(refProperties)).append("\n");
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
