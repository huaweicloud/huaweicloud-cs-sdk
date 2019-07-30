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
 * UpdateJarJobRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-29T22:02:11.944+08:00")
public class UpdateJarJobRequest {
  @SerializedName("job_id")
  private Long jobId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("cluster_id")
  private Integer clusterId = null;

  @SerializedName("spu_number")
  private Integer spuNumber = null;

  @SerializedName("manager_spu")
  private Integer managerSpu = null;

  @SerializedName("parallel_number")
  private Integer parallelNumber = null;

  @SerializedName("executor_number")
  private Integer executorNumber = null;

  @SerializedName("executor_spu")
  private Integer executorSpu = null;

  @SerializedName("obs_bucket")
  private String obsBucket = null;

  @SerializedName("log_enabled")
  private Boolean logEnabled = null;

  @SerializedName("smn_topic")
  private String smnTopic = null;

  @SerializedName("jar_url")
  private String jarUrl = null;

  @SerializedName("config_url")
  private String configUrl = null;

  @SerializedName("main_class")
  private String mainClass = null;

  @SerializedName("args")
  private String args = null;

  @SerializedName("restart_when_exception")
  private Boolean restartWhenException = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("sys_enterprise_project_id")
  private String sysEnterpriseProjectId = null;

  public UpdateJarJobRequest jobId(Long jobId) {
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

  public UpdateJarJobRequest name(String name) {
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

  public UpdateJarJobRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 作业描述
   * @return desc
  **/
  @ApiModelProperty(example = "作业描述", value = "作业描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public UpdateJarJobRequest clusterId(Integer clusterId) {
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

  public UpdateJarJobRequest spuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
    return this;
  }

   /**
   * 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置
   * minimum: 2
   * maximum: 400
   * @return spuNumber
  **/
  @ApiModelProperty(example = "5", value = "用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置")
  public Integer getSpuNumber() {
    return spuNumber;
  }

  public void setSpuNumber(Integer spuNumber) {
    this.spuNumber = spuNumber;
  }

  public UpdateJarJobRequest managerSpu(Integer managerSpu) {
    this.managerSpu = managerSpu;
    return this;
  }

   /**
   * 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量
   * minimum: 1
   * maximum: 4
   * @return managerSpu
  **/
  @ApiModelProperty(example = "1", value = "用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量")
  public Integer getManagerSpu() {
    return managerSpu;
  }

  public void setManagerSpu(Integer managerSpu) {
    this.managerSpu = managerSpu;
  }

  public UpdateJarJobRequest parallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
    return this;
  }

   /**
   * 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置
   * minimum: 1
   * maximum: 2000
   * @return parallelNumber
  **/
  @ApiModelProperty(example = "5", value = "用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置")
  public Integer getParallelNumber() {
    return parallelNumber;
  }

  public void setParallelNumber(Integer parallelNumber) {
    this.parallelNumber = parallelNumber;
  }

  public UpdateJarJobRequest executorNumber(Integer executorNumber) {
    this.executorNumber = executorNumber;
    return this;
  }

   /**
   * Spark作业使用的executor个数，提交Spark自定义作业时需要配置，Flink自定义作业不需要配置
   * minimum: 1
   * maximum: 100
   * @return executorNumber
  **/
  @ApiModelProperty(example = "1", value = "Spark作业使用的executor个数，提交Spark自定义作业时需要配置，Flink自定义作业不需要配置")
  public Integer getExecutorNumber() {
    return executorNumber;
  }

  public void setExecutorNumber(Integer executorNumber) {
    this.executorNumber = executorNumber;
  }

  public UpdateJarJobRequest executorSpu(Integer executorSpu) {
    this.executorSpu = executorSpu;
    return this;
  }

   /**
   * Spark作业每个Executor节点使用的SPU数量，提交Spark自定义作业时需要配置，Flink自定义作业不需要配置
   * minimum: 1
   * maximum: 4
   * @return executorSpu
  **/
  @ApiModelProperty(example = "1", value = "Spark作业每个Executor节点使用的SPU数量，提交Spark自定义作业时需要配置，Flink自定义作业不需要配置")
  public Integer getExecutorSpu() {
    return executorSpu;
  }

  public void setExecutorSpu(Integer executorSpu) {
    this.executorSpu = executorSpu;
  }

  public UpdateJarJobRequest obsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
    return this;
  }

   /**
   * log_enabled&#x3D;&#x3D;true是, 用户授权保存作业日志的OBS路径
   * @return obsBucket
  **/
  @ApiModelProperty(example = "my_obs_bucket", value = "log_enabled==true是, 用户授权保存作业日志的OBS路径")
  public String getObsBucket() {
    return obsBucket;
  }

