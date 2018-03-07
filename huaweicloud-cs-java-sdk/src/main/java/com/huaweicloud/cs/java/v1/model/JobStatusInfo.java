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
 * 作业状态信息
 */
@ApiModel(description = "作业状态信息")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T16:54:26.224+08:00")
public class JobStatusInfo {
  @SerializedName("job_id")
  private Long jobId = null;

  @SerializedName("status_name")
  private String statusName = null;

  @SerializedName("status_desc")
  private String statusDesc = null;

  public JobStatusInfo jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * 作业ID
   * @return jobId
  **/
  @ApiModelProperty(example = "100000", value = "作业ID")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public JobStatusInfo statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * 当前状态名称
   * @return statusName
  **/
  @ApiModelProperty(example = "running", value = "当前状态名称")
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public JobStatusInfo statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * 当前状态描述
   * @return statusDesc
  **/
  @ApiModelProperty(example = "当前状态描述", value = "当前状态描述")
  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatusInfo jobStatusInfo = (JobStatusInfo) o;
    return Objects.equals(this.jobId, jobStatusInfo.jobId) &&
        Objects.equals(this.statusName, jobStatusInfo.statusName) &&
        Objects.equals(this.statusDesc, jobStatusInfo.statusDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, statusName, statusDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatusInfo {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
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

