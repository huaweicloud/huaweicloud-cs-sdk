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
import com.huaweicloud.cs.java.v1.model.FlinkJobEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryFlinkJobListResponseJobList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T09:45:31.014+08:00")
public class QueryFlinkJobListResponseJobList {
  @SerializedName("total_count")
  private Integer totalCount = null;

  @SerializedName("jobs")
  private List<FlinkJobEntity> jobs = null;

  public QueryFlinkJobListResponseJobList totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 作业查询结果条数
   * @return totalCount
  **/
  @ApiModelProperty(value = "作业查询结果条数")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public QueryFlinkJobListResponseJobList jobs(List<FlinkJobEntity> jobs) {
    this.jobs = jobs;
    return this;
  }

  public QueryFlinkJobListResponseJobList addJobsItem(FlinkJobEntity jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<FlinkJobEntity>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @ApiModelProperty(value = "")
  public List<FlinkJobEntity> getJobs() {
    return jobs;
  }

  public void setJobs(List<FlinkJobEntity> jobs) {
    this.jobs = jobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFlinkJobListResponseJobList queryFlinkJobListResponseJobList = (QueryFlinkJobListResponseJobList) o;
    return Objects.equals(this.totalCount, queryFlinkJobListResponseJobList.totalCount) &&
        Objects.equals(this.jobs, queryFlinkJobListResponseJobList.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, jobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFlinkJobListResponseJobList {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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

