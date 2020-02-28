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
import java.util.ArrayList;
import java.util.List;

/**
 * 作业配置, show_detail为true时独有
 */
@ApiModel(description = "作业配置, show_detail为true时独有")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-28T09:45:31.014+08:00")
public class FlinkJobConfig {
  @SerializedName("checkpoint_enabled")
  private Boolean checkpointEnabled = null;

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
  private Integer checkpointInterval = null;

  @SerializedName("log_enabled")
  private Boolean logEnabled = null;

  @SerializedName("obs_bucket")
  private String obsBucket = null;

  @SerializedName("smn_topic")
  private String smnTopic = null;

  @SerializedName("root_id")
  private Long rootId = null;

  @SerializedName("edge_group_ids")
  private List<String> edgeGroupIds = null;

  @SerializedName("graph_editor_enabled")
  private Boolean graphEditorEnabled = null;

  @SerializedName("graph_editor_data")
  private String graphEditorData = null;

  @SerializedName("manager_cu_number")
  private Integer managerCuNumber = null;

  @SerializedName("executor_number")
  private Integer executorNumber = null;

  @SerializedName("executor_cu_number")
  private Integer executorCuNumber = null;

  @SerializedName("cu_number")
  private Integer cuNumber = null;

  @SerializedName("parallel_number")
  private Integer parallelNumber = null;

  @SerializedName("restart_when_exception")
  private Boolean restartWhenException = null;

  @SerializedName("idle_state_retention")
  private Integer idleStateRetention = null;

  @SerializedName("config_url")
  private String configUrl = null;

  @SerializedName("udf_jar_url")
  private String udfJarUrl = null;

  @SerializedName("entrypoint")
  private String entrypoint = null;

  @SerializedName("dependency_jars")
  private List<String> dependencyJars = null;

  @SerializedName("dependency_files")
  private List<String> dependencyFiles = null;

  public FlinkJobConfig checkpointEnabled(Boolean checkpointEnabled) {
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

  public FlinkJobConfig checkpointMode(CheckpointModeEnum checkpointMode) {
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

  public FlinkJobConfig checkpointInterval(Integer checkpointInterval) {
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

  public FlinkJobConfig logEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
    return this;
  }

   /**
   * 是否启用日志存储
   * @return logEnabled
  **/
  @ApiModelProperty(value = "是否启用日志存储")
  public Boolean isLogEnabled() {
    return logEnabled;
  }

  public void setLogEnabled(Boolean logEnabled) {
    this.logEnabled = logEnabled;
  }

  public FlinkJobConfig obsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
    return this;
  }

   /**
   * OBS桶名
   * @return obsBucket
  **/
  @ApiModelProperty(value = "OBS桶名")
  public String getObsBucket() {
    return obsBucket;
  }

  public void setObsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
  }

  public FlinkJobConfig smnTopic(String smnTopic) {
    this.smnTopic = smnTopic;
    return this;
  }

   /**
   * SMN主题名
   * @return smnTopic
  **/
  @ApiModelProperty(value = "SMN主题名")
  public String getSmnTopic() {
    return smnTopic;
  }

  public void setSmnTopic(String smnTopic) {
    this.smnTopic = smnTopic;
  }

  public FlinkJobConfig rootId(Long rootId) {
    this.rootId = rootId;
    return this;
  }

   /**
   * 父作业ID
   * @return rootId
  **/
  @ApiModelProperty(value = "父作业ID")
  public Long getRootId() {
    return rootId;
  }

  public void setRootId(Long rootId) {
    this.rootId = rootId;
  }

  public FlinkJobConfig edgeGroupIds(List<String> edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
    return this;
  }

  public FlinkJobConfig addEdgeGroupIdsItem(String edgeGroupIdsItem) {
    if (this.edgeGroupIds == null) {
      this.edgeGroupIds = new ArrayList<String>();
    }
    this.edgeGroupIds.add(edgeGroupIdsItem);
    return this;
  }

   /**
   * 边缘计算组ID列表, 多个ID以逗号分隔
   * @return edgeGroupIds
  **/
  @ApiModelProperty(value = "边缘计算组ID列表, 多个ID以逗号分隔")
  public List<String> getEdgeGroupIds() {
    return edgeGroupIds;
  }

  public void setEdgeGroupIds(List<String> edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
  }

  public FlinkJobConfig graphEditorEnabled(Boolean graphEditorEnabled) {
    this.graphEditorEnabled = graphEditorEnabled;
    return this;
  }

   /**
   * 是否启用可视化编辑
   * @return graphEditorEnabled
  **/
  @ApiModelProperty(value = "是否启用可视化编辑")
  public Boolean isGraphEditorEnabled() {
    return graphEditorEnabled;
  }

  public void setGraphEditorEnabled(Boolean graphEditorEnabled) {
    this.graphEditorEnabled = graphEditorEnabled;
  }

