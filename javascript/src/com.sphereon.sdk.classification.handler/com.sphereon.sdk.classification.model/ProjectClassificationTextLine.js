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
    define(['com.sphereon.sdk.classification.handler/ApiClient', 'com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ProjectClassificationWord'));
  } else {
    // Browser globals (root is window)
    if (!root.classification) {
      root.classification = {};
    }
    root.classification.ProjectClassificationTextLine = factory(root.classification.ApiClient, root.classification.ProjectClassificationWord);
  }
}(this, function(ApiClient, ProjectClassificationWord) {
  'use strict';




  /**
   * The ProjectClassificationTextLine model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationTextLine
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>ProjectClassificationTextLine</code>.
   * Text line
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationTextLine
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>ProjectClassificationTextLine</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationTextLine} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationTextLine} The populated <code>ProjectClassificationTextLine</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('top')) {
        obj['top'] = ApiClient.convertToType(data['top'], 'Integer');
      }
      if (data.hasOwnProperty('left')) {
        obj['left'] = ApiClient.convertToType(data['left'], 'Integer');
      }
      if (data.hasOwnProperty('bottom')) {
        obj['bottom'] = ApiClient.convertToType(data['bottom'], 'Integer');
      }
      if (data.hasOwnProperty('width')) {
        obj['width'] = ApiClient.convertToType(data['width'], 'Integer');
      }
      if (data.hasOwnProperty('words')) {
        obj['words'] = ApiClient.convertToType(data['words'], [ProjectClassificationWord]);
      }
      if (data.hasOwnProperty('right')) {
        obj['right'] = ApiClient.convertToType(data['right'], 'Integer');
      }
      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
      if (data.hasOwnProperty('height')) {
        obj['height'] = ApiClient.convertToType(data['height'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * The top pixel coordinate of the text line
   * @member {Integer} top
   */
  exports.prototype['top'] = undefined;
  /**
   * The left pixel coordinate of the text line
   * @member {Integer} left
   */
  exports.prototype['left'] = undefined;
  /**
   * The bottom pixel coordinate of the text line
   * @member {Integer} bottom
   */
  exports.prototype['bottom'] = undefined;
  /**
   * The width of the text line in pixel coordinate
   * @member {Integer} width
   */
  exports.prototype['width'] = undefined;
  /**
   * All words of this text line
   * @member {Array.<module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord>} words
   */
  exports.prototype['words'] = undefined;
  /**
   * The right pixel coordinate of the text line
   * @member {Integer} right
   */
  exports.prototype['right'] = undefined;
  /**
   * The text of this line from the words
   * @member {String} text
   */
  exports.prototype['text'] = undefined;
  /**
   * The height of the text line in pixel coordinate
   * @member {Integer} height
   */
  exports.prototype['height'] = undefined;



  return exports;
}));


