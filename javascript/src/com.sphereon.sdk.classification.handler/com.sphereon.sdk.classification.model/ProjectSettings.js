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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['com.sphereon.sdk.classification.handler/ApiClient', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./StorageLocation'), require('./StreamLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.classification) {
      root.classification = {};
    }
    root.classification.ProjectSettings = factory(root.classification.ApiClient, root.classification.StorageLocation, root.classification.StreamLocation);
  }
}(this, function(ApiClient, StorageLocation, StreamLocation) {
  'use strict';




  /**
   * The ProjectSettings model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>ProjectSettings</code>.
   * Project settings
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings
   * @class
   * @param projectStreamLocations {Array.<module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation>} Project stream locations
   * @param engine {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings.EngineEnum} Engine
   * @param description {String} Project description
   * @param projectName {String} Project name
   * @param projectStorageLocation {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation} Project Files storage location
   */
  var exports = function(projectStreamLocations, engine, description, projectName, projectStorageLocation) {
    var _this = this;

    _this['projectStreamLocations'] = projectStreamLocations;
    _this['engine'] = engine;
    _this['description'] = description;
    _this['projectName'] = projectName;
    _this['projectStorageLocation'] = projectStorageLocation;

  };

  /**
   * Constructs a <code>ProjectSettings</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings} The populated <code>ProjectSettings</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('projectStreamLocations')) {
        obj['projectStreamLocations'] = ApiClient.convertToType(data['projectStreamLocations'], [StreamLocation]);
      }
      if (data.hasOwnProperty('engine')) {
        obj['engine'] = ApiClient.convertToType(data['engine'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('projectName')) {
        obj['projectName'] = ApiClient.convertToType(data['projectName'], 'String');
      }
      if (data.hasOwnProperty('projectStorageLocation')) {
        obj['projectStorageLocation'] = StorageLocation.constructFromObject(data['projectStorageLocation']);
      }
      if (data.hasOwnProperty('projectId')) {
        obj['projectId'] = ApiClient.convertToType(data['projectId'], 'String');
      }
    }
    return obj;
  }

  /**
   * Project stream locations
   * @member {Array.<module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation>} projectStreamLocations
   */
  exports.prototype['projectStreamLocations'] = undefined;
  /**
   * Engine
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectSettings.EngineEnum} engine
   */
  exports.prototype['engine'] = undefined;
  /**
   * Project description
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * Project name
   * @member {String} projectName
   */
  exports.prototype['projectName'] = undefined;
  /**
   * Project Files storage location
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation} projectStorageLocation
   */
  exports.prototype['projectStorageLocation'] = undefined;
  /**
   * @member {String} projectId
   */
  exports.prototype['projectId'] = undefined;


  /**
   * Allowed values for the <code>engine</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EngineEnum = {
    /**
     * value: "PREMIUM"
     * @const
     */
    "PREMIUM": "PREMIUM"  };


  return exports;
}));

