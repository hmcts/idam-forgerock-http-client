/*
 * ForgeRock IDM Miscellaneous API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.misc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ReconciliationServiceResource
 */
@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.022Z")
public class ReconciliationServiceResource {
  @JsonProperty("mapping")
  private String mapping = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("stage")
  private String stage = null;

  @JsonProperty("stageDescription")
  private String stageDescription = null;

  @JsonProperty("progress")
  private ReconProgress progress = null;

  @JsonProperty("situationSummary")
  private Object situationSummary = null;

  @JsonProperty("statusSummary")
  private Object statusSummary = null;

  @JsonProperty("durationSummary")
  private Object durationSummary = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  @JsonProperty("started")
  private OffsetDateTime started = null;

  @JsonProperty("ended")
  private OffsetDateTime ended = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("_id")
  private String id = null;

  public ReconciliationServiceResource mapping(String mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Mapping name (e.g., systemXmlfileAccounts_managedUser)
   * @return mapping
  **/
  @ApiModelProperty(required = true, value = "Mapping name (e.g., systemXmlfileAccounts_managedUser)")
  public String getMapping() {
    return mapping;
  }

  public void setMapping(String mapping) {
    this.mapping = mapping;
  }

  public ReconciliationServiceResource state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Coarse-grained state of recon process
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Coarse-grained state of recon process")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ReconciliationServiceResource stage(String stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Fine-grained stage of recon process
   * @return stage
  **/
  @ApiModelProperty(required = true, value = "Fine-grained stage of recon process")
  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public ReconciliationServiceResource stageDescription(String stageDescription) {
    this.stageDescription = stageDescription;
    return this;
  }

   /**
   * Description of current stage
   * @return stageDescription
  **/
  @ApiModelProperty(required = true, value = "Description of current stage")
  public String getStageDescription() {
    return stageDescription;
  }

  public void setStageDescription(String stageDescription) {
    this.stageDescription = stageDescription;
  }

  public ReconciliationServiceResource progress(ReconProgress progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(required = true, value = "")
  public ReconProgress getProgress() {
    return progress;
  }

  public void setProgress(ReconProgress progress) {
    this.progress = progress;
  }

  public ReconciliationServiceResource situationSummary(Object situationSummary) {
    this.situationSummary = situationSummary;
    return this;
  }

   /**
   * Stats related to success and failure
   * @return situationSummary
  **/
  @ApiModelProperty(required = true, value = "Stats related to success and failure")
  public Object getSituationSummary() {
    return situationSummary;
  }

  public void setSituationSummary(Object situationSummary) {
    this.situationSummary = situationSummary;
  }

  public ReconciliationServiceResource statusSummary(Object statusSummary) {
    this.statusSummary = statusSummary;
    return this;
  }

   /**
   * Success and failure counts
   * @return statusSummary
  **/
  @ApiModelProperty(required = true, value = "Success and failure counts")
  public Object getStatusSummary() {
    return statusSummary;
  }

  public void setStatusSummary(Object statusSummary) {
    this.statusSummary = statusSummary;
  }

  public ReconciliationServiceResource durationSummary(Object durationSummary) {
    this.durationSummary = durationSummary;
    return this;
  }

   /**
   * Duration stats for discrete recon operations
   * @return durationSummary
  **/
  @ApiModelProperty(required = true, value = "Duration stats for discrete recon operations")
  public Object getDurationSummary() {
    return durationSummary;
  }

  public void setDurationSummary(Object durationSummary) {
    this.durationSummary = durationSummary;
  }

  public ReconciliationServiceResource parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Parameters for source and target selection
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "Parameters for source and target selection")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public ReconciliationServiceResource started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

   /**
   * ISO 8601 date-time when recon started
   * @return started
  **/
  @ApiModelProperty(required = true, value = "ISO 8601 date-time when recon started")
  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }

  public ReconciliationServiceResource ended(OffsetDateTime ended) {
    this.ended = ended;
    return this;
  }

   /**
   * ISO 8601 date-time when recon ended or empty-string
   * @return ended
  **/
  @ApiModelProperty(required = true, value = "ISO 8601 date-time when recon ended or empty-string")
  public OffsetDateTime getEnded() {
    return ended;
  }

  public void setEnded(OffsetDateTime ended) {
    this.ended = ended;
  }

  public ReconciliationServiceResource duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Recon duration, in millisconds
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Recon duration, in millisconds")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public ReconciliationServiceResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Recon ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Recon ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconciliationServiceResource reconciliationServiceResource = (ReconciliationServiceResource) o;
    return Objects.equals(this.mapping, reconciliationServiceResource.mapping) &&
        Objects.equals(this.state, reconciliationServiceResource.state) &&
        Objects.equals(this.stage, reconciliationServiceResource.stage) &&
        Objects.equals(this.stageDescription, reconciliationServiceResource.stageDescription) &&
        Objects.equals(this.progress, reconciliationServiceResource.progress) &&
        Objects.equals(this.situationSummary, reconciliationServiceResource.situationSummary) &&
        Objects.equals(this.statusSummary, reconciliationServiceResource.statusSummary) &&
        Objects.equals(this.durationSummary, reconciliationServiceResource.durationSummary) &&
        Objects.equals(this.parameters, reconciliationServiceResource.parameters) &&
        Objects.equals(this.started, reconciliationServiceResource.started) &&
        Objects.equals(this.ended, reconciliationServiceResource.ended) &&
        Objects.equals(this.duration, reconciliationServiceResource.duration) &&
        Objects.equals(this.id, reconciliationServiceResource.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, state, stage, stageDescription, progress, situationSummary, statusSummary, durationSummary, parameters, started, ended, duration, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconciliationServiceResource {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    stageDescription: ").append(toIndentedString(stageDescription)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    situationSummary: ").append(toIndentedString(situationSummary)).append("\n");
    sb.append("    statusSummary: ").append(toIndentedString(statusSummary)).append("\n");
    sb.append("    durationSummary: ").append(toIndentedString(durationSummary)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

