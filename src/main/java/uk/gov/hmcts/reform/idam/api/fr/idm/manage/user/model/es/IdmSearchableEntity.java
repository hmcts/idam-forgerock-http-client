package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public abstract class IdmSearchableEntity<T> {

    @Id
    protected String id = null;

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public T id(String id) {
        this.id = id;
        return (T) this;
    }


}
