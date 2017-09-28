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
import com.sphereon.sdk.classification.model.ProjectClassificationDocument;
import com.sphereon.sdk.classification.model.ProjectClassificationPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * External storage of classification result
 */
@ApiModel(description = "External storage of classification result")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T08:34:28.559+02:00")
public class Inline   {
  @SerializedName("pages")
  private List<ProjectClassificationPage> pages = new ArrayList<ProjectClassificationPage>();

  @SerializedName("documents")
  private List<ProjectClassificationDocument> documents = new ArrayList<ProjectClassificationDocument>();

  public Inline pages(List<ProjectClassificationPage> pages) {
    this.pages = pages;
    return this;
  }

  public Inline addPagesItem(ProjectClassificationPage pagesItem) {
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * A list of pages
   * @return pages
  **/
  @ApiModelProperty(example = "null", value = "A list of pages")
  public List<ProjectClassificationPage> getPages() {
    return pages;
  }

  public void setPages(List<ProjectClassificationPage> pages) {
    this.pages = pages;
  }

  public Inline documents(List<ProjectClassificationDocument> documents) {
    this.documents = documents;
    return this;
  }

  public Inline addDocumentsItem(ProjectClassificationDocument documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * A list of documents.
   * @return documents
  **/
  @ApiModelProperty(example = "null", value = "A list of documents.")
  public List<ProjectClassificationDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<ProjectClassificationDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inline inline = (Inline) o;
    return Objects.equals(this.pages, inline.pages) &&
        Objects.equals(this.documents, inline.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inline {\n");
    
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

