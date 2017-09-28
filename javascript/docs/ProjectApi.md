# classification.ProjectApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectApi.md#createProject) | **POST** /classification/0.1/projects | Create project
[**deleteProject**](ProjectApi.md#deleteProject) | **DELETE** /classification/0.1/projects/{projectId} | Delete project
[**deleteProjectStream**](ProjectApi.md#deleteProjectStream) | **DELETE** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Delete project stream
[**getProject**](ProjectApi.md#getProject) | **GET** /classification/0.1/projects/{projectId} | Get project
[**getProjectStreamByLocation**](ProjectApi.md#getProjectStreamByLocation) | **POST** /classification/0.1/projects/{projectId}/streams | Get project stream by location
[**getProjectStreamByLocationId**](ProjectApi.md#getProjectStreamByLocationId) | **GET** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Get project stream by locationid
[**getProjects**](ProjectApi.md#getProjects) | **GET** /classification/0.1/projects | Get all projects
[**updateProjectStream**](ProjectApi.md#updateProjectStream) | **PUT** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Updated project stream
[**uploadProjectStream**](ProjectApi.md#uploadProjectStream) | **POST** /classification/0.1/projects/{projectId}/streams/ | Upload project stream


<a name="createProject"></a>
# **createProject**
> ProjectResponse createProject(projectsettings)

Create project

Create a new project using the given project settings.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.ProjectApi();

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

<a name="deleteProject"></a>
# **deleteProject**
> ProjectResponse deleteProject(projectId)

Delete project

Delete the project including all related data.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.ProjectApi();

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

var apiInstance = new classification.ProjectApi();

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

<a name="getProject"></a>
# **getProject**
> ProjectResponse getProject(projectId)

Get project

Get the info of an existing project.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.ProjectApi();

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

var apiInstance = new classification.ProjectApi();

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

var apiInstance = new classification.ProjectApi();

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

var apiInstance = new classification.ProjectApi();

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

<a name="updateProjectStream"></a>
# **updateProjectStream**
> StreamResponse updateProjectStream(projectId, projectStreamLocationId, stream)

Updated project stream

Update the project data used by the classification engine.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.ProjectApi();

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

<a name="uploadProjectStream"></a>
# **uploadProjectStream**
> StreamResponse uploadProjectStream(projectId, stream)

Upload project stream

Upload the project data used by the classification engine.

### Example
```javascript
var classification = require('classification-sdk');

var apiInstance = new classification.ProjectApi();

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

