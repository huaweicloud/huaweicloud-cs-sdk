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
import com.huaweicloud.cs.java.v1.model.UserCluster;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户配额信息
 */
@ApiModel(description = "用户配额信息")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T19:15:11.891+08:00")
public class UserQuotaInfo {
  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("spu_used")
  private Integer spuUsed = null;

  @SerializedName("spu_quota")
  private Integer spuQuota = null;

  @SerializedName("clusters")
  private List<UserCluster> clusters = null;

  public UserQuotaInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户ID
   * @return userId
  **/
  @ApiModelProperty(example = "ausf2223dddd", value = "用户ID")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserQuotaInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 用户名称
   * @return userName
  **/
  @ApiModelProperty(example = "user_001", value = "用户名称")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserQuotaInfo spuUsed(Integer spuUsed) {
    this.spuUsed = spuUsed;
    return this;
  }

   /**
   * 用户已使用SPU配额
   * @return spuUsed
  **/
  @ApiModelProperty(example = "20", value = "用户已使用SPU配额")
  public Integer getSpuUsed() {
    return spuUsed;
  }

  public void setSpuUsed(Integer spuUsed) {
    this.spuUsed = spuUsed;
  }

  public UserQuotaInfo spuQuota(Integer spuQuota) {
    this.spuQuota = spuQuota;
    return this;
  }

   /**
   * 用户最大SPU配额
   * @return spuQuota
  **/
  @ApiModelProperty(example = "100", value = "用户最大SPU配额")
  public Integer getSpuQuota() {
    return spuQuota;
  }

  public void setSpuQuota(Integer spuQuota) {
    this.spuQuota = spuQuota;
  }

  public UserQuotaInfo clusters(List<UserCluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  public UserQuotaInfo addClustersItem(UserCluster clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<UserCluster>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * 用户可使用的集群列表
   * @return clusters
  **/
  @ApiModelProperty(value = "用户可使用的集群列表")
  public List<UserCluster> getClusters() {
    return clusters;
  }

  public void setClusters(List<UserCluster> clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserQuotaInfo userQuotaInfo = (UserQuotaInfo) o;
    return Objects.equals(this.userId, userQuotaInfo.userId) &&
        Objects.equals(this.userName, userQuotaInfo.userName) &&
        Objects.equals(this.spuUsed, userQuotaInfo.spuUsed) &&
        Objects.equals(this.spuQuota, userQuotaInfo.spuQuota) &&
        Objects.equals(this.clusters, userQuotaInfo.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, spuUsed, spuQuota, clusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQuotaInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    spuUsed: ").append(toIndentedString(spuUsed)).append("\n");
    sb.append("    spuQuota: ").append(toIndentedString(spuQuota)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

