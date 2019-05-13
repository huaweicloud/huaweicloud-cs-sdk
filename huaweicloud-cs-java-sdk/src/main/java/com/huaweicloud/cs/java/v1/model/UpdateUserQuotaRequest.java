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
import java.util.ArrayList;
import java.util.List;

/**
 * 更新用户配额信息
 */
@ApiModel(description = "更新用户配额信息")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-13T17:15:11.676+08:00")
public class UpdateUserQuotaRequest {
  @SerializedName("spu_quota")
  private Integer spuQuota = null;

  @SerializedName("clusters")
  private List<Integer> clusters = null;

  public UpdateUserQuotaRequest spuQuota(Integer spuQuota) {
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

  public UpdateUserQuotaRequest clusters(List<Integer> clusters) {
    this.clusters = clusters;
    return this;
  }

  public UpdateUserQuotaRequest addClustersItem(Integer clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<Integer>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * 分配给用户的集群id列表
   * @return clusters
  **/
  @ApiModelProperty(example = "[111,112]", value = "分配给用户的集群id列表")
  public List<Integer> getClusters() {
    return clusters;
  }

  public void setClusters(List<Integer> clusters) {
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
    UpdateUserQuotaRequest updateUserQuotaRequest = (UpdateUserQuotaRequest) o;
    return Objects.equals(this.spuQuota, updateUserQuotaRequest.spuQuota) &&
        Objects.equals(this.clusters, updateUserQuotaRequest.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spuQuota, clusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserQuotaRequest {\n");
    
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

