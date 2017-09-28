# classification.JobInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | **Date** | The completion date/time of this job in ISO 8601 format | [optional] 
**jobId** | **String** |  | [optional] 
**creationTime** | **Date** | The creation date/time of this job in ISO 8601 format | [optional] 
**updateTime** | **Date** | The last update date/time of this job in ISO 8601 format | [optional] 
**job** | [**ClassificationJob**](ClassificationJob.md) | The job | [optional] 
**statusMessage** | **String** | A status message, which can be informational, warning or error. A message here does not indicate an error perse | [optional] 
**queueTime** | **Date** | The conversion queue date/time of this job in ISO 8601 format | [optional] 
**status** | **String** | The status of the job | 


<a name="StatusEnum"></a>
## Enum: StatusEnum


* `CREATED` (value: `"CREATED"`)

* `INPUTS_UPLOADED` (value: `"INPUTS_UPLOADED"`)

* `PROCESSING` (value: `"PROCESSING"`)

* `DONE` (value: `"DONE"`)

* `ERROR` (value: `"ERROR"`)

* `DELETED` (value: `"DELETED"`)




