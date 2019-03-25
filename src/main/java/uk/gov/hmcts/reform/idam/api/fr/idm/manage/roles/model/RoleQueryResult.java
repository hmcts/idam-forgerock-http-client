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
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.Role;

/**
 * RoleQueryResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.755Z")
public class RoleQueryResult {
  @JsonProperty("result")
  private List<Role> result = null;

  @JsonProperty("resultCount")
  private Integer resultCount = 0;

  @JsonProperty("pagedResultsCookie")
  private String pagedResultsCookie = null;

  @JsonProperty("totalPagedResultsPolicy")
  private String totalPagedResultsPolicy = "NONE";

  @JsonProperty("totalPagedResults")
  private Integer totalPagedResults = -1;

  @JsonProperty("remainingPagedResults")
  private Integer remainingPagedResults = -1;

  public RoleQueryResult result(List<Role> result) {
    this.result = result;
    return this;
  }

  public RoleQueryResult addResultItem(Role resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Array of matching items
   * @return result
  **/
  @ApiModelProperty(value = "Array of matching items")
  public List<Role> getResult() {
    return result;
  }

  public void setResult(List<Role> result) {
    this.result = result;
  }

  public RoleQueryResult resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Count of individual result items
   * @return resultCount
  **/
  @ApiModelProperty(value = "Count of individual result items")
  public Integer getResultCount() {
    return resultCount;
  }

  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }

  public RoleQueryResult pagedResultsCookie(String pagedResultsCookie) {
    this.pagedResultsCookie = pagedResultsCookie;
    return this;
  }

   /**
   * Opaque cookie used by the server to keep track of the position in the search results
   * @return pagedResultsCookie
  **/
  @ApiModelProperty(value = "Opaque cookie used by the server to keep track of the position in the search results")
  public String getPagedResultsCookie() {
    return pagedResultsCookie;
  }

  public void setPagedResultsCookie(String pagedResultsCookie) {
    this.pagedResultsCookie = pagedResultsCookie;
  }

  public RoleQueryResult totalPagedResultsPolicy(String totalPagedResultsPolicy) {
    this.totalPagedResultsPolicy = totalPagedResultsPolicy;
    return this;
  }

   /**
   * Either NONE, EXACT, or ESTIMATE. Indicates the accuracy of the result count
   * @return totalPagedResultsPolicy
  **/
  @ApiModelProperty(value = "Either NONE, EXACT, or ESTIMATE. Indicates the accuracy of the result count")
  public String getTotalPagedResultsPolicy() {
    return totalPagedResultsPolicy;
  }

  public void setTotalPagedResultsPolicy(String totalPagedResultsPolicy) {
    this.totalPagedResultsPolicy = totalPagedResultsPolicy;
  }

  public RoleQueryResult totalPagedResults(Integer totalPagedResults) {
    this.totalPagedResults = totalPagedResults;
    return this;
  }

   /**
   * Total count of individual items
   * @return totalPagedResults
  **/
  @ApiModelProperty(value = "Total count of individual items")
  public Integer getTotalPagedResults() {
    return totalPagedResults;
  }

  public void setTotalPagedResults(Integer totalPagedResults) {
    this.totalPagedResults = totalPagedResults;
  }

  public RoleQueryResult remainingPagedResults(Integer remainingPagedResults) {
    this.remainingPagedResults = remainingPagedResults;
    return this;
  }

   /**
   * Count of individual items remaining
   * @return remainingPagedResults
  **/
  @ApiModelProperty(value = "Count of individual items remaining")
  public Integer getRemainingPagedResults() {
    return remainingPagedResults;
  }

  public void setRemainingPagedResults(Integer remainingPagedResults) {
    this.remainingPagedResults = remainingPagedResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleQueryResult roleQueryResult = (RoleQueryResult) o;
    return Objects.equals(this.result, roleQueryResult.result) &&
        Objects.equals(this.resultCount, roleQueryResult.resultCount) &&
        Objects.equals(this.pagedResultsCookie, roleQueryResult.pagedResultsCookie) &&
        Objects.equals(this.totalPagedResultsPolicy, roleQueryResult.totalPagedResultsPolicy) &&
        Objects.equals(this.totalPagedResults, roleQueryResult.totalPagedResults) &&
        Objects.equals(this.remainingPagedResults, roleQueryResult.remainingPagedResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, resultCount, pagedResultsCookie, totalPagedResultsPolicy, totalPagedResults, remainingPagedResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleQueryResult {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
    sb.append("    pagedResultsCookie: ").append(toIndentedString(pagedResultsCookie)).append("\n");
    sb.append("    totalPagedResultsPolicy: ").append(toIndentedString(totalPagedResultsPolicy)).append("\n");
    sb.append("    totalPagedResults: ").append(toIndentedString(totalPagedResults)).append("\n");
    sb.append("    remainingPagedResults: ").append(toIndentedString(remainingPagedResults)).append("\n");
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

