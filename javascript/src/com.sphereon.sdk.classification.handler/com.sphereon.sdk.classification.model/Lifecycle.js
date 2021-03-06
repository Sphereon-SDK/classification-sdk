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
    define(['com.sphereon.sdk.classification.handler/ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.classification) {
      root.classification = {};
    }
    root.classification.Lifecycle = factory(root.classification.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Lifecycle model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>Lifecycle</code>.
   * Lifecycle settings. When no lifecycle settings are supplied, the job and files will be deleted directly after retrieval of the file
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Lifecycle</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle} The populated <code>Lifecycle</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('actionTime')) {
        obj['actionTime'] = ApiClient.convertToType(data['actionTime'], 'Date');
      }
      if (data.hasOwnProperty('action')) {
        obj['action'] = ApiClient.convertToType(data['action'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
    }
    return obj;
  }

  /**
   * The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation
   * @member {Date} actionTime
   */
  exports.prototype['actionTime'] = undefined;
  /**
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle.ActionEnum} action
   */
  exports.prototype['action'] = undefined;
  /**
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/Lifecycle.TypeEnum} type
   */
  exports.prototype['type'] = undefined;


  /**
   * Allowed values for the <code>action</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ActionEnum = {
    /**
     * value: "DELETE"
     * @const
     */
    "DELETE": "DELETE"  };

  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "RETRIEVAL"
     * @const
     */
    "RETRIEVAL": "RETRIEVAL",
    /**
     * value: "TIME"
     * @const
     */
    "TIME": "TIME"  };


  return exports;
}));


