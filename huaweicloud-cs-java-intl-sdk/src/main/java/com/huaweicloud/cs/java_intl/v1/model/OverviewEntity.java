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

package com.huaweicloud.cs.java_intl.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.huaweicloud.cs.java_intl.v1.model.ClusterOverviewEntity;
import com.huaweicloud.cs.java_intl.v1.model.JobOverviewEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 概要统计信息实体
 */
@ApiModel(description = "概要统计信息实体")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-13T19:29:08.677+08:00")
public class OverviewEntity {
  @SerializedName("total_cost")
  private Double totalCost = null;

  @SerializedName("job_overview")
  private JobOverviewEntity jobOverview = null;

  @SerializedName("cluster_overview")
  private ClusterOverviewEntity clusterOverview = null;

  public OverviewEntity totalCost(Double totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * 总spu用量
   * @return totalCost
  **/
  @ApiModelProperty(example = "100.0", value = "总spu用量")
  public Double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }

  public OverviewEntity jobOverview(JobOverviewEntity jobOverview) {
    this.jobOverview = jobOverview;
    return this;
  }

   /**
   * Get jobOverview
   * @return jobOverview
  **/
  @ApiModelProperty(value = "")
  public JobOverviewEntity getJobOverview() {
    return jobOverview;
  }

  public void setJobOverview(JobOverviewEntity jobOverview) {
    this.jobOverview = jobOverview;
  }

  public OverviewEntity clusterOverview(ClusterOverviewEntity clusterOverview) {
    this.clusterOverview = clusterOverview;
    return this;
  }

   /**
   * Get clusterOverview
   * @return clusterOverview
  **/
  @ApiModelProperty(value = "")
  public ClusterOverviewEntity getClusterOverview() {
    return clusterOverview;
  }

  public void setClusterOverview(ClusterOverviewEntity clusterOverview) {
    this.clusterOverview = clusterOverview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverviewEntity overviewEntity = (OverviewEntity) o;
    return Objects.equals(this.totalCost, overviewEntity.totalCost) &&
        Objects.equals(this.jobOverview, overviewEntity.jobOverview) &&
        Objects.equals(this.clusterOverview, overviewEntity.clusterOverview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCost, jobOverview, clusterOverview);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverviewEntity {\n");
    
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    jobOverview: ").append(toIndentedString(jobOverview)).append("\n");
    sb.append("    clusterOverview: ").append(toIndentedString(clusterOverview)).append("\n");
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

