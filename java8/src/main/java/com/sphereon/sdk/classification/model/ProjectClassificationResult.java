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
import java.util.ArrayList;
import java.util.List;

/**
 * The classification result
 */
@ApiModel(description = "The classification result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T13:02:31.104+02:00")
public class ProjectClassificationResult {
  @SerializedName("score")
  private Double score = null;

  @SerializedName("notes")
  private List<String> notes = null;

  @SerializedName("className")
  private String className = null;

  public ProjectClassificationResult score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Score
   * @return score
  **/
  @ApiModelProperty(value = "Score")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public ProjectClassificationResult notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public ProjectClassificationResult addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * A list of classification notes
   * @return notes
  **/
  @ApiModelProperty(value = "A list of classification notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public ProjectClassificationResult className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Class name
   * @return className
  **/
  @ApiModelProperty(value = "Class name")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectClassificationResult projectClassificationResult = (ProjectClassificationResult) o;
    return Objects.equals(this.score, projectClassificationResult.score) &&
        Objects.equals(this.notes, projectClassificationResult.notes) &&
        Objects.equals(this.className, projectClassificationResult.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, notes, className);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectClassificationResult {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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

