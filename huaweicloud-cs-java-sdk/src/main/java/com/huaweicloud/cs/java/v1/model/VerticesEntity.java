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
import com.huaweicloud.cs.java.v1.model.MetricsEntity;
import com.huaweicloud.cs.java.v1.model.StatusCountsEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T09:59:30.710+08:00")
public class VerticesEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parallelism")
  private Integer parallelism = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("start-time")
  private Long startTime = null;

  @SerializedName("end-time")
  private Long endTime = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("tasks")
  private StatusCountsEntity tasks = null;

  @SerializedName("metrics")
  private MetricsEntity metrics = null;

  @SerializedName("latency")
  private Long latency = null;

  public VerticesEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VerticesEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VerticesEntity parallelism(Integer parallelism) {
    this.parallelism = parallelism;
    return this;
  }

   /**
   * 
   * @return parallelism
  **/
  @ApiModelProperty(value = "")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  public VerticesEntity status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VerticesEntity startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public VerticesEntity endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public VerticesEntity duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public VerticesEntity tasks(StatusCountsEntity tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @ApiModelProperty(value = "")
  public StatusCountsEntity getTasks() {
    return tasks;
  }

  public void setTasks(StatusCountsEntity tasks) {
    this.tasks = tasks;
  }

  public VerticesEntity metrics(MetricsEntity metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @ApiModelProperty(value = "")
  public MetricsEntity getMetrics() {
    return metrics;
  }

  public void setMetrics(MetricsEntity metrics) {
    this.metrics = metrics;
  }

  public VerticesEntity latency(Long latency) {
    this.latency = latency;
    return this;
  }

   /**
   * 
   * @return latency
  **/
  @ApiModelProperty(value = "")
  public Long getLatency() {
    return latency;
  }

  public void setLatency(Long latency) {
    this.latency = latency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerticesEntity verticesEntity = (VerticesEntity) o;
    return Objects.equals(this.id, verticesEntity.id) &&
        Objects.equals(this.name, verticesEntity.name) &&
        Objects.equals(this.parallelism, verticesEntity.parallelism) &&
        Objects.equals(this.status, verticesEntity.status) &&
        Objects.equals(this.startTime, verticesEntity.startTime) &&
        Objects.equals(this.endTime, verticesEntity.endTime) &&
        Objects.equals(this.duration, verticesEntity.duration) &&
        Objects.equals(this.tasks, verticesEntity.tasks) &&
        Objects.equals(this.metrics, verticesEntity.metrics) &&
        Objects.equals(this.latency, verticesEntity.latency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parallelism, status, startTime, endTime, duration, tasks, metrics, latency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerticesEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
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

