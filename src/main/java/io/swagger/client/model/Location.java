/*
 * SUPLA Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AccessIdentifier;
import io.swagger.client.model.Channel;
import io.swagger.client.model.ChannelGroup;
import io.swagger.client.model.Device;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Location
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-03T19:40:18.502Z")
public class Location {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("iodevicesIds")
  private List<Integer> iodevicesIds = null;

  @SerializedName("channelGroupsIds")
  private List<Integer> channelGroupsIds = null;

  @SerializedName("channelsIds")
  private List<Integer> channelsIds = null;

  @SerializedName("accessIdsIds")
  private List<Integer> accessIdsIds = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("iodevices")
  private List<Device> iodevices = null;

  @SerializedName("channelGroups")
  private List<ChannelGroup> channelGroups = null;

  @SerializedName("accessIds")
  private List<AccessIdentifier> accessIds = null;

  @SerializedName("channels")
  private List<Channel> channels = null;

  public Location id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Location identifier
   * @return id
  **/
  @ApiModelProperty(value = "Location identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Location caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Location caption
   * @return caption
  **/
  @ApiModelProperty(value = "Location caption")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Location enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * &#x60;true&#x60; if the location is enabled, &#x60;false&#x60; otherwise
   * @return enabled
  **/
  @ApiModelProperty(value = "`true` if the location is enabled, `false` otherwise")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Location iodevicesIds(List<Integer> iodevicesIds) {
    this.iodevicesIds = iodevicesIds;
    return this;
  }

  public Location addIodevicesIdsItem(Integer iodevicesIdsItem) {
    if (this.iodevicesIds == null) {
      this.iodevicesIds = new ArrayList<Integer>();
    }
    this.iodevicesIds.add(iodevicesIdsItem);
    return this;
  }

   /**
   * array containing the IO Devices identifiers assigned to this location
   * @return iodevicesIds
  **/
  @ApiModelProperty(value = "array containing the IO Devices identifiers assigned to this location")
  public List<Integer> getIodevicesIds() {
    return iodevicesIds;
  }

  public void setIodevicesIds(List<Integer> iodevicesIds) {
    this.iodevicesIds = iodevicesIds;
  }

  public Location channelGroupsIds(List<Integer> channelGroupsIds) {
    this.channelGroupsIds = channelGroupsIds;
    return this;
  }

  public Location addChannelGroupsIdsItem(Integer channelGroupsIdsItem) {
    if (this.channelGroupsIds == null) {
      this.channelGroupsIds = new ArrayList<Integer>();
    }
    this.channelGroupsIds.add(channelGroupsIdsItem);
    return this;
  }

   /**
   * array containing the Channel groups identifiers assigned to this location
   * @return channelGroupsIds
  **/
  @ApiModelProperty(value = "array containing the Channel groups identifiers assigned to this location")
  public List<Integer> getChannelGroupsIds() {
    return channelGroupsIds;
  }

  public void setChannelGroupsIds(List<Integer> channelGroupsIds) {
    this.channelGroupsIds = channelGroupsIds;
  }

  public Location channelsIds(List<Integer> channelsIds) {
    this.channelsIds = channelsIds;
    return this;
  }

  public Location addChannelsIdsItem(Integer channelsIdsItem) {
    if (this.channelsIds == null) {
      this.channelsIds = new ArrayList<Integer>();
    }
    this.channelsIds.add(channelsIdsItem);
    return this;
  }

   /**
   * array containing the Channels identifiers expicitely assigned to this location
   * @return channelsIds
  **/
  @ApiModelProperty(value = "array containing the Channels identifiers expicitely assigned to this location")
  public List<Integer> getChannelsIds() {
    return channelsIds;
  }

  public void setChannelsIds(List<Integer> channelsIds) {
    this.channelsIds = channelsIds;
  }

  public Location accessIdsIds(List<Integer> accessIdsIds) {
    this.accessIdsIds = accessIdsIds;
    return this;
  }

  public Location addAccessIdsIdsItem(Integer accessIdsIdsItem) {
    if (this.accessIdsIds == null) {
      this.accessIdsIds = new ArrayList<Integer>();
    }
    this.accessIdsIds.add(accessIdsIdsItem);
    return this;
  }

   /**
   * array containing the Access Identifiers identifiers assigned to this location
   * @return accessIdsIds
  **/
  @ApiModelProperty(value = "array containing the Access Identifiers identifiers assigned to this location")
  public List<Integer> getAccessIdsIds() {
    return accessIdsIds;
  }

  public void setAccessIdsIds(List<Integer> accessIdsIds) {
    this.accessIdsIds = accessIdsIds;
  }

  public Location password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Location password (plain text). Returned only if requested by the &#x60;include&#x60; parameter.
   * @return password
  **/
  @ApiModelProperty(value = "Location password (plain text). Returned only if requested by the `include` parameter.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Location iodevices(List<Device> iodevices) {
    this.iodevices = iodevices;
    return this;
  }

  public Location addIodevicesItem(Device iodevicesItem) {
    if (this.iodevices == null) {
      this.iodevices = new ArrayList<Device>();
    }
    this.iodevices.add(iodevicesItem);
    return this;
  }

   /**
   * Returned only if requested by the &#x60;include&#x60; parameter.
   * @return iodevices
  **/
  @ApiModelProperty(value = "Returned only if requested by the `include` parameter.")
  public List<Device> getIodevices() {
    return iodevices;
  }

  public void setIodevices(List<Device> iodevices) {
    this.iodevices = iodevices;
  }

  public Location channelGroups(List<ChannelGroup> channelGroups) {
    this.channelGroups = channelGroups;
    return this;
  }

  public Location addChannelGroupsItem(ChannelGroup channelGroupsItem) {
    if (this.channelGroups == null) {
      this.channelGroups = new ArrayList<ChannelGroup>();
    }
    this.channelGroups.add(channelGroupsItem);
    return this;
  }

   /**
   * Returned only if requested by the &#x60;include&#x60; parameter.
   * @return channelGroups
  **/
  @ApiModelProperty(example = "[]", value = "Returned only if requested by the `include` parameter.")
  public List<ChannelGroup> getChannelGroups() {
    return channelGroups;
  }

  public void setChannelGroups(List<ChannelGroup> channelGroups) {
    this.channelGroups = channelGroups;
  }

  public Location accessIds(List<AccessIdentifier> accessIds) {
    this.accessIds = accessIds;
    return this;
  }

  public Location addAccessIdsItem(AccessIdentifier accessIdsItem) {
    if (this.accessIds == null) {
      this.accessIds = new ArrayList<AccessIdentifier>();
    }
    this.accessIds.add(accessIdsItem);
    return this;
  }

   /**
   * Returned only if requested by the &#x60;include&#x60; parameter.
   * @return accessIds
  **/
  @ApiModelProperty(value = "Returned only if requested by the `include` parameter.")
  public List<AccessIdentifier> getAccessIds() {
    return accessIds;
  }

  public void setAccessIds(List<AccessIdentifier> accessIds) {
    this.accessIds = accessIds;
  }

  public Location channels(List<Channel> channels) {
    this.channels = channels;
    return this;
  }

  public Location addChannelsItem(Channel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<Channel>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Returned only if requested by the &#x60;include&#x60; parameter.
   * @return channels
  **/
  @ApiModelProperty(value = "Returned only if requested by the `include` parameter.")
  public List<Channel> getChannels() {
    return channels;
  }

  public void setChannels(List<Channel> channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.caption, location.caption) &&
        Objects.equals(this.enabled, location.enabled) &&
        Objects.equals(this.iodevicesIds, location.iodevicesIds) &&
        Objects.equals(this.channelGroupsIds, location.channelGroupsIds) &&
        Objects.equals(this.channelsIds, location.channelsIds) &&
        Objects.equals(this.accessIdsIds, location.accessIdsIds) &&
        Objects.equals(this.password, location.password) &&
        Objects.equals(this.iodevices, location.iodevices) &&
        Objects.equals(this.channelGroups, location.channelGroups) &&
        Objects.equals(this.accessIds, location.accessIds) &&
        Objects.equals(this.channels, location.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caption, enabled, iodevicesIds, channelGroupsIds, channelsIds, accessIdsIds, password, iodevices, channelGroups, accessIds, channels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    iodevicesIds: ").append(toIndentedString(iodevicesIds)).append("\n");
    sb.append("    channelGroupsIds: ").append(toIndentedString(channelGroupsIds)).append("\n");
    sb.append("    channelsIds: ").append(toIndentedString(channelsIds)).append("\n");
    sb.append("    accessIdsIds: ").append(toIndentedString(accessIdsIds)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    iodevices: ").append(toIndentedString(iodevices)).append("\n");
    sb.append("    channelGroups: ").append(toIndentedString(channelGroups)).append("\n");
    sb.append("    accessIds: ").append(toIndentedString(accessIds)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

