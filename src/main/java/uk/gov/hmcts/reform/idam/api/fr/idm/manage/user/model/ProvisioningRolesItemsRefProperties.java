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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Supports metadata within the relationship
 */
@ApiModel(description = "Supports metadata within the relationship")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.299Z")
public class ProvisioningRolesItemsRefProperties {
  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("_grantType")
  private String grantType = null;

  public ProvisioningRolesItemsRefProperties id(String id) {
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

  public ProvisioningRolesItemsRefProperties grantType(String grantType) {
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
    ProvisioningRolesItemsRefProperties provisioningRolesItemsRefProperties = (ProvisioningRolesItemsRefProperties) o;
    return Objects.equals(this.id, provisioningRolesItemsRefProperties.id) &&
        Objects.equals(this.grantType, provisioningRolesItemsRefProperties.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grantType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningRolesItemsRefProperties {\n");
    
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

