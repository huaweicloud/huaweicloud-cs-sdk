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
 * UpdateSqlJobRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-02T13:59:14.712+08:00")
public class UpdateSqlJobRequest {
  @SerializedName("job_id")
  private Long jobId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

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
  private Boolean checkpointEnabled = true;

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

  @SerializedName("restart_when_exception")
  private Boolean restartWhenException = false;

  @SerializedName("idle_state_retention")
  private Integer idleStateRetention = 3600;

  @SerializedName("edge_group_ids")
  private String edgeGroupIds = null;

  @SerializedName("sys_enterprise_project_id")
  private String sysEnterpriseProjectId = null;

  @SerializedName("udf_jar_url")
  private String udfJarUrl = null;

  @SerializedName("dirty_data_strategy")
  private String dirtyDataStrategy = null;

  public UpdateSqlJobRequest jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * 作业ID
   * @return jobId
  **/
  @ApiModelProperty(example = "100000", required = true, value = "作业ID")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public UpdateSqlJobRequest name(String name) {
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

  public UpdateSqlJobRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 作业描述
   * @return desc
  **/
  @ApiModelProperty(example = "这是我的第一个作业", value = "作业描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public UpdateSqlJobRequest clusterId(Integer clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * 独享集群资源ID, 当前用户有该独享资源的使用权限
   * @return clusterId
  **/
  @ApiModelProperty(example = "100000", value = "独享集群资源ID, 当前用户有该独享资源的使用权限")
  public Integer getClusterId() {
    return clusterId;
  }

  public void setClusterId(Integer clusterId) {
    this.clusterId = clusterId;
  }

  public UpdateSqlJobRequest sqlBody(String sqlBody) {
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

  public UpdateSqlJobRequest runMode(RunModeEnum runMode) {
    this.runMode = runMode;
    return this;
  }

   /**
   * 作业运行模式，共享或者独享或者边缘节点
   * @return runMode
  **/
  @ApiModelProperty(example = "shared_cluster", value = "作业运行模式，共享或者独享或者边缘节点")
  public RunModeEnum getRunMode() {
    return runMode;
  }

  public void setRunMode(RunModeEnum runMode) {
    this.runMode = runMode;
  }

  public UpdateSqlJobRequest spuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
    return this;
  }

   /**
   * 用户为作业选择的SPU数量
   * minimum: 2
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

  public UpdateSqlJobRequest parallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
    return this;
  }

   /**
   * 用户设置的作业并行数
   * minimum: 1
   * maximum: 2000
   * @return parallelNumber
  **/
  @ApiModelProperty(value = "用户设置的作业并行数")
  public Integer getParallelNumber() {
    return parallelNumber;
  }

  public void setParallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
  }

  public UpdateSqlJobRequest checkpointEnabled(Boolean checkpointEnabled) {
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

  public UpdateSqlJobRequest checkpointMode(CheckpointModeEnum checkpointMode) {
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

  public UpdateSqlJobRequest checkpointInterval(Integer checkpointInterval) {
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

  public UpdateSqlJobRequest obsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
    return this;
  }

   /**
   * checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径
   * @return obsBucket
  **/
  @ApiModelProperty(value = "checkpoint_enabled==true是, 用户授权保存快照的OBS路径")
  public String getObsBucket() {
    return obsBucket;
  }

  public void setObsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
  }

  public UpdateSqlJobRequest logEnabled(Boolean logEnabled) {
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

  public UpdateSqlJobRequest smnTopic(String smnTopic) {
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

  public UpdateSqlJobRequest restartWhenException(Boolean restartWhenException) {
    this.restartWhenException = restartWhenException;
    return this;
  }

   /**
   * 是否开启异常重启功能
   * @return restartWhenException
  **/
  @ApiModelProperty(value = "是否开启异常重启功能")
  public Boolean isRestartWhenException() {
    return restartWhenException;
  }

  public void setRestartWhenException(Boolean restartWhenException) {
    this.restartWhenException = restartWhenException;
  }

  public UpdateSqlJobRequest idleStateRetention(Integer idleStateRetention) {
    this.idleStateRetention = idleStateRetention;
    return this;
  }

   /**
   * 空闲状态最长保留时间，超过该时间没有进行更新的中间状态会被删除，单位为秒
   * @return idleStateRetention
  **/
  @ApiModelProperty(value = "空闲状态最长保留时间，超过该时间没有进行更新的中间状态会被删除，单位为秒")
  public Integer getIdleStateRetention() {
    return idleStateRetention;
  }

  public void setIdleStateRetention(Integer idleStateRetention) {
    this.idleStateRetention = idleStateRetention;
  }

  public UpdateSqlJobRequest edgeGroupIds(String edgeGroupIds) {
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

  public UpdateSqlJobRequest sysEnterpriseProjectId(String sysEnterpriseProjectId) {
    this.sysEnterpriseProjectId = sysEnterpriseProjectId;
    return this;
  }

   /**
   * 作业所属的企业项目id
   * @return sysEnterpriseProjectId
  **/
  @ApiModelProperty(value = "作业所属的企业项目id")
  public String getSysEnterpriseProjectId() {
    return sysEnterpriseProjectId;
  }

  public void setSysEnterpriseProjectId(String sysEnterpriseProjectId) {
    this.sysEnterpriseProjectId = sysEnterpriseProjectId;
  }

  public UpdateSqlJobRequest udfJarUrl(String udfJarUrl) {
    this.udfJarUrl = udfJarUrl;
    return this;
  }

   /**
   * sql作业udf jar所在的obs地址
   * @return udfJarUrl
  **/
  @ApiModelProperty(value = "sql作业udf jar所在的obs地址")
  public String getUdfJarUrl() {
    return udfJarUrl;
  }

  public void setUdfJarUrl(String udfJarUrl) {
    this.udfJarUrl = udfJarUrl;
  }

  public UpdateSqlJobRequest dirtyDataStrategy(String dirtyDataStrategy) {
    this.dirtyDataStrategy = dirtyDataStrategy;
    return this;
  }

   /**
   * 作业脏数据策略
   * @return dirtyDataStrategy
  **/
  @ApiModelProperty(value = "作业脏数据策略")
  public String getDirtyDataStrategy() {
    return dirtyDataStrategy;
  }

  public void setDirtyDataStrategy(String dirtyDataStrategy) {
    this.dirtyDataStrategy = dirtyDataStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSqlJobRequest updateSqlJobRequest = (UpdateSqlJobRequest) o;
    return Objects.equals(this.jobId, updateSqlJobRequest.jobId) &&
        Objects.equals(this.name, updateSqlJobRequest.name) &&
        Objects.equals(this.desc, updateSqlJobRequest.desc) &&
        Objects.equals(this.clusterId, updateSqlJobRequest.clusterId) &&
        Objects.equals(this.sqlBody, updateSqlJobRequest.sqlBody) &&
        Objects.equals(this.runMode, updateSqlJobRequest.runMode) &&
        Objects.equals(this.spuNumber, updateSqlJobRequest.spuNumber) &&
        Objects.equals(this.parallelNumber, updateSqlJobRequest.parallelNumber) &&
        Objects.equals(this.checkpointEnabled, updateSqlJobRequest.checkpointEnabled) &&
        Objects.equals(this.checkpointMode, updateSqlJobRequest.checkpointMode) &&
        Objects.equals(this.checkpointInterval, updateSqlJobRequest.checkpointInterval) &&
        Objects.equals(this.obsBucket, updateSqlJobRequest.obsBucket) &&
        Objects.equals(this.logEnabled, updateSqlJobRequest.logEnabled) &&
        Objects.equals(this.smnTopic, updateSqlJobRequest.smnTopic) &&
        Objects.equals(this.restartWhenException, updateSqlJobRequest.restartWhenException) &&
        Objects.equals(this.idleStateRetention, updateSqlJobRequest.idleStateRetention) &&
        Objects.equals(this.edgeGroupIds, updateSqlJobRequest.edgeGroupIds) &&
        Objects.equals(this.sysEnterpriseProjectId, updateSqlJobRequest.sysEnterpriseProjectId) &&
        Objects.equals(this.udfJarUrl, updateSqlJobRequest.udfJarUrl) &&
        Objects.equals(this.dirtyDataStrategy, updateSqlJobRequest.dirtyDataStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, name, desc, clusterId, sqlBody, runMode, spuNumber, parallelNumber, checkpointEnabled, checkpointMode, checkpointInterval, obsBucket, logEnabled, smnTopic, restartWhenException, idleStateRetention, edgeGroupIds, sysEnterpriseProjectId, udfJarUrl, dirtyDataStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSqlJobRequest {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
    sb.append("    restartWhenException: ").append(toIndentedString(restartWhenException)).append("\n");
    sb.append("    idleStateRetention: ").append(toIndentedString(idleStateRetention)).append("\n");
    sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
    sb.append("    sysEnterpriseProjectId: ").append(toIndentedString(sysEnterpriseProjectId)).append("\n");
    sb.append("    udfJarUrl: ").append(toIndentedString(udfJarUrl)).append("\n");
    sb.append("    dirtyDataStrategy: ").append(toIndentedString(dirtyDataStrategy)).append("\n");
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

