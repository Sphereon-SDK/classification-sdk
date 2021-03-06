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
    /// The classification result
    /// </summary>
    [DataContract]
    public partial class ProjectClassificationResult :  IEquatable<ProjectClassificationResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProjectClassificationResult" /> class.
        /// </summary>
        /// <param name="Score">Score.</param>
        /// <param name="Notes">A list of classification notes.</param>
        /// <param name="ClassName">Class name.</param>
        public ProjectClassificationResult(double? Score = default(double?), List<string> Notes = default(List<string>), string ClassName = default(string))
        {
            this.Score = Score;
            this.Notes = Notes;
            this.ClassName = ClassName;
        }
        
        /// <summary>
        /// Score
        /// </summary>
        /// <value>Score</value>
        [DataMember(Name="score", EmitDefaultValue=false)]
        public double? Score { get; set; }

        /// <summary>
        /// A list of classification notes
        /// </summary>
        /// <value>A list of classification notes</value>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public List<string> Notes { get; set; }

        /// <summary>
        /// Class name
        /// </summary>
        /// <value>Class name</value>
        [DataMember(Name="className", EmitDefaultValue=false)]
        public string ClassName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProjectClassificationResult {\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
            sb.Append("  ClassName: ").Append(ClassName).Append("\n");
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
            return this.Equals(obj as ProjectClassificationResult);
        }

        /// <summary>
        /// Returns true if ProjectClassificationResult instances are equal
        /// </summary>
        /// <param name="other">Instance of ProjectClassificationResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProjectClassificationResult other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Score == other.Score ||
                    this.Score != null &&
                    this.Score.Equals(other.Score)
                ) && 
                (
                    this.Notes == other.Notes ||
                    this.Notes != null &&
                    this.Notes.SequenceEqual(other.Notes)
                ) && 
                (
                    this.ClassName == other.ClassName ||
                    this.ClassName != null &&
                    this.ClassName.Equals(other.ClassName)
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
                if (this.Score != null)
                    hash = hash * 59 + this.Score.GetHashCode();
                if (this.Notes != null)
                    hash = hash * 59 + this.Notes.GetHashCode();
                if (this.ClassName != null)
                    hash = hash * 59 + this.ClassName.GetHashCode();
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
