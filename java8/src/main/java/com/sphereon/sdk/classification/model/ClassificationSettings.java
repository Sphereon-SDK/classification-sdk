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
import com.sphereon.sdk.classification.model.Lifecycle;
import com.sphereon.sdk.classification.model.StorageLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Classification settings
 */
@ApiModel(description = "Classification settings")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T08:34:28.559+02:00")
public class ClassificationSettings   {
  @SerializedName("lifecycle")
  private Lifecycle lifecycle = null;

  /**
   * Gets or Sets classificationTypes
   */
  public enum ClassificationTypesEnum {
    @SerializedName("DOCUMENT")
    DOCUMENT("DOCUMENT"),
    
    @SerializedName("PAGES")
    PAGES("PAGES"),
    
    @SerializedName("DOCUMENT_SEPARATION")
    DOCUMENT_SEPARATION("DOCUMENT_SEPARATION");

    private String value;

    ClassificationTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("classificationTypes")
  private List<ClassificationTypesEnum> classificationTypes = new ArrayList<ClassificationTypesEnum>();

  @SerializedName("maxResults")
  private Integer maxResults = null;

  /**
   * Gets or Sets detailLevels
   */
  public enum DetailLevelsEnum {
    @SerializedName("SUMMARY")
    SUMMARY("SUMMARY"),
    
    @SerializedName("DEFAULT")
    DEFAULT("DEFAULT"),
    
    @SerializedName("RAW")
    RAW("RAW");

    private String value;

    DetailLevelsEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("detailLevels")
  private List<DetailLevelsEnum> detailLevels = new ArrayList<DetailLevelsEnum>();

  @SerializedName("inputStorageLocation")
  private StorageLocation inputStorageLocation = null;

  @SerializedName("resultStorageLocation")
  private StorageLocation resultStorageLocation = null;

  /**
   * Gets or Sets resultTypes
   */
  public enum ResultTypesEnum {
    @SerializedName("INLINE")
    INLINE("INLINE"),
    
    @SerializedName("STORAGE")
    STORAGE("STORAGE");

    private String value;

    ResultTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("resultTypes")
  private List<ResultTypesEnum> resultTypes = new ArrayList<ResultTypesEnum>();

  /**
   * Gets or Sets classificationType
   */
  public enum ClassificationTypeEnum {
    @SerializedName("DOCUMENT")
    DOCUMENT("DOCUMENT"),
    
    @SerializedName("PAGES")
    PAGES("PAGES"),
    
    @SerializedName("DOCUMENT_SEPARATION")
    DOCUMENT_SEPARATION("DOCUMENT_SEPARATION");

    private String value;

    ClassificationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("classificationType")
  private List<ClassificationTypeEnum> classificationType = new ArrayList<ClassificationTypeEnum>();

  /**
   * OCR mode
   */
  public enum OcrModeEnum {
    @SerializedName("ALWAYS")
    ALWAYS("ALWAYS"),
    
    @SerializedName("NEVER")
    NEVER("NEVER"),
    
    @SerializedName("AUTO")
    AUTO("AUTO");

    private String value;

    OcrModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ocrMode")
  private OcrModeEnum ocrMode = null;

  public ClassificationSettings lifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Lifecycle
   * @return lifecycle
  **/
  @ApiModelProperty(example = "null", value = "Lifecycle")
  public Lifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public ClassificationSettings classificationTypes(List<ClassificationTypesEnum> classificationTypes) {
    this.classificationTypes = classificationTypes;
    return this;
  }

  public ClassificationSettings addClassificationTypesItem(ClassificationTypesEnum classificationTypesItem) {
    this.classificationTypes.add(classificationTypesItem);
    return this;
  }

   /**
   * List of classification types, currently only one allowed
   * @return classificationTypes
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of classification types, currently only one allowed")
  public List<ClassificationTypesEnum> getClassificationTypes() {
    return classificationTypes;
  }

  public void setClassificationTypes(List<ClassificationTypesEnum> classificationTypes) {
    this.classificationTypes = classificationTypes;
  }

  public ClassificationSettings maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Maximum number of classification results per document or page per classification project
   * @return maxResults
  **/
  @ApiModelProperty(example = "null", required = true, value = "Maximum number of classification results per document or page per classification project")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public ClassificationSettings detailLevels(List<DetailLevelsEnum> detailLevels) {
    this.detailLevels = detailLevels;
    return this;
  }

  public ClassificationSettings addDetailLevelsItem(DetailLevelsEnum detailLevelsItem) {
    this.detailLevels.add(detailLevelsItem);
    return this;
  }

