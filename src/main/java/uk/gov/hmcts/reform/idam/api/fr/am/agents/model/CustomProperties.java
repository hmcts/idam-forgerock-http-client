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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Additional properties that allow users to augment the set of properties supported by the OAuth2 Client. &lt;br&gt; Examples: &lt;br&gt; customproperty&#x3D;custom-value1 &lt;br&gt; customlist[0]&#x3D;customlist-value-0 &lt;br&gt; customlist[1]&#x3D;customlist-value-1 &lt;br&gt; custommap[key1]&#x3D;custommap-value-1 &lt;br&gt; custommap[key2]&#x3D;custommap-value-2
 */
@ApiModel(description = "Additional properties that allow users to augment the set of properties supported by the OAuth2 Client. <br> Examples: <br> customproperty=custom-value1 <br> customlist[0]=customlist-value-0 <br> customlist[1]=customlist-value-1 <br> custommap[key1]=custommap-value-1 <br> custommap[key2]=custommap-value-2")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-08T06:31:38.266+01:00")
public class CustomProperties {
  @JsonProperty("inherited")
  private Boolean inherited = null;

  @JsonProperty("value")
  private List<String> value = null;

  public CustomProperties inherited(Boolean inherited) {
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

  public CustomProperties value(List<String> value) {
    this.value = value;
    return this;
  }

  public CustomProperties addValueItem(String valueItem) {
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
    CustomProperties customProperties = (CustomProperties) o;
    return Objects.equals(this.inherited, customProperties.inherited) &&
        Objects.equals(this.value, customProperties.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomProperties {\n");
    
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

