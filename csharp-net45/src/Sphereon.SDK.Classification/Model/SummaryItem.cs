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
    /// The classification job summary item
    /// </summary>
    [DataContract]
    public partial class SummaryItem :  IEquatable<SummaryItem>, IValidatableObject
    {
        /// <summary>
        /// classification context
        /// </summary>
        /// <value>classification context</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ClassificationContextEnum
        {
            
            /// <summary>
            /// Enum DOCUMENT for "DOCUMENT"
            /// </summary>
            [EnumMember(Value = "DOCUMENT")]
            DOCUMENT,
            
            /// <summary>
            /// Enum PAGE for "PAGE"
            /// </summary>
            [EnumMember(Value = "PAGE")]
            PAGE
        }

        /// <summary>
        /// classification context
        /// </summary>
        /// <value>classification context</value>
        [DataMember(Name="classificationContext", EmitDefaultValue=false)]
        public ClassificationContextEnum? ClassificationContext { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SummaryItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SummaryItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SummaryItem" /> class.
        /// </summary>
        /// <param name="InputInfo">Original input information (required).</param>
        /// <param name="Score">Confidence score (required).</param>
        /// <param name="FirstPage">First page (required).</param>
        /// <param name="LastPage">Last page (required).</param>
        /// <param name="ClassName">classification name (required).</param>
        /// <param name="ClassificationContext">classification context (required).</param>
        /// <param name="ProjectId">Project id.</param>
        public SummaryItem(ClassificationInputInfo InputInfo = default(ClassificationInputInfo), double? Score = default(double?), int? FirstPage = default(int?), int? LastPage = default(int?), string ClassName = default(string), ClassificationContextEnum? ClassificationContext = default(ClassificationContextEnum?), string ProjectId = default(string))
        {
            // to ensure "InputInfo" is required (not null)
            if (InputInfo == null)
            {
                throw new InvalidDataException("InputInfo is a required property for SummaryItem and cannot be null");
            }
            else
            {
                this.InputInfo = InputInfo;
            }
            // to ensure "Score" is required (not null)
            if (Score == null)
            {
                throw new InvalidDataException("Score is a required property for SummaryItem and cannot be null");
            }
            else
            {
                this.Score = Score;
            }
            // to ensure "FirstPage" is required (not null)
            if (FirstPage == null)
            {
                throw new InvalidDataException("FirstPage is a required property for SummaryItem and cannot be null");
            }
            else
            {
                this.FirstPage = FirstPage;
            }
            // to ensure "LastPage" is required (not null)
            if (LastPage == null)
            {
                throw new InvalidDataException("LastPage is a required property for SummaryItem and cannot be null");
            }
            else
            {
                this.LastPage = LastPage;
            }
            // to ensure "ClassName" is required (not null)
            if (ClassName == null)
            {
                throw new InvalidDataException("ClassName is a required property for SummaryItem and cannot be null");
            }
            else
            {
                this.ClassName = ClassName;
            }
            // to ensure "ClassificationContext" is required (not null)
            if (ClassificationContext == null)
            {
                throw new InvalidDataException("ClassificationContext is a required property for SummaryItem and cannot be null");
            }
            else
            {
                this.ClassificationContext = ClassificationContext;
            }
            this.ProjectId = ProjectId;
        }
        
        /// <summary>
        /// Original input information
        /// </summary>
        /// <value>Original input information</value>
        [DataMember(Name="inputInfo", EmitDefaultValue=false)]
        public ClassificationInputInfo InputInfo { get; set; }

        /// <summary>
        /// Confidence score
        /// </summary>
        /// <value>Confidence score</value>
        [DataMember(Name="score", EmitDefaultValue=false)]
        public double? Score { get; set; }

        /// <summary>
        /// First page
        /// </summary>
        /// <value>First page</value>
        [DataMember(Name="firstPage", EmitDefaultValue=false)]
        public int? FirstPage { get; set; }

        /// <summary>
        /// Last page
        /// </summary>
        /// <value>Last page</value>
        [DataMember(Name="lastPage", EmitDefaultValue=false)]
        public int? LastPage { get; set; }

        /// <summary>
        /// classification name
        /// </summary>
        /// <value>classification name</value>
        [DataMember(Name="className", EmitDefaultValue=false)]
        public string ClassName { get; set; }


        /// <summary>
        /// Project id
        /// </summary>
        /// <value>Project id</value>
        [DataMember(Name="projectId", EmitDefaultValue=false)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SummaryItem {\n");
            sb.Append("  InputInfo: ").Append(InputInfo).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
            sb.Append("  FirstPage: ").Append(FirstPage).Append("\n");
            sb.Append("  LastPage: ").Append(LastPage).Append("\n");
            sb.Append("  ClassName: ").Append(ClassName).Append("\n");
            sb.Append("  ClassificationContext: ").Append(ClassificationContext).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
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
            return this.Equals(obj as SummaryItem);
        }

        /// <summary>
        /// Returns true if SummaryItem instances are equal
        /// </summary>
        /// <param name="other">Instance of SummaryItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SummaryItem other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.InputInfo == other.InputInfo ||
                    this.InputInfo != null &&
                    this.InputInfo.Equals(other.InputInfo)
                ) && 
                (
                    this.Score == other.Score ||
                    this.Score != null &&
                    this.Score.Equals(other.Score)
                ) && 
                (
                    this.FirstPage == other.FirstPage ||
                    this.FirstPage != null &&
                    this.FirstPage.Equals(other.FirstPage)
                ) && 
                (
                    this.LastPage == other.LastPage ||
                    this.LastPage != null &&
                    this.LastPage.Equals(other.LastPage)
                ) && 
                (
                    this.ClassName == other.ClassName ||
                    this.ClassName != null &&
                    this.ClassName.Equals(other.ClassName)
                ) && 
                (
                    this.ClassificationContext == other.ClassificationContext ||
                    this.ClassificationContext != null &&
                    this.ClassificationContext.Equals(other.ClassificationContext)
                ) && 
                (
                    this.ProjectId == other.ProjectId ||
                    this.ProjectId != null &&
                    this.ProjectId.Equals(other.ProjectId)
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
                if (this.InputInfo != null)
                    hash = hash * 59 + this.InputInfo.GetHashCode();
                if (this.Score != null)
                    hash = hash * 59 + this.Score.GetHashCode();
                if (this.FirstPage != null)
                    hash = hash * 59 + this.FirstPage.GetHashCode();
                if (this.LastPage != null)
                    hash = hash * 59 + this.LastPage.GetHashCode();
                if (this.ClassName != null)
                    hash = hash * 59 + this.ClassName.GetHashCode();
                if (this.ClassificationContext != null)
                    hash = hash * 59 + this.ClassificationContext.GetHashCode();
                if (this.ProjectId != null)
                    hash = hash * 59 + this.ProjectId.GetHashCode();
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
