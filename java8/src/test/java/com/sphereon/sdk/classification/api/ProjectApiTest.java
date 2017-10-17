/*
 * Classification API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.classification.api;

import com.sphereon.sdk.classification.handler.ApiException;
import java.io.File;
import com.sphereon.sdk.classification.model.ProjectResponse;
import com.sphereon.sdk.classification.model.ProjectSettings;
import com.sphereon.sdk.classification.model.StreamResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Ignore
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    
    /**
     * Create project
     *
     * Create a new project using the given project settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        ProjectSettings projectsettings = null;
        ProjectResponse response = api.createProject(projectsettings);

        // TODO: test validations
    }
    
    /**
     * Delete project
     *
     * Delete the project including all related data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String projectId = null;
        ProjectResponse response = api.deleteProject(projectId);

        // TODO: test validations
    }
    
    /**
     * Delete project stream
     *
     * Delete a stream in the project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectStreamTest() throws ApiException {
        String projectId = null;
        String projectStreamLocationId = null;
        ProjectResponse response = api.deleteProjectStream(projectId, projectStreamLocationId);

        // TODO: test validations
    }
    
    /**
     * Get project
     *
     * Get the info of an existing project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String projectId = null;
        ProjectResponse response = api.getProject(projectId);

        // TODO: test validations
    }
    
    /**
     * Get project stream by locationid
     *
     * Download the project data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectStreamByLocationIdTest() throws ApiException {
        String projectId = null;
        String projectStreamLocationId = null;
        byte[] response = api.getProjectStreamByLocationId(projectId, projectStreamLocationId);

        // TODO: test validations
    }
    
    /**
     * Get all projects
     *
     * Get all project definitions and their current state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        List<String> status = null;
        ProjectResponse response = api.getProjects(status);

        // TODO: test validations
    }
    
    /**
     * Updated project stream
     *
     * Update the project data used by the classification engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectStreamTest() throws ApiException {
        String projectId = null;
        String projectStreamLocationId = null;
        File stream = null;
        StreamResponse response = api.updateProjectStream(projectId, projectStreamLocationId, stream);

        // TODO: test validations
    }
    
    /**
     * Upload project stream
     *
     * Upload the project data used by the classification engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadProjectStreamTest() throws ApiException {
        String projectId = null;
        File stream = null;
        StreamResponse response = api.uploadProjectStream(projectId, stream);

        // TODO: test validations
    }
    
}
