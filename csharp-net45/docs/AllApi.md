# Sphereon.SDK.Classification.Api.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddProjectId**](AllApi.md#addprojectid) | **POST** /classification/0.1/jobs/{jobId}/projects/{projectId} | Add a projectId
[**CreateClassificationJob**](AllApi.md#createclassificationjob) | **POST** /classification/0.1/jobs | Create classification job
[**CreateProject**](AllApi.md#createproject) | **POST** /classification/0.1/projects | Create project
[**DeleteJob**](AllApi.md#deletejob) | **DELETE** /classification/0.1/jobs/{jobId} | Delete a job manually
[**DeleteProject**](AllApi.md#deleteproject) | **DELETE** /classification/0.1/projects/{projectId} | Delete project
[**DeleteProjectStream**](AllApi.md#deleteprojectstream) | **DELETE** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Delete project stream
[**GetClassificationResult**](AllApi.md#getclassificationresult) | **GET** /classification/0.1/jobs/{jobId}/result | Classification result
[**GetJob**](AllApi.md#getjob) | **GET** /classification/0.1/jobs/{jobId} | Job definition and state
[**GetJobs**](AllApi.md#getjobs) | **GET** /classification/0.1/jobs | Get all jobs
[**GetProject**](AllApi.md#getproject) | **GET** /classification/0.1/projects/{projectId} | Get project
[**GetProjectStreamByLocation**](AllApi.md#getprojectstreambylocation) | **POST** /classification/0.1/projects/{projectId}/streams | Get project stream by location
[**GetProjectStreamByLocationId**](AllApi.md#getprojectstreambylocationid) | **GET** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Get project stream by locationid
[**GetProjects**](AllApi.md#getprojects) | **GET** /classification/0.1/projects | Get all projects
[**SubmitJob**](AllApi.md#submitjob) | **PUT** /classification/0.1/jobs/{jobId} | Submit classification job for processing
[**UpdateProjectStream**](AllApi.md#updateprojectstream) | **PUT** /classification/0.1/projects/{projectId}/streams/{projectStreamLocationId} | Updated project stream
[**UploadInputFile**](AllApi.md#uploadinputfile) | **POST** /classification/0.1/jobs/{jobId}/streams | Upload a file
[**UploadProjectStream**](AllApi.md#uploadprojectstream) | **POST** /classification/0.1/projects/{projectId}/streams/ | Upload project stream


<a name="addprojectid"></a>
# **AddProjectId**
> ClassificationJobResponse AddProjectId (string jobId, string projectId)

Add a projectId

Add a project Id. Classification will not be started yet.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class AddProjectIdExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId
            var projectId = projectId_example;  // string | projectId

            try
            {
                // Add a projectId
                ClassificationJobResponse result = apiInstance.AddProjectId(jobId, projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.AddProjectId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 
 **projectId** | **string**| projectId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createclassificationjob"></a>
# **CreateClassificationJob**
> ClassificationJobResponse CreateClassificationJob (ClassificationSettings classificationSettings)

Create classification job

Create a job using the given classification settings.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class CreateClassificationJobExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var classificationSettings = new ClassificationSettings(); // ClassificationSettings | classificationSettings

            try
            {
                // Create classification job
                ClassificationJobResponse result = apiInstance.CreateClassificationJob(classificationSettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateClassificationJob: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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
            
            var apiInstance = new AllApi();
            var projectsettings = new ProjectSettings(); // ProjectSettings | The project settings

            try
            {
                // Create project
                ProjectResponse result = apiInstance.CreateProject(projectsettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateProject: " + e.Message );
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletejob"></a>
# **DeleteJob**
> ClassificationJobResponse DeleteJob (string jobId)

Delete a job manually

Delete the Classification job and all related files

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class DeleteJobExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Delete a job manually
                ClassificationJobResponse result = apiInstance.DeleteJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.DeleteJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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
            
            var apiInstance = new AllApi();
            var projectId = projectId_example;  // string | projectId

            try
            {
                // Delete project
                ProjectResponse result = apiInstance.DeleteProject(projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.DeleteProject: " + e.Message );
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

No authorization required

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
            
            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.DeleteProjectStream: " + e.Message );
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getclassificationresult"></a>
# **GetClassificationResult**
> ClassificationResponse GetClassificationResult (string jobId)

Classification result

Get the classification job definition and current state. Please not that you can differentiate based on http response status

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class GetClassificationResultExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Classification result
                ClassificationResponse result = apiInstance.GetClassificationResult(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetClassificationResult: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 

### Return type

[**ClassificationResponse**](ClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getjob"></a>
# **GetJob**
> ClassificationJobResponse GetJob (string jobId)

Job definition and state

Get the classification job definition and current state. Please not that you can differentiate based on http response status

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class GetJobExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Job definition and state
                ClassificationJobResponse result = apiInstance.GetJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getjobs"></a>
# **GetJobs**
> ClassificationJobResponse GetJobs (List<string> status = null)

Get all jobs

Get all classification job definitions and their current state.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class GetJobsExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var status = new List<string>(); // List<string> | A list of status to filter on. (optional) 

            try
            {
                // Get all jobs
                ClassificationJobResponse result = apiInstance.GetJobs(status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetJobs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List<string>**](string.md)| A list of status to filter on. | [optional] 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

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
            
            var apiInstance = new AllApi();
            var projectId = projectId_example;  // string | projectId

            try
            {
                // Get project
                ProjectResponse result = apiInstance.GetProject(projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetProject: " + e.Message );
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getprojectstreambylocation"></a>
# **GetProjectStreamByLocation**
> byte[] GetProjectStreamByLocation (string projectId, StreamLocation streamLocation)

Get project stream by location

Download the project data.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class GetProjectStreamByLocationExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var projectId = projectId_example;  // string | projectId
            var streamLocation = new StreamLocation(); // StreamLocation | streamLocation

            try
            {
                // Get project stream by location
                byte[] result = apiInstance.GetProjectStreamByLocation(projectId, streamLocation);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetProjectStreamByLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| projectId | 
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation | 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream

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
            
            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.GetProjectStreamByLocationId: " + e.Message );
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

No authorization required

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
            
            var apiInstance = new AllApi();
            var status = new List<string>(); // List<string> | A list of status to filter on. (optional) 

            try
            {
                // Get all projects
                ProjectResponse result = apiInstance.GetProjects(status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetProjects: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List<string>**](string.md)| A list of status to filter on. | [optional] 

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitjob"></a>
# **SubmitJob**
> ClassificationJobResponse SubmitJob (string jobId)

Submit classification job for processing

Start classification of the previously uploaded file(s), using the supplied settings associated with the job in the request body. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the job Id in the path must match the jobId in the request

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class SubmitJobExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Submit classification job for processing
                ClassificationJobResponse result = apiInstance.SubmitJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.SubmitJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 

### Return type

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

No authorization required

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
            
            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.UpdateProjectStream: " + e.Message );
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

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="uploadinputfile"></a>
# **UploadInputFile**
> StreamResponse UploadInputFile (string jobId, System.IO.Stream stream)

Upload a file

Upload an input image. Classification will not be started yet.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Model;

namespace Example
{
    public class UploadInputFileExample
    {
        public void main()
        {
            
            var apiInstance = new AllApi();
            var jobId = jobId_example;  // string | jobId
            var stream = new System.IO.Stream(); // System.IO.Stream | The additional binary image (file/inputstream) to be classified

            try
            {
                // Upload a file
                StreamResponse result = apiInstance.UploadInputFile(jobId, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.UploadInputFile: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string**| jobId | 
 **stream** | **System.IO.Stream**| The additional binary image (file/inputstream) to be classified | 

### Return type

[**StreamResponse**](StreamResponse.md)

### Authorization

No authorization required

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
            
            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.UploadProjectStream: " + e.Message );
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

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

