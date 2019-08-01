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
import com.huaweicloud.cs.java.v1.model.JobMetaDataAttrEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobMetaDataEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T10:03:30.829+08:00")
public class JobMetaDataEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("encode")
  private String encode = null;

  @SerializedName("delimiter")
  private String delimiter = null;

  @SerializedName("attrs")
  private List<JobMetaDataAttrEntity> attrs = null;

  public JobMetaDataEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 定义的Sink数据流的名称
   * @return name
  **/
  @ApiModelProperty(example = "CAR_INFOS_DETAIL", value = "定义的Sink数据流的名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobMetaDataEntity encode(String encode) {
    this.encode = encode;
    return this;
  }

   /**
   * 定义的Sink数据输出的格式
   * @return encode
  **/
  @ApiModelProperty(example = "csv", value = "定义的Sink数据输出的格式")
  public String getEncode() {
    return encode;
  }

  public void setEncode(String encode) {
    this.encode = encode;
  }

  public JobMetaDataEntity delimiter(String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

   /**
   * 定义的Sink数据输出的分隔符
   * @return delimiter
  **/
  @ApiModelProperty(example = ",", value = "定义的Sink数据输出的分隔符")
  public String getDelimiter() {
    return delimiter;
  }

  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }

  public JobMetaDataEntity attrs(List<JobMetaDataAttrEntity> attrs) {
    this.attrs = attrs;
    return this;
  }

  public JobMetaDataEntity addAttrsItem(JobMetaDataAttrEntity attrsItem) {
    if (this.attrs == null) {
      this.attrs = new ArrayList<JobMetaDataAttrEntity>();
    }
    this.attrs.add(attrsItem);
    return this;
  }

   /**
   * 定义的Sink数据各个字段名称和类型
   * @return attrs
  **/
  @ApiModelProperty(value = "定义的Sink数据各个字段名称和类型")
  public List<JobMetaDataAttrEntity> getAttrs() {
    return attrs;
  }

  public void setAttrs(List<JobMetaDataAttrEntity> attrs) {
    this.attrs = attrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobMetaDataEntity jobMetaDataEntity = (JobMetaDataEntity) o;
    return Objects.equals(this.name, jobMetaDataEntity.name) &&
        Objects.equals(this.encode, jobMetaDataEntity.encode) &&
        Objects.equals(this.delimiter, jobMetaDataEntity.delimiter) &&
        Objects.equals(this.attrs, jobMetaDataEntity.attrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, encode, delimiter, attrs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobMetaDataEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    encode: ").append(toIndentedString(encode)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
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

