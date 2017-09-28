# AllApi

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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
String projectId = "projectId_example"; // String | projectId
try {
    ClassificationJobResponse result = apiInstance.addProjectId(jobId, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#addProjectId");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
ClassificationSettings classificationSettings = new ClassificationSettings(); // ClassificationSettings | classificationSettings
try {
    ClassificationJobResponse result = apiInstance.createClassificationJob(classificationSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createClassificationJob");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
ProjectSettings projectsettings = new ProjectSettings(); // ProjectSettings | The project settings
try {
    ProjectResponse result = apiInstance.createProject(projectsettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createProject");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationJobResponse result = apiInstance.deleteJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteJob");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String projectId = "projectId_example"; // String | projectId
try {
    ProjectResponse result = apiInstance.deleteProject(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteProject");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String projectId = "projectId_example"; // String | projectId
String projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId
try {
    ProjectResponse result = apiInstance.deleteProjectStream(projectId, projectStreamLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#deleteProjectStream");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationResponse result = apiInstance.getClassificationResult(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getClassificationResult");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationJobResponse result = apiInstance.getJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getJob");
    e.printStackTrace();
}
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
> ClassificationJobResponse getJobs(status)

Get all jobs

Get all classification job definitions and their current state.

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
List<String> status = Arrays.asList("status_example"); // List<String> | A list of status to filter on.
try {
    ClassificationJobResponse result = apiInstance.getJobs(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;String&gt;**](String.md)| A list of status to filter on. | [optional] [enum: CREATED, INPUTS_UPLOADED, PROCESSING, DONE, ERROR, DELETED]

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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String projectId = "projectId_example"; // String | projectId
try {
    ProjectResponse result = apiInstance.getProject(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getProject");
    e.printStackTrace();
}
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
> byte[] getProjectStreamByLocation(projectId, streamLocation)

Get project stream by location

Download the project data.

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String projectId = "projectId_example"; // String | projectId
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    byte[] result = apiInstance.getProjectStreamByLocation(projectId, streamLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getProjectStreamByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId |
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

<a name="getProjectStreamByLocationId"></a>
# **getProjectStreamByLocationId**
> byte[] getProjectStreamByLocationId(projectId, projectStreamLocationId)

Get project stream by locationid

Download the project data

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String projectId = "projectId_example"; // String | projectId
String projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId
try {
    byte[] result = apiInstance.getProjectStreamByLocationId(projectId, projectStreamLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getProjectStreamByLocationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId |
 **projectStreamLocationId** | **String**| projectStreamLocationId |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getProjects"></a>
# **getProjects**
> ProjectResponse getProjects(status)

Get all projects

Get all project definitions and their current state.

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
List<String> status = Arrays.asList("status_example"); // List<String> | A list of status to filter on.
try {
    ProjectResponse result = apiInstance.getProjects(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;String&gt;**](String.md)| A list of status to filter on. | [optional] [enum: CREATED, PROJECT_UPLOADED, ERROR, DELETED]

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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationJobResponse result = apiInstance.submitJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#submitJob");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String projectId = "projectId_example"; // String | projectId
String projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId
File stream = new File("/path/to/file.txt"); // File | The project data
try {
    StreamResponse result = apiInstance.updateProjectStream(projectId, projectStreamLocationId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#updateProjectStream");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String jobId = "jobId_example"; // String | jobId
File stream = new File("/path/to/file.txt"); // File | The additional binary image (file/inputstream) to be classified
try {
    StreamResponse result = apiInstance.uploadInputFile(jobId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#uploadInputFile");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.AllApi;


AllApi apiInstance = new AllApi();
String projectId = "projectId_example"; // String | projectId
File stream = new File("/path/to/file.txt"); // File | The project data
try {
    StreamResponse result = apiInstance.uploadProjectStream(projectId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#uploadProjectStream");
    e.printStackTrace();
}
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

