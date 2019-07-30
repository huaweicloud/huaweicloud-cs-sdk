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
 * 作业配置, show_detail为true时独有
 */
@ApiModel(description = "作业配置, show_detail为true时独有")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T10:07:58.610+08:00")
public class JobConfig {
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
  private String edgeGroupIds = null;

  @SerializedName("manager_spu")
  private Integer managerSpu = null;

  @SerializedName("spu_number")
  private Integer spuNumber = null;

  @SerializedName("parallel_number")
  private Integer parallelNumber = null;

  public JobConfig checkpointEnabled(Boolean checkpointEnabled) {
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

  public JobConfig checkpointMode(CheckpointModeEnum checkpointMode) {
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

  public JobConfig checkpointInterval(Integer checkpointInterval) {
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

  public JobConfig logEnabled(Boolean logEnabled) {
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

  public JobConfig obsBucket(String obsBucket) {
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

  public JobConfig smnTopic(String smnTopic) {
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

  public JobConfig rootId(Long rootId) {
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

  public JobConfig edgeGroupIds(String edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
    return this;
  }

   /**
   * 边缘计算组ID列表, 多个ID以逗号分隔
   * @return edgeGroupIds
  **/
  @ApiModelProperty(value = "边缘计算组ID列表, 多个ID以逗号分隔")
  public String getEdgeGroupIds() {
    return edgeGroupIds;
  }

  public void setEdgeGroupIds(String edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
  }

  public JobConfig managerSpu(Integer managerSpu) {
    this.managerSpu = managerSpu;
    return this;
  }

   /**
   * 管理单元SPU数
   * @return managerSpu
  **/
  @ApiModelProperty(value = "管理单元SPU数")
  public Integer getManagerSpu() {
    return managerSpu;
  }

  public void setManagerSpu(Integer managerSpu) {
    this.managerSpu = managerSpu;
  }

  public JobConfig spuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
    return this;
  }

   /**
   * 用户为作业选择的SPU数量, show_detail为true时独有
   * minimum: 2
   * maximum: 400
   * @return spuNumber
  **/
  @ApiModelProperty(value = "用户为作业选择的SPU数量, show_detail为true时独有")
  public Integer getSpuNumber() {
    return spuNumber;
  }

  public void setSpuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
  }

  public JobConfig parallelNumber(Integer parallelNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobConfig jobConfig = (JobConfig) o;
    return Objects.equals(this.checkpointEnabled, jobConfig.checkpointEnabled) &&
        Objects.equals(this.checkpointMode, jobConfig.checkpointMode) &&
        Objects.equals(this.checkpointInterval, jobConfig.checkpointInterval) &&
        Objects.equals(this.logEnabled, jobConfig.logEnabled) &&
        Objects.equals(this.obsBucket, jobConfig.obsBucket) &&
        Objects.equals(this.smnTopic, jobConfig.smnTopic) &&
        Objects.equals(this.rootId, jobConfig.rootId) &&
        Objects.equals(this.edgeGroupIds, jobConfig.edgeGroupIds) &&
        Objects.equals(this.managerSpu, jobConfig.managerSpu) &&
        Objects.equals(this.spuNumber, jobConfig.spuNumber) &&
        Objects.equals(this.parallelNumber, jobConfig.parallelNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkpointEnabled, checkpointMode, checkpointInterval, logEnabled, obsBucket, smnTopic, rootId, edgeGroupIds, managerSpu, spuNumber, parallelNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfig {\n");
    
    sb.append("    checkpointEnabled: ").append(toIndentedString(checkpointEnabled)).append("\n");
    sb.append("    checkpointMode: ").append(toIndentedString(checkpointMode)).append("\n");
    sb.append("    checkpointInterval: ").append(toIndentedString(checkpointInterval)).append("\n");
    sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
    sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
    sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
    sb.append("    managerSpu: ").append(toIndentedString(managerSpu)).append("\n");
    sb.append("    spuNumber: ").append(toIndentedString(spuNumber)).append("\n");
    sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
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

