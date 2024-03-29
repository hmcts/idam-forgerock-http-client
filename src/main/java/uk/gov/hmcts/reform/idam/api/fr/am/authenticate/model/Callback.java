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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Holds information about callbacks required for this chain flow
 */
@ApiModel(description = "Holds information about callbacks required for this chain flow")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-28T12:12:27.878Z")
public class Callback {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("output")
  private List<NameValuePair> output = null;

  @JsonProperty("input")
  private List<NameValuePair> input = null;

  public Callback type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of callback
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the type of callback")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Callback output(List<NameValuePair> output) {
    this.output = output;
    return this;
  }

  public Callback addOutputItem(NameValuePair outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<>();
    }
    this.output.add(outputItem);
    return this;
  }

   /**
   * List of name value pair output
   * @return output
  **/
  @ApiModelProperty(value = "List of name value pair output")
  public List<NameValuePair> getOutput() {
    return output;
  }

  public void setOutput(List<NameValuePair> output) {
    this.output = output;
  }

  public Callback input(List<NameValuePair> input) {
    this.input = input;
    return this;
  }

  public Callback addInputItem(NameValuePair inputItem) {
    if (this.input == null) {
      this.input = new ArrayList<>();
    }
    this.input.add(inputItem);
    return this;
  }

   /**
   * List of name value pair input
   * @return input
  **/
  @ApiModelProperty(value = "List of name value pair input")
  public List<NameValuePair> getInput() {
    return input;
  }

  public void setInput(List<NameValuePair> input) {
    this.input = input;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callback callback = (Callback) o;
    return Objects.equals(this.type, callback.type) &&
        Objects.equals(this.output, callback.output) &&
        Objects.equals(this.input, callback.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, output, input);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Callback {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

