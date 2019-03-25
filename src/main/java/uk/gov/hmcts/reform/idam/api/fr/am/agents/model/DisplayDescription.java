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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A description of the client or other information that may be relevant to the resource owner when considering approval.&lt;br&gt;&lt;br&gt;The description may be entered as a single string or as pipe separated strings for locale and localized name; e.g. \&quot;en|The company intranet is requesting the following access permission\&quot;. Locale strings are in the format &lt;code&gt;language + \&quot;_\&quot; + country + \&quot;_\&quot; + variant&lt;/code&gt;, e.g. en, en_GB, en_US_WIN. If the locale is omitted, the description is displayed to all users having undefined locales. e.g. \&quot;The company intranet is requesting the following access permission\&quot;.
 */
@ApiModel(description = "A description of the client or other information that may be relevant to the resource owner when considering approval.<br><br>The description may be entered as a single string or as pipe separated strings for locale and localized name; e.g. \"en|The company intranet is requesting the following access permission\". Locale strings are in the format <code>language + \"_\" + country + \"_\" + variant</code>, e.g. en, en_GB, en_US_WIN. If the locale is omitted, the description is displayed to all users having undefined locales. e.g. \"The company intranet is requesting the following access permission\".")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class DisplayDescription {
  @JsonProperty("inherited")
  private Boolean inherited = null;

  @JsonProperty("value")
  private List<String> value = null;

  public DisplayDescription inherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

   /**
   * Get inherited
   * @return inherited
  **/
  @ApiModelProperty(value = "")
  public Boolean isInherited() {
    return inherited;
  }

  public void setInherited(Boolean inherited) {
    this.inherited = inherited;
  }

  public DisplayDescription value(List<String> value) {
    this.value = value;
    return this;
  }

  public DisplayDescription addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
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
    DisplayDescription displayDescription = (DisplayDescription) o;
    return Objects.equals(this.inherited, displayDescription.inherited) &&
        Objects.equals(this.value, displayDescription.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayDescription {\n");
    
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
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
