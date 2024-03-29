/*
 * OpenAM
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.policies.model;

import io.swagger.annotations.ApiModel;

import java.util.HashMap;
import java.util.Objects;

/**
 * Specifies the subject conditions to which the policy applies, where subjects can be combined by using the built-in types \&quot;AND\&quot;, \&quot;OR\&quot;, and \&quot;NOT\&quot;, and where subject implementations are pluggable
 */
@ApiModel(description = "Specifies the subject conditions to which the policy applies, where subjects can be combined by using the built-in types \"AND\", \"OR\", and \"NOT\", and where subject implementations are pluggable")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T13:59:55.834+01:00")
public class SubjectMap extends HashMap<String, Object> {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectMap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

