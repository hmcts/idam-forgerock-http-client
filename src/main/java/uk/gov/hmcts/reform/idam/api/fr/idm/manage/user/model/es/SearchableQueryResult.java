package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UserQueryResultSet
 */
public class SearchableQueryResult<T> {
    @JsonProperty("result")
    private List<T> result = null;

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

    public SearchableQueryResult<T> result(List<T> result) {
        this.result = result;
        return this;
    }

    public SearchableQueryResult<T> addResultItem(T resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    /**
     * Array of matching items
     *
     * @return result
     **/
    @ApiModelProperty(value = "Array of matching items")
    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public SearchableQueryResult<T> resultCount(Integer resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * Count of individual result items
     *
     * @return resultCount
     **/
    @ApiModelProperty(value = "Count of individual result items")
    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public SearchableQueryResult<T> pagedResultsCookie(String pagedResultsCookie) {
        this.pagedResultsCookie = pagedResultsCookie;
        return this;
    }

    /**
     * Opaque cookie used by the server to keep track of the position in the search results
     *
     * @return pagedResultsCookie
     **/
    @ApiModelProperty(value = "Opaque cookie used by the server to keep track of the position in the search results")
    public String getPagedResultsCookie() {
        return pagedResultsCookie;
    }

    public void setPagedResultsCookie(String pagedResultsCookie) {
        this.pagedResultsCookie = pagedResultsCookie;
    }

    public SearchableQueryResult<T> totalPagedResultsPolicy(String totalPagedResultsPolicy) {
        this.totalPagedResultsPolicy = totalPagedResultsPolicy;
        return this;
    }

    /**
     * Either NONE, EXACT, or ESTIMATE. Indicates the accuracy of the result count
     *
     * @return totalPagedResultsPolicy
     **/
    @ApiModelProperty(value = "Either NONE, EXACT, or ESTIMATE. Indicates the accuracy of the result count")
    public String getTotalPagedResultsPolicy() {
        return totalPagedResultsPolicy;
    }

    public void setTotalPagedResultsPolicy(String totalPagedResultsPolicy) {
        this.totalPagedResultsPolicy = totalPagedResultsPolicy;
    }

    public SearchableQueryResult<T> totalPagedResults(Integer totalPagedResults) {
        this.totalPagedResults = totalPagedResults;
        return this;
    }

    /**
     * Total count of individual items
     *
     * @return totalPagedResults
     **/
    @ApiModelProperty(value = "Total count of individual items")
    public Integer getTotalPagedResults() {
        return totalPagedResults;
    }

    public void setTotalPagedResults(Integer totalPagedResults) {
        this.totalPagedResults = totalPagedResults;
    }

    public SearchableQueryResult<T> remainingPagedResults(Integer remainingPagedResults) {
        this.remainingPagedResults = remainingPagedResults;
        return this;
    }

    /**
     * Count of individual items remaining
     *
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
        SearchableQueryResult<T> userQueryResultSet = (SearchableQueryResult<T>) o;
        return Objects.equals(this.result, userQueryResultSet.result) &&
                Objects.equals(this.resultCount, userQueryResultSet.resultCount) &&
                Objects.equals(this.pagedResultsCookie, userQueryResultSet.pagedResultsCookie) &&
                Objects.equals(this.totalPagedResultsPolicy, userQueryResultSet.totalPagedResultsPolicy) &&
                Objects.equals(this.totalPagedResults, userQueryResultSet.totalPagedResults) &&
                Objects.equals(this.remainingPagedResults, userQueryResultSet.remainingPagedResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, resultCount, pagedResultsCookie, totalPagedResultsPolicy, totalPagedResults, remainingPagedResults);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserQueryResultSet {\n");
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

