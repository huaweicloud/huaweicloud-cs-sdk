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
public class TimestampsEntity {
  @SerializedName("CREATED")
  private Long CREATED = null;

  @SerializedName("RUNNING")
  private Long RUNNING = null;

  @SerializedName("FAILING")
  private Long FAILING = null;

  @SerializedName("FAILED")
  private Long FAILED = null;

  @SerializedName("CANCELLING")
  private Long CANCELLING = null;

  @SerializedName("CANCELED")
  private Long CANCELED = null;

  @SerializedName("FINISHED")
  private Long FINISHED = null;

  @SerializedName("RESTARTING")
  private Long RESTARTING = null;

  @SerializedName("SUSPENDING")
  private Long SUSPENDING = null;

  @SerializedName("SUSPENDED")
  private Long SUSPENDED = null;

  @SerializedName("RECONCILING")
  private Long RECONCILING = null;

  public TimestampsEntity CREATED(Long CREATED) {
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

  public TimestampsEntity RUNNING(Long RUNNING) {
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

  public TimestampsEntity FAILING(Long FAILING) {
    this.FAILING = FAILING;
    return this;
  }

   /**
   * 
   * @return FAILING
  **/
  @ApiModelProperty(value = "")
  public Long getFAILING() {
    return FAILING;
  }

  public void setFAILING(Long FAILING) {
    this.FAILING = FAILING;
  }

  public TimestampsEntity FAILED(Long FAILED) {
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

  public TimestampsEntity CANCELLING(Long CANCELLING) {
    this.CANCELLING = CANCELLING;
    return this;
  }

   /**
   * 
   * @return CANCELLING
  **/
  @ApiModelProperty(value = "")
  public Long getCANCELLING() {
    return CANCELLING;
  }

  public void setCANCELLING(Long CANCELLING) {
    this.CANCELLING = CANCELLING;
  }

  public TimestampsEntity CANCELED(Long CANCELED) {
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

  public TimestampsEntity FINISHED(Long FINISHED) {
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

  public TimestampsEntity RESTARTING(Long RESTARTING) {
    this.RESTARTING = RESTARTING;
    return this;
  }

   /**
   * 
   * @return RESTARTING
  **/
  @ApiModelProperty(value = "")
  public Long getRESTARTING() {
    return RESTARTING;
  }

  public void setRESTARTING(Long RESTARTING) {
    this.RESTARTING = RESTARTING;
  }

  public TimestampsEntity SUSPENDING(Long SUSPENDING) {
    this.SUSPENDING = SUSPENDING;
    return this;
  }

   /**
   * 
   * @return SUSPENDING
  **/
  @ApiModelProperty(value = "")
  public Long getSUSPENDING() {
    return SUSPENDING;
  }

  public void setSUSPENDING(Long SUSPENDING) {
    this.SUSPENDING = SUSPENDING;
  }

  public TimestampsEntity SUSPENDED(Long SUSPENDED) {
    this.SUSPENDED = SUSPENDED;
    return this;
  }

   /**
   * 
   * @return SUSPENDED
  **/
  @ApiModelProperty(value = "")
  public Long getSUSPENDED() {
    return SUSPENDED;
  }

  public void setSUSPENDED(Long SUSPENDED) {
    this.SUSPENDED = SUSPENDED;
  }

  public TimestampsEntity RECONCILING(Long RECONCILING) {
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
    TimestampsEntity timestampsEntity = (TimestampsEntity) o;
    return Objects.equals(this.CREATED, timestampsEntity.CREATED) &&
        Objects.equals(this.RUNNING, timestampsEntity.RUNNING) &&
        Objects.equals(this.FAILING, timestampsEntity.FAILING) &&
        Objects.equals(this.FAILED, timestampsEntity.FAILED) &&
        Objects.equals(this.CANCELLING, timestampsEntity.CANCELLING) &&
        Objects.equals(this.CANCELED, timestampsEntity.CANCELED) &&
        Objects.equals(this.FINISHED, timestampsEntity.FINISHED) &&
        Objects.equals(this.RESTARTING, timestampsEntity.RESTARTING) &&
        Objects.equals(this.SUSPENDING, timestampsEntity.SUSPENDING) &&
        Objects.equals(this.SUSPENDED, timestampsEntity.SUSPENDED) &&
        Objects.equals(this.RECONCILING, timestampsEntity.RECONCILING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CREATED, RUNNING, FAILING, FAILED, CANCELLING, CANCELED, FINISHED, RESTARTING, SUSPENDING, SUSPENDED, RECONCILING);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampsEntity {\n");
    
    sb.append("    CREATED: ").append(toIndentedString(CREATED)).append("\n");
    sb.append("    RUNNING: ").append(toIndentedString(RUNNING)).append("\n");
    sb.append("    FAILING: ").append(toIndentedString(FAILING)).append("\n");
    sb.append("    FAILED: ").append(toIndentedString(FAILED)).append("\n");
    sb.append("    CANCELLING: ").append(toIndentedString(CANCELLING)).append("\n");
    sb.append("    CANCELED: ").append(toIndentedString(CANCELED)).append("\n");
    sb.append("    FINISHED: ").append(toIndentedString(FINISHED)).append("\n");
    sb.append("    RESTARTING: ").append(toIndentedString(RESTARTING)).append("\n");
    sb.append("    SUSPENDING: ").append(toIndentedString(SUSPENDING)).append("\n");
    sb.append("    SUSPENDED: ").append(toIndentedString(SUSPENDED)).append("\n");
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

