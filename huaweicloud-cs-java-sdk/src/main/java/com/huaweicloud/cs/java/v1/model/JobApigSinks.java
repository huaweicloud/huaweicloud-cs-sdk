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
import com.huaweicloud.cs.java.v1.model.JobApigSinkEntity;
import com.huaweicloud.cs.java.v1.model.JobMetaDataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobApigSinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T10:07:58.610+08:00")
public class JobApigSinks {
  @SerializedName("sinks")
  private List<JobApigSinkEntity> sinks = null;

  @SerializedName("metadata")
  private List<JobMetaDataEntity> metadata = null;

  public JobApigSinks sinks(List<JobApigSinkEntity> sinks) {
    this.sinks = sinks;
    return this;
  }

  public JobApigSinks addSinksItem(JobApigSinkEntity sinksItem) {
    if (this.sinks == null) {
      this.sinks = new ArrayList<JobApigSinkEntity>();
    }
    this.sinks.add(sinksItem);
    return this;
  }

   /**
   * Get sinks
   * @return sinks
  **/
  @ApiModelProperty(value = "")
  public List<JobApigSinkEntity> getSinks() {
    return sinks;
  }

  public void setSinks(List<JobApigSinkEntity> sinks) {
    this.sinks = sinks;
  }

  public JobApigSinks metadata(List<JobMetaDataEntity> metadata) {
    this.metadata = metadata;
    return this;
  }

  public JobApigSinks addMetadataItem(JobMetaDataEntity metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<JobMetaDataEntity>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public List<JobMetaDataEntity> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<JobMetaDataEntity> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobApigSinks jobApigSinks = (JobApigSinks) o;
    return Objects.equals(this.sinks, jobApigSinks.sinks) &&
        Objects.equals(this.metadata, jobApigSinks.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sinks, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobApigSinks {\n");
    
    sb.append("    sinks: ").append(toIndentedString(sinks)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

