/*
 * ForgeRock Roles API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Supports metadata within the relationship
 */
@ApiModel(description = "Supports metadata within the relationship")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.261Z")
public class IdmRoleMembersItemsRefProperties {
  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("_grantType")
  private String grantType = null;

  public IdmRoleMembersItemsRefProperties id(String id) {
    this.id = id;
    return this;
  }

   /**
   * _refProperties object ID
   * @return id
  **/
  @ApiModelProperty(value = "_refProperties object ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IdmRoleMembersItemsRefProperties grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Grant Type
   * @return grantType
  **/
  @ApiModelProperty(value = "Grant Type")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdmRoleMembersItemsRefProperties roleMembersItemsRefProperties = (IdmRoleMembersItemsRefProperties) o;
    return Objects.equals(this.id, roleMembersItemsRefProperties.id) &&
        Objects.equals(this.grantType, roleMembersItemsRefProperties.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grantType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMembersItemsRefProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
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

