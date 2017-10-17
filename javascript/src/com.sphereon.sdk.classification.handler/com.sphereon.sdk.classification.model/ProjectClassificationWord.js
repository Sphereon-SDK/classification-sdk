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
    root.classification.ProjectClassificationWord = factory(root.classification.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ProjectClassificationWord model module.
   * @module com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord
   * @version 0.3.2
   */

  /**
   * Constructs a new <code>ProjectClassificationWord</code>.
   * Word of text line
   * @alias module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>ProjectClassificationWord</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord} obj Optional instance to populate.
   * @return {module:com.sphereon.sdk.classification.handler/com.sphereon.sdk.classification.model/ProjectClassificationWord} The populated <code>ProjectClassificationWord</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('top')) {
        obj['top'] = ApiClient.convertToType(data['top'], 'Number');
      }
      if (data.hasOwnProperty('left')) {
        obj['left'] = ApiClient.convertToType(data['left'], 'Number');
      }
      if (data.hasOwnProperty('bottom')) {
        obj['bottom'] = ApiClient.convertToType(data['bottom'], 'Number');
      }
      if (data.hasOwnProperty('width')) {
        obj['width'] = ApiClient.convertToType(data['width'], 'Number');
      }
      if (data.hasOwnProperty('right')) {
        obj['right'] = ApiClient.convertToType(data['right'], 'Number');
      }
      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
      if (data.hasOwnProperty('height')) {
        obj['height'] = ApiClient.convertToType(data['height'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The top pixel coordinate of the text line
   * @member {Number} top
   */
  exports.prototype['top'] = undefined;
  /**
   * The left pixel coordinate of the text line
   * @member {Number} left
   */
  exports.prototype['left'] = undefined;
  /**
   * The bottom pixel coordinate of the text line
   * @member {Number} bottom
   */
  exports.prototype['bottom'] = undefined;
  /**
   * The width of the text line in pixel coordinate
   * @member {Number} width
   */
  exports.prototype['width'] = undefined;
  /**
   * The right pixel coordinate of the text line
   * @member {Number} right
   */
  exports.prototype['right'] = undefined;
  /**
   * The text of the word
   * @member {String} text
   */
  exports.prototype['text'] = undefined;
  /**
   * The height of the text line in pixel coordinate
   * @member {Number} height
   */
  exports.prototype['height'] = undefined;



  return exports;
}));


