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


package pl.grzeslowski.jsupla.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import pl.grzeslowski.jsupla.api.model.ChannelFunctionActionEnum;

/**
 * ChannelFunctionAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-03T19:40:18.502Z")
public class ChannelFunctionAction {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private ChannelFunctionActionEnum name = null;

  @SerializedName("caption")
  private String caption = null;

  public ChannelFunctionAction id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChannelFunctionAction name(ChannelFunctionActionEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ChannelFunctionActionEnum getName() {
    return name;
  }

  public void setName(ChannelFunctionActionEnum name) {
    this.name = name;
  }

  public ChannelFunctionAction caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @ApiModelProperty(value = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelFunctionAction channelFunctionAction = (ChannelFunctionAction) o;
    return Objects.equals(this.id, channelFunctionAction.id) &&
        Objects.equals(this.name, channelFunctionAction.name) &&
        Objects.equals(this.caption, channelFunctionAction.caption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, caption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelFunctionAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
