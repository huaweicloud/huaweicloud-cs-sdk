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
 * GlobalErrorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-28T15:37:25.807+08:00")
public class GlobalErrorResponse {
  @SerializedName("error_id")
  private String errorId = null;

  @SerializedName("error_name")
  private String errorName = null;

  @SerializedName("error_cause")
  private String errorCause = null;

  @SerializedName("error_suggestion")
  private String errorSuggestion = null;

  @SerializedName("error_json_opt")
  private String errorJsonOpt = null;

  @SerializedName("error_time")
  private Long errorTime = null;

  public GlobalErrorResponse errorId(String errorId) {
    this.errorId = errorId;
    return this;
  }

   /**
   * 错误消息码
   * @return errorId
  **/
  @ApiModelProperty(example = "CS.10001", value = "错误消息码")
  public String getErrorId() {
    return errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public GlobalErrorResponse errorName(String errorName) {
    this.errorName = errorName;
    return this;
  }

   /**
   * 错误消息名
   * @return errorName
  **/
  @ApiModelProperty(example = "service_error_name", value = "错误消息名")
  public String getErrorName() {
    return errorName;
  }

  public void setErrorName(String errorName) {
    this.errorName = errorName;
  }

  public GlobalErrorResponse errorCause(String errorCause) {
    this.errorCause = errorCause;
    return this;
  }

   /**
   * 错误原因
   * @return errorCause
  **/
  @ApiModelProperty(example = "输入参数格式不正确", value = "错误原因")
  public String getErrorCause() {
    return errorCause;
  }

  public void setErrorCause(String errorCause) {
    this.errorCause = errorCause;
  }

  public GlobalErrorResponse errorSuggestion(String errorSuggestion) {
    this.errorSuggestion = errorSuggestion;
    return this;
  }

   /**
   * 针对错误的建议
   * @return errorSuggestion
  **/
  @ApiModelProperty(example = "查询API文档", value = "针对错误的建议")
  public String getErrorSuggestion() {
    return errorSuggestion;
  }

  public void setErrorSuggestion(String errorSuggestion) {
    this.errorSuggestion = errorSuggestion;
  }

  public GlobalErrorResponse errorJsonOpt(String errorJsonOpt) {
    this.errorJsonOpt = errorJsonOpt;
    return this;
  }

   /**
   * 扩展信息, JSON格式
   * @return errorJsonOpt
  **/
  @ApiModelProperty(example = "[{}]", value = "扩展信息, JSON格式")
  public String getErrorJsonOpt() {
    return errorJsonOpt;
  }

  public void setErrorJsonOpt(String errorJsonOpt) {
    this.errorJsonOpt = errorJsonOpt;
  }

  public GlobalErrorResponse errorTime(Long errorTime) {
    this.errorTime = errorTime;
    return this;
  }

   /**
   * 错误发生的时间, 毫秒数
   * @return errorTime
  **/
  @ApiModelProperty(example = "4000000", value = "错误发生的时间, 毫秒数")
  public Long getErrorTime() {
    return errorTime;
  }

  public void setErrorTime(Long errorTime) {
    this.errorTime = errorTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalErrorResponse globalErrorResponse = (GlobalErrorResponse) o;
    return Objects.equals(this.errorId, globalErrorResponse.errorId) &&
        Objects.equals(this.errorName, globalErrorResponse.errorName) &&
        Objects.equals(this.errorCause, globalErrorResponse.errorCause) &&
        Objects.equals(this.errorSuggestion, globalErrorResponse.errorSuggestion) &&
        Objects.equals(this.errorJsonOpt, globalErrorResponse.errorJsonOpt) &&
        Objects.equals(this.errorTime, globalErrorResponse.errorTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, errorName, errorCause, errorSuggestion, errorJsonOpt, errorTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalErrorResponse {\n");
    
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    errorName: ").append(toIndentedString(errorName)).append("\n");
    sb.append("    errorCause: ").append(toIndentedString(errorCause)).append("\n");
    sb.append("    errorSuggestion: ").append(toIndentedString(errorSuggestion)).append("\n");
    sb.append("    errorJsonOpt: ").append(toIndentedString(errorJsonOpt)).append("\n");
    sb.append("    errorTime: ").append(toIndentedString(errorTime)).append("\n");
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

