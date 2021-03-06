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
import com.sphereon.sdk.classification.model.ClassificationInputInfo;
import com.sphereon.sdk.classification.model.JobInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The classification job. Has access to the job settings as well as ocr engine tasks
 */
@ApiModel(description = "The classification job. Has access to the job settings as well as ocr engine tasks")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T13:02:31.104+02:00")
public class ClassificationJobResponse {
  @SerializedName("inputInfo")
  private ClassificationInputInfo inputInfo = null;

  @SerializedName("jobInfo")
  private JobInfo jobInfo = null;

  public ClassificationJobResponse inputInfo(ClassificationInputInfo inputInfo) {
    this.inputInfo = inputInfo;
    return this;
  }

   /**
   * Original input information
   * @return inputInfo
  **/
  @ApiModelProperty(required = true, value = "Original input information")
  public ClassificationInputInfo getInputInfo() {
    return inputInfo;
  }

  public void setInputInfo(ClassificationInputInfo inputInfo) {
    this.inputInfo = inputInfo;
  }

  public ClassificationJobResponse jobInfo(JobInfo jobInfo) {
    this.jobInfo = jobInfo;
    return this;
  }

   /**
   * Job info
   * @return jobInfo
  **/
  @ApiModelProperty(required = true, value = "Job info")
  public JobInfo getJobInfo() {
    return jobInfo;
  }

  public void setJobInfo(JobInfo jobInfo) {
    this.jobInfo = jobInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationJobResponse classificationJobResponse = (ClassificationJobResponse) o;
    return Objects.equals(this.inputInfo, classificationJobResponse.inputInfo) &&
        Objects.equals(this.jobInfo, classificationJobResponse.jobInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputInfo, jobInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationJobResponse {\n");
    
    sb.append("    inputInfo: ").append(toIndentedString(inputInfo)).append("\n");
    sb.append("    jobInfo: ").append(toIndentedString(jobInfo)).append("\n");
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