   /**
   * Level of detail for the results
   * @return detailLevels
  **/
  @ApiModelProperty(example = "null", required = true, value = "Level of detail for the results")
  public List<DetailLevelsEnum> getDetailLevels() {
    return detailLevels;
  }

  public void setDetailLevels(List<DetailLevelsEnum> detailLevels) {
    this.detailLevels = detailLevels;
  }

  public ClassificationSettings inputStorageLocation(StorageLocation inputStorageLocation) {
    this.inputStorageLocation = inputStorageLocation;
    return this;
  }

   /**
   * Storage container location
   * @return inputStorageLocation
  **/
  @ApiModelProperty(example = "null", value = "Storage container location")
  public StorageLocation getInputStorageLocation() {
    return inputStorageLocation;
  }

  public void setInputStorageLocation(StorageLocation inputStorageLocation) {
    this.inputStorageLocation = inputStorageLocation;
  }

  public ClassificationSettings resultStorageLocation(StorageLocation resultStorageLocation) {
    this.resultStorageLocation = resultStorageLocation;
    return this;
  }

   /**
   * Classification result location
   * @return resultStorageLocation
  **/
  @ApiModelProperty(example = "null", required = true, value = "Classification result location")
  public StorageLocation getResultStorageLocation() {
    return resultStorageLocation;
  }

  public void setResultStorageLocation(StorageLocation resultStorageLocation) {
    this.resultStorageLocation = resultStorageLocation;
  }

  public ClassificationSettings resultTypes(List<ResultTypesEnum> resultTypes) {
    this.resultTypes = resultTypes;
    return this;
  }

  public ClassificationSettings addResultTypesItem(ResultTypesEnum resultTypesItem) {
    this.resultTypes.add(resultTypesItem);
    return this;
  }

   /**
   * Store classification result in
   * @return resultTypes
  **/
  @ApiModelProperty(example = "null", value = "Store classification result in")
  public List<ResultTypesEnum> getResultTypes() {
    return resultTypes;
  }

  public void setResultTypes(List<ResultTypesEnum> resultTypes) {
    this.resultTypes = resultTypes;
  }

  public ClassificationSettings classificationType(List<ClassificationTypeEnum> classificationType) {
    this.classificationType = classificationType;
    return this;
  }

  public ClassificationSettings addClassificationTypeItem(ClassificationTypeEnum classificationTypeItem) {
    this.classificationType.add(classificationTypeItem);
    return this;
  }

   /**
   * Get classificationType
   * @return classificationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ClassificationTypeEnum> getClassificationType() {
    return classificationType;
  }

  public void setClassificationType(List<ClassificationTypeEnum> classificationType) {
    this.classificationType = classificationType;
  }

  public ClassificationSettings ocrMode(OcrModeEnum ocrMode) {
    this.ocrMode = ocrMode;
    return this;
  }

   /**
   * OCR mode
   * @return ocrMode
  **/
  @ApiModelProperty(example = "null", value = "OCR mode")
  public OcrModeEnum getOcrMode() {
    return ocrMode;
  }

  public void setOcrMode(OcrModeEnum ocrMode) {
    this.ocrMode = ocrMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationSettings classificationSettings = (ClassificationSettings) o;
    return Objects.equals(this.lifecycle, classificationSettings.lifecycle) &&
        Objects.equals(this.classificationTypes, classificationSettings.classificationTypes) &&
        Objects.equals(this.maxResults, classificationSettings.maxResults) &&
        Objects.equals(this.detailLevels, classificationSettings.detailLevels) &&
        Objects.equals(this.inputStorageLocation, classificationSettings.inputStorageLocation) &&
        Objects.equals(this.resultStorageLocation, classificationSettings.resultStorageLocation) &&
        Objects.equals(this.resultTypes, classificationSettings.resultTypes) &&
        Objects.equals(this.classificationType, classificationSettings.classificationType) &&
        Objects.equals(this.ocrMode, classificationSettings.ocrMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycle, classificationTypes, maxResults, detailLevels, inputStorageLocation, resultStorageLocation, resultTypes, classificationType, ocrMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationSettings {\n");
    
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    classificationTypes: ").append(toIndentedString(classificationTypes)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    detailLevels: ").append(toIndentedString(detailLevels)).append("\n");
    sb.append("    inputStorageLocation: ").append(toIndentedString(inputStorageLocation)).append("\n");
    sb.append("    resultStorageLocation: ").append(toIndentedString(resultStorageLocation)).append("\n");
    sb.append("    resultTypes: ").append(toIndentedString(resultTypes)).append("\n");
    sb.append("    classificationType: ").append(toIndentedString(classificationType)).append("\n");
    sb.append("    ocrMode: ").append(toIndentedString(ocrMode)).append("\n");
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
