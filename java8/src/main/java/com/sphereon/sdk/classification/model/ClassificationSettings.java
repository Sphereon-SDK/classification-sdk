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
import com.sphereon.sdk.classification.model.Lifecycle;
import com.sphereon.sdk.classification.model.StorageLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classification settings
 */
@ApiModel(description = "Classification settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T13:02:31.104+02:00")
public class ClassificationSettings {
  @SerializedName("lifecycle")
  private Lifecycle lifecycle = null;

  /**
   * Gets or Sets classificationTypes
   */
  @JsonAdapter(ClassificationTypesEnum.Adapter.class)
  public enum ClassificationTypesEnum {
    DOCUMENT("DOCUMENT"),
    
    PAGES("PAGES"),
    
    DOCUMENT_SEPARATION("DOCUMENT_SEPARATION");

    private String value;

    ClassificationTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClassificationTypesEnum fromValue(String text) {
      for (ClassificationTypesEnum b : ClassificationTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ClassificationTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassificationTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClassificationTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClassificationTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("classificationTypes")
  private List<ClassificationTypesEnum> classificationTypes = new ArrayList<ClassificationTypesEnum>();

  @SerializedName("maxResults")
  private Integer maxResults = null;

  /**
   * Gets or Sets detailLevels
   */
  @JsonAdapter(DetailLevelsEnum.Adapter.class)
  public enum DetailLevelsEnum {
    SUMMARY("SUMMARY"),
    
    DEFAULT("DEFAULT"),
    
    RAW("RAW");

    private String value;

    DetailLevelsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DetailLevelsEnum fromValue(String text) {
      for (DetailLevelsEnum b : DetailLevelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DetailLevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DetailLevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DetailLevelsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DetailLevelsEnum.fromValue(String.valueOf(value));
      }
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
  @JsonAdapter(ResultTypesEnum.Adapter.class)
  public enum ResultTypesEnum {
    INLINE("INLINE"),
    
    STORAGE("STORAGE");

    private String value;

    ResultTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultTypesEnum fromValue(String text) {
      for (ResultTypesEnum b : ResultTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResultTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResultTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("resultTypes")
  private List<ResultTypesEnum> resultTypes = null;

  /**
   * OCR mode
   */
  @JsonAdapter(OcrModeEnum.Adapter.class)
  public enum OcrModeEnum {
    ALWAYS("ALWAYS"),
    
    NEVER("NEVER"),
    
    AUTO("AUTO");

    private String value;

    OcrModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OcrModeEnum fromValue(String text) {
      for (OcrModeEnum b : OcrModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OcrModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OcrModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OcrModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OcrModeEnum.fromValue(String.valueOf(value));
      }
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
  @ApiModelProperty(value = "Lifecycle")
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
  @ApiModelProperty(required = true, value = "List of classification types, currently only one allowed")
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
  @ApiModelProperty(required = true, value = "Maximum number of classification results per document or page per classification project")
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
  @ApiModelProperty(required = true, value = "Level of detail for the results")
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
  @ApiModelProperty(value = "Storage container location")
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
  @ApiModelProperty(required = true, value = "Classification result location")
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
    if (this.resultTypes == null) {
      this.resultTypes = new ArrayList<ResultTypesEnum>();
    }
    this.resultTypes.add(resultTypesItem);
    return this;
  }

   /**
   * Store classification result in
   * @return resultTypes
  **/
  @ApiModelProperty(value = "Store classification result in")
  public List<ResultTypesEnum> getResultTypes() {
    return resultTypes;
  }

  public void setResultTypes(List<ResultTypesEnum> resultTypes) {
    this.resultTypes = resultTypes;
  }

  public ClassificationSettings ocrMode(OcrModeEnum ocrMode) {
    this.ocrMode = ocrMode;
    return this;
  }

   /**
   * OCR mode
   * @return ocrMode
  **/
  @ApiModelProperty(value = "OCR mode")
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
        Objects.equals(this.ocrMode, classificationSettings.ocrMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycle, classificationTypes, maxResults, detailLevels, inputStorageLocation, resultStorageLocation, resultTypes, ocrMode);
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

