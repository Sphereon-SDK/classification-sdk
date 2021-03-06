/**
 * Classification API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['com.sphereon.sdk.classification.handler/ApiClient', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationInputInfo', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationJob', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationJobResponse', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationProjectInfo', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationProjectResult', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResult', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResultItem', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationSettings', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationSummary', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Error', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ErrorResponse', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Inline', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/JobInfo', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationClassifierFeature', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationDocument', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationPage', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationResult', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationTextLine', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectResponse', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Stream', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamResponse', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.api/AllApi', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.api/JobApi', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.api/ProjectApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./com.sphereon.sdk.classification.model/ClassificationInputInfo'), require('./com.sphereon.sdk.classification.model/ClassificationJob'), require('./com.sphereon.sdk.classification.model/ClassificationJobResponse'), require('./com.sphereon.sdk.classification.model/ClassificationProjectInfo'), require('./com.sphereon.sdk.classification.model/ClassificationProjectResult'), require('./com.sphereon.sdk.classification.model/ClassificationResponse'), require('./com.sphereon.sdk.classification.model/ClassificationResult'), require('./com.sphereon.sdk.classification.model/ClassificationResultItem'), require('./com.sphereon.sdk.classification.model/ClassificationSettings'), require('./com.sphereon.sdk.classification.model/ClassificationSummary'), require('./com.sphereon.sdk.classification.model/Error'), require('./com.sphereon.sdk.classification.model/ErrorResponse'), require('./com.sphereon.sdk.classification.model/Inline'), require('./com.sphereon.sdk.classification.model/JobInfo'), require('./com.sphereon.sdk.classification.model/Lifecycle'), require('./com.sphereon.sdk.classification.model/ProjectClassificationClassifierFeature'), require('./com.sphereon.sdk.classification.model/ProjectClassificationDocument'), require('./com.sphereon.sdk.classification.model/ProjectClassificationPage'), require('./com.sphereon.sdk.classification.model/ProjectClassificationResult'), require('./com.sphereon.sdk.classification.model/ProjectClassificationTextLine'), require('./com.sphereon.sdk.classification.model/ProjectClassificationWord'), require('./com.sphereon.sdk.classification.model/ProjectResponse'), require('./com.sphereon.sdk.classification.model/ProjectSettings'), require('./com.sphereon.sdk.classification.model/StorageLocation'), require('./com.sphereon.sdk.classification.model/Stream'), require('./com.sphereon.sdk.classification.model/StreamLocation'), require('./com.sphereon.sdk.classification.model/StreamResponse'), require('./com.sphereon.sdk.classification.model/SummaryItem'), require('./com.sphereon.sdk.classification.api/AllApi'), require('./com.sphereon.sdk.classification.api/JobApi'), require('./com.sphereon.sdk.classification.api/ProjectApi'));
  }
}(function(ApiClient, ClassificationInputInfo, ClassificationJob, ClassificationJobResponse, ClassificationProjectInfo, ClassificationProjectResult, ClassificationResponse, ClassificationResult, ClassificationResultItem, ClassificationSettings, ClassificationSummary, Error, ErrorResponse, Inline, JobInfo, Lifecycle, ProjectClassificationClassifierFeature, ProjectClassificationDocument, ProjectClassificationPage, ProjectClassificationResult, ProjectClassificationTextLine, ProjectClassificationWord, ProjectResponse, ProjectSettings, StorageLocation, Stream, StreamLocation, StreamResponse, SummaryItem, AllApi, JobApi, ProjectApi) {
  'use strict';

  /**
   * Classification Javascript SDK.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var classification = require('com.sphereon.sdk.classification.handler/index'); // See note below*.
   * var xxxSvc = new classification.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new classification.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['com.sphereon.sdk.classification.handler/index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new classification.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new classification.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module com.sphereon.sdk.classification.handler/index
   * @version 0.3.2
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:com.sphereon.sdk.classification.handler/ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The ClassificationInputInfo model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationInputInfo}
     */
    ClassificationInputInfo: ClassificationInputInfo,
    /**
     * The ClassificationJob model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationJob}
     */
    ClassificationJob: ClassificationJob,
    /**
     * The ClassificationJobResponse model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationJobResponse}
     */
    ClassificationJobResponse: ClassificationJobResponse,
    /**
     * The ClassificationProjectInfo model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationProjectInfo}
     */
    ClassificationProjectInfo: ClassificationProjectInfo,
    /**
     * The ClassificationProjectResult model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationProjectResult}
     */
    ClassificationProjectResult: ClassificationProjectResult,
    /**
     * The ClassificationResponse model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse}
     */
    ClassificationResponse: ClassificationResponse,
    /**
     * The ClassificationResult model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResult}
     */
    ClassificationResult: ClassificationResult,
    /**
     * The ClassificationResultItem model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResultItem}
     */
    ClassificationResultItem: ClassificationResultItem,
    /**
     * The ClassificationSettings model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationSettings}
     */
    ClassificationSettings: ClassificationSettings,
    /**
     * The ClassificationSummary model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationSummary}
     */
    ClassificationSummary: ClassificationSummary,
    /**
     * The Error model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Error}
     */
    Error: Error,
    /**
     * The ErrorResponse model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ErrorResponse}
     */
    ErrorResponse: ErrorResponse,
    /**
     * The Inline model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Inline}
     */
    Inline: Inline,
    /**
     * The JobInfo model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/JobInfo}
     */
    JobInfo: JobInfo,
    /**
     * The Lifecycle model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle}
     */
    Lifecycle: Lifecycle,
    /**
     * The ProjectClassificationClassifierFeature model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationClassifierFeature}
     */
    ProjectClassificationClassifierFeature: ProjectClassificationClassifierFeature,
    /**
     * The ProjectClassificationDocument model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationDocument}
     */
    ProjectClassificationDocument: ProjectClassificationDocument,
    /**
     * The ProjectClassificationPage model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationPage}
     */
    ProjectClassificationPage: ProjectClassificationPage,
    /**
     * The ProjectClassificationResult model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationResult}
     */
    ProjectClassificationResult: ProjectClassificationResult,
    /**
     * The ProjectClassificationTextLine model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationTextLine}
     */
    ProjectClassificationTextLine: ProjectClassificationTextLine,
    /**
     * The ProjectClassificationWord model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord}
     */
    ProjectClassificationWord: ProjectClassificationWord,
    /**
     * The ProjectResponse model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectResponse}
     */
    ProjectResponse: ProjectResponse,
    /**
     * The ProjectSettings model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings}
     */
    ProjectSettings: ProjectSettings,
    /**
     * The StorageLocation model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation}
     */
    StorageLocation: StorageLocation,
    /**
     * The Stream model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Stream}
     */
    Stream: Stream,
    /**
     * The StreamLocation model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation}
     */
    StreamLocation: StreamLocation,
    /**
     * The StreamResponse model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamResponse}
     */
    StreamResponse: StreamResponse,
    /**
     * The SummaryItem model constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem}
     */
    SummaryItem: SummaryItem,
    /**
     * The AllApi service constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.api/AllApi}
     */
    AllApi: AllApi,
    /**
     * The JobApi service constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.api/JobApi}
     */
    JobApi: JobApi,
    /**
     * The ProjectApi service constructor.
     * @property {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.api/ProjectApi}
     */
    ProjectApi: ProjectApi
  };

  return exports;
}));
