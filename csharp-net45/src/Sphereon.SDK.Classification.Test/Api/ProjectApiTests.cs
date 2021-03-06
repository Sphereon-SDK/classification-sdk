/* 
 * Classification API
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Sphereon.SDK.Classification.Client;
using Sphereon.SDK.Classification.Api;
using Sphereon.SDK.Classification.Model;

namespace Sphereon.SDK.Classification.Test
{
    /// <summary>
    ///  Class for testing ProjectApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ProjectApiTests
    {
        private ProjectApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ProjectApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ProjectApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ProjectApi
            //Assert.IsInstanceOfType(typeof(ProjectApi), instance, "instance is a ProjectApi");
        }

        
        /// <summary>
        /// Test CreateProject
        /// </summary>
        [Test]
        public void CreateProjectTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ProjectSettings projectsettings = null;
            //var response = instance.CreateProject(projectsettings);
            //Assert.IsInstanceOf<ProjectResponse> (response, "response is ProjectResponse");
        }
        
        /// <summary>
        /// Test DeleteProject
        /// </summary>
        [Test]
        public void DeleteProjectTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string projectId = null;
            //var response = instance.DeleteProject(projectId);
            //Assert.IsInstanceOf<ProjectResponse> (response, "response is ProjectResponse");
        }
        
        /// <summary>
        /// Test DeleteProjectStream
        /// </summary>
        [Test]
        public void DeleteProjectStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string projectId = null;
            //string projectStreamLocationId = null;
            //var response = instance.DeleteProjectStream(projectId, projectStreamLocationId);
            //Assert.IsInstanceOf<ProjectResponse> (response, "response is ProjectResponse");
        }
        
        /// <summary>
        /// Test GetProject
        /// </summary>
        [Test]
        public void GetProjectTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string projectId = null;
            //var response = instance.GetProject(projectId);
            //Assert.IsInstanceOf<ProjectResponse> (response, "response is ProjectResponse");
        }
        
        /// <summary>
        /// Test GetProjectStreamByLocationId
        /// </summary>
        [Test]
        public void GetProjectStreamByLocationIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string projectId = null;
            //string projectStreamLocationId = null;
            //var response = instance.GetProjectStreamByLocationId(projectId, projectStreamLocationId);
            //Assert.IsInstanceOf<byte[]> (response, "response is byte[]");
        }
        
        /// <summary>
        /// Test GetProjects
        /// </summary>
        [Test]
        public void GetProjectsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<string> status = null;
            //var response = instance.GetProjects(status);
            //Assert.IsInstanceOf<ProjectResponse> (response, "response is ProjectResponse");
        }
        
        /// <summary>
        /// Test UpdateProjectStream
        /// </summary>
        [Test]
        public void UpdateProjectStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string projectId = null;
            //string projectStreamLocationId = null;
            //System.IO.Stream stream = null;
            //var response = instance.UpdateProjectStream(projectId, projectStreamLocationId, stream);
            //Assert.IsInstanceOf<StreamResponse> (response, "response is StreamResponse");
        }
        
        /// <summary>
        /// Test UploadProjectStream
        /// </summary>
        [Test]
        public void UploadProjectStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string projectId = null;
            //System.IO.Stream stream = null;
            //var response = instance.UploadProjectStream(projectId, stream);
            //Assert.IsInstanceOf<StreamResponse> (response, "response is StreamResponse");
        }
        
    }

}
