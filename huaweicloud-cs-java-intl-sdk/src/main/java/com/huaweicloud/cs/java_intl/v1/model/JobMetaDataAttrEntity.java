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

package com.huaweicloud.cs.java_intl.v1.model;

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
 * JobMetaDataAttrEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-13T19:29:08.677+08:00")
public class JobMetaDataAttrEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public JobMetaDataAttrEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 字段名称
   * @return name
  **/
  @ApiModelProperty(example = "car_id", value = "字段名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobMetaDataAttrEntity type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 字段类型
   * @return type
  **/
  @ApiModelProperty(example = "STRING", value = "字段类型")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobMetaDataAttrEntity jobMetaDataAttrEntity = (JobMetaDataAttrEntity) o;
    return Objects.equals(this.name, jobMetaDataAttrEntity.name) &&
        Objects.equals(this.type, jobMetaDataAttrEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobMetaDataAttrEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

