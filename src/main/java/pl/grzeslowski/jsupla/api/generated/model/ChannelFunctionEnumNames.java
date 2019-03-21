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

package pl.grzeslowski.jsupla.api.generated.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets ChannelFunctionEnumNames
 */
@JsonAdapter(ChannelFunctionEnumNames.Adapter.class)
public enum ChannelFunctionEnumNames {
  
  NONE("NONE"),
  
  CONTROLLINGTHEGATEWAYLOCK("CONTROLLINGTHEGATEWAYLOCK"),
  
  CONTROLLINGTHEGATE("CONTROLLINGTHEGATE"),
  
  CONTROLLINGTHEGARAGEDOOR("CONTROLLINGTHEGARAGEDOOR"),
  
  THERMOMETER("THERMOMETER"),
  
  HUMIDITY("HUMIDITY"),
  
  HUMIDITYANDTEMPERATURE("HUMIDITYANDTEMPERATURE"),
  
  OPENINGSENSOR_GATEWAY("OPENINGSENSOR_GATEWAY"),
  
  OPENINGSENSOR_GATE("OPENINGSENSOR_GATE"),
  
  OPENINGSENSOR_GARAGEDOOR("OPENINGSENSOR_GARAGEDOOR"),
  
  NOLIQUIDSENSOR("NOLIQUIDSENSOR"),
  
  CONTROLLINGTHEDOORLOCK("CONTROLLINGTHEDOORLOCK"),
  
  OPENINGSENSOR_DOOR("OPENINGSENSOR_DOOR"),
  
  CONTROLLINGTHEROLLERSHUTTER("CONTROLLINGTHEROLLERSHUTTER"),
  
  OPENINGSENSOR_ROLLERSHUTTER("OPENINGSENSOR_ROLLERSHUTTER"),
  
  POWERSWITCH("POWERSWITCH"),
  
  LIGHTSWITCH("LIGHTSWITCH"),
  
  DIMMER("DIMMER"),
  
  RGBLIGHTING("RGBLIGHTING"),
  
  DIMMERANDRGBLIGHTING("DIMMERANDRGBLIGHTING"),
  
  DEPTHSENSOR("DEPTHSENSOR"),
  
  DISTANCESENSOR("DISTANCESENSOR"),
  
  OPENINGSENSOR_WINDOW("OPENINGSENSOR_WINDOW"),
  
  MAILSENSOR("MAILSENSOR"),
  
  WINDSENSOR("WINDSENSOR"),
  
  PRESSURESENSOR("PRESSURESENSOR"),
  
  RAINSENSOR("RAINSENSOR"),
  
  WEIGHTSENSOR("WEIGHTSENSOR"),
  
  WEATHER_STATION("WEATHER_STATION"),
  
  STAIRCASETIMER("STAIRCASETIMER");

  private String value;

  ChannelFunctionEnumNames(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChannelFunctionEnumNames fromValue(String text) {
    for (ChannelFunctionEnumNames b : ChannelFunctionEnumNames.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ChannelFunctionEnumNames> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChannelFunctionEnumNames enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChannelFunctionEnumNames read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChannelFunctionEnumNames.fromValue(String.valueOf(value));
    }
  }
}
