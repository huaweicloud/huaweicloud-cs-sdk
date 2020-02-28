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
 * FlinkGlobalErrorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T09:45:31.014+08:00")
public class FlinkGlobalErrorResponse {
  @SerializedName("error_code")
  private String errorCode = null;

  @SerializedName("error_msg")
  private String errorMsg = null;

  @SerializedName("error_json_opt")
  private String errorJsonOpt = null;

  public FlinkGlobalErrorResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误消息码
   * @return errorCode
  **/
  @ApiModelProperty(example = "DLI.12004", value = "错误消息码")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public FlinkGlobalErrorResponse errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * 错误信息描述
   * @return errorMsg
  **/
  @ApiModelProperty(example = "作业不存在请检查原因或者创建一个新作业", value = "错误信息描述")
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public FlinkGlobalErrorResponse errorJsonOpt(String errorJsonOpt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlinkGlobalErrorResponse flinkGlobalErrorResponse = (FlinkGlobalErrorResponse) o;
    return Objects.equals(this.errorCode, flinkGlobalErrorResponse.errorCode) &&
        Objects.equals(this.errorMsg, flinkGlobalErrorResponse.errorMsg) &&
        Objects.equals(this.errorJsonOpt, flinkGlobalErrorResponse.errorJsonOpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMsg, errorJsonOpt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlinkGlobalErrorResponse {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    errorJsonOpt: ").append(toIndentedString(errorJsonOpt)).append("\n");
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