  public FlinkJobConfig graphEditorData(String graphEditorData) {
    this.graphEditorData = graphEditorData;
    return this;
  }

   /**
   * 可视化编辑数据
   * @return graphEditorData
  **/
  @ApiModelProperty(value = "可视化编辑数据")
  public String getGraphEditorData() {
    return graphEditorData;
  }

  public void setGraphEditorData(String graphEditorData) {
    this.graphEditorData = graphEditorData;
  }

  public FlinkJobConfig managerCuNumber(Integer managerCuNumber) {
    this.managerCuNumber = managerCuNumber;
    return this;
  }

   /**
   * 管理单元CU数
   * @return managerCuNumber
  **/
  @ApiModelProperty(value = "管理单元CU数")
  public Integer getManagerCuNumber() {
    return managerCuNumber;
  }

  public void setManagerCuNumber(Integer managerCuNumber) {
    this.managerCuNumber = managerCuNumber;
  }

  public FlinkJobConfig executorNumber(Integer executorNumber) {
    this.executorNumber = executorNumber;
    return this;
  }

   /**
   * 作业使用计算节点个数
   * @return executorNumber
  **/
  @ApiModelProperty(value = "作业使用计算节点个数")
  public Integer getExecutorNumber() {
    return executorNumber;
  }

  public void setExecutorNumber(Integer executorNumber) {
    this.executorNumber = executorNumber;
  }

  public FlinkJobConfig executorCuNumber(Integer executorCuNumber) {
    this.executorCuNumber = executorCuNumber;
    return this;
  }

   /**
   * 计算节点cu数
   * @return executorCuNumber
  **/
  @ApiModelProperty(value = "计算节点cu数")
  public Integer getExecutorCuNumber() {
    return executorCuNumber;
  }

  public void setExecutorCuNumber(Integer executorCuNumber) {
    this.executorCuNumber = executorCuNumber;
  }

  public FlinkJobConfig cuNumber(Integer cuNumber) {
    this.cuNumber = cuNumber;
    return this;
  }

   /**
   * 用户为作业选择的CU数量, show_detail为true时独有
   * minimum: 2
   * maximum: 400
   * @return cuNumber
  **/
  @ApiModelProperty(value = "用户为作业选择的CU数量, show_detail为true时独有")
  public Integer getCuNumber() {
    return cuNumber;
  }

  public void setCuNumber(Integer cuNumber) {
    this.cuNumber = cuNumber;
  }

