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
import com.huaweicloud.cs.java.v1.model.FlinkJobConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FlinkJobEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T09:45:31.014+08:00")
public class FlinkJobEntity {
  @SerializedName("job_id")
  private Long jobId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("queue_name")
  private String queueName = null;

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

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("root_id")
  private Long rootId = null;

  @SerializedName("graph_editor_enabled")
  private Boolean graphEditorEnabled = null;

  @SerializedName("has_savepoint")
  private Boolean hasSavepoint = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("project_id")
  private String projectId = null;

  @SerializedName("sql_body")
  private String sqlBody = null;

  /**
   * 作业运行模式，共享或者独享模式或者边缘节点, show_detail为true时独有
   */
  @JsonAdapter(RunModeEnum.Adapter.class)
  public enum RunModeEnum {
    SHARED_CLUSTER("shared_cluster"),
    
    EXCLUSIVE_CLUSTER("exclusive_cluster"),
    
    EDGE_NODE("edge_node");

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

  @SerializedName("job_config")
  private FlinkJobConfig jobConfig = null;

  @SerializedName("main_class")
  private String mainClass = null;

  @SerializedName("entrypoint_args")
  private String entrypointArgs = null;

  @SerializedName("savepoint_path")
  private String savepointPath = null;

  @SerializedName("execution_graph")
  private String executionGraph = null;

  @SerializedName("update_time")
  private Long updateTime = null;

