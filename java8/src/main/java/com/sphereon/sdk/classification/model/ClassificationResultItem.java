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
import com.sphereon.sdk.classification.model.ClassificationInputInfo;
import com.sphereon.sdk.classification.model.ClassificationProjectResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Document to be classified
 */
@ApiModel(description = "Document to be classified")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T08:34:28.559+02:00")
public class ClassificationResultItem   {
  @SerializedName("inputInfo")
  private ClassificationInputInfo inputInfo = null;

  @SerializedName("results")
  private List<ClassificationProjectResult> results = new ArrayList<ClassificationProjectResult>();

  public ClassificationResultItem inputInfo(ClassificationInputInfo inputInfo) {
    this.inputInfo = inputInfo;
    return this;
  }

   /**
   * Original input information
   * @return inputInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "Original input information")
  public ClassificationInputInfo getInputInfo() {
    return inputInfo;
  }

  public void setInputInfo(ClassificationInputInfo inputInfo) {
    this.inputInfo = inputInfo;
  }

  public ClassificationResultItem results(List<ClassificationProjectResult> results) {
    this.results = results;
    return this;
  }

  public ClassificationResultItem addResultsItem(ClassificationProjectResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Classification results for a document per project
   * @return results
  **/
  @ApiModelProperty(example = "null", value = "Classification results for a document per project")
  public List<ClassificationProjectResult> getResults() {
    return results;
  }

  public void setResults(List<ClassificationProjectResult> results) {
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
    ClassificationResultItem classificationResultItem = (ClassificationResultItem) o;
    return Objects.equals(this.inputInfo, classificationResultItem.inputInfo) &&
        Objects.equals(this.results, classificationResultItem.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputInfo, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResultItem {\n");
    
    sb.append("    inputInfo: ").append(toIndentedString(inputInfo)).append("\n");
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
