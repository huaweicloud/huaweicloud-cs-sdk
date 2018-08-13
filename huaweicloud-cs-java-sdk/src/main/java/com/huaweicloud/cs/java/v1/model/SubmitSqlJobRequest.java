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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubmitSqlJobRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:00:00.393+08:00")
public class SubmitSqlJobRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("template_id")
  private Long templateId = null;

  @SerializedName("cluster_id")
  private Integer clusterId = null;

  @SerializedName("sql_body")
  private String sqlBody = null;

  /**
   * 作业运行模式，共享或者独享或者边缘节点
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

  @SerializedName("spu_number")
  private Integer spuNumber = null;

  @SerializedName("parallel_number")
  private Integer parallelNumber = null;

  @SerializedName("checkpoint_enabled")
  private Boolean checkpointEnabled = false;

  /**
   * 快照模式, 两种可选, exactly_once和at_least_once
   */
  @JsonAdapter(CheckpointModeEnum.Adapter.class)
  public enum CheckpointModeEnum {
    EXACTLY_ONCE("exactly_once"),
    
    AT_LEAST_ONCE("at_least_once");

    private String value;

    CheckpointModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CheckpointModeEnum fromValue(String text) {
      for (CheckpointModeEnum b : CheckpointModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CheckpointModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CheckpointModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CheckpointModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CheckpointModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("checkpoint_mode")
  private CheckpointModeEnum checkpointMode = null;

  @SerializedName("checkpoint_interval")
  private Integer checkpointInterval = 10;

  @SerializedName("obs_bucket")
  private String obsBucket = null;

  @SerializedName("log_enabled")
  private Boolean logEnabled = false;

  @SerializedName("smn_topic")
  private String smnTopic = null;

  /**
   * 作业类型, run_mode为edge_node时, 作业类型须为flink_sql_edge_job, run_mode为shared_cluster跟exclusive_cluster时, 作业类型须为flink_sql_job
   */
  @JsonAdapter(JobTypeEnum.Adapter.class)
  public enum JobTypeEnum {
    JOB("flink_sql_job"),
    
    EDGE_JOB("flink_sql_edge_job");

    private String value;

    JobTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JobTypeEnum fromValue(String text) {
      for (JobTypeEnum b : JobTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<JobTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JobTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JobTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return JobTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("job_type")
  private JobTypeEnum jobType = JobTypeEnum.JOB;

  @SerializedName("edge_group_ids")
  private String edgeGroupIds = null;

  public SubmitSqlJobRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 作业名称
   * @return name
  **/
  @ApiModelProperty(example = "my job", required = true, value = "作业名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubmitSqlJobRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 作业描述
   * @return desc
  **/
  @ApiModelProperty(example = "这是个做字符记数的作业", value = "作业描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SubmitSqlJobRequest templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * 作业模板ID, 如果template_id和sql_body都不为空, 优先sql_body; 如果template_id不空, sql_body为空, 以template_id内容填充sql_body
   * @return templateId
  **/
  @ApiModelProperty(example = "100000", value = "作业模板ID, 如果template_id和sql_body都不为空, 优先sql_body; 如果template_id不空, sql_body为空, 以template_id内容填充sql_body")
  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public SubmitSqlJobRequest clusterId(Integer clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * 独享集群资源ID, 前提是当前用户有该独享资源的使用权限
   * @return clusterId
  **/
  @ApiModelProperty(example = "100000", value = "独享集群资源ID, 前提是当前用户有该独享资源的使用权限")
  public Integer getClusterId() {
    return clusterId;
  }

  public void setClusterId(Integer clusterId) {
    this.clusterId = clusterId;
  }

  public SubmitSqlJobRequest sqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
    return this;
  }

   /**
   * Stream SQL语句, 至少包含source, query, sink三个部分
   * @return sqlBody
  **/
  @ApiModelProperty(example = "select * from source_table", value = "Stream SQL语句, 至少包含source, query, sink三个部分")
  public String getSqlBody() {
    return sqlBody;
  }

  public void setSqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
  }

  public SubmitSqlJobRequest runMode(RunModeEnum runMode) {
    this.runMode = runMode;
    return this;
  }

   /**
   * 作业运行模式，共享或者独享或者边缘节点
   * @return runMode
  **/
  @ApiModelProperty(example = "shared_cluster", required = true, value = "作业运行模式，共享或者独享或者边缘节点")
  public RunModeEnum getRunMode() {
    return runMode;
  }

  public void setRunMode(RunModeEnum runMode) {
    this.runMode = runMode;
  }

  public SubmitSqlJobRequest spuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
    return this;
  }

   /**
   * 用户为作业选择的SPU数量
   * minimum: 2
   * maximum: 400
   * @return spuNumber
  **/
  @ApiModelProperty(example = "5", value = "用户为作业选择的SPU数量")
  public Integer getSpuNumber() {
    return spuNumber;
  }

  public void setSpuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
  }

  public SubmitSqlJobRequest parallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
    return this;
  }

   /**
   * 用户设置的作业并行数
   * minimum: 1
   * maximum: 2000
   * @return parallelNumber
  **/
  @ApiModelProperty(example = "1", value = "用户设置的作业并行数")
  public Integer getParallelNumber() {
    return parallelNumber;
  }

  public void setParallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
  }

  public SubmitSqlJobRequest checkpointEnabled(Boolean checkpointEnabled) {
    this.checkpointEnabled = checkpointEnabled;
    return this;
  }

   /**
   * 是否开启作业自动快照功能, true开启, false关闭, 默认false
   * @return checkpointEnabled
  **/
  @ApiModelProperty(value = "是否开启作业自动快照功能, true开启, false关闭, 默认false")
  public Boolean isCheckpointEnabled() {
    return checkpointEnabled;
  }

  public void setCheckpointEnabled(Boolean checkpointEnabled) {
    this.checkpointEnabled = checkpointEnabled;
  }

  public SubmitSqlJobRequest checkpointMode(CheckpointModeEnum checkpointMode) {
    this.checkpointMode = checkpointMode;
    return this;
  }

   /**
   * 快照模式, 两种可选, exactly_once和at_least_once
   * @return checkpointMode
  **/
  @ApiModelProperty(example = "exactly_once", value = "快照模式, 两种可选, exactly_once和at_least_once")
  public CheckpointModeEnum getCheckpointMode() {
    return checkpointMode;
  }

  public void setCheckpointMode(CheckpointModeEnum checkpointMode) {
    this.checkpointMode = checkpointMode;
  }

  public SubmitSqlJobRequest checkpointInterval(Integer checkpointInterval) {
    this.checkpointInterval = checkpointInterval;
    return this;
  }

   /**
   * 快照时间间隔, 单位为秒
   * @return checkpointInterval
  **/
  @ApiModelProperty(value = "快照时间间隔, 单位为秒")
  public Integer getCheckpointInterval() {
    return checkpointInterval;
  }

  public void setCheckpointInterval(Integer checkpointInterval) {
    this.checkpointInterval = checkpointInterval;
  }

  public SubmitSqlJobRequest obsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
    return this;
  }

   /**
   * checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径
   * @return obsBucket
  **/
  @ApiModelProperty(example = "my_obs_bucket", value = "checkpoint_enabled==true是, 用户授权保存快照的OBS路径")
  public String getObsBucket() {
    return obsBucket;
  }

  public void setObsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
  }

  public SubmitSqlJobRequest logEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
    return this;
  }

   /**
   * 是否开启作业的日志上传到用户的OBS功能
   * @return logEnabled
  **/
  @ApiModelProperty(value = "是否开启作业的日志上传到用户的OBS功能")
  public Boolean isLogEnabled() {
    return logEnabled;
  }

  public void setLogEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
  }

  public SubmitSqlJobRequest smnTopic(String smnTopic) {
    this.smnTopic = smnTopic;
    return this;
  }

   /**
   * 当作业异常时，向该SMN主题推送告警信息
   * @return smnTopic
  **/
  @ApiModelProperty(example = "cs_job_exception", value = "当作业异常时，向该SMN主题推送告警信息")
  public String getSmnTopic() {
    return smnTopic;
  }

  public void setSmnTopic(String smnTopic) {
    this.smnTopic = smnTopic;
  }

  public SubmitSqlJobRequest jobType(JobTypeEnum jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * 作业类型, run_mode为edge_node时, 作业类型须为flink_sql_edge_job, run_mode为shared_cluster跟exclusive_cluster时, 作业类型须为flink_sql_job
   * @return jobType
  **/
  @ApiModelProperty(value = "作业类型, run_mode为edge_node时, 作业类型须为flink_sql_edge_job, run_mode为shared_cluster跟exclusive_cluster时, 作业类型须为flink_sql_job")
  public JobTypeEnum getJobType() {
    return jobType;
  }

  public void setJobType(JobTypeEnum jobType) {
    this.jobType = jobType;
  }

  public SubmitSqlJobRequest edgeGroupIds(String edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
    return this;
  }

   /**
   * 边缘计算组ID列表, 多个ID以逗号分隔
   * @return edgeGroupIds
  **/
  @ApiModelProperty(example = "62de1e1c-066e-48a8-a79d-f461a31b2ee1,2eb00f85-99f2-4144-bcb7-d39ff47f9002", value = "边缘计算组ID列表, 多个ID以逗号分隔")
  public String getEdgeGroupIds() {
    return edgeGroupIds;
  }

  public void setEdgeGroupIds(String edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSqlJobRequest submitSqlJobRequest = (SubmitSqlJobRequest) o;
    return Objects.equals(this.name, submitSqlJobRequest.name) &&
        Objects.equals(this.desc, submitSqlJobRequest.desc) &&
        Objects.equals(this.templateId, submitSqlJobRequest.templateId) &&
        Objects.equals(this.clusterId, submitSqlJobRequest.clusterId) &&
        Objects.equals(this.sqlBody, submitSqlJobRequest.sqlBody) &&
        Objects.equals(this.runMode, submitSqlJobRequest.runMode) &&
        Objects.equals(this.spuNumber, submitSqlJobRequest.spuNumber) &&
        Objects.equals(this.parallelNumber, submitSqlJobRequest.parallelNumber) &&
        Objects.equals(this.checkpointEnabled, submitSqlJobRequest.checkpointEnabled) &&
        Objects.equals(this.checkpointMode, submitSqlJobRequest.checkpointMode) &&
        Objects.equals(this.checkpointInterval, submitSqlJobRequest.checkpointInterval) &&
        Objects.equals(this.obsBucket, submitSqlJobRequest.obsBucket) &&
        Objects.equals(this.logEnabled, submitSqlJobRequest.logEnabled) &&
        Objects.equals(this.smnTopic, submitSqlJobRequest.smnTopic) &&
        Objects.equals(this.jobType, submitSqlJobRequest.jobType) &&
        Objects.equals(this.edgeGroupIds, submitSqlJobRequest.edgeGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc, templateId, clusterId, sqlBody, runMode, spuNumber, parallelNumber, checkpointEnabled, checkpointMode, checkpointInterval, obsBucket, logEnabled, smnTopic, jobType, edgeGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSqlJobRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
    sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
    sb.append("    spuNumber: ").append(toIndentedString(spuNumber)).append("\n");
    sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
    sb.append("    checkpointEnabled: ").append(toIndentedString(checkpointEnabled)).append("\n");
    sb.append("    checkpointMode: ").append(toIndentedString(checkpointMode)).append("\n");
    sb.append("    checkpointInterval: ").append(toIndentedString(checkpointInterval)).append("\n");
    sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
    sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
    sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
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

