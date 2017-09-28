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
    define(['com.sphereon.sdk.classification.handler/ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.classification) {
      root.classification = {};
    }
    root.classification.StorageLocation = factory(root.classification.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The StorageLocation model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>StorageLocation</code>.
   * Location record
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>StorageLocation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StorageLocation} The populated <code>StorageLocation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('folderPath')) {
        obj['folderPath'] = ApiClient.convertToType(data['folderPath'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('containerId')) {
        obj['containerId'] = ApiClient.convertToType(data['containerId'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} folderPath
   */
  exports.prototype['folderPath'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} containerId
   */
  exports.prototype['containerId'] = undefined;



  return exports;
}));

