# ProjectApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/classification/0.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectApi.md#createProject) | **POST** /projects | Create project
[**deleteProject**](ProjectApi.md#deleteProject) | **DELETE** /projects/{projectId} | Delete project
[**deleteProjectStream**](ProjectApi.md#deleteProjectStream) | **DELETE** /projects/{projectId}/streams/{projectStreamLocationId} | Delete project stream
[**getProject**](ProjectApi.md#getProject) | **GET** /projects/{projectId} | Get project
[**getProjectStreamByLocationId**](ProjectApi.md#getProjectStreamByLocationId) | **GET** /projects/{projectId}/streams/{projectStreamLocationId} | Get project stream by locationid
[**getProjects**](ProjectApi.md#getProjects) | **GET** /projects | Get all projects
[**updateProjectStream**](ProjectApi.md#updateProjectStream) | **PUT** /projects/{projectId}/streams/{projectStreamLocationId} | Updated project stream
[**uploadProjectStream**](ProjectApi.md#uploadProjectStream) | **POST** /projects/{projectId}/streams | Upload project stream


<a name="createProject"></a>
# **createProject**
> ProjectResponse createProject(projectsettings)

Create project

Create a new project using the given project settings.

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
ProjectSettings projectsettings = new ProjectSettings(); // ProjectSettings | The project settings
try {
    ProjectResponse result = apiInstance.createProject(projectsettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createProject");
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

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteProject"></a>
# **deleteProject**
> ProjectResponse deleteProject(projectId)

Delete project

Delete the project including all related data.

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | projectId
try {
    ProjectResponse result = apiInstance.deleteProject(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteProject");
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

[oauth2schema](../README.md#oauth2schema)

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
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | projectId
String projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId
try {
    ProjectResponse result = apiInstance.deleteProjectStream(projectId, projectStreamLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteProjectStream");
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

[oauth2schema](../README.md#oauth2schema)

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
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | projectId
try {
    ProjectResponse result = apiInstance.getProject(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProject");
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

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getProjectStreamByLocationId"></a>
# **getProjectStreamByLocationId**
> byte[] getProjectStreamByLocationId(projectId, projectStreamLocationId)

Get project stream by locationid

Download the project data

### Example
```java
// Import classes:
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | projectId
String projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId
try {
    byte[] result = apiInstance.getProjectStreamByLocationId(projectId, projectStreamLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectStreamByLocationId");
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

[oauth2schema](../README.md#oauth2schema)

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
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
List<String> status = Arrays.asList("status_example"); // List<String> | A list of status to filter on.
try {
    ProjectResponse result = apiInstance.getProjects(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjects");
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

[oauth2schema](../README.md#oauth2schema)

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
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | projectId
String projectStreamLocationId = "projectStreamLocationId_example"; // String | projectStreamLocationId
File stream = new File("/path/to/file.txt"); // File | The project data
try {
    StreamResponse result = apiInstance.updateProjectStream(projectId, projectStreamLocationId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateProjectStream");
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

[oauth2schema](../README.md#oauth2schema)

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
//import com.sphereon.sdk.classification.handler.ApiClient;
//import com.sphereon.sdk.classification.handler.ApiException;
//import com.sphereon.sdk.classification.handler.Configuration;
//import com.sphereon.sdk.classification.handler.auth.*;
//import com.sphereon.sdk.classification.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | projectId
File stream = new File("/path/to/file.txt"); // File | The project data
try {
    StreamResponse result = apiInstance.uploadProjectStream(projectId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#uploadProjectStream");
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

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

