package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public abstract class IdmSearchableEntity<T> {

    @Id
    protected String uid = null;

    @JsonProperty("_id")
    public void setId(String id) {
        this.uid = id;
    }

    @JsonProperty("uid")
    public String setUid() {
        return uid;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    public T id(String id) {
        this.uid = id;
        return (T) this;
    }


}
