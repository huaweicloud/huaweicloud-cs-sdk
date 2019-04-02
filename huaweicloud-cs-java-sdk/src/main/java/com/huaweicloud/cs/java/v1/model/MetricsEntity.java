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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T09:59:30.710+08:00")
public class MetricsEntity {
  @SerializedName("read-bytes")
  private Long readBytes = null;

  @SerializedName("read-bytes-complete")
  private Boolean readBytesComplete = null;

  @SerializedName("write-bytes")
  private Long writeBytes = null;

  @SerializedName("write-bytes-complete")
  private Boolean writeBytesComplete = null;

  @SerializedName("read-records")
  private Long readRecords = null;

  @SerializedName("read-records-complete")
  private Boolean readRecordsComplete = null;

  @SerializedName("write-records")
  private Long writeRecords = null;

  @SerializedName("write-records-complete")
  private Boolean writeRecordsComplete = null;

  public MetricsEntity readBytes(Long readBytes) {
    this.readBytes = readBytes;
    return this;
  }

   /**
   * 
   * @return readBytes
  **/
  @ApiModelProperty(value = "")
  public Long getReadBytes() {
    return readBytes;
  }

  public void setReadBytes(Long readBytes) {
    this.readBytes = readBytes;
  }

  public MetricsEntity readBytesComplete(Boolean readBytesComplete) {
    this.readBytesComplete = readBytesComplete;
    return this;
  }

   /**
   * 
   * @return readBytesComplete
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadBytesComplete() {
    return readBytesComplete;
  }

  public void setReadBytesComplete(Boolean readBytesComplete) {
    this.readBytesComplete = readBytesComplete;
  }

  public MetricsEntity writeBytes(Long writeBytes) {
    this.writeBytes = writeBytes;
    return this;
  }

   /**
   * 
   * @return writeBytes
  **/
  @ApiModelProperty(value = "")
  public Long getWriteBytes() {
    return writeBytes;
  }

  public void setWriteBytes(Long writeBytes) {
    this.writeBytes = writeBytes;
  }

  public MetricsEntity writeBytesComplete(Boolean writeBytesComplete) {
    this.writeBytesComplete = writeBytesComplete;
    return this;
  }

   /**
   * 
   * @return writeBytesComplete
  **/
  @ApiModelProperty(value = "")
  public Boolean isWriteBytesComplete() {
    return writeBytesComplete;
  }

  public void setWriteBytesComplete(Boolean writeBytesComplete) {
    this.writeBytesComplete = writeBytesComplete;
  }

  public MetricsEntity readRecords(Long readRecords) {
    this.readRecords = readRecords;
    return this;
  }

   /**
   * 
   * @return readRecords
  **/
  @ApiModelProperty(value = "")
  public Long getReadRecords() {
    return readRecords;
  }

  public void setReadRecords(Long readRecords) {
    this.readRecords = readRecords;
  }

  public MetricsEntity readRecordsComplete(Boolean readRecordsComplete) {
    this.readRecordsComplete = readRecordsComplete;
    return this;
  }

   /**
   * 
   * @return readRecordsComplete
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadRecordsComplete() {
    return readRecordsComplete;
  }

  public void setReadRecordsComplete(Boolean readRecordsComplete) {
    this.readRecordsComplete = readRecordsComplete;
  }

  public MetricsEntity writeRecords(Long writeRecords) {
    this.writeRecords = writeRecords;
    return this;
  }

   /**
   * 
   * @return writeRecords
  **/
  @ApiModelProperty(value = "")
  public Long getWriteRecords() {
    return writeRecords;
  }

  public void setWriteRecords(Long writeRecords) {
    this.writeRecords = writeRecords;
  }

  public MetricsEntity writeRecordsComplete(Boolean writeRecordsComplete) {
    this.writeRecordsComplete = writeRecordsComplete;
    return this;
  }

   /**
   * 
   * @return writeRecordsComplete
  **/
  @ApiModelProperty(value = "")
  public Boolean isWriteRecordsComplete() {
    return writeRecordsComplete;
  }

  public void setWriteRecordsComplete(Boolean writeRecordsComplete) {
    this.writeRecordsComplete = writeRecordsComplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsEntity metricsEntity = (MetricsEntity) o;
    return Objects.equals(this.readBytes, metricsEntity.readBytes) &&
        Objects.equals(this.readBytesComplete, metricsEntity.readBytesComplete) &&
        Objects.equals(this.writeBytes, metricsEntity.writeBytes) &&
        Objects.equals(this.writeBytesComplete, metricsEntity.writeBytesComplete) &&
        Objects.equals(this.readRecords, metricsEntity.readRecords) &&
        Objects.equals(this.readRecordsComplete, metricsEntity.readRecordsComplete) &&
        Objects.equals(this.writeRecords, metricsEntity.writeRecords) &&
        Objects.equals(this.writeRecordsComplete, metricsEntity.writeRecordsComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readBytes, readBytesComplete, writeBytes, writeBytesComplete, readRecords, readRecordsComplete, writeRecords, writeRecordsComplete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsEntity {\n");
    
    sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
    sb.append("    readBytesComplete: ").append(toIndentedString(readBytesComplete)).append("\n");
    sb.append("    writeBytes: ").append(toIndentedString(writeBytes)).append("\n");
    sb.append("    writeBytesComplete: ").append(toIndentedString(writeBytesComplete)).append("\n");
    sb.append("    readRecords: ").append(toIndentedString(readRecords)).append("\n");
    sb.append("    readRecordsComplete: ").append(toIndentedString(readRecordsComplete)).append("\n");
    sb.append("    writeRecords: ").append(toIndentedString(writeRecords)).append("\n");
    sb.append("    writeRecordsComplete: ").append(toIndentedString(writeRecordsComplete)).append("\n");
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

