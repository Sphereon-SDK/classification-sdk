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
import com.sphereon.sdk.classification.model.ProjectClassificationClassifierFeature;
import com.sphereon.sdk.classification.model.ProjectClassificationResult;
import com.sphereon.sdk.classification.model.ProjectClassificationTextLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * The classification result page
 */
@ApiModel(description = "The classification result page")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T08:34:28.559+02:00")
public class ProjectClassificationPage   {
  @SerializedName("classifiedClassName")
  private String classifiedClassName = null;

  @SerializedName("featureHighlightings")
  private List<ProjectClassificationClassifierFeature> featureHighlightings = new ArrayList<ProjectClassificationClassifierFeature>();

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("textLines")
  private List<ProjectClassificationTextLine> textLines = new ArrayList<ProjectClassificationTextLine>();

  @SerializedName("skipContentClassification")
  private Boolean skipContentClassification = null;

  @SerializedName("classificationResults")
  private List<ProjectClassificationResult> classificationResults = new ArrayList<ProjectClassificationResult>();

  @SerializedName("rotationType")
  private String rotationType = null;

  @SerializedName("confidentDocumentClassificationResult")
  private Boolean confidentDocumentClassificationResult = null;

  @SerializedName("assignedClassName")
  private String assignedClassName = null;

  @SerializedName("separationResults")
  private List<ProjectClassificationResult> separationResults = new ArrayList<ProjectClassificationResult>();

  @SerializedName("xresolution")
  private Double xresolution = null;

  @SerializedName("originalPageNumber")
  private Integer originalPageNumber = null;

  @SerializedName("hasPageText")
  private Boolean hasPageText = null;

  @SerializedName("splitConfidence")
  private Double splitConfidence = null;

  @SerializedName("yresolution")
  private Double yresolution = null;

  @SerializedName("separationFeatureHighlightings")
  private List<ProjectClassificationClassifierFeature> separationFeatureHighlightings = new ArrayList<ProjectClassificationClassifierFeature>();

  @SerializedName("splitBeforePage")
  private Boolean splitBeforePage = null;

  public ProjectClassificationPage classifiedClassName(String classifiedClassName) {
    this.classifiedClassName = classifiedClassName;
    return this;
  }

   /**
   * classifiedClassName
   * @return classifiedClassName
  **/
  @ApiModelProperty(example = "null", value = "classifiedClassName")
  public String getClassifiedClassName() {
    return classifiedClassName;
  }

  public void setClassifiedClassName(String classifiedClassName) {
    this.classifiedClassName = classifiedClassName;
  }

  public ProjectClassificationPage featureHighlightings(List<ProjectClassificationClassifierFeature> featureHighlightings) {
    this.featureHighlightings = featureHighlightings;
    return this;
  }

  public ProjectClassificationPage addFeatureHighlightingsItem(ProjectClassificationClassifierFeature featureHighlightingsItem) {
    this.featureHighlightings.add(featureHighlightingsItem);
    return this;
  }

   /**
   * featureHighlightings
   * @return featureHighlightings
  **/
  @ApiModelProperty(example = "null", value = "featureHighlightings")
  public List<ProjectClassificationClassifierFeature> getFeatureHighlightings() {
    return featureHighlightings;
  }

  public void setFeatureHighlightings(List<ProjectClassificationClassifierFeature> featureHighlightings) {
    this.featureHighlightings = featureHighlightings;
  }

