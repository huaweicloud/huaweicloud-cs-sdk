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
public class StatusCountsEntity {
  @SerializedName("CREATED")
  private Long CREATED = null;

  @SerializedName("SCHEDULED")
  private Long SCHEDULED = null;

  @SerializedName("DEPLOYING")
  private Long DEPLOYING = null;

  @SerializedName("RUNNING")
  private Long RUNNING = null;

  @SerializedName("FINISHED")
  private Long FINISHED = null;

  @SerializedName("CANCELING")
  private Long CANCELING = null;

  @SerializedName("CANCELED")
  private Long CANCELED = null;

  @SerializedName("FAILED")
  private Long FAILED = null;

  @SerializedName("RECONCILING")
  private Long RECONCILING = null;

  public StatusCountsEntity CREATED(Long CREATED) {
    this.CREATED = CREATED;
    return this;
  }

   /**
   * 
   * @return CREATED
  **/
  @ApiModelProperty(value = "")
  public Long getCREATED() {
    return CREATED;
  }

  public void setCREATED(Long CREATED) {
    this.CREATED = CREATED;
  }

  public StatusCountsEntity SCHEDULED(Long SCHEDULED) {
    this.SCHEDULED = SCHEDULED;
    return this;
  }

   /**
   * 
   * @return SCHEDULED
  **/
  @ApiModelProperty(value = "")
  public Long getSCHEDULED() {
    return SCHEDULED;
  }

  public void setSCHEDULED(Long SCHEDULED) {
    this.SCHEDULED = SCHEDULED;
  }

  public StatusCountsEntity DEPLOYING(Long DEPLOYING) {
    this.DEPLOYING = DEPLOYING;
    return this;
  }

   /**
   * 
   * @return DEPLOYING
  **/
  @ApiModelProperty(value = "")
  public Long getDEPLOYING() {
    return DEPLOYING;
  }

  public void setDEPLOYING(Long DEPLOYING) {
    this.DEPLOYING = DEPLOYING;
  }

  public StatusCountsEntity RUNNING(Long RUNNING) {
    this.RUNNING = RUNNING;
    return this;
  }

   /**
   * 
   * @return RUNNING
  **/
  @ApiModelProperty(value = "")
  public Long getRUNNING() {
    return RUNNING;
  }

  public void setRUNNING(Long RUNNING) {
    this.RUNNING = RUNNING;
  }

  public StatusCountsEntity FINISHED(Long FINISHED) {
    this.FINISHED = FINISHED;
    return this;
  }

   /**
   * 
   * @return FINISHED
  **/
  @ApiModelProperty(value = "")
  public Long getFINISHED() {
    return FINISHED;
  }

  public void setFINISHED(Long FINISHED) {
    this.FINISHED = FINISHED;
  }

  public StatusCountsEntity CANCELING(Long CANCELING) {
    this.CANCELING = CANCELING;
    return this;
  }

   /**
   * 
   * @return CANCELING
  **/
  @ApiModelProperty(value = "")
  public Long getCANCELING() {
    return CANCELING;
  }

  public void setCANCELING(Long CANCELING) {
    this.CANCELING = CANCELING;
  }

  public StatusCountsEntity CANCELED(Long CANCELED) {
    this.CANCELED = CANCELED;
    return this;
  }

   /**
   * 
   * @return CANCELED
  **/
  @ApiModelProperty(value = "")
  public Long getCANCELED() {
    return CANCELED;
  }

  public void setCANCELED(Long CANCELED) {
    this.CANCELED = CANCELED;
  }

  public StatusCountsEntity FAILED(Long FAILED) {
    this.FAILED = FAILED;
    return this;
  }

   /**
   * 
   * @return FAILED
  **/
  @ApiModelProperty(value = "")
  public Long getFAILED() {
    return FAILED;
  }

  public void setFAILED(Long FAILED) {
    this.FAILED = FAILED;
  }

  public StatusCountsEntity RECONCILING(Long RECONCILING) {
    this.RECONCILING = RECONCILING;
    return this;
  }

   /**
   * 
   * @return RECONCILING
  **/
  @ApiModelProperty(value = "")
  public Long getRECONCILING() {
    return RECONCILING;
  }

  public void setRECONCILING(Long RECONCILING) {
    this.RECONCILING = RECONCILING;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCountsEntity statusCountsEntity = (StatusCountsEntity) o;
    return Objects.equals(this.CREATED, statusCountsEntity.CREATED) &&
        Objects.equals(this.SCHEDULED, statusCountsEntity.SCHEDULED) &&
        Objects.equals(this.DEPLOYING, statusCountsEntity.DEPLOYING) &&
        Objects.equals(this.RUNNING, statusCountsEntity.RUNNING) &&
        Objects.equals(this.FINISHED, statusCountsEntity.FINISHED) &&
        Objects.equals(this.CANCELING, statusCountsEntity.CANCELING) &&
        Objects.equals(this.CANCELED, statusCountsEntity.CANCELED) &&
        Objects.equals(this.FAILED, statusCountsEntity.FAILED) &&
        Objects.equals(this.RECONCILING, statusCountsEntity.RECONCILING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CREATED, SCHEDULED, DEPLOYING, RUNNING, FINISHED, CANCELING, CANCELED, FAILED, RECONCILING);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCountsEntity {\n");
    
    sb.append("    CREATED: ").append(toIndentedString(CREATED)).append("\n");
    sb.append("    SCHEDULED: ").append(toIndentedString(SCHEDULED)).append("\n");
    sb.append("    DEPLOYING: ").append(toIndentedString(DEPLOYING)).append("\n");
    sb.append("    RUNNING: ").append(toIndentedString(RUNNING)).append("\n");
    sb.append("    FINISHED: ").append(toIndentedString(FINISHED)).append("\n");
    sb.append("    CANCELING: ").append(toIndentedString(CANCELING)).append("\n");
    sb.append("    CANCELED: ").append(toIndentedString(CANCELED)).append("\n");
    sb.append("    FAILED: ").append(toIndentedString(FAILED)).append("\n");
    sb.append("    RECONCILING: ").append(toIndentedString(RECONCILING)).append("\n");
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

