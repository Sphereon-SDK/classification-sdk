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
    /// Lifecycle settings. When no lifecycle settings are supplied, the job and files will be deleted directly after retrieval of the file
    /// </summary>
    [DataContract]
    public partial class Lifecycle :  IEquatable<Lifecycle>
    {
        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ActionEnum
        {
            
            /// <summary>
            /// Enum DELETE for "DELETE"
            /// </summary>
            [EnumMember(Value = "DELETE")]
            DELETE
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum RETRIEVAL for "RETRIEVAL"
            /// </summary>
            [EnumMember(Value = "RETRIEVAL")]
            RETRIEVAL,
            
            /// <summary>
            /// Enum TIME for "TIME"
            /// </summary>
            [EnumMember(Value = "TIME")]
            TIME
        }

        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name="action", EmitDefaultValue=false)]
        public ActionEnum? Action { get; set; }
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Lifecycle" /> class.
        /// </summary>
        /// <param name="ActionTime">The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation.</param>
        /// <param name="Action">Action.</param>
        /// <param name="Type">Type.</param>
        public Lifecycle(DateTime? ActionTime = null, ActionEnum? Action = null, TypeEnum? Type = null)
        {
            this.ActionTime = ActionTime;
            this.Action = Action;
            this.Type = Type;
        }
        
        /// <summary>
        /// The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation
        /// </summary>
        /// <value>The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation</value>
        [DataMember(Name="actionTime", EmitDefaultValue=false)]
        public DateTime? ActionTime { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Lifecycle {\n");
            sb.Append("  ActionTime: ").Append(ActionTime).Append("\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(obj as Lifecycle);
        }

        /// <summary>
        /// Returns true if Lifecycle instances are equal
        /// </summary>
        /// <param name="other">Instance of Lifecycle to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Lifecycle other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ActionTime == other.ActionTime ||
                    this.ActionTime != null &&
                    this.ActionTime.Equals(other.ActionTime)
                ) && 
                (
                    this.Action == other.Action ||
                    this.Action != null &&
                    this.Action.Equals(other.Action)
                ) && 
                (
                    this.Type == other.Type ||
                    this.Type != null &&
                    this.Type.Equals(other.Type)
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
                if (this.ActionTime != null)
                    hash = hash * 59 + this.ActionTime.GetHashCode();
                if (this.Action != null)
                    hash = hash * 59 + this.Action.GetHashCode();
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                return hash;
            }
        }
    }

}