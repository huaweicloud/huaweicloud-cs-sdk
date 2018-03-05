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
import com.huaweicloud.cs.java.v1.model.JobConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobDetailEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T19:32:22.642+08:00")
public class JobDetailEntity {
  @SerializedName("job_id")
  private Long jobId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("job_type")
  private String jobType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("status_desc")
  private String statusDesc = null;

  @SerializedName("create_time")
  private Long createTime = null;

  @SerializedName("start_time")
  private Long startTime = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("cluster_id")
  private Integer clusterId = null;

  @SerializedName("project_id")
  private String projectId = null;

  @SerializedName("sql_body")
  private String sqlBody = null;

  /**
   * 作业运行模式，共享或者独享模式
   */
  @JsonAdapter(RunModeEnum.Adapter.class)
  public enum RunModeEnum {
    SHARED_CLUSTER("shared_cluster"),
    
    EXCLUSIVE_CLUSTER("exclusive_cluster");

    private String value;

    RunModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RunModeEnum fromValue(String text) {
      for (RunModeEnum b : RunModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RunModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RunModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RunModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RunModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("run_mode")
  private RunModeEnum runMode = null;

  @SerializedName("spu_number")
  private Integer spuNumber = null;

  @SerializedName("parallel_number")
  private Integer parallelNumber = null;

  @SerializedName("job_config")
  private JobConfig jobConfig = null;

  @SerializedName("jar_url")
  private String jarUrl = null;

  @SerializedName("main_class")
  private String mainClass = null;

  @SerializedName("args")
  private String args = null;

  @SerializedName("execution_graph")
  private String executionGraph = null;

  @SerializedName("update_time")
  private Long updateTime = null;

  public JobDetailEntity jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * 作业ID
   * @return jobId
  **/
  @ApiModelProperty(value = "作业ID")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public JobDetailEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 作业名称
   * @return name
  **/
  @ApiModelProperty(example = "my_job_001", value = "作业名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobDetailEntity desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 作业描述
   * @return desc
  **/
  @ApiModelProperty(value = "作业描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public JobDetailEntity jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * 作业类型
   * @return jobType
  **/
  @ApiModelProperty(value = "作业类型")
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public JobDetailEntity status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 作业状态
   * @return status
  **/
  @ApiModelProperty(value = "作业状态")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public JobDetailEntity statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * 作业状态描述
   * @return statusDesc
  **/
  @ApiModelProperty(value = "作业状态描述")
  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public JobDetailEntity createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 作业创建时间
   * @return createTime
  **/
  @ApiModelProperty(value = "作业创建时间")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public JobDetailEntity startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 作业启动时间, 0尚未启动
   * @return startTime
  **/
  @ApiModelProperty(value = "作业启动时间, 0尚未启动")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public JobDetailEntity userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 作业所属用户标识
   * @return userId
  **/
  @ApiModelProperty(value = "作业所属用户标识")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public JobDetailEntity clusterId(Integer clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * 独享集群资源ID, 当前用户有该独享资源的使用权限
   * @return clusterId
  **/
  @ApiModelProperty(value = "独享集群资源ID, 当前用户有该独享资源的使用权限")
  public Integer getClusterId() {
    return clusterId;
  }

  public void setClusterId(Integer clusterId) {
    this.clusterId = clusterId;
  }

  public JobDetailEntity projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 作业所属项目标识
   * @return projectId
  **/
  @ApiModelProperty(value = "作业所属项目标识")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public JobDetailEntity sqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
    return this;
  }

   /**
   * Stream SQL语句
   * @return sqlBody
  **/
  @ApiModelProperty(example = "select * from source_table", value = "Stream SQL语句")
  public String getSqlBody() {
    return sqlBody;
  }

  public void setSqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
  }

  public JobDetailEntity runMode(RunModeEnum runMode) {
    this.runMode = runMode;
    return this;
  }

   /**
   * 作业运行模式，共享或者独享模式
   * @return runMode
  **/
  @ApiModelProperty(example = "shared_cluster", value = "作业运行模式，共享或者独享模式")
  public RunModeEnum getRunMode() {
    return runMode;
  }

  public void setRunMode(RunModeEnum runMode) {
    this.runMode = runMode;
  }

  public JobDetailEntity spuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
    return this;
  }

   /**
   * 用户为作业选择的SPU数量
   * minimum: 1
   * maximum: 400
   * @return spuNumber
  **/
  @ApiModelProperty(value = "用户为作业选择的SPU数量")
  public Integer getSpuNumber() {
    return spuNumber;
  }

  public void setSpuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
  }

  public JobDetailEntity parallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
    return this;
  }

