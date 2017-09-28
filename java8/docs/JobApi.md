# JobApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProjectId**](JobApi.md#addProjectId) | **POST** /classification/0.1/jobs/{jobId}/projects/{projectId} | Add a projectId
[**createClassificationJob**](JobApi.md#createClassificationJob) | **POST** /classification/0.1/jobs | Create classification job
[**deleteJob**](JobApi.md#deleteJob) | **DELETE** /classification/0.1/jobs/{jobId} | Delete a job manually
[**getClassificationResult**](JobApi.md#getClassificationResult) | **GET** /classification/0.1/jobs/{jobId}/result | Classification result
[**getJob**](JobApi.md#getJob) | **GET** /classification/0.1/jobs/{jobId} | Job definition and state
[**getJobs**](JobApi.md#getJobs) | **GET** /classification/0.1/jobs | Get all jobs
[**submitJob**](JobApi.md#submitJob) | **PUT** /classification/0.1/jobs/{jobId} | Submit classification job for processing
[**uploadInputFile**](JobApi.md#uploadInputFile) | **POST** /classification/0.1/jobs/{jobId}/streams | Upload a file


<a name="addProjectId"></a>
# **addProjectId**
> ClassificationJobResponse addProjectId(jobId, projectId)

Add a projectId

Add a project Id. Classification will not be started yet.

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
String projectId = "projectId_example"; // String | projectId
try {
    ClassificationJobResponse result = apiInstance.addProjectId(jobId, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addProjectId");
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
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
ClassificationSettings classificationSettings = new ClassificationSettings(); // ClassificationSettings | classificationSettings
try {
    ClassificationJobResponse result = apiInstance.createClassificationJob(classificationSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#createClassificationJob");
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

<a name="deleteJob"></a>
# **deleteJob**
> ClassificationJobResponse deleteJob(jobId)

Delete a job manually

Delete the Classification job and all related files

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationJobResponse result = apiInstance.deleteJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteJob");
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

<a name="getClassificationResult"></a>
# **getClassificationResult**
> ClassificationResponse getClassificationResult(jobId)

Classification result

Get the classification job definition and current state. Please not that you can differentiate based on http response status

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationResponse result = apiInstance.getClassificationResult(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getClassificationResult");
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
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationJobResponse result = apiInstance.getJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJob");
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
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
List<String> status = Arrays.asList("status_example"); // List<String> | A list of status to filter on.
try {
    ClassificationJobResponse result = apiInstance.getJobs(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobs");
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

<a name="submitJob"></a>
# **submitJob**
> ClassificationJobResponse submitJob(jobId)

Submit classification job for processing

Start classification of the previously uploaded file(s), using the supplied settings associated with the job in the request body. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the job Id in the path must match the jobId in the request

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
try {
    ClassificationJobResponse result = apiInstance.submitJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#submitJob");
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

<a name="uploadInputFile"></a>
# **uploadInputFile**
> StreamResponse uploadInputFile(jobId, stream)

Upload a file

Upload an input image. Classification will not be started yet.

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.api.JobApi;


JobApi apiInstance = new JobApi();
String jobId = "jobId_example"; // String | jobId
File stream = new File("/path/to/file.txt"); // File | The additional binary image (file/inputstream) to be classified
try {
    StreamResponse result = apiInstance.uploadInputFile(jobId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#uploadInputFile");
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

