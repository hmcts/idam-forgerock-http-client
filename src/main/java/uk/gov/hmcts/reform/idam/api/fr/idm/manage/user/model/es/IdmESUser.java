package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.elasticsearch.annotations.Document;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * User
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(indexName = "idmuser")
public class IdmESUser extends IdmSearchableEntity<IdmESUser> {

    @JsonProperty("mail")
    public void setMail(String mail) {
        this.email = mail;
    }

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.forename = givenName;
    }

    @JsonProperty("forename")
    private String forename = null;

    @JsonProperty("sn")
    public void setSn(String sn) {
        this.surname = sn;
    }

    @JsonProperty("surname")
    private String surname = null;

    @JsonProperty("accountStatus")
    public void setAccountStatus(String accountStatus) {
        this.active = accountStatus.equalsIgnoreCase("active");
    }

    @JsonProperty("active")
    private Boolean active = null;

    @JsonProperty("effectiveAssignments")
    public void setEffectiveAssignments(List<EffectiveAssignment> effectiveAssignments) {
        this.roles = effectiveAssignments.stream()
                .map(EffectiveAssignment::getName)
                .collect(Collectors.toList());
    }

    @JsonProperty("roles")
    private List<String> roles = null;

    @JsonProperty("lastChanged")
    public void setLastChanged(LastChanged lastChanged) {
        this.lastModified = lastChanged.getDate();
    }

    @JsonProperty("lastModified")
    private String lastModified = null;

    public IdmESUser email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Email Address
     *
     * @return mail
     **/
    @ApiModelProperty(required = true, value = "Email Address")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public IdmESUser surname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Last Name
     *
     * @return sn
     **/
    @ApiModelProperty(required = true, value = "Last Name")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public IdmESUser forename(String forename) {
        this.forename = forename;
        return this;
    }

    /**
     * First Name
     *
     * @return givenName
     **/
    @ApiModelProperty(required = true, value = "First Name")
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public IdmESUser active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Status
     *
     * @return accountStatus
     **/
    @ApiModelProperty(value = "Status")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public IdmESUser roles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public IdmESUser addRoles(String role) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(role);
        return this;
    }

    /**
     * Effective Assignments
     *
     * @return effectiveAssignments
     **/
    @ApiModelProperty(value = "Effective Assignments")
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public IdmESUser lastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get lastChanged
     *
     * @return lastChanged
     **/
    @ApiModelProperty(value = "")
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdmESUser user = (IdmESUser) o;
        return Objects.equals(this.id, user.id) &&
                Objects.equals(this.email, user.email) &&
                Objects.equals(this.surname, user.surname) &&
                Objects.equals(this.forename, user.forename) &&
                Objects.equals(this.active, user.active) &&
                Objects.equals(this.roles, user.roles) &&
                Objects.equals(this.lastModified, user.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, surname, forename, active, roles, lastModified);
    }


    @Override
    public String toString() {
        return "class User {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    surname: " + toIndentedString(surname) + "\n" +
                "    forename: " + toIndentedString(forename) + "\n" +
                "    active: " + toIndentedString(active) + "\n" +
                "    roles: " + toIndentedString(roles) + "\n" +
                "    lastModified: " + toIndentedString(lastModified) + "\n" +
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

