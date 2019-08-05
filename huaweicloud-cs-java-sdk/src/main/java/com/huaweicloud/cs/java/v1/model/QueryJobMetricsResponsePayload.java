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
import com.huaweicloud.cs.java.v1.model.JobMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryJobMetricsResponsePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-02T13:59:14.712+08:00")
public class QueryJobMetricsResponsePayload {
  @SerializedName("jobs")
  private List<JobMetric> jobs = null;

  public QueryJobMetricsResponsePayload jobs(List<JobMetric> jobs) {
    this.jobs = jobs;
    return this;
  }

  public QueryJobMetricsResponsePayload addJobsItem(JobMetric jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<JobMetric>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @ApiModelProperty(value = "")
  public List<JobMetric> getJobs() {
    return jobs;
  }

  public void setJobs(List<JobMetric> jobs) {
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
    QueryJobMetricsResponsePayload queryJobMetricsResponsePayload = (QueryJobMetricsResponsePayload) o;
    return Objects.equals(this.jobs, queryJobMetricsResponsePayload.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryJobMetricsResponsePayload {\n");
    
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

