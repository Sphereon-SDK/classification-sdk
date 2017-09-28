/* 
 * Classification API
 *
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Sphereon.SDK.Classification.Model
{
    /// <summary>
    /// The Classification response
    /// </summary>
    [DataContract]
    public partial class ClassificationResponse :  IEquatable<ClassificationResponse>
    {

        /// <summary>
        /// Gets or Sets DetailLevels
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DetailLevelsEnum
        {
            
            /// <summary>
            /// Enum SUMMARY for "SUMMARY"
            /// </summary>
            [EnumMember(Value = "SUMMARY")]
            SUMMARY,
            
            /// <summary>
            /// Enum DEFAULT for "DEFAULT"
            /// </summary>
            [EnumMember(Value = "DEFAULT")]
            DEFAULT,
            
            /// <summary>
            /// Enum RAW for "RAW"
            /// </summary>
            [EnumMember(Value = "RAW")]
            RAW
        }

        /// <summary>
        /// Level of detail for the results
        /// </summary>
        /// <value>Level of detail for the results</value>
        [DataMember(Name="detailLevels", EmitDefaultValue=false)]
        public List<DetailLevelsEnum> DetailLevels { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClassificationResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClassificationResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClassificationResponse" /> class.
        /// </summary>
        /// <param name="ClassificationResult">Classification results.</param>
        /// <param name="Summary">Classification job summary.</param>
        /// <param name="DetailLevels">Level of detail for the results (required).</param>
        /// <param name="JobInfo">Job info (required).</param>
        public ClassificationResponse(ClassificationResult ClassificationResult = null, ClassificationSummary Summary = null, List<DetailLevelsEnum> DetailLevels = null, JobInfo JobInfo = null)
        {
            // to ensure "DetailLevels" is required (not null)
            if (DetailLevels == null)
            {
                throw new InvalidDataException("DetailLevels is a required property for ClassificationResponse and cannot be null");
            }
            else
            {
                this.DetailLevels = DetailLevels;
            }
            // to ensure "JobInfo" is required (not null)
            if (JobInfo == null)
            {
                throw new InvalidDataException("JobInfo is a required property for ClassificationResponse and cannot be null");
            }
            else
            {
                this.JobInfo = JobInfo;
            }
            this.ClassificationResult = ClassificationResult;
            this.Summary = Summary;
        }
        
        /// <summary>
        /// Classification results
        /// </summary>
        /// <value>Classification results</value>
        [DataMember(Name="classificationResult", EmitDefaultValue=false)]
        public ClassificationResult ClassificationResult { get; set; }
        /// <summary>
        /// Classification job summary
        /// </summary>
        /// <value>Classification job summary</value>
        [DataMember(Name="summary", EmitDefaultValue=false)]
        public ClassificationSummary Summary { get; set; }
        /// <summary>
        /// Job info
        /// </summary>
        /// <value>Job info</value>
        [DataMember(Name="jobInfo", EmitDefaultValue=false)]
        public JobInfo JobInfo { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClassificationResponse {\n");
            sb.Append("  ClassificationResult: ").Append(ClassificationResult).Append("\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
            sb.Append("  DetailLevels: ").Append(DetailLevels).Append("\n");
            sb.Append("  JobInfo: ").Append(JobInfo).Append("\n");
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
            return this.Equals(obj as ClassificationResponse);
        }

        /// <summary>
        /// Returns true if ClassificationResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of ClassificationResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClassificationResponse other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ClassificationResult == other.ClassificationResult ||
                    this.ClassificationResult != null &&
                    this.ClassificationResult.Equals(other.ClassificationResult)
                ) && 
                (
                    this.Summary == other.Summary ||
                    this.Summary != null &&
                    this.Summary.Equals(other.Summary)
                ) && 
                (
                    this.DetailLevels == other.DetailLevels ||
                    this.DetailLevels != null &&
                    this.DetailLevels.SequenceEqual(other.DetailLevels)
                ) && 
                (
                    this.JobInfo == other.JobInfo ||
                    this.JobInfo != null &&
                    this.JobInfo.Equals(other.JobInfo)
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
                if (this.ClassificationResult != null)
                    hash = hash * 59 + this.ClassificationResult.GetHashCode();
                if (this.Summary != null)
                    hash = hash * 59 + this.Summary.GetHashCode();
                if (this.DetailLevels != null)
                    hash = hash * 59 + this.DetailLevels.GetHashCode();
                if (this.JobInfo != null)
                    hash = hash * 59 + this.JobInfo.GetHashCode();
                return hash;
            }
        }
    }

}
