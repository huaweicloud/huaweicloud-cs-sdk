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
import com.huaweicloud.cs.java.v1.model.ClusterHostsInfoHostsInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 集群IP域名映射信息列表
 */
@ApiModel(description = "集群IP域名映射信息列表")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:00:00.393+08:00")
public class ClusterHostsInfo {
  @SerializedName("hosts_info")
  private List<ClusterHostsInfoHostsInfo> hostsInfo = null;

  @SerializedName("total")
  private Integer total = null;

  public ClusterHostsInfo hostsInfo(List<ClusterHostsInfoHostsInfo> hostsInfo) {
    this.hostsInfo = hostsInfo;
    return this;
  }

  public ClusterHostsInfo addHostsInfoItem(ClusterHostsInfoHostsInfo hostsInfoItem) {
    if (this.hostsInfo == null) {
      this.hostsInfo = new ArrayList<ClusterHostsInfoHostsInfo>();
    }
    this.hostsInfo.add(hostsInfoItem);
    return this;
  }

   /**
   * 集群IP域名映射信息列表
   * @return hostsInfo
  **/
  @ApiModelProperty(value = "集群IP域名映射信息列表")
  public List<ClusterHostsInfoHostsInfo> getHostsInfo() {
    return hostsInfo;
  }

  public void setHostsInfo(List<ClusterHostsInfoHostsInfo> hostsInfo) {
    this.hostsInfo = hostsInfo;
  }

  public ClusterHostsInfo total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * IP域名总数
   * @return total
  **/
  @ApiModelProperty(example = "1", value = "IP域名总数")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterHostsInfo clusterHostsInfo = (ClusterHostsInfo) o;
    return Objects.equals(this.hostsInfo, clusterHostsInfo.hostsInfo) &&
        Objects.equals(this.total, clusterHostsInfo.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostsInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterHostsInfo {\n");
    
    sb.append("    hostsInfo: ").append(toIndentedString(hostsInfo)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

