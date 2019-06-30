package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Total Count
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TotalCount {

  @JsonProperty("total")
  private Long total = null;

  public TotalCount total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Email Address
   * @return mail
  **/
  @ApiModelProperty(required = true, value = "A count of all entities")
  public Long getTotal() {
    return total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalCount totalCount = (TotalCount) o;
    return Objects.equals(this.total, totalCount.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total);
  }


  @Override
  public String toString() {
    return "class TotalCount {\n" +
            "    total: " + toIndentedString(total) + "\n" +
            "}";
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

