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
import com.huaweicloud.cs.java.v1.model.EngineVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReleaseVersionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-07T19:47:23.803+08:00")
public class ReleaseVersionResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("min_version")
  private String minVersion = null;

  @SerializedName("engines")
  private List<EngineVersion> engines = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("current_millis")
  private Long currentMillis = null;

  public ReleaseVersionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @ApiModelProperty(example = "v1.0", value = "id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReleaseVersionResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * CS当前版本号
   * @return version
  **/
  @ApiModelProperty(example = "v1.0.1", value = "CS当前版本号")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ReleaseVersionResponse minVersion(String minVersion) {
    this.minVersion = minVersion;
    return this;
  }

   /**
   * CS当前小版本号
   * @return minVersion
  **/
  @ApiModelProperty(example = "v1.0", value = "CS当前小版本号")
  public String getMinVersion() {
    return minVersion;
  }

  public void setMinVersion(String minVersion) {
    this.minVersion = minVersion;
  }

  public ReleaseVersionResponse engines(List<EngineVersion> engines) {
    this.engines = engines;
    return this;
  }

  public ReleaseVersionResponse addEnginesItem(EngineVersion enginesItem) {
    if (this.engines == null) {
      this.engines = new ArrayList<EngineVersion>();
    }
    this.engines.add(enginesItem);
    return this;
  }

   /**
   * Get engines
   * @return engines
  **/
  @ApiModelProperty(value = "")
  public List<EngineVersion> getEngines() {
    return engines;
  }

  public void setEngines(List<EngineVersion> engines) {
    this.engines = engines;
  }

  public ReleaseVersionResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * CS当前版本状态
   * @return status
  **/
  @ApiModelProperty(example = "CURRENT", value = "CS当前版本状态")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReleaseVersionResponse updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * 更新时间
   * @return updated
  **/
  @ApiModelProperty(example = "20180916013934", value = "更新时间")
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public ReleaseVersionResponse currentMillis(Long currentMillis) {
    this.currentMillis = currentMillis;
    return this;
  }

   /**
   * 当前时间, 毫秒数
   * @return currentMillis
  **/
  @ApiModelProperty(example = "4000000", value = "当前时间, 毫秒数")
  public Long getCurrentMillis() {
    return currentMillis;
  }

  public void setCurrentMillis(Long currentMillis) {
    this.currentMillis = currentMillis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseVersionResponse releaseVersionResponse = (ReleaseVersionResponse) o;
    return Objects.equals(this.id, releaseVersionResponse.id) &&
        Objects.equals(this.version, releaseVersionResponse.version) &&
        Objects.equals(this.minVersion, releaseVersionResponse.minVersion) &&
        Objects.equals(this.engines, releaseVersionResponse.engines) &&
        Objects.equals(this.status, releaseVersionResponse.status) &&
        Objects.equals(this.updated, releaseVersionResponse.updated) &&
        Objects.equals(this.currentMillis, releaseVersionResponse.currentMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, minVersion, engines, status, updated, currentMillis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseVersionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
    sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    currentMillis: ").append(toIndentedString(currentMillis)).append("\n");
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

