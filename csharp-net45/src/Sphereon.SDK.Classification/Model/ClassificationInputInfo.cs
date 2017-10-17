/* 
 * Classification API
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Sphereon.SDK.Classification.Client.SwaggerDateConverter;

namespace Sphereon.SDK.Classification.Model
{
    /// <summary>
    /// Input documents which where classified
    /// </summary>
    [DataContract]
    public partial class ClassificationInputInfo :  IEquatable<ClassificationInputInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClassificationInputInfo" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClassificationInputInfo() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClassificationInputInfo" /> class.
        /// </summary>
        /// <param name="InputStreamLocations">Original documents (required).</param>
        public ClassificationInputInfo(List<StreamLocation> InputStreamLocations = default(List<StreamLocation>))
        {
            // to ensure "InputStreamLocations" is required (not null)
            if (InputStreamLocations == null)
            {
                throw new InvalidDataException("InputStreamLocations is a required property for ClassificationInputInfo and cannot be null");
            }
            else
            {
                this.InputStreamLocations = InputStreamLocations;
            }
        }
        
        /// <summary>
        /// Original documents
        /// </summary>
        /// <value>Original documents</value>
        [DataMember(Name="inputStreamLocations", EmitDefaultValue=false)]
        public List<StreamLocation> InputStreamLocations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClassificationInputInfo {\n");
            sb.Append("  InputStreamLocations: ").Append(InputStreamLocations).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as ClassificationInputInfo);
        }

        /// <summary>
        /// Returns true if ClassificationInputInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of ClassificationInputInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClassificationInputInfo other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.InputStreamLocations == other.InputStreamLocations ||
                    this.InputStreamLocations != null &&
                    this.InputStreamLocations.SequenceEqual(other.InputStreamLocations)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.InputStreamLocations != null)
                    hash = hash * 59 + this.InputStreamLocations.GetHashCode();
                return hash;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
