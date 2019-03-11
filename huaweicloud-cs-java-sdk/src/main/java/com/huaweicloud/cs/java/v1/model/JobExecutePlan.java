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
 * JobExecutePlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T19:15:11.891+08:00")
public class JobExecutePlan {
  @SerializedName("execute_plan_items")
  private String executePlanItems = null;

  public JobExecutePlan executePlanItems(String executePlanItems) {
    this.executePlanItems = executePlanItems;
    return this;
  }

   /**
   * Get executePlanItems
   * @return executePlanItems
  **/
  @ApiModelProperty(example = "[{\"key\":\"value\"}]", value = "")
  public String getExecutePlanItems() {
    return executePlanItems;
  }

  public void setExecutePlanItems(String executePlanItems) {
    this.executePlanItems = executePlanItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobExecutePlan jobExecutePlan = (JobExecutePlan) o;
    return Objects.equals(this.executePlanItems, jobExecutePlan.executePlanItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executePlanItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobExecutePlan {\n");
    
    sb.append("    executePlanItems: ").append(toIndentedString(executePlanItems)).append("\n");
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

