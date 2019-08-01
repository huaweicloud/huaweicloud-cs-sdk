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
 * OperatorMetric
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T10:03:30.829+08:00")
public class OperatorMetric {
  @SerializedName("name")
  private String name = null;

  @SerializedName("records")
  private Long records = null;

  @SerializedName("corrupted_records")
  private Long corruptedRecords = null;

  public OperatorMetric name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 算子名称
   * @return name
  **/
  @ApiModelProperty(example = "Source: KafKa_6070_KAFKA_SOURCE", value = "算子名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OperatorMetric records(Long records) {
    this.records = records;
    return this;
  }

   /**
   * 记录数
   * @return records
  **/
  @ApiModelProperty(value = "记录数")
  public Long getRecords() {
    return records;
  }

  public void setRecords(Long records) {
    this.records = records;
  }

  public OperatorMetric corruptedRecords(Long corruptedRecords) {
    this.corruptedRecords = corruptedRecords;
    return this;
  }

   /**
   * 脏数据记录数
   * @return corruptedRecords
  **/
  @ApiModelProperty(value = "脏数据记录数")
  public Long getCorruptedRecords() {
    return corruptedRecords;
  }

  public void setCorruptedRecords(Long corruptedRecords) {
    this.corruptedRecords = corruptedRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatorMetric operatorMetric = (OperatorMetric) o;
    return Objects.equals(this.name, operatorMetric.name) &&
        Objects.equals(this.records, operatorMetric.records) &&
        Objects.equals(this.corruptedRecords, operatorMetric.corruptedRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, records, corruptedRecords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatorMetric {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    corruptedRecords: ").append(toIndentedString(corruptedRecords)).append("\n");
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

