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
import com.huaweicloud.cs.java.v1.model.PlanEntity;
import com.huaweicloud.cs.java.v1.model.StatusCountsEntity;
import com.huaweicloud.cs.java.v1.model.TimestampsEntity;
import com.huaweicloud.cs.java.v1.model.VerticesEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobExecutePlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T09:59:30.710+08:00")
public class JobExecutePlan {
  @SerializedName("jid")
  private String jid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("isStoppable")
  private Boolean isStoppable = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("start-time")
  private Long startTime = null;

  @SerializedName("end-time")
  private Long endTime = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("now")
  private Long now = null;

  @SerializedName("timestamps")
  private TimestampsEntity timestamps = null;

  @SerializedName("vertices")
  private List<VerticesEntity> vertices = null;

  @SerializedName("status-counts")
  private StatusCountsEntity statusCounts = null;

  @SerializedName("plan")
  private PlanEntity plan = null;

  public JobExecutePlan jid(String jid) {
    this.jid = jid;
    return this;
  }

   /**
   * 
   * @return jid
  **/
  @ApiModelProperty(value = "")
  public String getJid() {
    return jid;
  }

  public void setJid(String jid) {
    this.jid = jid;
  }

  public JobExecutePlan name(String name) {
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

  public JobExecutePlan isStoppable(Boolean isStoppable) {
    this.isStoppable = isStoppable;
    return this;
  }

   /**
   * 
   * @return isStoppable
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsStoppable() {
    return isStoppable;
  }

  public void setIsStoppable(Boolean isStoppable) {
    this.isStoppable = isStoppable;
  }

  public JobExecutePlan state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JobExecutePlan startTime(Long startTime) {
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

  public JobExecutePlan endTime(Long endTime) {
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

  public JobExecutePlan duration(String duration) {
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

  public JobExecutePlan now(Long now) {
    this.now = now;
    return this;
  }

   /**
   * 
   * @return now
  **/
  @ApiModelProperty(value = "")
  public Long getNow() {
    return now;
  }

  public void setNow(Long now) {
    this.now = now;
  }

  public JobExecutePlan timestamps(TimestampsEntity timestamps) {
    this.timestamps = timestamps;
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @ApiModelProperty(value = "")
  public TimestampsEntity getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(TimestampsEntity timestamps) {
    this.timestamps = timestamps;
  }

  public JobExecutePlan vertices(List<VerticesEntity> vertices) {
    this.vertices = vertices;
    return this;
  }

  public JobExecutePlan addVerticesItem(VerticesEntity verticesItem) {
    if (this.vertices == null) {
      this.vertices = new ArrayList<VerticesEntity>();
    }
    this.vertices.add(verticesItem);
    return this;
  }

   /**
   * Get vertices
   * @return vertices
  **/
  @ApiModelProperty(value = "")
  public List<VerticesEntity> getVertices() {
    return vertices;
  }

  public void setVertices(List<VerticesEntity> vertices) {
    this.vertices = vertices;
  }

  public JobExecutePlan statusCounts(StatusCountsEntity statusCounts) {
    this.statusCounts = statusCounts;
    return this;
  }

   /**
   * Get statusCounts
   * @return statusCounts
  **/
  @ApiModelProperty(value = "")
  public StatusCountsEntity getStatusCounts() {
    return statusCounts;
  }

  public void setStatusCounts(StatusCountsEntity statusCounts) {
    this.statusCounts = statusCounts;
  }

  public JobExecutePlan plan(PlanEntity plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public PlanEntity getPlan() {
    return plan;
  }

  public void setPlan(PlanEntity plan) {
    this.plan = plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobExecutePlan jobExecutePlan = (JobExecutePlan) o;
    return Objects.equals(this.jid, jobExecutePlan.jid) &&
        Objects.equals(this.name, jobExecutePlan.name) &&
        Objects.equals(this.isStoppable, jobExecutePlan.isStoppable) &&
        Objects.equals(this.state, jobExecutePlan.state) &&
        Objects.equals(this.startTime, jobExecutePlan.startTime) &&
        Objects.equals(this.endTime, jobExecutePlan.endTime) &&
        Objects.equals(this.duration, jobExecutePlan.duration) &&
        Objects.equals(this.now, jobExecutePlan.now) &&
        Objects.equals(this.timestamps, jobExecutePlan.timestamps) &&
        Objects.equals(this.vertices, jobExecutePlan.vertices) &&
        Objects.equals(this.statusCounts, jobExecutePlan.statusCounts) &&
        Objects.equals(this.plan, jobExecutePlan.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jid, name, isStoppable, state, startTime, endTime, duration, now, timestamps, vertices, statusCounts, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobExecutePlan {\n");
    
    sb.append("    jid: ").append(toIndentedString(jid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isStoppable: ").append(toIndentedString(isStoppable)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
    sb.append("    statusCounts: ").append(toIndentedString(statusCounts)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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

