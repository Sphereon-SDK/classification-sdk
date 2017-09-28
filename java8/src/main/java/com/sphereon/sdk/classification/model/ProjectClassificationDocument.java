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
import com.sphereon.sdk.classification.model.ProjectClassificationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * The classification Document
 */
@ApiModel(description = "The classification Document")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T08:34:28.559+02:00")
public class ProjectClassificationDocument   {
  @SerializedName("firstPage")
  private Integer firstPage = null;

  @SerializedName("lastPage")
  private Integer lastPage = null;

  @SerializedName("results")
  private List<ProjectClassificationResult> results = new ArrayList<ProjectClassificationResult>();

  public ProjectClassificationDocument firstPage(Integer firstPage) {
    this.firstPage = firstPage;
    return this;
  }

   /**
   * First page
   * @return firstPage
  **/
  @ApiModelProperty(example = "null", required = true, value = "First page")
  public Integer getFirstPage() {
    return firstPage;
  }

  public void setFirstPage(Integer firstPage) {
    this.firstPage = firstPage;
  }

  public ProjectClassificationDocument lastPage(Integer lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Last page
   * @return lastPage
  **/
  @ApiModelProperty(example = "null", required = true, value = "Last page")
  public Integer getLastPage() {
    return lastPage;
  }

  public void setLastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }

  public ProjectClassificationDocument results(List<ProjectClassificationResult> results) {
    this.results = results;
    return this;
  }

  public ProjectClassificationDocument addResultsItem(ProjectClassificationResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * A list of classification results
   * @return results
  **/
  @ApiModelProperty(example = "null", required = true, value = "A list of classification results")
  public List<ProjectClassificationResult> getResults() {
    return results;
  }

  public void setResults(List<ProjectClassificationResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectClassificationDocument projectClassificationDocument = (ProjectClassificationDocument) o;
    return Objects.equals(this.firstPage, projectClassificationDocument.firstPage) &&
        Objects.equals(this.lastPage, projectClassificationDocument.lastPage) &&
        Objects.equals(this.results, projectClassificationDocument.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstPage, lastPage, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectClassificationDocument {\n");
    
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
