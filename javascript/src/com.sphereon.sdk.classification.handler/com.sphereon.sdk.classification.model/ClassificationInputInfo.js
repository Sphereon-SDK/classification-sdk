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
    define(['com.sphereon.sdk.classification.handler/ApiClient', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./StreamLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.classification) {
      root.classification = {};
    }
    root.classification.ClassificationInputInfo = factory(root.classification.ApiClient, root.classification.StreamLocation);
  }
}(this, function(ApiClient, StreamLocation) {
  'use strict';




  /**
   * The ClassificationInputInfo model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationInputInfo
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>ClassificationInputInfo</code>.
   * Input documents which where classified
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationInputInfo
   * @class
   * @param inputStreamLocations {Array.<module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation>} Original documents
   */
  var exports = function(inputStreamLocations) {
    var _this = this;

    _this['inputStreamLocations'] = inputStreamLocations;
  };

  /**
   * Constructs a <code>ClassificationInputInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationInputInfo} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ClassificationInputInfo} The populated <code>ClassificationInputInfo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('inputStreamLocations')) {
        obj['inputStreamLocations'] = ApiClient.convertToType(data['inputStreamLocations'], [StreamLocation]);
      }
    }
    return obj;
  }

  /**
   * Original documents
   * @member {Array.<module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation>} inputStreamLocations
   */
  exports.prototype['inputStreamLocations'] = undefined;



  return exports;
}));


