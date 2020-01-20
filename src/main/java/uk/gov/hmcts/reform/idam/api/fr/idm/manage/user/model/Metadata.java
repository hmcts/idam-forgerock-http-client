package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.Objects;

/**
 * Metadata
 */
@ApiModel(description = "Metadata")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "20202-01-25T17:14:09.475Z")

public class Metadata {

    @JsonProperty("_id")
    private String id = null;

    @JsonProperty("lastChanged")
    private LastChanged lastChanged = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LastChanged getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(LastChanged lastChanged) {
        this.lastChanged = lastChanged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Metadata)) return false;
        Metadata metadata = (Metadata) o;
        return getId().equals(metadata.getId()) &&
                Objects.equals(getLastChanged(), metadata.getLastChanged());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLastChanged());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastChanged: ").append(toIndentedString(lastChanged)).append("\n");
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
