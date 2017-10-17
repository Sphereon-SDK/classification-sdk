/*
 * Classification API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.classification.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sphereon.sdk.classification.model.StreamLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * External storage of classification result
 */
@ApiModel(description = "External storage of classification result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T13:02:31.104+02:00")
public class Stream {
  @SerializedName("streamLocation")
  private StreamLocation streamLocation = null;

  public Stream streamLocation(StreamLocation streamLocation) {
    this.streamLocation = streamLocation;
    return this;
  }

   /**
   * The location of the classification result.
   * @return streamLocation
  **/
  @ApiModelProperty(value = "The location of the classification result.")
  public StreamLocation getStreamLocation() {
    return streamLocation;
  }

  public void setStreamLocation(StreamLocation streamLocation) {
    this.streamLocation = streamLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream stream = (Stream) o;
    return Objects.equals(this.streamLocation, stream.streamLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    
    sb.append("    streamLocation: ").append(toIndentedString(streamLocation)).append("\n");
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