  public FlinkJobConfig parallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
    return this;
  }

   /**
   * 用户设置的作业并行数, show_detail为true时独有
   * minimum: 1
   * maximum: 2000
   * @return parallelNumber
  **/
  @ApiModelProperty(value = "用户设置的作业并行数, show_detail为true时独有")
  public Integer getParallelNumber() {
    return parallelNumber;
  }

  public void setParallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
  }

  public FlinkJobConfig restartWhenException(Boolean restartWhenException) {
    this.restartWhenException = restartWhenException;
    return this;
  }

   /**
   * 是否异常重启
   * @return restartWhenException
  **/
  @ApiModelProperty(value = "是否异常重启")
  public Boolean isRestartWhenException() {
    return restartWhenException;
  }

  public void setRestartWhenException(Boolean restartWhenException) {
    this.restartWhenException = restartWhenException;
  }

  public FlinkJobConfig idleStateRetention(Integer idleStateRetention) {
    this.idleStateRetention = idleStateRetention;
    return this;
  }

   /**
   * 空闲状态保留时间
   * @return idleStateRetention
  **/
  @ApiModelProperty(value = "空闲状态保留时间")
  public Integer getIdleStateRetention() {
    return idleStateRetention;
  }

  public void setIdleStateRetention(Integer idleStateRetention) {
    this.idleStateRetention = idleStateRetention;
  }

  public FlinkJobConfig configUrl(String configUrl) {
    this.configUrl = configUrl;
    return this;
  }

   /**
   * 用户上传的配置文件的OBS路径
   * @return configUrl
  **/
  @ApiModelProperty(value = "用户上传的配置文件的OBS路径")
  public String getConfigUrl() {
    return configUrl;
  }

  public void setConfigUrl(String configUrl) {
    this.configUrl = configUrl;
  }

  public FlinkJobConfig udfJarUrl(String udfJarUrl) {
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

  public FlinkJobConfig entrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

   /**
   * 
   * @return entrypoint
  **/
  @ApiModelProperty(value = "")
  public String getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }

  public FlinkJobConfig dependencyJars(List<String> dependencyJars) {
    this.dependencyJars = dependencyJars;
    return this;
  }

  public FlinkJobConfig addDependencyJarsItem(String dependencyJarsItem) {
    if (this.dependencyJars == null) {
      this.dependencyJars = new ArrayList<String>();
    }
    this.dependencyJars.add(dependencyJarsItem);
    return this;
  }

   /**
   * 依赖jar资源包列表
   * @return dependencyJars
  **/
  @ApiModelProperty(value = "依赖jar资源包列表")
  public List<String> getDependencyJars() {
    return dependencyJars;
  }

  public void setDependencyJars(List<String> dependencyJars) {
    this.dependencyJars = dependencyJars;
  }

  public FlinkJobConfig dependencyFiles(List<String> dependencyFiles) {
    this.dependencyFiles = dependencyFiles;
    return this;
  }

  public FlinkJobConfig addDependencyFilesItem(String dependencyFilesItem) {
    if (this.dependencyFiles == null) {
      this.dependencyFiles = new ArrayList<String>();
    }
    this.dependencyFiles.add(dependencyFilesItem);
    return this;
  }

   /**
   * 依赖文件资源包列表
   * @return dependencyFiles
  **/
  @ApiModelProperty(value = "依赖文件资源包列表")
  public List<String> getDependencyFiles() {
    return dependencyFiles;
  }

  public void setDependencyFiles(List<String> dependencyFiles) {
    this.dependencyFiles = dependencyFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlinkJobConfig flinkJobConfig = (FlinkJobConfig) o;
    return Objects.equals(this.checkpointEnabled, flinkJobConfig.checkpointEnabled) &&
        Objects.equals(this.checkpointMode, flinkJobConfig.checkpointMode) &&
        Objects.equals(this.checkpointInterval, flinkJobConfig.checkpointInterval) &&
        Objects.equals(this.logEnabled, flinkJobConfig.logEnabled) &&
        Objects.equals(this.obsBucket, flinkJobConfig.obsBucket) &&
        Objects.equals(this.smnTopic, flinkJobConfig.smnTopic) &&
        Objects.equals(this.rootId, flinkJobConfig.rootId) &&
        Objects.equals(this.edgeGroupIds, flinkJobConfig.edgeGroupIds) &&
        Objects.equals(this.graphEditorEnabled, flinkJobConfig.graphEditorEnabled) &&
        Objects.equals(this.graphEditorData, flinkJobConfig.graphEditorData) &&
        Objects.equals(this.managerCuNumber, flinkJobConfig.managerCuNumber) &&
        Objects.equals(this.executorNumber, flinkJobConfig.executorNumber) &&
        Objects.equals(this.executorCuNumber, flinkJobConfig.executorCuNumber) &&
        Objects.equals(this.cuNumber, flinkJobConfig.cuNumber) &&
        Objects.equals(this.parallelNumber, flinkJobConfig.parallelNumber) &&
        Objects.equals(this.restartWhenException, flinkJobConfig.restartWhenException) &&
        Objects.equals(this.idleStateRetention, flinkJobConfig.idleStateRetention) &&
        Objects.equals(this.configUrl, flinkJobConfig.configUrl) &&
        Objects.equals(this.udfJarUrl, flinkJobConfig.udfJarUrl) &&
        Objects.equals(this.entrypoint, flinkJobConfig.entrypoint) &&
        Objects.equals(this.dependencyJars, flinkJobConfig.dependencyJars) &&
        Objects.equals(this.dependencyFiles, flinkJobConfig.dependencyFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkpointEnabled, checkpointMode, checkpointInterval, logEnabled, obsBucket, smnTopic, rootId, edgeGroupIds, graphEditorEnabled, graphEditorData, managerCuNumber, executorNumber, executorCuNumber, cuNumber, parallelNumber, restartWhenException, idleStateRetention, configUrl, udfJarUrl, entrypoint, dependencyJars, dependencyFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlinkJobConfig {\n");
    
    sb.append("    checkpointEnabled: ").append(toIndentedString(checkpointEnabled)).append("\n");
    sb.append("    checkpointMode: ").append(toIndentedString(checkpointMode)).append("\n");
    sb.append("    checkpointInterval: ").append(toIndentedString(checkpointInterval)).append("\n");
    sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
    sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
    sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
    sb.append("    graphEditorEnabled: ").append(toIndentedString(graphEditorEnabled)).append("\n");
    sb.append("    graphEditorData: ").append(toIndentedString(graphEditorData)).append("\n");
    sb.append("    managerCuNumber: ").append(toIndentedString(managerCuNumber)).append("\n");
    sb.append("    executorNumber: ").append(toIndentedString(executorNumber)).append("\n");
    sb.append("    executorCuNumber: ").append(toIndentedString(executorCuNumber)).append("\n");
    sb.append("    cuNumber: ").append(toIndentedString(cuNumber)).append("\n");
    sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
    sb.append("    restartWhenException: ").append(toIndentedString(restartWhenException)).append("\n");
    sb.append("    idleStateRetention: ").append(toIndentedString(idleStateRetention)).append("\n");
    sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
    sb.append("    udfJarUrl: ").append(toIndentedString(udfJarUrl)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
    sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
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

