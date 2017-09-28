
# ProjectResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date/time of this job in ISO 8601 format |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The last update date/time of this job in ISO 8601 format |  [optional]
**projectId** | **String** |  |  [optional]
**projectSettings** | [**ProjectSettings**](ProjectSettings.md) | The project info |  [optional]
**statusMessage** | **String** | A status message, which can be informational, warning or error. A message here does not indicate an error perse |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the project action | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
PROJECT_UPLOADED | &quot;PROJECT_UPLOADED&quot;
ERROR | &quot;ERROR&quot;
DELETED | &quot;DELETED&quot;



