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
 * VpcInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-05T16:45:41.401+08:00")
public class VpcInfo {
  @SerializedName("vpc_id")
  private String vpcId = null;

  @SerializedName("tenant_id")
  private String tenantId = null;

  public VpcInfo vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * 对等连接ID
   * @return vpcId
  **/
  @ApiModelProperty(example = "83081290-198e-48e2-8e2d-64c50023d136", value = "对等连接ID")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public VpcInfo tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 租户ID
   * @return tenantId
  **/
  @ApiModelProperty(example = "4f30b9215e054c908d18f2b150131646", value = "租户ID")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpcInfo vpcInfo = (VpcInfo) o;
    return Objects.equals(this.vpcId, vpcInfo.vpcId) &&
        Objects.equals(this.tenantId, vpcInfo.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcId, tenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpcInfo {\n");
    
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

