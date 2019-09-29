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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Specifies environment conditions, where conditions can be combined by using the built-in types \&quot;AND\&quot;, \&quot;OR\&quot;, and \&quot;NOT\&quot;, and where condition implementations are pluggable
 */
@ApiModel(description = "Specifies environment conditions, where conditions can be combined by using the built-in types \"AND\", \"OR\", and \"NOT\", and where condition implementations are pluggable")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-29T17:06:44.605+01:00")
public class Condition {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("conditions")
  private List<Object> conditions = null;

  public Condition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Condition conditions(List<Object> conditions) {
    this.conditions = conditions;
    return this;
  }

  public Condition addConditionsItem(Object conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Specifies environment conditions, where conditions can be combined by using the built-in types \&quot;AND\&quot;, \&quot;OR\&quot;, and \&quot;NOT\&quot;, and where condition implementations are pluggable
   * @return conditions
  **/
  @ApiModelProperty(value = "Specifies environment conditions, where conditions can be combined by using the built-in types \"AND\", \"OR\", and \"NOT\", and where condition implementations are pluggable")
  public List<Object> getConditions() {
    return conditions;
  }

  public void setConditions(List<Object> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Condition condition = (Condition) o;
    return Objects.equals(this.type, condition.type) &&
        Objects.equals(this.conditions, condition.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condition {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

