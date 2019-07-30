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
 * JobApigSinkEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T10:07:58.610+08:00")
public class JobApigSinkEntity {
  @SerializedName("app_id")
  private String appId = null;

  @SerializedName("sink_name")
  private String sinkName = null;

  @SerializedName("url")
  private String url = null;

  public JobApigSinkEntity appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Apig网关服务console页面创建的应用ID
   * @return appId
  **/
  @ApiModelProperty(example = "ee412697e20c4ab8b567bffd71724991", value = "Apig网关服务console页面创建的应用ID")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public JobApigSinkEntity sinkName(String sinkName) {
    this.sinkName = sinkName;
    return this;
  }

   /**
   * 定义的Sink数据流的名称
   * @return sinkName
  **/
  @ApiModelProperty(example = "CAR_INFOS_DETAIL", value = "定义的Sink数据流的名称")
  public String getSinkName() {
    return sinkName;
  }

  public void setSinkName(String sinkName) {
    this.sinkName = sinkName;
  }

  public JobApigSinkEntity url(String url) {
    this.url = url;
    return this;
  }

   /**
   * 用于用户访问Apig服务中创建出来api的访问地址
   * @return url
  **/
  @ApiModelProperty(example = "https://fb2ce37f71f04d91ac67c4efcd75a172.apigw.cn-north-1.huaweicloud.com/jobid/CAR_INFOS_DETAIL", value = "用于用户访问Apig服务中创建出来api的访问地址")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobApigSinkEntity jobApigSinkEntity = (JobApigSinkEntity) o;
    return Objects.equals(this.appId, jobApigSinkEntity.appId) &&
        Objects.equals(this.sinkName, jobApigSinkEntity.sinkName) &&
        Objects.equals(this.url, jobApigSinkEntity.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, sinkName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobApigSinkEntity {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    sinkName: ").append(toIndentedString(sinkName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

