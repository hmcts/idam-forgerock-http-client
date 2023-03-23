package uk.gov.hmcts.reform.idam.api.fr.am.agents.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Response types this client will support and use.
 */
@ApiModel(description = "Response types this client will support and use.")
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-29T13:48:57.857Z")
public class GrantTypes {
    @JsonProperty("inherited")
    private Boolean inherited = null;

    @JsonProperty("value")
    private List<String> value = null;

    public GrantTypes inherited(Boolean inherited) {
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

    public GrantTypes values(List<String> value) {
        this.value = value;
        return this;
    }

    public GrantTypes ddValueItem(String valueItem) {
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
        if (this == o) return true;
        if (!(o instanceof GrantTypes)) return false;
        GrantTypes that = (GrantTypes) o;
        return Objects.equals(inherited, that.inherited) &&
                Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(inherited, getValue());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantTypes {\n");

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
