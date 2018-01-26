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
 * 预留集群信息
 */
@ApiModel(description = "预留集群信息")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-26T18:16:13.272+08:00")
public class ClusterInfo {
  @SerializedName("cluster_id")
  private Long clusterId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("status_code")
  private Integer statusCode = null;

  @SerializedName("status_name")
  private String statusName = null;

  @SerializedName("status_desc")
  private String statusDesc = null;

  @SerializedName("region_id")
  private String regionId = null;

  @SerializedName("spu_used")
  private Integer spuUsed = null;

  @SerializedName("maximum_spu_quota")
  private Integer maximumSpuQuota = null;

  @SerializedName("error_reason")
  private String errorReason = null;

  @SerializedName("created_at")
  private Long createdAt = null;

  public ClusterInfo clusterId(Long clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * 集群ID
   * @return clusterId
  **/
  @ApiModelProperty(example = "100000", value = "集群ID")
  public Long getClusterId() {
    return clusterId;
  }

  public void setClusterId(Long clusterId) {
    this.clusterId = clusterId;
  }

  public ClusterInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 集群名称
   * @return name
  **/
  @ApiModelProperty(example = "my cluster", value = "集群名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterInfo desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 集群描述
   * @return desc
  **/
  @ApiModelProperty(example = "my cluster desc", value = "集群描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ClusterInfo statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 集群当前状态码
   * @return statusCode
  **/
  @ApiModelProperty(example = "5", value = "集群当前状态码")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ClusterInfo statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * 集群当前状态名称
   * @return statusName
  **/
  @ApiModelProperty(example = "cluster_running", value = "集群当前状态名称")
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public ClusterInfo statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * 集群当前状态描述
   * @return statusDesc
  **/
  @ApiModelProperty(example = "运行中", value = "集群当前状态描述")
  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public ClusterInfo regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * 集群当前所处的Region
   * @return regionId
  **/
  @ApiModelProperty(example = "cn-north-1", value = "集群当前所处的Region")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public ClusterInfo spuUsed(Integer spuUsed) {
    this.spuUsed = spuUsed;
    return this;
  }

   /**
   * 集群已使用SPU配额
   * @return spuUsed
  **/
  @ApiModelProperty(example = "100", value = "集群已使用SPU配额")
  public Integer getSpuUsed() {
    return spuUsed;
  }

  public void setSpuUsed(Integer spuUsed) {
    this.spuUsed = spuUsed;
  }

  public ClusterInfo maximumSpuQuota(Integer maximumSpuQuota) {
    this.maximumSpuQuota = maximumSpuQuota;
    return this;
  }

   /**
   * 集群的最大SPU配额
   * @return maximumSpuQuota
  **/
  @ApiModelProperty(example = "100", value = "集群的最大SPU配额")
  public Integer getMaximumSpuQuota() {
    return maximumSpuQuota;
  }

  public void setMaximumSpuQuota(Integer maximumSpuQuota) {
    this.maximumSpuQuota = maximumSpuQuota;
  }

  public ClusterInfo errorReason(String errorReason) {
    this.errorReason = errorReason;
    return this;
  }

   /**
   * 集群状态异常时的错误原因
   * @return errorReason
  **/
  @ApiModelProperty(example = "100", value = "集群状态异常时的错误原因")
  public String getErrorReason() {
    return errorReason;
  }

  public void setErrorReason(String errorReason) {
    this.errorReason = errorReason;
  }

  public ClusterInfo createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 集群创建时间
   * @return createdAt
  **/
  @ApiModelProperty(example = "100", value = "集群创建时间")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterInfo clusterInfo = (ClusterInfo) o;
    return Objects.equals(this.clusterId, clusterInfo.clusterId) &&
        Objects.equals(this.name, clusterInfo.name) &&
        Objects.equals(this.desc, clusterInfo.desc) &&
        Objects.equals(this.statusCode, clusterInfo.statusCode) &&
        Objects.equals(this.statusName, clusterInfo.statusName) &&
        Objects.equals(this.statusDesc, clusterInfo.statusDesc) &&
        Objects.equals(this.regionId, clusterInfo.regionId) &&
        Objects.equals(this.spuUsed, clusterInfo.spuUsed) &&
        Objects.equals(this.maximumSpuQuota, clusterInfo.maximumSpuQuota) &&
        Objects.equals(this.errorReason, clusterInfo.errorReason) &&
        Objects.equals(this.createdAt, clusterInfo.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, name, desc, statusCode, statusName, statusDesc, regionId, spuUsed, maximumSpuQuota, errorReason, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterInfo {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    spuUsed: ").append(toIndentedString(spuUsed)).append("\n");
    sb.append("    maximumSpuQuota: ").append(toIndentedString(maximumSpuQuota)).append("\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

