# classification.ClassificationProjectResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inline** | [**Inline**](Inline.md) | Storage of classification result in response | [optional] 
**stream** | [**Stream**](Stream.md) | External storage of classification result | [optional] 
**classificationType** | **String** | Classification type | [optional] 
**projectId** | **String** | Project id | [optional] 
**resultType** | **[String]** | Returned result in response and/or store | [optional] 


<a name="ClassificationTypeEnum"></a>
## Enum: ClassificationTypeEnum


* `DOCUMENT` (value: `"DOCUMENT"`)

* `PAGES` (value: `"PAGES"`)

* `DOCUMENT_SEPARATION` (value: `"DOCUMENT_SEPARATION"`)




<a name="[ResultTypeEnum]"></a>
## Enum: [ResultTypeEnum]


* `INLINE` (value: `"INLINE"`)

* `STORAGE` (value: `"STORAGE"`)




