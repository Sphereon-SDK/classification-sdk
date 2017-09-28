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
    root.classification.SummaryItem = factory(root.classification.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SummaryItem model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>SummaryItem</code>.
   * The classification job summary item
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem
   * @class
   * @param score {Number} Confidence score
   * @param firstPage {Integer} First page
   * @param lastPage {Integer} Last page
   * @param className {String} classification name
   * @param classificationContext {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem.ClassificationContextEnum} classification context
   */
  var exports = function(score, firstPage, lastPage, className, classificationContext) {
    var _this = this;

    _this['score'] = score;
    _this['firstPage'] = firstPage;
    _this['lastPage'] = lastPage;
    _this['className'] = className;
    _this['classificationContext'] = classificationContext;
  };

  /**
   * Constructs a <code>SummaryItem</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem} The populated <code>SummaryItem</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('score')) {
        obj['score'] = ApiClient.convertToType(data['score'], 'Number');
      }
      if (data.hasOwnProperty('firstPage')) {
        obj['firstPage'] = ApiClient.convertToType(data['firstPage'], 'Integer');
      }
      if (data.hasOwnProperty('lastPage')) {
        obj['lastPage'] = ApiClient.convertToType(data['lastPage'], 'Integer');
      }
      if (data.hasOwnProperty('className')) {
        obj['className'] = ApiClient.convertToType(data['className'], 'String');
      }
      if (data.hasOwnProperty('classificationContext')) {
        obj['classificationContext'] = ApiClient.convertToType(data['classificationContext'], 'String');
      }
    }
    return obj;
  }

  /**
   * Confidence score
   * @member {Number} score
   */
  exports.prototype['score'] = undefined;
  /**
   * First page
   * @member {Integer} firstPage
   */
  exports.prototype['firstPage'] = undefined;
  /**
   * Last page
   * @member {Integer} lastPage
   */
  exports.prototype['lastPage'] = undefined;
  /**
   * classification name
   * @member {String} className
   */
  exports.prototype['className'] = undefined;
  /**
   * classification context
   * @member {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/SummaryItem.ClassificationContextEnum} classificationContext
   */
  exports.prototype['classificationContext'] = undefined;


  /**
   * Allowed values for the <code>classificationContext</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ClassificationContextEnum = {
    /**
     * value: "DOCUMENT"
     * @const
     */
    "DOCUMENT": "DOCUMENT",
    /**
     * value: "PAGE"
     * @const
     */
    "PAGE": "PAGE"  };


  return exports;
}));


