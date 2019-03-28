/*
 * SUPLA Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package pl.grzeslowski.jsupla.api.generated.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DirectLinkRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-28T22:45:22.163Z[GMT]")
public class DirectLinkRequest {

    @SerializedName("subjectId")
    private Integer subjectId = null;

    @SerializedName("subjectType")
    private ActionableSubjectTypeEnum subjectType = null;

    @SerializedName("allowedActions")
    private List<ChannelFunctionActionEnum> allowedActions = null;

    @SerializedName("activeDateRange")
    private DirectLinkActiveDateRange activeDateRange = null;

    @SerializedName("executionsLimit")
    private Integer executionsLimit = null;

    @SerializedName("caption")
    private String caption = null;

    @SerializedName("enabled")
    private Boolean enabled = null;

    @SerializedName("disableHttpGet")
    private Boolean disableHttpGet = null;

    public DirectLinkRequest subjectId(Integer subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    /**
     * Get subjectId
     *
     * @return subjectId
     **/
    @Schema(description = "")
    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public DirectLinkRequest subjectType(ActionableSubjectTypeEnum subjectType) {
        this.subjectType = subjectType;
        return this;
    }

    /**
     * Get subjectType
     *
     * @return subjectType
     **/
    @Schema(description = "")
    public ActionableSubjectTypeEnum getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(ActionableSubjectTypeEnum subjectType) {
        this.subjectType = subjectType;
    }

    public DirectLinkRequest allowedActions(List<ChannelFunctionActionEnum> allowedActions) {
        this.allowedActions = allowedActions;
        return this;
    }

    public DirectLinkRequest addAllowedActionsItem(ChannelFunctionActionEnum allowedActionsItem) {
        if (this.allowedActions == null) {
            this.allowedActions = new ArrayList<ChannelFunctionActionEnum>();
        }
        this.allowedActions.add(allowedActionsItem);
        return this;
    }

    /**
     * Get allowedActions
     *
     * @return allowedActions
     **/
    @Schema(description = "")
    public List<ChannelFunctionActionEnum> getAllowedActions() {
        return allowedActions;
    }

    public void setAllowedActions(List<ChannelFunctionActionEnum> allowedActions) {
        this.allowedActions = allowedActions;
    }

    public DirectLinkRequest activeDateRange(DirectLinkActiveDateRange activeDateRange) {
        this.activeDateRange = activeDateRange;
        return this;
    }

    /**
     * Get activeDateRange
     *
     * @return activeDateRange
     **/
    @Schema(description = "")
    public DirectLinkActiveDateRange getActiveDateRange() {
        return activeDateRange;
    }

    public void setActiveDateRange(DirectLinkActiveDateRange activeDateRange) {
        this.activeDateRange = activeDateRange;
    }

    public DirectLinkRequest executionsLimit(Integer executionsLimit) {
        this.executionsLimit = executionsLimit;
        return this;
    }

    /**
     * Get executionsLimit
     *
     * @return executionsLimit
     **/
    @Schema(example = "10", description = "")
    public Integer getExecutionsLimit() {
        return executionsLimit;
    }

    public void setExecutionsLimit(Integer executionsLimit) {
        this.executionsLimit = executionsLimit;
    }

    public DirectLinkRequest caption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Get caption
     *
     * @return caption
     **/
    @Schema(description = "")
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public DirectLinkRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     **/
    @Schema(description = "")
    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public DirectLinkRequest disableHttpGet(Boolean disableHttpGet) {
        this.disableHttpGet = disableHttpGet;
        return this;
    }

    /**
     * Get disableHttpGet
     *
     * @return disableHttpGet
     **/
    @Schema(description = "")
    public Boolean isDisableHttpGet() {
        return disableHttpGet;
    }

    public void setDisableHttpGet(Boolean disableHttpGet) {
        this.disableHttpGet = disableHttpGet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DirectLinkRequest directLinkRequest = (DirectLinkRequest) o;
        return Objects.equals(this.subjectId, directLinkRequest.subjectId) &&
                       Objects.equals(this.subjectType, directLinkRequest.subjectType) &&
                       Objects.equals(this.allowedActions, directLinkRequest.allowedActions) &&
                       Objects.equals(this.activeDateRange, directLinkRequest.activeDateRange) &&
                       Objects.equals(this.executionsLimit, directLinkRequest.executionsLimit) &&
                       Objects.equals(this.caption, directLinkRequest.caption) &&
                       Objects.equals(this.enabled, directLinkRequest.enabled) &&
                       Objects.equals(this.disableHttpGet, directLinkRequest.disableHttpGet);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(subjectId, subjectType, allowedActions, activeDateRange, executionsLimit, caption, enabled, disableHttpGet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectLinkRequest {\n");

        sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
        sb.append("    allowedActions: ").append(toIndentedString(allowedActions)).append("\n");
        sb.append("    activeDateRange: ").append(toIndentedString(activeDateRange)).append("\n");
        sb.append("    executionsLimit: ").append(toIndentedString(executionsLimit)).append("\n");
        sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    disableHttpGet: ").append(toIndentedString(disableHttpGet)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}