  public void setObsBucket(String obsBucket) {
    this.obsBucket = obsBucket;
  }

  public UpdateJarJobRequest logEnabled(Boolean logEnabled) {
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

  public UpdateJarJobRequest smnTopic(String smnTopic) {
    this.smnTopic = smnTopic;
    return this;
  }

   /**
   * 当作业异常时，向该SMN主题推送告警信息
   * @return smnTopic
  **/
  @ApiModelProperty(value = "当作业异常时，向该SMN主题推送告警信息")
  public String getSmnTopic() {
    return smnTopic;
  }

  public void setSmnTopic(String smnTopic) {
    this.smnTopic = smnTopic;
  }

  public UpdateJarJobRequest jarUrl(String jarUrl) {
    this.jarUrl = jarUrl;
    return this;
  }

   /**
   * 用户上传的jar包OBS路径
   * @return jarUrl
  **/
  @ApiModelProperty(value = "用户上传的jar包OBS路径")
  public String getJarUrl() {
    return jarUrl;
  }

  public void setJarUrl(String jarUrl) {
    this.jarUrl = jarUrl;
  }

  public UpdateJarJobRequest configUrl(String configUrl) {
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

  public UpdateJarJobRequest mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

   /**
   * 作业入口类
   * @return mainClass
  **/
  @ApiModelProperty(value = "作业入口类")
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public UpdateJarJobRequest args(String args) {
    this.args = args;
    return this;
  }

   /**
   * 作业入口类参数
   * @return args
  **/
  @ApiModelProperty(value = "作业入口类参数")
  public String getArgs() {
    return args;
  }

  public void setArgs(String args) {
    this.args = args;
  }

  public UpdateJarJobRequest restartWhenException(Boolean restartWhenException) {
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

  public UpdateJarJobRequest tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * 作业标签
   * @return tags
  **/
  @ApiModelProperty(value = "作业标签")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public UpdateJarJobRequest sysEnterpriseProjectId(String sysEnterpriseProjectId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateJarJobRequest updateJarJobRequest = (UpdateJarJobRequest) o;
    return Objects.equals(this.jobId, updateJarJobRequest.jobId) &&
        Objects.equals(this.name, updateJarJobRequest.name) &&
        Objects.equals(this.desc, updateJarJobRequest.desc) &&
        Objects.equals(this.clusterId, updateJarJobRequest.clusterId) &&
        Objects.equals(this.spuNumber, updateJarJobRequest.spuNumber) &&
        Objects.equals(this.managerSpu, updateJarJobRequest.managerSpu) &&
        Objects.equals(this.parallelNumber, updateJarJobRequest.parallelNumber) &&
        Objects.equals(this.executorNumber, updateJarJobRequest.executorNumber) &&
        Objects.equals(this.executorSpu, updateJarJobRequest.executorSpu) &&
        Objects.equals(this.obsBucket, updateJarJobRequest.obsBucket) &&
        Objects.equals(this.logEnabled, updateJarJobRequest.logEnabled) &&
        Objects.equals(this.smnTopic, updateJarJobRequest.smnTopic) &&
        Objects.equals(this.jarUrl, updateJarJobRequest.jarUrl) &&
        Objects.equals(this.configUrl, updateJarJobRequest.configUrl) &&
        Objects.equals(this.mainClass, updateJarJobRequest.mainClass) &&
        Objects.equals(this.args, updateJarJobRequest.args) &&
        Objects.equals(this.restartWhenException, updateJarJobRequest.restartWhenException) &&
        Objects.equals(this.tags, updateJarJobRequest.tags) &&
        Objects.equals(this.sysEnterpriseProjectId, updateJarJobRequest.sysEnterpriseProjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, name, desc, clusterId, spuNumber, managerSpu, parallelNumber, executorNumber, executorSpu, obsBucket, logEnabled, smnTopic, jarUrl, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateJarJobRequest {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    spuNumber: ").append(toIndentedString(spuNumber)).append("\n");
    sb.append("    managerSpu: ").append(toIndentedString(managerSpu)).append("\n");
    sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
    sb.append("    executorNumber: ").append(toIndentedString(executorNumber)).append("\n");
    sb.append("    executorSpu: ").append(toIndentedString(executorSpu)).append("\n");
    sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
    sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
    sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
    sb.append("    jarUrl: ").append(toIndentedString(jarUrl)).append("\n");
    sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    restartWhenException: ").append(toIndentedString(restartWhenException)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    sysEnterpriseProjectId: ").append(toIndentedString(sysEnterpriseProjectId)).append("\n");
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

