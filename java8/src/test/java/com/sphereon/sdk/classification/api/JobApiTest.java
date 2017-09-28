/**
 * Classification API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.classification.api;

import com.sphereon.sdk.classification.handler.ApiException;
import com.sphereon.sdk.classification.model.ClassificationJobResponse;
import com.sphereon.sdk.classification.model.ErrorResponse;
import com.sphereon.sdk.classification.model.ClassificationSettings;
import com.sphereon.sdk.classification.model.ClassificationResponse;
import com.sphereon.sdk.classification.model.StreamResponse;
import java.io.File;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
public class JobApiTest {

    private final JobApi api = new JobApi();

    
    /**
     * Add a projectId
     *
     * Add a project Id. Classification will not be started yet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProjectIdTest() throws ApiException {
        String jobId = null;
        String projectId = null;
        // ClassificationJobResponse response = api.addProjectId(jobId, projectId);

        // TODO: test validations
    }
    
    /**
     * Create classification job
     *
     * Create a job using the given classification settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClassificationJobTest() throws ApiException {
        ClassificationSettings classificationSettings = null;
        // ClassificationJobResponse response = api.createClassificationJob(classificationSettings);

        // TODO: test validations
    }
    
    /**
     * Delete a job manually
     *
     * Delete the Classification job and all related files
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTest() throws ApiException {
        String jobId = null;
        // ClassificationJobResponse response = api.deleteJob(jobId);

        // TODO: test validations
    }
    
    /**
     * Classification result
     *
     * Get the classification job definition and current state. Please not that you can differentiate based on http response status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClassificationResultTest() throws ApiException {
        String jobId = null;
        // ClassificationResponse response = api.getClassificationResult(jobId);

        // TODO: test validations
    }
    
    /**
     * Job definition and state
     *
     * Get the classification job definition and current state. Please not that you can differentiate based on http response status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTest() throws ApiException {
        String jobId = null;
        // ClassificationJobResponse response = api.getJob(jobId);

        // TODO: test validations
    }
    
    /**
     * Get all jobs
     *
     * Get all classification job definitions and their current state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobsTest() throws ApiException {
        List<String> status = null;
        // ClassificationJobResponse response = api.getJobs(status);

        // TODO: test validations
    }
    
    /**
     * Submit classification job for processing
     *
     * Start classification of the previously uploaded file(s), using the supplied settings associated with the job in the request body. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the job Id in the path must match the jobId in the request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitJobTest() throws ApiException {
        String jobId = null;
        // ClassificationJobResponse response = api.submitJob(jobId);

        // TODO: test validations
    }
    
    /**
     * Upload a file
     *
     * Upload an input image. Classification will not be started yet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadInputFileTest() throws ApiException {
        String jobId = null;
        File stream = null;
        // StreamResponse response = api.uploadInputFile(jobId, stream);

        // TODO: test validations
    }
    
}