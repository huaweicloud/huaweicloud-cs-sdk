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
 * JobTemplateCreated
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:34:21.045+08:00")
public class JobTemplateCreated {
  @SerializedName("template_id")
  private Long templateId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("create_time")
  private Long createTime = null;

  @SerializedName("is_success")
  private Boolean isSuccess = null;

  public JobTemplateCreated templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public JobTemplateCreated name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 模板名称
   * @return name
  **/
  @ApiModelProperty(example = "IoT_example", value = "模板名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobTemplateCreated desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 模板描述
   * @return desc
  **/
  @ApiModelProperty(example = "快速上手示例", value = "模板描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public JobTemplateCreated createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 模板创建时间
   * @return createTime
  **/
  @ApiModelProperty(example = "40000", value = "模板创建时间")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public JobTemplateCreated isSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    return this;
  }

   /**
   * 模板创建是否成功
   * @return isSuccess
  **/
  @ApiModelProperty(example = "true", value = "模板创建是否成功")
  public Boolean isIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTemplateCreated jobTemplateCreated = (JobTemplateCreated) o;
    return Objects.equals(this.templateId, jobTemplateCreated.templateId) &&
        Objects.equals(this.name, jobTemplateCreated.name) &&
        Objects.equals(this.desc, jobTemplateCreated.desc) &&
        Objects.equals(this.createTime, jobTemplateCreated.createTime) &&
        Objects.equals(this.isSuccess, jobTemplateCreated.isSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, name, desc, createTime, isSuccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTemplateCreated {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
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

