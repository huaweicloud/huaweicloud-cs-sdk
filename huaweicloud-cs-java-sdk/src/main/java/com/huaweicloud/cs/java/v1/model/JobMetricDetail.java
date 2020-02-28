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
import com.huaweicloud.cs.java.v1.model.OperatorMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobMetricDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T09:45:31.014+08:00")
public class JobMetricDetail {
  @SerializedName("sources")
  private List<OperatorMetric> sources = null;

  @SerializedName("sinks")
  private List<OperatorMetric> sinks = null;

  @SerializedName("total_read_rate")
  private Double totalReadRate = null;

  @SerializedName("total_write_rate")
  private Double totalWriteRate = null;

  public JobMetricDetail sources(List<OperatorMetric> sources) {
    this.sources = sources;
    return this;
  }

  public JobMetricDetail addSourcesItem(OperatorMetric sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<OperatorMetric>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @ApiModelProperty(value = "")
  public List<OperatorMetric> getSources() {
    return sources;
  }

  public void setSources(List<OperatorMetric> sources) {
    this.sources = sources;
  }

  public JobMetricDetail sinks(List<OperatorMetric> sinks) {
    this.sinks = sinks;
    return this;
  }

  public JobMetricDetail addSinksItem(OperatorMetric sinksItem) {
    if (this.sinks == null) {
      this.sinks = new ArrayList<OperatorMetric>();
    }
    this.sinks.add(sinksItem);
    return this;
  }

   /**
   * Get sinks
   * @return sinks
  **/
  @ApiModelProperty(value = "")
  public List<OperatorMetric> getSinks() {
    return sinks;
  }

  public void setSinks(List<OperatorMetric> sinks) {
    this.sinks = sinks;
  }

  public JobMetricDetail totalReadRate(Double totalReadRate) {
    this.totalReadRate = totalReadRate;
    return this;
  }

   /**
   * 总输入速率，单位条/秒
   * @return totalReadRate
  **/
  @ApiModelProperty(example = "100.0", value = "总输入速率，单位条/秒")
  public Double getTotalReadRate() {
    return totalReadRate;
  }

  public void setTotalReadRate(Double totalReadRate) {
    this.totalReadRate = totalReadRate;
  }

  public JobMetricDetail totalWriteRate(Double totalWriteRate) {
    this.totalWriteRate = totalWriteRate;
    return this;
  }

   /**
   * 总输出速率，单位条/秒
   * @return totalWriteRate
  **/
  @ApiModelProperty(example = "100.0", value = "总输出速率，单位条/秒")
  public Double getTotalWriteRate() {
    return totalWriteRate;
  }

  public void setTotalWriteRate(Double totalWriteRate) {
    this.totalWriteRate = totalWriteRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobMetricDetail jobMetricDetail = (JobMetricDetail) o;
    return Objects.equals(this.sources, jobMetricDetail.sources) &&
        Objects.equals(this.sinks, jobMetricDetail.sinks) &&
        Objects.equals(this.totalReadRate, jobMetricDetail.totalReadRate) &&
        Objects.equals(this.totalWriteRate, jobMetricDetail.totalWriteRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources, sinks, totalReadRate, totalWriteRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobMetricDetail {\n");
    
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    sinks: ").append(toIndentedString(sinks)).append("\n");
    sb.append("    totalReadRate: ").append(toIndentedString(totalReadRate)).append("\n");
    sb.append("    totalWriteRate: ").append(toIndentedString(totalWriteRate)).append("\n");
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

