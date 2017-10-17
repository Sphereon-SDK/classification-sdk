
# ClassificationProjectResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectInfo** | [**ClassificationProjectInfo**](ClassificationProjectInfo.md) | Project info | 
**inline** | [**Inline**](Inline.md) | Storage of classification result in response |  [optional]
**stream** | [**Stream**](Stream.md) | External storage of classification result |  [optional]
**classificationType** | [**ClassificationTypeEnum**](#ClassificationTypeEnum) | Classification type |  [optional]
**resultType** | [**List&lt;ResultTypeEnum&gt;**](#List&lt;ResultTypeEnum&gt;) | Returned result in response and/or store |  [optional]


<a name="ClassificationTypeEnum"></a>
## Enum: ClassificationTypeEnum
Name | Value
---- | -----
DOCUMENT | &quot;DOCUMENT&quot;
PAGES | &quot;PAGES&quot;
DOCUMENT_SEPARATION | &quot;DOCUMENT_SEPARATION&quot;


<a name="List<ResultTypeEnum>"></a>
## Enum: List&lt;ResultTypeEnum&gt;
Name | Value
---- | -----
INLINE | &quot;INLINE&quot;
STORAGE | &quot;STORAGE&quot;



