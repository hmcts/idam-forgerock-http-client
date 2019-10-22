/*
 * Forgerock AM Authentication Chain API
 * An OAuth2 Client for Forgerock AM based on tests
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.authenticate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Holds name value pair information specifying input, output callback data
 */
@ApiModel(description = "Holds name value pair information specifying input, output callback data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-22T18:02:07.730+01:00")
public class NameValuePair {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public NameValuePair name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of input or output
   * @return name
  **/
  @ApiModelProperty(value = "Name of input or output")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NameValuePair value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of input or output
   * @return value
  **/
  @ApiModelProperty(value = "Value of input or output")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    NameValuePair nameValuePair = (NameValuePair) o;
    return Objects.equals(this.name, nameValuePair.name) &&
        Objects.equals(this.value, nameValuePair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameValuePair {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

