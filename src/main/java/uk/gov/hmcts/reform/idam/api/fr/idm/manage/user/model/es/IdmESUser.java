package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.elasticsearch.annotations.Document;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * User
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(indexName = "idmuser")
public class IdmESUser extends IdmSearchableEntity<IdmESUser> {

  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("sn")
  private String sn = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("accountStatus")
  private String accountStatus = null;

  @JsonProperty("effectiveAssignments")
  private List<EffectiveAssignment> effectiveAssignments = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("lastChanged")
  private LastChanged lastChanged = null;

  @JsonProperty("sunset")
  private Sunset sunset = null;

  public IdmESUser mail(String mail) {
    this.mail = mail;
    return this;
  }

   /**
   * Email Address
   * @return mail
  **/
  @ApiModelProperty(required = true, value = "Email Address")
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public IdmESUser sn(String sn) {
    this.sn = sn;
    return this;
  }

   /**
   * Last Name
   * @return sn
  **/
  @ApiModelProperty(required = true, value = "Last Name")
  public String getSn() {
    return sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }

  public IdmESUser givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * First Name
   * @return givenName
  **/
  @ApiModelProperty(required = true, value = "First Name")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public IdmESUser accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Status
   * @return accountStatus
  **/
  @ApiModelProperty(value = "Status")
  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public IdmESUser effectiveAssignments(List<EffectiveAssignment> effectiveAssignments) {
    this.effectiveAssignments = effectiveAssignments;
    return this;
  }

  public IdmESUser addEffectiveAssignmentsItem(EffectiveAssignment effectiveAssignmentsItem) {
    if (this.effectiveAssignments == null) {
      this.effectiveAssignments = new ArrayList<>();
    }
    this.effectiveAssignments.add(effectiveAssignmentsItem);
    return this;
  }

   /**
   * Effective Assignments
   * @return effectiveAssignments
  **/
  @ApiModelProperty(value = "Effective Assignments")
  public List<EffectiveAssignment> getEffectiveAssignments() {
    return effectiveAssignments;
  }

  public void setEffectiveAssignments(List<EffectiveAssignment> effectiveAssignments) {
    this.effectiveAssignments = effectiveAssignments;
  }

  public IdmESUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Username
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "Username")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public IdmESUser lastChanged(LastChanged lastChanged) {
    this.lastChanged = lastChanged;
    return this;
  }

  public IdmESUser sunset(Sunset sunset) {
    this.sunset = sunset;
    return this;
  }

  /**
   * Get sunset
   * @return sunset
   **/
  @ApiModelProperty(value = "")
  public Sunset getSunset() {
    return sunset;
  }

  public void setSunset(Sunset sunset) {
    this.sunset = sunset;
  }

   /**
   * Get lastChanged
   * @return lastChanged
  **/
  @ApiModelProperty(value = "")
  public LastChanged getLastChanged() {
    return lastChanged;
  }

  public void setLastChanged(LastChanged lastChanged) {
    this.lastChanged = lastChanged;
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
    return Objects.equals(this.uid, user.uid) &&
        Objects.equals(this.mail, user.mail) &&
        Objects.equals(this.sn, user.sn) &&
        Objects.equals(this.givenName, user.givenName) &&
        Objects.equals(this.accountStatus, user.accountStatus) &&
        Objects.equals(this.effectiveAssignments, user.effectiveAssignments) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.lastChanged, user.lastChanged) &&
        Objects.equals(this.sunset, user.sunset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, mail, sn, givenName, accountStatus, effectiveAssignments, userName, lastChanged, sunset);
  }


  @Override
  public String toString() {
    return "class User {\n" +
            "    id: " + toIndentedString(uid) + "\n" +
            "    mail: " + toIndentedString(mail) + "\n" +
            "    sn: " + toIndentedString(sn) + "\n" +
            "    givenName: " + toIndentedString(givenName) + "\n" +
            "    accountStatus: " + toIndentedString(accountStatus) + "\n" +
            "    effectiveAssignments: " + toIndentedString(effectiveAssignments) + "\n" +
            "    userName: " + toIndentedString(userName) + "\n" +
            "    sunset: " + toIndentedString(sunset) + "\n" +
            "    lastChanged: " + toIndentedString(lastChanged) + "\n" +
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

