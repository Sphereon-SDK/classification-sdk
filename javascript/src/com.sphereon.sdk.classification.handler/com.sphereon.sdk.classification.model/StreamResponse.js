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
    define(['com.sphereon.sdk.classification.handler/ApiClient', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./StreamLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.classification) {
      root.classification = {};
    }
    root.classification.StreamResponse = factory(root.classification.ApiClient, root.classification.StreamLocation);
  }
}(this, function(ApiClient, StreamLocation) {
  'use strict';




  /**
   * The StreamResponse model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamResponse
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>StreamResponse</code>.
   * The result location of a stream
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamResponse
   * @class
   * @param streamLocation {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation} The actual location of the stream
   */
  var exports = function(streamLocation) {
    var _this = this;

    _this['streamLocation'] = streamLocation;
  };

  /**
   * Constructs a <code>StreamResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamResponse} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamResponse} The populated <code>StreamResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('streamLocation')) {
        obj['streamLocation'] = StreamLocation.constructFromObject(data['streamLocation']);
      }
    }
    return obj;
  }

  /**
   * The actual location of the stream
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/StreamLocation} streamLocation
   */
  exports.prototype['streamLocation'] = undefined;



  return exports;
}));

