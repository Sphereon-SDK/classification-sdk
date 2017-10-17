# classification.ClassificationSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifecycle** | [**Lifecycle**](Lifecycle.md) | Lifecycle | [optional] 
**classificationTypes** | **[String]** | List of classification types, currently only one allowed | 
**maxResults** | **Number** | Maximum number of classification results per document or page per classification project | 
**detailLevels** | **[String]** | Level of detail for the results | 
**inputStorageLocation** | [**StorageLocation**](StorageLocation.md) | Storage container location | [optional] 
**resultStorageLocation** | [**StorageLocation**](StorageLocation.md) | Classification result location | 
**resultTypes** | **[String]** | Store classification result in | [optional] 
**ocrMode** | **String** | OCR mode | [optional] 


<a name="[ClassificationTypesEnum]"></a>
## Enum: [ClassificationTypesEnum]


* `DOCUMENT` (value: `"DOCUMENT"`)

* `PAGES` (value: `"PAGES"`)

* `DOCUMENT_SEPARATION` (value: `"DOCUMENT_SEPARATION"`)




<a name="[DetailLevelsEnum]"></a>
## Enum: [DetailLevelsEnum]


* `SUMMARY` (value: `"SUMMARY"`)

* `DEFAULT` (value: `"DEFAULT"`)

* `RAW` (value: `"RAW"`)




<a name="[ResultTypesEnum]"></a>
## Enum: [ResultTypesEnum]


* `INLINE` (value: `"INLINE"`)

* `STORAGE` (value: `"STORAGE"`)




<a name="OcrModeEnum"></a>
## Enum: OcrModeEnum


* `ALWAYS` (value: `"ALWAYS"`)

* `NEVER` (value: `"NEVER"`)

* `AUTO` (value: `"AUTO"`)




