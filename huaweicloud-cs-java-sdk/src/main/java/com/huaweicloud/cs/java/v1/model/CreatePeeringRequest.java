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
 * CreatePeeringRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:00:00.393+08:00")
public class CreatePeeringRequest {
  @SerializedName("vpc_id")
  private String vpcId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("accept_tenant_id")
  private String acceptTenantId = null;

  public CreatePeeringRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * vpc id
   * @return vpcId
  **/
  @ApiModelProperty(example = "f4da5a55-fcd9-4a93-8b86-5b81585e14bb", required = true, value = "vpc id")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public CreatePeeringRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * vpc名称
   * @return name
  **/
  @ApiModelProperty(example = "myVpc", value = "vpc名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreatePeeringRequest acceptTenantId(String acceptTenantId) {
    this.acceptTenantId = acceptTenantId;
    return this;
  }

   /**
   * 接受方vpc所属的租户ID
   * @return acceptTenantId
  **/
  @ApiModelProperty(example = "4f30b9215e054c908d18f2b150131646", value = "接受方vpc所属的租户ID")
  public String getAcceptTenantId() {
    return acceptTenantId;
  }

  public void setAcceptTenantId(String acceptTenantId) {
    this.acceptTenantId = acceptTenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePeeringRequest createPeeringRequest = (CreatePeeringRequest) o;
    return Objects.equals(this.vpcId, createPeeringRequest.vpcId) &&
        Objects.equals(this.name, createPeeringRequest.name) &&
        Objects.equals(this.acceptTenantId, createPeeringRequest.acceptTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcId, name, acceptTenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePeeringRequest {\n");
    
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    acceptTenantId: ").append(toIndentedString(acceptTenantId)).append("\n");
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

