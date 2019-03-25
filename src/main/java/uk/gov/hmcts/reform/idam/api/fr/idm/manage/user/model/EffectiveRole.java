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
 * Effective Role
 */
@ApiModel(description = "Effective Role")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public class EffectiveRole {
  @JsonProperty("_ref")
  private String ref = null;

  public EffectiveRole ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Full path of effective Role Mapping
   * @return ref
  **/
  @ApiModelProperty(value = "Full path of effective Role Mapping")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveRole effectiveRole = (EffectiveRole) o;
    return Objects.equals(this.ref, effectiveRole.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveRole {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

