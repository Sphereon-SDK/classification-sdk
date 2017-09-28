/**
 * Classification API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.classification.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.sphereon.sdk.classification.model.ProjectSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;


/**
 * The project response
 */
@ApiModel(description = "The project response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T08:34:28.559+02:00")
public class ProjectResponse   {
  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("updateTime")
  private OffsetDateTime updateTime = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("projectSettings")
  private ProjectSettings projectSettings = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  /**
   * The status of the project action
   */
  public enum StatusEnum {
    @SerializedName("CREATED")
    CREATED("CREATED"),
    
    @SerializedName("PROJECT_UPLOADED")
    PROJECT_UPLOADED("PROJECT_UPLOADED"),
    
    @SerializedName("ERROR")
    ERROR("ERROR"),
    
    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

   /**
   * The creation date/time of this job in ISO 8601 format
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "The creation date/time of this job in ISO 8601 format")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

   /**
   * The last update date/time of this job in ISO 8601 format
   * @return updateTime
  **/
  @ApiModelProperty(example = "null", value = "The last update date/time of this job in ISO 8601 format")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public ProjectResponse projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProjectResponse projectSettings(ProjectSettings projectSettings) {
    this.projectSettings = projectSettings;
    return this;
  }

   /**
   * The project info
   * @return projectSettings
  **/
  @ApiModelProperty(example = "null", value = "The project info")
  public ProjectSettings getProjectSettings() {
    return projectSettings;
  }

  public void setProjectSettings(ProjectSettings projectSettings) {
    this.projectSettings = projectSettings;
  }

   /**
   * A status message, which can be informational, warning or error. A message here does not indicate an error perse
   * @return statusMessage
  **/
  @ApiModelProperty(example = "null", value = "A status message, which can be informational, warning or error. A message here does not indicate an error perse")
  public String getStatusMessage() {
    return statusMessage;
  }

   /**
   * The status of the project action
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "The status of the project action")
  public StatusEnum getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectResponse projectResponse = (ProjectResponse) o;
    return Objects.equals(this.creationTime, projectResponse.creationTime) &&
        Objects.equals(this.updateTime, projectResponse.updateTime) &&
        Objects.equals(this.projectId, projectResponse.projectId) &&
        Objects.equals(this.projectSettings, projectResponse.projectSettings) &&
        Objects.equals(this.statusMessage, projectResponse.statusMessage) &&
        Objects.equals(this.status, projectResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, updateTime, projectId, projectSettings, statusMessage, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectResponse {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectSettings: ").append(toIndentedString(projectSettings)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