   /**
   * 用户设置的作业并行数
   * minimum: 1
   * maximum: 50
   * @return parallelNumber
  **/
  @ApiModelProperty(value = "用户设置的作业并行数")
  public Integer getParallelNumber() {
    return parallelNumber;
  }

  public void setParallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
  }

  public JobDetailEntity jobConfig(JobConfig jobConfig) {
    this.jobConfig = jobConfig;
    return this;
  }

   /**
   * Get jobConfig
   * @return jobConfig
  **/
  @ApiModelProperty(value = "")
  public JobConfig getJobConfig() {
    return jobConfig;
  }

  public void setJobConfig(JobConfig jobConfig) {
    this.jobConfig = jobConfig;
  }

  public JobDetailEntity jarUrl(String jarUrl) {
    this.jarUrl = jarUrl;
    return this;
  }

   /**
   * jar包的OBS路径
   * @return jarUrl
  **/
  @ApiModelProperty(value = "jar包的OBS路径")
  public String getJarUrl() {
    return jarUrl;
  }

  public void setJarUrl(String jarUrl) {
    this.jarUrl = jarUrl;
  }

  public JobDetailEntity mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

   /**
   * checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径
   * @return mainClass
  **/
  @ApiModelProperty(value = "checkpoint_enabled==true是, 用户授权保存快照的OBS路径")
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public JobDetailEntity args(String args) {
    this.args = args;
    return this;
  }

   /**
   * jar包作业运行参数
   * @return args
  **/
  @ApiModelProperty(value = "jar包作业运行参数")
  public String getArgs() {
    return args;
  }

  public void setArgs(String args) {
    this.args = args;
  }

  public JobDetailEntity executionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
    return this;
  }

   /**
   * 作业执行计划
   * @return executionGraph
  **/
  @ApiModelProperty(value = "作业执行计划")
  public String getExecutionGraph() {
    return executionGraph;
  }

  public void setExecutionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
  }

  public JobDetailEntity updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 作业更新时间
   * @return updateTime
  **/
  @ApiModelProperty(value = "作业更新时间")
  public Long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailEntity jobDetailEntity = (JobDetailEntity) o;
    return Objects.equals(this.jobId, jobDetailEntity.jobId) &&
        Objects.equals(this.name, jobDetailEntity.name) &&
        Objects.equals(this.desc, jobDetailEntity.desc) &&
        Objects.equals(this.jobType, jobDetailEntity.jobType) &&
        Objects.equals(this.status, jobDetailEntity.status) &&
        Objects.equals(this.statusDesc, jobDetailEntity.statusDesc) &&
        Objects.equals(this.createTime, jobDetailEntity.createTime) &&
        Objects.equals(this.startTime, jobDetailEntity.startTime) &&
        Objects.equals(this.userId, jobDetailEntity.userId) &&
        Objects.equals(this.clusterId, jobDetailEntity.clusterId) &&
        Objects.equals(this.projectId, jobDetailEntity.projectId) &&
        Objects.equals(this.sqlBody, jobDetailEntity.sqlBody) &&
        Objects.equals(this.runMode, jobDetailEntity.runMode) &&
        Objects.equals(this.spuNumber, jobDetailEntity.spuNumber) &&
        Objects.equals(this.parallelNumber, jobDetailEntity.parallelNumber) &&
        Objects.equals(this.jobConfig, jobDetailEntity.jobConfig) &&
        Objects.equals(this.jarUrl, jobDetailEntity.jarUrl) &&
        Objects.equals(this.mainClass, jobDetailEntity.mainClass) &&
        Objects.equals(this.args, jobDetailEntity.args) &&
        Objects.equals(this.executionGraph, jobDetailEntity.executionGraph) &&
        Objects.equals(this.updateTime, jobDetailEntity.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, name, desc, jobType, status, statusDesc, createTime, startTime, userId, clusterId, projectId, sqlBody, runMode, spuNumber, parallelNumber, jobConfig, jarUrl, mainClass, args, executionGraph, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailEntity {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
    sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
    sb.append("    spuNumber: ").append(toIndentedString(spuNumber)).append("\n");
    sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
    sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
    sb.append("    jarUrl: ").append(toIndentedString(jarUrl)).append("\n");
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    executionGraph: ").append(toIndentedString(executionGraph)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

