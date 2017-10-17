# Sphereon.SDK.Classification.Api.JobApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/classification/0.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddProjectId**](JobApi.md#addprojectid) | **POST** /jobs/{jobId}/projects/{projectId} | Add a projectId
[**CreateClassificationJob**](JobApi.md#createclassificationjob) | **POST** /jobs | Create classification job
[**DeleteJob**](JobApi.md#deletejob) | **DELETE** /jobs/{jobId} | Delete a job manually
[**GetClassificationResult**](JobApi.md#getclassificationresult) | **GET** /jobs/{jobId}/result | Classification result
[**GetJobWithClaimParameters**](JobApi.md#getjobwithclaimparameters) | **GET** /jobs/{jobId} | Job definition and state
[**GetJobs**](JobApi.md#getjobs) | **GET** /jobs | Get all jobs
[**SubmitJob**](JobApi.md#submitjob) | **PUT** /jobs/{jobId} | Submit classification job for processing
[**UploadInputFile**](JobApi.md#uploadinputfile) | **POST** /jobs/{jobId}/streams | Upload a file


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
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
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
                Debug.Print("Exception when calling JobApi.AddProjectId: " + e.Message );
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

[oauth2schema](../README.md#oauth2schema)

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
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
            var classificationSettings = new ClassificationSettings(); // ClassificationSettings | classificationSettings

            try
            {
                // Create classification job
                ClassificationJobResponse result = apiInstance.CreateClassificationJob(classificationSettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.CreateClassificationJob: " + e.Message );
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

[oauth2schema](../README.md#oauth2schema)

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
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Delete a job manually
                ClassificationJobResponse result = apiInstance.DeleteJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.DeleteJob: " + e.Message );
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

[oauth2schema](../README.md#oauth2schema)

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
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Classification result
                ClassificationResponse result = apiInstance.GetClassificationResult(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.GetClassificationResult: " + e.Message );
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

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getjobwithclaimparameters"></a>
# **GetJobWithClaimParameters**
> ClassificationJobResponse GetJobWithClaimParameters (string jobId)

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
    public class GetJobWithClaimParametersExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Job definition and state
                ClassificationJobResponse result = apiInstance.GetJobWithClaimParameters(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.GetJobWithClaimParameters: " + e.Message );
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

[oauth2schema](../README.md#oauth2schema)

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
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
            var status = new List<string>(); // List<string> | A list of status to filter on. (optional) 

            try
            {
                // Get all jobs
                ClassificationJobResponse result = apiInstance.GetJobs(status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.GetJobs: " + e.Message );
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

[**ClassificationJobResponse**](ClassificationJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

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
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Submit classification job for processing
                ClassificationJobResponse result = apiInstance.SubmitJob(jobId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling JobApi.SubmitJob: " + e.Message );
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

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
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
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new JobApi();
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
                Debug.Print("Exception when calling JobApi.UploadInputFile: " + e.Message );
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

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

