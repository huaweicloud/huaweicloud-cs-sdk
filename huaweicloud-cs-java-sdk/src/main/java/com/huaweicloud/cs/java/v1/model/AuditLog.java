/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.cs.java.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AuditLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T09:45:31.014+08:00")
public class AuditLog {
  @SerializedName("resource_id")
  private String resourceId = null;

  @SerializedName("resource_name")
  private String resourceName = null;

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("event_type")
  private String eventType = null;

  @SerializedName("event_rating")
  private String eventRating = null;

  @SerializedName("op_user")
  private String opUser = null;

  @SerializedName("op_time")
  private Long opTime = null;

  @SerializedName("op_ip")
  private String opIp = null;

  @SerializedName("op_result")
  private String opResult = null;

  public AuditLog resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @ApiModelProperty(example = "10000", value = "")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AuditLog resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @ApiModelProperty(example = "my job", value = "")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public AuditLog eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(example = "create_job", value = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public AuditLog eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(example = "create_job", value = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public AuditLog eventRating(String eventRating) {
    this.eventRating = eventRating;
    return this;
  }

   /**
   * Get eventRating
   * @return eventRating
  **/
  @ApiModelProperty(value = "")
  public String getEventRating() {
    return eventRating;
  }

  public void setEventRating(String eventRating) {
    this.eventRating = eventRating;
  }

  public AuditLog opUser(String opUser) {
    this.opUser = opUser;
    return this;
  }

   /**
   * Get opUser
   * @return opUser
  **/
  @ApiModelProperty(value = "")
  public String getOpUser() {
    return opUser;
  }

  public void setOpUser(String opUser) {
    this.opUser = opUser;
  }

  public AuditLog opTime(Long opTime) {
    this.opTime = opTime;
    return this;
  }

   /**
   * Get opTime
   * @return opTime
  **/
  @ApiModelProperty(value = "")
  public Long getOpTime() {
    return opTime;
  }

  public void setOpTime(Long opTime) {
    this.opTime = opTime;
  }

  public AuditLog opIp(String opIp) {
    this.opIp = opIp;
    return this;
  }

   /**
   * Get opIp
   * @return opIp
  **/
  @ApiModelProperty(value = "")
  public String getOpIp() {
    return opIp;
  }

  public void setOpIp(String opIp) {
    this.opIp = opIp;
  }

  public AuditLog opResult(String opResult) {
    this.opResult = opResult;
    return this;
  }

   /**
   * Get opResult
   * @return opResult
  **/
  @ApiModelProperty(value = "")
  public String getOpResult() {
    return opResult;
  }

  public void setOpResult(String opResult) {
    this.opResult = opResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLog auditLog = (AuditLog) o;
    return Objects.equals(this.resourceId, auditLog.resourceId) &&
        Objects.equals(this.resourceName, auditLog.resourceName) &&
        Objects.equals(this.eventName, auditLog.eventName) &&
        Objects.equals(this.eventType, auditLog.eventType) &&
        Objects.equals(this.eventRating, auditLog.eventRating) &&
        Objects.equals(this.opUser, auditLog.opUser) &&
        Objects.equals(this.opTime, auditLog.opTime) &&
        Objects.equals(this.opIp, auditLog.opIp) &&
        Objects.equals(this.opResult, auditLog.opResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceName, eventName, eventType, eventRating, opUser, opTime, opIp, opResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLog {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventRating: ").append(toIndentedString(eventRating)).append("\n");
    sb.append("    opUser: ").append(toIndentedString(opUser)).append("\n");
    sb.append("    opTime: ").append(toIndentedString(opTime)).append("\n");
    sb.append("    opIp: ").append(toIndentedString(opIp)).append("\n");
    sb.append("    opResult: ").append(toIndentedString(opResult)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

