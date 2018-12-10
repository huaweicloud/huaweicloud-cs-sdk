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
import com.huaweicloud.cs.java.v1.model.JobEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryJobListResponsePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-10T14:17:13.719+08:00")
public class QueryJobListResponsePayload {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("jobs")
  private List<JobEntity> jobs = null;

  public QueryJobListResponsePayload total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * 作业查询结果条数
   * @return total
  **/
  @ApiModelProperty(value = "作业查询结果条数")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public QueryJobListResponsePayload jobs(List<JobEntity> jobs) {
    this.jobs = jobs;
    return this;
  }

  public QueryJobListResponsePayload addJobsItem(JobEntity jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<JobEntity>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @ApiModelProperty(value = "")
  public List<JobEntity> getJobs() {
    return jobs;
  }

  public void setJobs(List<JobEntity> jobs) {
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
    QueryJobListResponsePayload queryJobListResponsePayload = (QueryJobListResponsePayload) o;
    return Objects.equals(this.total, queryJobListResponsePayload.total) &&
        Objects.equals(this.jobs, queryJobListResponsePayload.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, jobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryJobListResponsePayload {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

