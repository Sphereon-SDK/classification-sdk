# classification.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProjectId**](AllApi.md#addProjectId) | **POST** /classification/0.1/jobs/{jobId}/projects/{projectId} | Add a projectId
[**createClassificationJob**](AllApi.md#createClassificationJob) | **POST** /classification/0.1/jobs | Create classification job
[**createProject**](AllApi.md#createProject) | **POST** /classification/0.1/projects | Create project
[**deleteJob**](AllApi.md#deleteJob) | **DELETE** /classification/0.1/jobs/{jobId} | Delete a job manually
[**deleteProject**](AllApi.md#deleteProject) | **DELETE** /classification/0.1/projects/{projectId} | Delete project
[**deleteProjectStream**](AllApi.md#deleteProjectStream) | **DELETE** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Delete project stream
[**getClassificationResult**](AllApi.md#getClassificationResult) | **GET** /classification/0.1/jobs/{jobId}/result | Classification result
[**getJob**](AllApi.md#getJob) | **GET** /classification/0.1/jobs/{jobId} | Job definition and state
[**getJobs**](AllApi.md#getJobs) | **GET** /classification/0.1/jobs | Get all jobs
[**getProject**](AllApi.md#getProject) | **GET** /classification/0.1/projects/{projectId} | Get project
[**getProjectStreamByLocation**](AllApi.md#getProjectStreamByLocation) | **POST** /classification/0.1/projects/{projectId}/streams | Get project stream by location
[**getProjectStreamByLocationId**](AllApi.md#getProjectStreamByLocationId) | **GET** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Get project stream by locationid
[**getProjects**](AllApi.md#getProjects) | **GET** /classification/0.1/projects | Get all projects
[**submitJob**](AllApi.md#submitJob) | **PUT** /classification/0.1/jobs/{jobId} | Submit classification job for processing
[**updateProjectStream**](AllApi.md#updateProjectStream) | **PUT** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Updated project stream
[**uploadInputFile**](AllApi.md#uploadInputFile) | **POST** /classification/0.1/jobs/{jobId}/streams | Upload a file
[**uploadProjectStream**](AllApi.md#uploadProjectStream) | **POST** /classification/0.1/projects/{projectId}/streams/ | Upload project stream


<a name="addProjectId"></a>
# **addProjectId**
> ClassificationJobResponse addProjectId(jobId, projectId)

Add a projectId

Add a project Id. Classification will not be started yet.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var jobId = "jobId_example"; // String | jobId

var projectId = "projectId_example"; // String | projectId

apiInstance.addProjectId(jobId, projectId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 
 **projectId** | **String**| projectId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createClassificationJob"></a>
# **createClassificationJob**
> ClassificationJobResponse createClassificationJob(classificationSettings)

Create classification job

Create a job using the given classification settings.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var classificationSettings = new classification.ClassificationSettings(); // ClassificationSettings | classificationSettings

apiInstance.createClassificationJob(classificationSettings).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classificationSettings** | [**ClassificationSettings**](ClassificationSettings.md)| classificationSettings | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createProject"></a>
# **createProject**
> ProjectResponse createProject(projectsettings)

Create project

Create a new project using the given project settings.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectsettings = new classification.ProjectSettings(); // ProjectSettings | The project settings

apiInstance.createProject(projectsettings).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectsettings** | [**ProjectSettings**](ProjectSettings.md)| The project settings | 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteJob"></a>
# **deleteJob**
> ClassificationJobResponse deleteJob(jobId)

Delete a job manually

Delete the Classification job and all related files

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var jobId = "jobId_example"; // String | jobId

apiInstance.deleteJob(jobId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteProject"></a>
# **deleteProject**
> ProjectResponse deleteProject(projectId)

Delete project

Delete the project including all related data.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectId = "projectId_example"; // String | projectId

apiInstance.deleteProject(projectId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteProjectStream"></a>
# **deleteProjectStream**
> ProjectResponse deleteProjectStream(projectId, projectStreamLocationId)

Delete project stream

Delete a stream in the project.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectId = "projectId_example"; // String | projectId

var projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId

apiInstance.deleteProjectStream(projectId, projectStreamLocationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | 
 **projectStreamLocationId** | **String**| projectStreamLocationId | 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getClassificationResult"></a>
# **getClassificationResult**
> ClassificationResponse getClassificationResult(jobId)

Classification result

Get the classification job definition and current state. Please not that you can differentiate based on http response status

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var jobId = "jobId_example"; // String | jobId

apiInstance.getClassificationResult(jobId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 

### Return type

[**ClassificationResponse**](ClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getJob"></a>
# **getJob**
> ClassificationJobResponse getJob(jobId)

Job definition and state

Get the classification job definition and current state. Please not that you can differentiate based on http response status

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var jobId = "jobId_example"; // String | jobId

apiInstance.getJob(jobId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getJobs"></a>
# **getJobs**
> ClassificationJobResponse getJobs(opts)

Get all jobs

Get all classification job definitions and their current state.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var opts = { 
  'status': ["status_example"] // [String] | A list of status to filter on.
};
apiInstance.getJobs(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**[String]**](String.md)| A list of status to filter on. | [optional] 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getProject"></a>
# **getProject**
> ProjectResponse getProject(projectId)

Get project

Get the info of an existing project.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectId = "projectId_example"; // String | projectId

apiInstance.getProject(projectId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getProjectStreamByLocation"></a>
# **getProjectStreamByLocation**
> &#39;String&#39; getProjectStreamByLocation(projectId, streamLocation)

Get project stream by location

Download the project data.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectId = "projectId_example"; // String | projectId

var streamLocation = new classification.StreamLocation(); // StreamLocation | streamLocation

apiInstance.getProjectStreamByLocation(projectId, streamLocation).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | 
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation | 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

<a name="getProjectStreamByLocationId"></a>
# **getProjectStreamByLocationId**
> &#39;String&#39; getProjectStreamByLocationId(projectId, projectStreamLocationId)

Get project stream by locationid

Download the project data

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectId = "projectId_example"; // String | projectId

var projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId

apiInstance.getProjectStreamByLocationId(projectId, projectStreamLocationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | 
 **projectStreamLocationId** | **String**| projectStreamLocationId | 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getProjects"></a>
# **getProjects**
> ProjectResponse getProjects(opts)

Get all projects

Get all project definitions and their current state.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var opts = { 
  'status': ["status_example"] // [String] | A list of status to filter on.
};
apiInstance.getProjects(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**[String]**](String.md)| A list of status to filter on. | [optional] 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="submitJob"></a>
# **submitJob**
> ClassificationJobResponse submitJob(jobId)

Submit classification job for processing

Start classification of the previously uploaded file(s), using the supplied settings associated with the job in the request body. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the job Id in the path must match the jobId in the request

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var jobId = "jobId_example"; // String | jobId

apiInstance.submitJob(jobId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateProjectStream"></a>
# **updateProjectStream**
> StreamResponse updateProjectStream(projectId, projectStreamLocationId, stream)

Updated project stream

Update the project data used by the classification engine.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectId = "projectId_example"; // String | projectId

var projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId

var stream = "/path/to/file.txt"; // File | The project data

apiInstance.updateProjectStream(projectId, projectStreamLocationId, stream).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | 
 **projectStreamLocationId** | **String**| projectStreamLocationId | 
 **stream** | **File**| The project data | 

### Return type

[**StreamResponse**](StreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="uploadInputFile"></a>
# **uploadInputFile**
> StreamResponse uploadInputFile(jobId, stream)

Upload a file

Upload an input image. Classification will not be started yet.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var jobId = "jobId_example"; // String | jobId

var stream = "/path/to/file.txt"; // File | The additional binary image (file/inputstream) to be classified

apiInstance.uploadInputFile(jobId, stream).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId | 
 **stream** | **File**| The additional binary image (file/inputstream) to be classified | 

### Return type

[**StreamResponse**](StreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="uploadProjectStream"></a>
# **uploadProjectStream**
> StreamResponse uploadProjectStream(projectId, stream)

Upload project stream

Upload the project data used by the classification engine.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.AllApi();

var projectId = "projectId_example"; // String | projectId

var stream = "/path/to/file.txt"; // File | The project data

apiInstance.uploadProjectStream(projectId, stream).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId | 
 **stream** | **File**| The project data | 

### Return type

[**StreamResponse**](StreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