  public ProjectClassificationPage pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", value = "Page number")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ProjectClassificationPage textLines(List<ProjectClassificationTextLine> textLines) {
    this.textLines = textLines;
    return this;
  }

  public ProjectClassificationPage addTextLinesItem(ProjectClassificationTextLine textLinesItem) {
    this.textLines.add(textLinesItem);
    return this;
  }

   /**
   * textLines
   * @return textLines
  **/
  @ApiModelProperty(example = "null", value = "textLines")
  public List<ProjectClassificationTextLine> getTextLines() {
    return textLines;
  }

  public void setTextLines(List<ProjectClassificationTextLine> textLines) {
    this.textLines = textLines;
  }

  public ProjectClassificationPage skipContentClassification(Boolean skipContentClassification) {
    this.skipContentClassification = skipContentClassification;
    return this;
  }

   /**
   * skipContentClassification
   * @return skipContentClassification
  **/
  @ApiModelProperty(example = "false", value = "skipContentClassification")
  public Boolean getSkipContentClassification() {
    return skipContentClassification;
  }

  public void setSkipContentClassification(Boolean skipContentClassification) {
    this.skipContentClassification = skipContentClassification;
  }

  public ProjectClassificationPage classificationResults(List<ProjectClassificationResult> classificationResults) {
    this.classificationResults = classificationResults;
    return this;
  }

  public ProjectClassificationPage addClassificationResultsItem(ProjectClassificationResult classificationResultsItem) {
    this.classificationResults.add(classificationResultsItem);
    return this;
  }

   /**
   * A list of classification results
   * @return classificationResults
  **/
  @ApiModelProperty(example = "null", value = "A list of classification results")
  public List<ProjectClassificationResult> getClassificationResults() {
    return classificationResults;
  }

  public void setClassificationResults(List<ProjectClassificationResult> classificationResults) {
    this.classificationResults = classificationResults;
  }

  public ProjectClassificationPage rotationType(String rotationType) {
    this.rotationType = rotationType;
    return this;
  }

   /**
   * rotationType
   * @return rotationType
  **/
  @ApiModelProperty(example = "null", value = "rotationType")
  public String getRotationType() {
    return rotationType;
  }

  public void setRotationType(String rotationType) {
    this.rotationType = rotationType;
  }

  public ProjectClassificationPage confidentDocumentClassificationResult(Boolean confidentDocumentClassificationResult) {
    this.confidentDocumentClassificationResult = confidentDocumentClassificationResult;
    return this;
  }

   /**
   * confidentDocumentClassificationResult
   * @return confidentDocumentClassificationResult
  **/
  @ApiModelProperty(example = "false", value = "confidentDocumentClassificationResult")
  public Boolean getConfidentDocumentClassificationResult() {
    return confidentDocumentClassificationResult;
  }

  public void setConfidentDocumentClassificationResult(Boolean confidentDocumentClassificationResult) {
    this.confidentDocumentClassificationResult = confidentDocumentClassificationResult;
  }

  public ProjectClassificationPage assignedClassName(String assignedClassName) {
    this.assignedClassName = assignedClassName;
    return this;
  }

   /**
   * assignedClassName
   * @return assignedClassName
  **/
  @ApiModelProperty(example = "null", value = "assignedClassName")
  public String getAssignedClassName() {
    return assignedClassName;
  }

  public void setAssignedClassName(String assignedClassName) {
    this.assignedClassName = assignedClassName;
  }

  public ProjectClassificationPage separationResults(List<ProjectClassificationResult> separationResults) {
    this.separationResults = separationResults;
    return this;
  }

  public ProjectClassificationPage addSeparationResultsItem(ProjectClassificationResult separationResultsItem) {
    this.separationResults.add(separationResultsItem);
    return this;
  }

   /**
   * separationResults
   * @return separationResults
  **/
  @ApiModelProperty(example = "null", value = "separationResults")
  public List<ProjectClassificationResult> getSeparationResults() {
    return separationResults;
  }

  public void setSeparationResults(List<ProjectClassificationResult> separationResults) {
    this.separationResults = separationResults;
  }

  public ProjectClassificationPage xresolution(Double xresolution) {
    this.xresolution = xresolution;
    return this;
  }

   /**
   * Get xresolution
   * @return xresolution
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getXresolution() {
    return xresolution;
  }

  public void setXresolution(Double xresolution) {
    this.xresolution = xresolution;
  }

  public ProjectClassificationPage originalPageNumber(Integer originalPageNumber) {
    this.originalPageNumber = originalPageNumber;
    return this;
  }

   /**
   * originalPageNumber
   * @return originalPageNumber
  **/
  @ApiModelProperty(example = "null", value = "originalPageNumber")
  public Integer getOriginalPageNumber() {
    return originalPageNumber;
  }

  public void setOriginalPageNumber(Integer originalPageNumber) {
    this.originalPageNumber = originalPageNumber;
  }

  public ProjectClassificationPage hasPageText(Boolean hasPageText) {
    this.hasPageText = hasPageText;
    return this;
  }

   /**
   * hasPageText
   * @return hasPageText
  **/
  @ApiModelProperty(example = "false", value = "hasPageText")
  public Boolean getHasPageText() {
    return hasPageText;
  }

  public void setHasPageText(Boolean hasPageText) {
    this.hasPageText = hasPageText;
  }

  public ProjectClassificationPage splitConfidence(Double splitConfidence) {
    this.splitConfidence = splitConfidence;
    return this;
  }

   /**
   * splitConfidence
   * @return splitConfidence
  **/
  @ApiModelProperty(example = "null", value = "splitConfidence")
  public Double getSplitConfidence() {
    return splitConfidence;
  }

  public void setSplitConfidence(Double splitConfidence) {
    this.splitConfidence = splitConfidence;
  }

  public ProjectClassificationPage yresolution(Double yresolution) {
    this.yresolution = yresolution;
    return this;
  }

   /**
   * Get yresolution
   * @return yresolution
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getYresolution() {
    return yresolution;
  }

  public void setYresolution(Double yresolution) {
    this.yresolution = yresolution;
  }

  public ProjectClassificationPage separationFeatureHighlightings(List<ProjectClassificationClassifierFeature> separationFeatureHighlightings) {
    this.separationFeatureHighlightings = separationFeatureHighlightings;
    return this;
  }

  public ProjectClassificationPage addSeparationFeatureHighlightingsItem(ProjectClassificationClassifierFeature separationFeatureHighlightingsItem) {
    this.separationFeatureHighlightings.add(separationFeatureHighlightingsItem);
    return this;
  }

   /**
   * separationFeatureHighlightings
   * @return separationFeatureHighlightings
  **/
  @ApiModelProperty(example = "null", value = "separationFeatureHighlightings")
  public List<ProjectClassificationClassifierFeature> getSeparationFeatureHighlightings() {
    return separationFeatureHighlightings;
  }

  public void setSeparationFeatureHighlightings(List<ProjectClassificationClassifierFeature> separationFeatureHighlightings) {
    this.separationFeatureHighlightings = separationFeatureHighlightings;
  }

  public ProjectClassificationPage splitBeforePage(Boolean splitBeforePage) {
    this.splitBeforePage = splitBeforePage;
    return this;
  }

   /**
   * splitBeforePage
   * @return splitBeforePage
  **/
  @ApiModelProperty(example = "false", value = "splitBeforePage")
  public Boolean getSplitBeforePage() {
    return splitBeforePage;
  }

  public void setSplitBeforePage(Boolean splitBeforePage) {
    this.splitBeforePage = splitBeforePage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectClassificationPage projectClassificationPage = (ProjectClassificationPage) o;
    return Objects.equals(this.classifiedClassName, projectClassificationPage.classifiedClassName) &&
        Objects.equals(this.featureHighlightings, projectClassificationPage.featureHighlightings) &&
        Objects.equals(this.pageNumber, projectClassificationPage.pageNumber) &&
        Objects.equals(this.textLines, projectClassificationPage.textLines) &&
        Objects.equals(this.skipContentClassification, projectClassificationPage.skipContentClassification) &&
        Objects.equals(this.classificationResults, projectClassificationPage.classificationResults) &&
        Objects.equals(this.rotationType, projectClassificationPage.rotationType) &&
        Objects.equals(this.confidentDocumentClassificationResult, projectClassificationPage.confidentDocumentClassificationResult) &&
        Objects.equals(this.assignedClassName, projectClassificationPage.assignedClassName) &&
        Objects.equals(this.separationResults, projectClassificationPage.separationResults) &&
        Objects.equals(this.xresolution, projectClassificationPage.xresolution) &&
        Objects.equals(this.originalPageNumber, projectClassificationPage.originalPageNumber) &&
        Objects.equals(this.hasPageText, projectClassificationPage.hasPageText) &&
        Objects.equals(this.splitConfidence, projectClassificationPage.splitConfidence) &&
        Objects.equals(this.yresolution, projectClassificationPage.yresolution) &&
        Objects.equals(this.separationFeatureHighlightings, projectClassificationPage.separationFeatureHighlightings) &&
        Objects.equals(this.splitBeforePage, projectClassificationPage.splitBeforePage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifiedClassName, featureHighlightings, pageNumber, textLines, skipContentClassification, classificationResults, rotationType, confidentDocumentClassificationResult, assignedClassName, separationResults, xresolution, originalPageNumber, hasPageText, splitConfidence, yresolution, separationFeatureHighlightings, splitBeforePage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectClassificationPage {\n");
    
    sb.append("    classifiedClassName: ").append(toIndentedString(classifiedClassName)).append("\n");
    sb.append("    featureHighlightings: ").append(toIndentedString(featureHighlightings)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    textLines: ").append(toIndentedString(textLines)).append("\n");
    sb.append("    skipContentClassification: ").append(toIndentedString(skipContentClassification)).append("\n");
    sb.append("    classificationResults: ").append(toIndentedString(classificationResults)).append("\n");
    sb.append("    rotationType: ").append(toIndentedString(rotationType)).append("\n");
    sb.append("    confidentDocumentClassificationResult: ").append(toIndentedString(confidentDocumentClassificationResult)).append("\n");
    sb.append("    assignedClassName: ").append(toIndentedString(assignedClassName)).append("\n");
    sb.append("    separationResults: ").append(toIndentedString(separationResults)).append("\n");
    sb.append("    xresolution: ").append(toIndentedString(xresolution)).append("\n");
    sb.append("    originalPageNumber: ").append(toIndentedString(originalPageNumber)).append("\n");
    sb.append("    hasPageText: ").append(toIndentedString(hasPageText)).append("\n");
    sb.append("    splitConfidence: ").append(toIndentedString(splitConfidence)).append("\n");
    sb.append("    yresolution: ").append(toIndentedString(yresolution)).append("\n");
    sb.append("    separationFeatureHighlightings: ").append(toIndentedString(separationFeatureHighlightings)).append("\n");
    sb.append("    splitBeforePage: ").append(toIndentedString(splitBeforePage)).append("\n");
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
