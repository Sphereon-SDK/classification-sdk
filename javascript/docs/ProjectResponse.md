# classification.ProjectResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationTime** | **Date** | The creation date/time of this job in ISO 8601 format | [optional] 
**updateTime** | **Date** | The last update date/time of this job in ISO 8601 format | [optional] 
**projectId** | **String** |  | [optional] 
**projectSettings** | [**ProjectSettings**](ProjectSettings.md) | The project info | [optional] 
**statusMessage** | **String** | A status message, which can be informational, warning or error. A message here does not indicate an error perse | [optional] 
**status** | **String** | The status of the project action | 


<a name="StatusEnum"></a>
## Enum: StatusEnum


* `CREATED` (value: `"CREATED"`)

* `PROJECT_UPLOADED` (value: `"PROJECT_UPLOADED"`)

* `ERROR` (value: `"ERROR"`)

* `DELETED` (value: `"DELETED"`)




