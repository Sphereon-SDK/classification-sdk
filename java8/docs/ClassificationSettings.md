
# ClassificationSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifecycle** | [**Lifecycle**](Lifecycle.md) | Lifecycle |  [optional]
**classificationTypes** | [**List&lt;ClassificationTypesEnum&gt;**](#List&lt;ClassificationTypesEnum&gt;) | List of classification types, currently only one allowed | 
**maxResults** | **Integer** | Maximum number of classification results per document or page per classification project | 
**detailLevels** | [**List&lt;DetailLevelsEnum&gt;**](#List&lt;DetailLevelsEnum&gt;) | Level of detail for the results | 
**inputStorageLocation** | [**StorageLocation**](StorageLocation.md) | Storage container location |  [optional]
**resultStorageLocation** | [**StorageLocation**](StorageLocation.md) | Classification result location | 
**resultTypes** | [**List&lt;ResultTypesEnum&gt;**](#List&lt;ResultTypesEnum&gt;) | Store classification result in |  [optional]
**classificationType** | [**List&lt;ClassificationTypeEnum&gt;**](#List&lt;ClassificationTypeEnum&gt;) |  |  [optional]
**ocrMode** | [**OcrModeEnum**](#OcrModeEnum) | OCR mode |  [optional]


<a name="List<ClassificationTypesEnum>"></a>
## Enum: List&lt;ClassificationTypesEnum&gt;
Name | Value
---- | -----
DOCUMENT | &quot;DOCUMENT&quot;
PAGES | &quot;PAGES&quot;
DOCUMENT_SEPARATION | &quot;DOCUMENT_SEPARATION&quot;


<a name="List<DetailLevelsEnum>"></a>
## Enum: List&lt;DetailLevelsEnum&gt;
Name | Value
---- | -----
SUMMARY | &quot;SUMMARY&quot;
DEFAULT | &quot;DEFAULT&quot;
RAW | &quot;RAW&quot;


<a name="List<ResultTypesEnum>"></a>
## Enum: List&lt;ResultTypesEnum&gt;
Name | Value
---- | -----
INLINE | &quot;INLINE&quot;
STORAGE | &quot;STORAGE&quot;


<a name="List<ClassificationTypeEnum>"></a>
## Enum: List&lt;ClassificationTypeEnum&gt;
Name | Value
---- | -----
DOCUMENT | &quot;DOCUMENT&quot;
PAGES | &quot;PAGES&quot;
DOCUMENT_SEPARATION | &quot;DOCUMENT_SEPARATION&quot;


<a name="OcrModeEnum"></a>
## Enum: OcrModeEnum
Name | Value
---- | -----
ALWAYS | &quot;ALWAYS&quot;
NEVER | &quot;NEVER&quot;
AUTO | &quot;AUTO&quot;