  public FlinkJobEntity jobId(Long jobId) {
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

  public FlinkJobEntity name(String name) {
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

  public FlinkJobEntity desc(String desc) {
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

  public FlinkJobEntity userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 用户名, show_detail为false时独有
   * @return userName
  **/
  @ApiModelProperty(value = "用户名, show_detail为false时独有")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public FlinkJobEntity queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * 队列名, show_detail为true时独有
   * @return queueName
  **/
  @ApiModelProperty(value = "队列名, show_detail为true时独有")
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public FlinkJobEntity jobType(String jobType) {
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

  public FlinkJobEntity status(String status) {
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

  public FlinkJobEntity statusDesc(String statusDesc) {
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

  public FlinkJobEntity createTime(Long createTime) {
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

  public FlinkJobEntity startTime(Long startTime) {
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

  public FlinkJobEntity duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * 作业运行时长, 单位ms, show_detail为false时独有
   * @return duration
  **/
  @ApiModelProperty(value = "作业运行时长, 单位ms, show_detail为false时独有")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public FlinkJobEntity rootId(Long rootId) {
    this.rootId = rootId;
    return this;
  }

   /**
   * 父作业ID, show_detail为false时独有
   * @return rootId
  **/
  @ApiModelProperty(value = "父作业ID, show_detail为false时独有")
  public Long getRootId() {
    return rootId;
  }

  public void setRootId(Long rootId) {
    this.rootId = rootId;
  }

  public FlinkJobEntity graphEditorEnabled(Boolean graphEditorEnabled) {
    this.graphEditorEnabled = graphEditorEnabled;
    return this;
  }

   /**
   * 是否启用可视化编辑, show_detail为false时独有
   * @return graphEditorEnabled
  **/
  @ApiModelProperty(value = "是否启用可视化编辑, show_detail为false时独有")
  public Boolean isGraphEditorEnabled() {
    return graphEditorEnabled;
  }

  public void setGraphEditorEnabled(Boolean graphEditorEnabled) {
    this.graphEditorEnabled = graphEditorEnabled;
  }

  public FlinkJobEntity hasSavepoint(Boolean hasSavepoint) {
    this.hasSavepoint = hasSavepoint;
    return this;
  }

   /**
   * 是否有保存点, show_detail为false时独有
   * @return hasSavepoint
  **/
  @ApiModelProperty(value = "是否有保存点, show_detail为false时独有")
  public Boolean isHasSavepoint() {
    return hasSavepoint;
  }

  public void setHasSavepoint(Boolean hasSavepoint) {
    this.hasSavepoint = hasSavepoint;
  }

  public FlinkJobEntity userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 作业所属用户标识, show_detail为true时独有
   * @return userId
  **/
  @ApiModelProperty(value = "作业所属用户标识, show_detail为true时独有")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public FlinkJobEntity projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 作业所属项目标识, show_detail为true时独有
   * @return projectId
  **/
  @ApiModelProperty(value = "作业所属项目标识, show_detail为true时独有")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public FlinkJobEntity sqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
    return this;
  }

   /**
   * Stream SQL语句, show_detail为true时独有
   * @return sqlBody
  **/
  @ApiModelProperty(example = "select * from source_table", value = "Stream SQL语句, show_detail为true时独有")
  public String getSqlBody() {
    return sqlBody;
  }

  public void setSqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
  }

  public FlinkJobEntity runMode(RunModeEnum runMode) {
    this.runMode = runMode;
    return this;
  }

   /**
   * 作业运行模式，共享或者独享模式或者边缘节点, show_detail为true时独有
   * @return runMode
  **/
  @ApiModelProperty(example = "shared_cluster", value = "作业运行模式，共享或者独享模式或者边缘节点, show_detail为true时独有")
  public RunModeEnum getRunMode() {
    return runMode;
  }

  public void setRunMode(RunModeEnum runMode) {
    this.runMode = runMode;
  }

  public FlinkJobEntity jobConfig(FlinkJobConfig jobConfig) {
    this.jobConfig = jobConfig;
    return this;
  }

   /**
   * 作业配置信息, show_detail为true时独有
   * @return jobConfig
  **/
  @ApiModelProperty(value = "作业配置信息, show_detail为true时独有")
  public FlinkJobConfig getJobConfig() {
    return jobConfig;
  }

  public void setJobConfig(FlinkJobConfig jobConfig) {
    this.jobConfig = jobConfig;
  }

  public FlinkJobEntity mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

   /**
   * checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径, show_detail为true时独有
   * @return mainClass
  **/
  @ApiModelProperty(value = "checkpoint_enabled==true是, 用户授权保存快照的OBS路径, show_detail为true时独有")
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public FlinkJobEntity entrypointArgs(String entrypointArgs) {
    this.entrypointArgs = entrypointArgs;
    return this;
  }

   /**
   * jar包作业运行参数, show_detail为true时独有
   * @return entrypointArgs
  **/
  @ApiModelProperty(value = "jar包作业运行参数, show_detail为true时独有")
  public String getEntrypointArgs() {
    return entrypointArgs;
  }

  public void setEntrypointArgs(String entrypointArgs) {
    this.entrypointArgs = entrypointArgs;
  }

  public FlinkJobEntity savepointPath(String savepointPath) {
    this.savepointPath = savepointPath;
    return this;
  }

   /**
   * show_detail为true时独有
   * @return savepointPath
  **/
  @ApiModelProperty(value = "show_detail为true时独有")
  public String getSavepointPath() {
    return savepointPath;
  }

  public void setSavepointPath(String savepointPath) {
    this.savepointPath = savepointPath;
  }

  public FlinkJobEntity executionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
    return this;
  }

   /**
   * 作业执行计划, show_detail为true时独有
   * @return executionGraph
  **/
  @ApiModelProperty(value = "作业执行计划, show_detail为true时独有")
  public String getExecutionGraph() {
    return executionGraph;
  }

  public void setExecutionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
  }

  public FlinkJobEntity updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 作业更新时间, show_detail为true时独有
   * @return updateTime
  **/
  @ApiModelProperty(value = "作业更新时间, show_detail为true时独有")
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
    FlinkJobEntity flinkJobEntity = (FlinkJobEntity) o;
    return Objects.equals(this.jobId, flinkJobEntity.jobId) &&
        Objects.equals(this.name, flinkJobEntity.name) &&
        Objects.equals(this.desc, flinkJobEntity.desc) &&
        Objects.equals(this.userName, flinkJobEntity.userName) &&
        Objects.equals(this.queueName, flinkJobEntity.queueName) &&
        Objects.equals(this.jobType, flinkJobEntity.jobType) &&
        Objects.equals(this.status, flinkJobEntity.status) &&
        Objects.equals(this.statusDesc, flinkJobEntity.statusDesc) &&
        Objects.equals(this.createTime, flinkJobEntity.createTime) &&
        Objects.equals(this.startTime, flinkJobEntity.startTime) &&
        Objects.equals(this.duration, flinkJobEntity.duration) &&
        Objects.equals(this.rootId, flinkJobEntity.rootId) &&
        Objects.equals(this.graphEditorEnabled, flinkJobEntity.graphEditorEnabled) &&
        Objects.equals(this.hasSavepoint, flinkJobEntity.hasSavepoint) &&
        Objects.equals(this.userId, flinkJobEntity.userId) &&
        Objects.equals(this.projectId, flinkJobEntity.projectId) &&
        Objects.equals(this.sqlBody, flinkJobEntity.sqlBody) &&
        Objects.equals(this.runMode, flinkJobEntity.runMode) &&
        Objects.equals(this.jobConfig, flinkJobEntity.jobConfig) &&
        Objects.equals(this.mainClass, flinkJobEntity.mainClass) &&
        Objects.equals(this.entrypointArgs, flinkJobEntity.entrypointArgs) &&
        Objects.equals(this.savepointPath, flinkJobEntity.savepointPath) &&
        Objects.equals(this.executionGraph, flinkJobEntity.executionGraph) &&
        Objects.equals(this.updateTime, flinkJobEntity.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, name, desc, userName, queueName, jobType, status, statusDesc, createTime, startTime, duration, rootId, graphEditorEnabled, hasSavepoint, userId, projectId, sqlBody, runMode, jobConfig, mainClass, entrypointArgs, savepointPath, executionGraph, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlinkJobEntity {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    graphEditorEnabled: ").append(toIndentedString(graphEditorEnabled)).append("\n");
    sb.append("    hasSavepoint: ").append(toIndentedString(hasSavepoint)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
    sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
    sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    entrypointArgs: ").append(toIndentedString(entrypointArgs)).append("\n");
    sb.append("    savepointPath: ").append(toIndentedString(savepointPath)).append("\n");
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

