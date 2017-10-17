# Sphereon.SDK.Classification.Api.ProjectApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/classification/0.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateProject**](ProjectApi.md#createproject) | **POST** /projects | Create project
[**DeleteProject**](ProjectApi.md#deleteproject) | **DELETE** /projects/{projectId} | Delete project
[**DeleteProjectStream**](ProjectApi.md#deleteprojectstream) | **DELETE** /projects/{projectId}/streams/{projectStreamLocationId} | Delete project stream
[**GetProject**](ProjectApi.md#getproject) | **GET** /projects/{projectId} | Get project
[**GetProjectStreamByLocationId**](ProjectApi.md#getprojectstreambylocationid) | **GET** /projects/{projectId}/streams/{projectStreamLocationId} | Get project stream by locationid
[**GetProjects**](ProjectApi.md#getprojects) | **GET** /projects | Get all projects
[**UpdateProjectStream**](ProjectApi.md#updateprojectstream) | **PUT** /projects/{projectId}/streams/{projectStreamLocationId} | Updated project stream
[**UploadProjectStream**](ProjectApi.md#uploadprojectstream) | **POST** /projects/{projectId}/streams | Upload project stream


<a name="createproject"></a>
# **CreateProject**
> ProjectResponse CreateProject (ProjectSettings projectsettings)

Create project

Create a new project using the given project settings.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class CreateProjectExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var projectsettings = new ProjectSettings(); // ProjectSettings | The project settings

            try
            {
                // Create project
                ProjectResponse result = apiInstance.CreateProject(projectsettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.CreateProject: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteproject"></a>
# **DeleteProject**
> ProjectResponse DeleteProject (string projectId)

Delete project

Delete the project including all related data.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class DeleteProjectExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var projectId = projectId_example;  // string | projectId

            try
            {
                // Delete project
                ProjectResponse result = apiInstance.DeleteProject(projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.DeleteProject: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| projectId | 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteprojectstream"></a>
# **DeleteProjectStream**
> ProjectResponse DeleteProjectStream (string projectId, string projectStreamLocationId)

Delete project stream

Delete a stream in the project.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class DeleteProjectStreamExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var projectId = projectId_example;  // string | projectId
            var projectStreamLocationId = projectStreamLocationId_example;  // string | projectStreamLocationId

            try
            {
                // Delete project stream
                ProjectResponse result = apiInstance.DeleteProjectStream(projectId, projectStreamLocationId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.DeleteProjectStream: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| projectId | 
 **projectStreamLocationId** | **string**| projectStreamLocationId | 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getproject"></a>
# **GetProject**
> ProjectResponse GetProject (string projectId)

Get project

Get the info of an existing project.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class GetProjectExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var projectId = projectId_example;  // string | projectId

            try
            {
                // Get project
                ProjectResponse result = apiInstance.GetProject(projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.GetProject: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| projectId | 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getprojectstreambylocationid"></a>
# **GetProjectStreamByLocationId**
> byte[] GetProjectStreamByLocationId (string projectId, string projectStreamLocationId)

Get project stream by locationid

Download the project data

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class GetProjectStreamByLocationIdExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var projectId = projectId_example;  // string | projectId
            var projectStreamLocationId = projectStreamLocationId_example;  // string | projectStreamLocationId

            try
            {
                // Get project stream by locationid
                byte[] result = apiInstance.GetProjectStreamByLocationId(projectId, projectStreamLocationId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.GetProjectStreamByLocationId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| projectId | 
 **projectStreamLocationId** | **string**| projectStreamLocationId | 

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getprojects"></a>
# **GetProjects**
> ProjectResponse GetProjects (List<string> status = null)

Get all projects

Get all project definitions and their current state.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class GetProjectsExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var status = new List<string>(); // List<string> | A list of status to filter on. (optional) 

            try
            {
                // Get all projects
                ProjectResponse result = apiInstance.GetProjects(status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.GetProjects: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;string&gt;**](string.md)| A list of status to filter on. | [optional] 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateprojectstream"></a>
# **UpdateProjectStream**
> StreamResponse UpdateProjectStream (string projectId, string projectStreamLocationId, System.IO.Stream stream)

Updated project stream

Update the project data used by the classification engine.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class UpdateProjectStreamExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var projectId = projectId_example;  // string | projectId
            var projectStreamLocationId = projectStreamLocationId_example;  // string | projectStreamLocationId
            var stream = new System.IO.Stream(); // System.IO.Stream | The project data

            try
            {
                // Updated project stream
                StreamResponse result = apiInstance.UpdateProjectStream(projectId, projectStreamLocationId, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.UpdateProjectStream: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| projectId | 
 **projectStreamLocationId** | **string**| projectStreamLocationId | 
 **stream** | **System.IO.Stream**| The project data | 

### Return type

[**StreamResponse**](StreamResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="uploadprojectstream"></a>
# **UploadProjectStream**
> StreamResponse UploadProjectStream (string projectId, System.IO.Stream stream)

Upload project stream

Upload the project data used by the classification engine.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class UploadProjectStreamExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProjectApi();
            var projectId = projectId_example;  // string | projectId
            var stream = new System.IO.Stream(); // System.IO.Stream | The project data

            try
            {
                // Upload project stream
                StreamResponse result = apiInstance.UploadProjectStream(projectId, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProjectApi.UploadProjectStream: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| projectId | 
 **stream** | **System.IO.Stream**| The project data | 

### Return type

[**StreamResponse**](StreamResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

