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
import com.huaweicloud.cs.java.v1.model.VpcInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Peering
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-05T16:45:41.401+08:00")
public class Peering {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("request_vpc_info")
  private VpcInfo requestVpcInfo = null;

  @SerializedName("accept_vpc_info")
  private VpcInfo acceptVpcInfo = null;

  @SerializedName("status")
  private String status = null;

  public Peering name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 对等连接名称
   * @return name
  **/
  @ApiModelProperty(example = "myVpc", value = "对等连接名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Peering id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 对等连接ID
   * @return id
  **/
  @ApiModelProperty(example = "7e974044-bcc1-4f25-aff8-5f10cb347b0f", value = "对等连接ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Peering requestVpcInfo(VpcInfo requestVpcInfo) {
    this.requestVpcInfo = requestVpcInfo;
    return this;
  }

   /**
   * Get requestVpcInfo
   * @return requestVpcInfo
  **/
  @ApiModelProperty(value = "")
  public VpcInfo getRequestVpcInfo() {
    return requestVpcInfo;
  }

  public void setRequestVpcInfo(VpcInfo requestVpcInfo) {
    this.requestVpcInfo = requestVpcInfo;
  }

  public Peering acceptVpcInfo(VpcInfo acceptVpcInfo) {
    this.acceptVpcInfo = acceptVpcInfo;
    return this;
  }

   /**
   * Get acceptVpcInfo
   * @return acceptVpcInfo
  **/
  @ApiModelProperty(value = "")
  public VpcInfo getAcceptVpcInfo() {
    return acceptVpcInfo;
  }

  public void setAcceptVpcInfo(VpcInfo acceptVpcInfo) {
    this.acceptVpcInfo = acceptVpcInfo;
  }

  public Peering status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 对等连接状态
   * @return status
  **/
  @ApiModelProperty(example = "PENDING_ACCEPTANCE", value = "对等连接状态")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peering peering = (Peering) o;
    return Objects.equals(this.name, peering.name) &&
        Objects.equals(this.id, peering.id) &&
        Objects.equals(this.requestVpcInfo, peering.requestVpcInfo) &&
        Objects.equals(this.acceptVpcInfo, peering.acceptVpcInfo) &&
        Objects.equals(this.status, peering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, requestVpcInfo, acceptVpcInfo, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peering {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestVpcInfo: ").append(toIndentedString(requestVpcInfo)).append("\n");
    sb.append("    acceptVpcInfo: ").append(toIndentedString(acceptVpcInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

