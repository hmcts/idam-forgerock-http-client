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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAssignments;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAuthzMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.TemporalConstraintsItems;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.755Z")
public class Role {
  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("members")
  private List<RoleMembers> members = null;

  @JsonProperty("authzMembers")
  private List<RoleAuthzMembers> authzMembers = null;

  @JsonProperty("assignments")
  private List<RoleAssignments> assignments = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("temporalConstraints")
  private List<TemporalConstraintsItems> temporalConstraints = null;

  public Role id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Role ID
   * @return id
  **/
  @ApiModelProperty(value = "Role ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The role name, used for display purposes.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The role name, used for display purposes.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The role description, used for display purposes.
   * @return description
  **/
  @ApiModelProperty(value = "The role description, used for display purposes.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Role members(List<RoleMembers> members) {
    this.members = members;
    return this;
  }

  public Role addMembersItem(RoleMembers membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Role Members
   * @return members
  **/
  @ApiModelProperty(value = "Role Members")
  public List<RoleMembers> getMembers() {
    return members;
  }

  public void setMembers(List<RoleMembers> members) {
    this.members = members;
  }

  public Role authzMembers(List<RoleAuthzMembers> authzMembers) {
    this.authzMembers = authzMembers;
    return this;
  }

  public Role addAuthzMembersItem(RoleAuthzMembers authzMembersItem) {
    if (this.authzMembers == null) {
      this.authzMembers = new ArrayList<>();
    }
    this.authzMembers.add(authzMembersItem);
    return this;
  }

   /**
   * Authorization Role Members
   * @return authzMembers
  **/
  @ApiModelProperty(value = "Authorization Role Members")
  public List<RoleAuthzMembers> getAuthzMembers() {
    return authzMembers;
  }

  public void setAuthzMembers(List<RoleAuthzMembers> authzMembers) {
    this.authzMembers = authzMembers;
  }

  public Role assignments(List<RoleAssignments> assignments) {
    this.assignments = assignments;
    return this;
  }

  public Role addAssignmentsItem(RoleAssignments assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Managed Assignments
   * @return assignments
  **/
  @ApiModelProperty(value = "Managed Assignments")
  public List<RoleAssignments> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<RoleAssignments> assignments) {
    this.assignments = assignments;
  }

  public Role condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * A conditional filter for this role
   * @return condition
  **/
  @ApiModelProperty(value = "A conditional filter for this role")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public Role temporalConstraints(List<TemporalConstraintsItems> temporalConstraints) {
    this.temporalConstraints = temporalConstraints;
    return this;
  }

  public Role addTemporalConstraintsItem(TemporalConstraintsItems temporalConstraintsItem) {
    if (this.temporalConstraints == null) {
      this.temporalConstraints = new ArrayList<>();
    }
    this.temporalConstraints.add(temporalConstraintsItem);
    return this;
  }

   /**
   * An array of temporal constraints for a role
   * @return temporalConstraints
  **/
  @ApiModelProperty(value = "An array of temporal constraints for a role")
  public List<TemporalConstraintsItems> getTemporalConstraints() {
    return temporalConstraints;
  }

  public void setTemporalConstraints(List<TemporalConstraintsItems> temporalConstraints) {
    this.temporalConstraints = temporalConstraints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.description, role.description) &&
        Objects.equals(this.members, role.members) &&
        Objects.equals(this.authzMembers, role.authzMembers) &&
        Objects.equals(this.assignments, role.assignments) &&
        Objects.equals(this.condition, role.condition) &&
        Objects.equals(this.temporalConstraints, role.temporalConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, members, authzMembers, assignments, condition, temporalConstraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    authzMembers: ").append(toIndentedString(authzMembers)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    temporalConstraints: ").append(toIndentedString(temporalConstraints)).append("\n");
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

