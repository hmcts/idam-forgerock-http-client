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
 * Json schema for the policy resource
 */
@ApiModel(description = "Json schema for the policy resource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-28T16:50:59.186+01:00")
public class PutPolicyRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("applicationName")
  private String applicationName = null;

  @JsonProperty("actionValues")
  private Object actionValues = null;

  @JsonProperty("resources")
  private List<String> resources = null;

  @JsonProperty("subject")
  private Object subject = null;

  @JsonProperty("condition")
  private Condition condition = null;

  @JsonProperty("resourceTypeUuid")
  private String resourceTypeUuid = null;

  @JsonProperty("resourceAttributes")
  private List<Object> resourceAttributes = null;

  @JsonProperty("lastModifiedBy")
  private String lastModifiedBy = null;

  @JsonProperty("lastModifiedDate")
  private String lastModifiedDate = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("creationDate")
  private String creationDate = null;

  public PutPolicyRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * String matching the name of the application
   * @return name
  **/
  @ApiModelProperty(value = "String matching the name of the application")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PutPolicyRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Boolean indicating whether OpenAM considers the policy active for evaluation purposes, defaults to false
   * @return active
  **/
  @ApiModelProperty(value = "Boolean indicating whether OpenAM considers the policy active for evaluation purposes, defaults to false")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PutPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * String describing the policy
   * @return description
  **/
  @ApiModelProperty(value = "String describing the policy")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PutPolicyRequest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * String containing the application name, such as \&quot;iPlanetAMWebAgentService\&quot;, or \&quot;mypolicyset\&quot;
   * @return applicationName
  **/
  @ApiModelProperty(value = "String containing the application name, such as \"iPlanetAMWebAgentService\", or \"mypolicyset\"")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public PutPolicyRequest actionValues(Object actionValues) {
    this.actionValues = actionValues;
    return this;
  }

   /**
   * Set of string action names, each set to a boolean indicating whether the action is allowed. Chosen from the available actions provided by the associated Managing Resource Types resource type
   * @return actionValues
  **/
  @ApiModelProperty(value = "Set of string action names, each set to a boolean indicating whether the action is allowed. Chosen from the available actions provided by the associated Managing Resource Types resource type")
  public Object getActionValues() {
    return actionValues;
  }

  public void setActionValues(Object actionValues) {
    this.actionValues = actionValues;
  }

  public PutPolicyRequest resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public PutPolicyRequest addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * List of the resource name pattern strings to which the policy applies. Must conform to the pattern templates provided by the associated Managing Resource Types resource type
   * @return resources
  **/
  @ApiModelProperty(value = "List of the resource name pattern strings to which the policy applies. Must conform to the pattern templates provided by the associated Managing Resource Types resource type")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public PutPolicyRequest subject(Object subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Specifies the subject conditions to which the policy applies, where subjects can be combined by using the built-in types \&quot;AND\&quot;, \&quot;OR\&quot;, and \&quot;NOT\&quot;, and where subject implementations are pluggable
   * @return subject
  **/
  @ApiModelProperty(value = "Specifies the subject conditions to which the policy applies, where subjects can be combined by using the built-in types \"AND\", \"OR\", and \"NOT\", and where subject implementations are pluggable")
  public Object getSubject() {
    return subject;
  }

  public void setSubject(Object subject) {
    this.subject = subject;
  }

  public PutPolicyRequest condition(Condition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(value = "")
  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public PutPolicyRequest resourceTypeUuid(String resourceTypeUuid) {
    this.resourceTypeUuid = resourceTypeUuid;
    return this;
  }

   /**
   * The UUIDs of the resource type associated with the policy
   * @return resourceTypeUuid
  **/
  @ApiModelProperty(value = "The UUIDs of the resource type associated with the policy")
  public String getResourceTypeUuid() {
    return resourceTypeUuid;
  }

  public void setResourceTypeUuid(String resourceTypeUuid) {
    this.resourceTypeUuid = resourceTypeUuid;
  }

  public PutPolicyRequest resourceAttributes(List<Object> resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

  public PutPolicyRequest addResourceAttributesItem(Object resourceAttributesItem) {
    if (this.resourceAttributes == null) {
      this.resourceAttributes = new ArrayList<>();
    }
    this.resourceAttributes.add(resourceAttributesItem);
    return this;
  }

   /**
   * List of attributes to return with decisions. These attributes are known as response attributes
   * @return resourceAttributes
  **/
  @ApiModelProperty(value = "List of attributes to return with decisions. These attributes are known as response attributes")
  public List<Object> getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(List<Object> resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public PutPolicyRequest lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * A string containing the universal identifier DN of the subject that most recently updated the policy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "A string containing the universal identifier DN of the subject that most recently updated the policy")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public PutPolicyRequest lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * An integer containing the last modified date and time, in number of seconds
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "An integer containing the last modified date and time, in number of seconds")
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public PutPolicyRequest createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * A string containing the universal identifier DN of the subject that created the policy
   * @return createdBy
  **/
  @ApiModelProperty(value = "A string containing the universal identifier DN of the subject that created the policy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public PutPolicyRequest creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * An integer containing the creation date and time, in number of seconds
   * @return creationDate
  **/
  @ApiModelProperty(value = "An integer containing the creation date and time, in number of seconds")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutPolicyRequest putPolicyRequest = (PutPolicyRequest) o;
    return Objects.equals(this.name, putPolicyRequest.name) &&
        Objects.equals(this.active, putPolicyRequest.active) &&
        Objects.equals(this.description, putPolicyRequest.description) &&
        Objects.equals(this.applicationName, putPolicyRequest.applicationName) &&
        Objects.equals(this.actionValues, putPolicyRequest.actionValues) &&
        Objects.equals(this.resources, putPolicyRequest.resources) &&
        Objects.equals(this.subject, putPolicyRequest.subject) &&
        Objects.equals(this.condition, putPolicyRequest.condition) &&
        Objects.equals(this.resourceTypeUuid, putPolicyRequest.resourceTypeUuid) &&
        Objects.equals(this.resourceAttributes, putPolicyRequest.resourceAttributes) &&
        Objects.equals(this.lastModifiedBy, putPolicyRequest.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, putPolicyRequest.lastModifiedDate) &&
        Objects.equals(this.createdBy, putPolicyRequest.createdBy) &&
        Objects.equals(this.creationDate, putPolicyRequest.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active, description, applicationName, actionValues, resources, subject, condition, resourceTypeUuid, resourceAttributes, lastModifiedBy, lastModifiedDate, createdBy, creationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutPolicyRequest {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    actionValues: ").append(toIndentedString(actionValues)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    resourceTypeUuid: ").append(toIndentedString(resourceTypeUuid)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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

