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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Storage Location
 */
@ApiModel(description = "Storage Location")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T13:02:31.104+02:00")
public class StorageLocation {
  @SerializedName("folderPath")
  private String folderPath = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("containerId")
  private String containerId = null;

  public StorageLocation folderPath(String folderPath) {
    this.folderPath = folderPath;
    return this;
  }

   /**
   * Get folderPath
   * @return folderPath
  **/
  @ApiModelProperty(value = "")
  public String getFolderPath() {
    return folderPath;
  }

  public void setFolderPath(String folderPath) {
    this.folderPath = folderPath;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public StorageLocation containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

   /**
   * Get containerId
   * @return containerId
  **/
  @ApiModelProperty(value = "")
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageLocation storageLocation = (StorageLocation) o;
    return Objects.equals(this.folderPath, storageLocation.folderPath) &&
        Objects.equals(this.id, storageLocation.id) &&
        Objects.equals(this.containerId, storageLocation.containerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folderPath, id, containerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageLocation {\n");
    
    sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
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

