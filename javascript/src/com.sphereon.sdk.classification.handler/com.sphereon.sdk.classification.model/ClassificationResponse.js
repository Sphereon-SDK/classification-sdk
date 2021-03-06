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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['com.sphereon.sdk.classification.handler/ApiClient', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResult', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationSummary', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/JobInfo'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ClassificationResult'), require('./ClassificationSummary'), require('./JobInfo'));
  } else {
    // Browser globals (root is window)
    if (!root.classification) {
      root.classification = {};
    }
    root.classification.ClassificationResponse = factory(root.classification.ApiClient, root.classification.ClassificationResult, root.classification.ClassificationSummary, root.classification.JobInfo);
  }
}(this, function(ApiClient, ClassificationResult, ClassificationSummary, JobInfo) {
  'use strict';




  /**
   * The ClassificationResponse model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>ClassificationResponse</code>.
   * The Classification response
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse
   * @class
   * @param detailLevels {Array.<module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse.DetailLevelsEnum>} Level of detail for the results
   * @param jobInfo {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/JobInfo} Job info
   */
  var exports = function(detailLevels, jobInfo) {
    var _this = this;



    _this['detailLevels'] = detailLevels;
    _this['jobInfo'] = jobInfo;
  };

  /**
   * Constructs a <code>ClassificationResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse} The populated <code>ClassificationResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('classificationResult')) {
        obj['classificationResult'] = ClassificationResult.constructFromObject(data['classificationResult']);
      }
      if (data.hasOwnProperty('summary')) {
        obj['summary'] = ClassificationSummary.constructFromObject(data['summary']);
      }
      if (data.hasOwnProperty('detailLevels')) {
        obj['detailLevels'] = ApiClient.convertToType(data['detailLevels'], ['String']);
      }
      if (data.hasOwnProperty('jobInfo')) {
        obj['jobInfo'] = JobInfo.constructFromObject(data['jobInfo']);
      }
    }
    return obj;
  }

  /**
   * Classification results
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResult} classificationResult
   */
  exports.prototype['classificationResult'] = undefined;
  /**
   * Classification job summary
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationSummary} summary
   */
  exports.prototype['summary'] = undefined;
  /**
   * Level of detail for the results
   * @member {Array.<module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationResponse.DetailLevelsEnum>} detailLevels
   */
  exports.prototype['detailLevels'] = undefined;
  /**
   * Job info
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/JobInfo} jobInfo
   */
  exports.prototype['jobInfo'] = undefined;


  /**
   * Allowed values for the <code>detailLevels</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DetailLevelsEnum = {
    /**
     * value: "SUMMARY"
     * @const
     */
    "SUMMARY": "SUMMARY",
    /**
     * value: "DEFAULT"
     * @const
     */
    "DEFAULT": "DEFAULT",
    /**
     * value: "RAW"
     * @const
     */
    "RAW": "RAW"  };


  return exports;
}));


