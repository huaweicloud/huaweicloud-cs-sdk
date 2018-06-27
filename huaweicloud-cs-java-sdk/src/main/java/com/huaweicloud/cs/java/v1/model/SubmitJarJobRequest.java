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
 * SubmitJarJobRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-27T15:00:33.512+08:00")
public class SubmitJarJobRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("cluster_id")
  private Integer clusterId = null;

  @SerializedName("spu_number")
  private Integer spuNumber = null;

  @SerializedName("obs_bucket")
  private String obsBucket = null;

  @SerializedName("log_enabled")
  private Boolean logEnabled = false;

  public SubmitJarJobRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 作业名称
   * @return name
  **/
  @ApiModelProperty(example = "my_job_001", required = true, value = "作业名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubmitJarJobRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 作业描述
   * @return desc
  **/
  @ApiModelProperty(example = "作业描述", value = "作业描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SubmitJarJobRequest clusterId(Integer clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * 独享集群资源ID, 当前用户有该独享资源的使用权限
   * @return clusterId
  **/
  @ApiModelProperty(example = "100000", required = true, value = "独享集群资源ID, 当前用户有该独享资源的使用权限")
  public Integer getClusterId() {
    return clusterId;
  }

  public void setClusterId(Integer clusterId) {
    this.clusterId = clusterId;
  }

  public SubmitJarJobRequest spuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
    return this;
  }

   /**
   * 用户为作业选择的SPU数量
   * minimum: 2
   * maximum: 400
   * @return spuNumber
  **/
  @ApiModelProperty(value = "用户为作业选择的SPU数量")
  public Integer getSpuNumber() {
    return spuNumber;
  }

  public void setSpuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
  }

  public SubmitJarJobRequest obsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
    return this;
  }

   /**
   * log_enabled&#x3D;&#x3D;true是, 用户授权保存作业日志的OBS路径
   * @return obsBucket
  **/
  @ApiModelProperty(example = "my_obs_bucket", value = "log_enabled==true是, 用户授权保存作业日志的OBS路径")
  public String getObsBucket() {
    return obsBucket;
  }

  public void setObsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
  }

  public SubmitJarJobRequest logEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
    return this;
  }

   /**
   * 是否开启作业的日志上传到用户的OBS功能
   * @return logEnabled
  **/
  @ApiModelProperty(value = "是否开启作业的日志上传到用户的OBS功能")
  public Boolean isLogEnabled() {
    return logEnabled;
  }

  public void setLogEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitJarJobRequest submitJarJobRequest = (SubmitJarJobRequest) o;
    return Objects.equals(this.name, submitJarJobRequest.name) &&
        Objects.equals(this.desc, submitJarJobRequest.desc) &&
        Objects.equals(this.clusterId, submitJarJobRequest.clusterId) &&
        Objects.equals(this.spuNumber, submitJarJobRequest.spuNumber) &&
        Objects.equals(this.obsBucket, submitJarJobRequest.obsBucket) &&
        Objects.equals(this.logEnabled, submitJarJobRequest.logEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc, clusterId, spuNumber, obsBucket, logEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitJarJobRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    spuNumber: ").append(toIndentedString(spuNumber)).append("\n");
    sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
    sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
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

