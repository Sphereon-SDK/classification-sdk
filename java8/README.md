# classification-sdk-java8

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sphereon.sdk</groupId>
    <artifactId>classification-sdk-java8</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:classification-sdk-java8:1.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/classification-sdk-java8-1.0.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.classification.handler.*;
import com.sphereon.sdk.classification.handler.auth.*;
import com.sphereon.sdk.classification.model.*;
import com.sphereon.sdk.classification.api.AllApi;

import java.io.File;
import java.util.*;

public class AllApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/classification/0.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**addProjectId**](docs/AllApi.md#addProjectId) | **POST** /jobs/{jobId}/projects/{projectId} | Add a projectId
*AllApi* | [**createClassificationJob**](docs/AllApi.md#createClassificationJob) | **POST** /jobs | Create classification job
*AllApi* | [**createProject**](docs/AllApi.md#createProject) | **POST** /projects | Create project
*AllApi* | [**deleteJob**](docs/AllApi.md#deleteJob) | **DELETE** /jobs/{jobId} | Delete a job manually
*AllApi* | [**deleteProject**](docs/AllApi.md#deleteProject) | **DELETE** /projects/{projectId} | Delete project
*AllApi* | [**deleteProjectStream**](docs/AllApi.md#deleteProjectStream) | **DELETE** /projects/{projectId}/streams/{projectStreamLocationId} | Delete project stream
*AllApi* | [**getClassificationResult**](docs/AllApi.md#getClassificationResult) | **GET** /jobs/{jobId}/result | Classification result
*AllApi* | [**getJobWithClaimParameters**](docs/AllApi.md#getJobWithClaimParameters) | **GET** /jobs/{jobId} | Job definition and state
*AllApi* | [**getJobs**](docs/AllApi.md#getJobs) | **GET** /jobs | Get all jobs
*AllApi* | [**getProject**](docs/AllApi.md#getProject) | **GET** /projects/{projectId} | Get project
*AllApi* | [**getProjectStreamByLocationId**](docs/AllApi.md#getProjectStreamByLocationId) | **GET** /projects/{projectId}/streams/{projectStreamLocationId} | Get project stream by locationid
*AllApi* | [**getProjects**](docs/AllApi.md#getProjects) | **GET** /projects | Get all projects
*AllApi* | [**submitJob**](docs/AllApi.md#submitJob) | **PUT** /jobs/{jobId} | Submit classification job for processing
*AllApi* | [**updateProjectStream**](docs/AllApi.md#updateProjectStream) | **PUT** /projects/{projectId}/streams/{projectStreamLocationId} | Updated project stream
*AllApi* | [**uploadInputFile**](docs/AllApi.md#uploadInputFile) | **POST** /jobs/{jobId}/streams | Upload a file
*AllApi* | [**uploadProjectStream**](docs/AllApi.md#uploadProjectStream) | **POST** /projects/{projectId}/streams | Upload project stream
*JobApi* | [**addProjectId**](docs/JobApi.md#addProjectId) | **POST** /jobs/{jobId}/projects/{projectId} | Add a projectId
*JobApi* | [**createClassificationJob**](docs/JobApi.md#createClassificationJob) | **POST** /jobs | Create classification job
*JobApi* | [**deleteJob**](docs/JobApi.md#deleteJob) | **DELETE** /jobs/{jobId} | Delete a job manually
*JobApi* | [**getClassificationResult**](docs/JobApi.md#getClassificationResult) | **GET** /jobs/{jobId}/result | Classification result
*JobApi* | [**getJobWithClaimParameters**](docs/JobApi.md#getJobWithClaimParameters) | **GET** /jobs/{jobId} | Job definition and state
*JobApi* | [**getJobs**](docs/JobApi.md#getJobs) | **GET** /jobs | Get all jobs
*JobApi* | [**submitJob**](docs/JobApi.md#submitJob) | **PUT** /jobs/{jobId} | Submit classification job for processing
*JobApi* | [**uploadInputFile**](docs/JobApi.md#uploadInputFile) | **POST** /jobs/{jobId}/streams | Upload a file
*ProjectApi* | [**createProject**](docs/ProjectApi.md#createProject) | **POST** /projects | Create project
*ProjectApi* | [**deleteProject**](docs/ProjectApi.md#deleteProject) | **DELETE** /projects/{projectId} | Delete project
*ProjectApi* | [**deleteProjectStream**](docs/ProjectApi.md#deleteProjectStream) | **DELETE** /projects/{projectId}/streams/{projectStreamLocationId} | Delete project stream
*ProjectApi* | [**getProject**](docs/ProjectApi.md#getProject) | **GET** /projects/{projectId} | Get project
*ProjectApi* | [**getProjectStreamByLocationId**](docs/ProjectApi.md#getProjectStreamByLocationId) | **GET** /projects/{projectId}/streams/{projectStreamLocationId} | Get project stream by locationid
*ProjectApi* | [**getProjects**](docs/ProjectApi.md#getProjects) | **GET** /projects | Get all projects
*ProjectApi* | [**updateProjectStream**](docs/ProjectApi.md#updateProjectStream) | **PUT** /projects/{projectId}/streams/{projectStreamLocationId} | Updated project stream
*ProjectApi* | [**uploadProjectStream**](docs/ProjectApi.md#uploadProjectStream) | **POST** /projects/{projectId}/streams | Upload project stream


## Documentation for Models

 - [ClassificationInputInfo](docs/ClassificationInputInfo.md)
 - [ClassificationJob](docs/ClassificationJob.md)
 - [ClassificationJobResponse](docs/ClassificationJobResponse.md)
 - [ClassificationProjectInfo](docs/ClassificationProjectInfo.md)
 - [ClassificationProjectResult](docs/ClassificationProjectResult.md)
 - [ClassificationResponse](docs/ClassificationResponse.md)
 - [ClassificationResult](docs/ClassificationResult.md)
 - [ClassificationResultItem](docs/ClassificationResultItem.md)
 - [ClassificationSettings](docs/ClassificationSettings.md)
 - [ClassificationSummary](docs/ClassificationSummary.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Inline](docs/Inline.md)
 - [JobInfo](docs/JobInfo.md)
 - [Lifecycle](docs/Lifecycle.md)
 - [ProjectClassificationClassifierFeature](docs/ProjectClassificationClassifierFeature.md)
 - [ProjectClassificationDocument](docs/ProjectClassificationDocument.md)
 - [ProjectClassificationPage](docs/ProjectClassificationPage.md)
 - [ProjectClassificationResult](docs/ProjectClassificationResult.md)
 - [ProjectClassificationTextLine](docs/ProjectClassificationTextLine.md)
 - [ProjectClassificationWord](docs/ProjectClassificationWord.md)
 - [ProjectResponse](docs/ProjectResponse.md)
 - [ProjectSettings](docs/ProjectSettings.md)
 - [StorageLocation](docs/StorageLocation.md)
 - [Stream](docs/Stream.md)
 - [StreamLocation](docs/StreamLocation.md)
 - [StreamResponse](docs/StreamResponse.md)
 - [SummaryItem](docs/SummaryItem.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

