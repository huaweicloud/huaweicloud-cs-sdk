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
import com.huaweicloud.cs.java.v1.model.ClusterInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryClustersResponsePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:34:21.045+08:00")
public class QueryClustersResponsePayload {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("clusters")
  private List<ClusterInfo> clusters = null;

  public QueryClustersResponsePayload total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * 集群查询结果条数
   * @return total
  **/
  @ApiModelProperty(value = "集群查询结果条数")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public QueryClustersResponsePayload clusters(List<ClusterInfo> clusters) {
    this.clusters = clusters;
    return this;
  }

  public QueryClustersResponsePayload addClustersItem(ClusterInfo clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<ClusterInfo>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @ApiModelProperty(value = "")
  public List<ClusterInfo> getClusters() {
    return clusters;
  }

  public void setClusters(List<ClusterInfo> clusters) {
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
    QueryClustersResponsePayload queryClustersResponsePayload = (QueryClustersResponsePayload) o;
    return Objects.equals(this.total, queryClustersResponsePayload.total) &&
        Objects.equals(this.clusters, queryClustersResponsePayload.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, clusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryClustersResponsePayload {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

