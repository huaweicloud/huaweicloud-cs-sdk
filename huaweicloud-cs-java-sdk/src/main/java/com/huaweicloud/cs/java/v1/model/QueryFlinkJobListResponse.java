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
import com.huaweicloud.cs.java.v1.model.QueryFlinkJobListResponseJobList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryFlinkJobListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T09:45:31.014+08:00")
public class QueryFlinkJobListResponse {
  @SerializedName("is_success")
  private Boolean isSuccess = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("job_list")
  private QueryFlinkJobListResponseJobList jobList = null;

  public QueryFlinkJobListResponse isSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    return this;
  }

   /**
   * 请求是否成功
   * @return isSuccess
  **/
  @ApiModelProperty(example = "true", value = "请求是否成功")
  public Boolean isIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  public QueryFlinkJobListResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 消息内容
   * @return message
  **/
  @ApiModelProperty(example = "消息内容", value = "消息内容")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public QueryFlinkJobListResponse jobList(QueryFlinkJobListResponseJobList jobList) {
    this.jobList = jobList;
    return this;
  }

   /**
   * Get jobList
   * @return jobList
  **/
  @ApiModelProperty(value = "")
  public QueryFlinkJobListResponseJobList getJobList() {
    return jobList;
  }

  public void setJobList(QueryFlinkJobListResponseJobList jobList) {
    this.jobList = jobList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFlinkJobListResponse queryFlinkJobListResponse = (QueryFlinkJobListResponse) o;
    return Objects.equals(this.isSuccess, queryFlinkJobListResponse.isSuccess) &&
        Objects.equals(this.message, queryFlinkJobListResponse.message) &&
        Objects.equals(this.jobList, queryFlinkJobListResponse.jobList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSuccess, message, jobList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFlinkJobListResponse {\n");
    
    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
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

