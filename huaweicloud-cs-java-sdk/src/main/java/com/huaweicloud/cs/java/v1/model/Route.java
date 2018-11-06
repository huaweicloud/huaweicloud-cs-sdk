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
 * Route
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-05T16:45:41.401+08:00")
public class Route {
  @SerializedName("type")
  private String type = null;

  @SerializedName("nexthop")
  private String nexthop = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("vpc_id")
  private String vpcId = null;

  @SerializedName("tenant_id")
  private String tenantId = null;

  @SerializedName("id")
  private String id = null;

  public Route type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 路由类型，一般为peering
   * @return type
  **/
  @ApiModelProperty(example = "peering", value = "路由类型，一般为peering")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Route nexthop(String nexthop) {
    this.nexthop = nexthop;
    return this;
  }

   /**
   * 下一跳地址，即对等连接ID
   * @return nexthop
  **/
  @ApiModelProperty(example = "7e974044-bcc1-4f25-aff8-5f10cb347b0f", value = "下一跳地址，即对等连接ID")
  public String getNexthop() {
    return nexthop;
  }

  public void setNexthop(String nexthop) {
    this.nexthop = nexthop;
  }

  public Route destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * 路由的目的CIDR
   * @return destination
  **/
  @ApiModelProperty(example = "192.168.0.0/16", value = "路由的目的CIDR")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Route vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * 请求添加路由的VPC ID
   * @return vpcId
  **/
  @ApiModelProperty(example = "83081290-198e-48e2-8e2d-64c50023d136", value = "请求添加路由的VPC ID")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public Route tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 请求添加路由的租户ID
   * @return tenantId
  **/
  @ApiModelProperty(example = "8185f87d043f4519a68420a282b5e2fa", value = "请求添加路由的租户ID")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Route id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 路由ID
   * @return id
  **/
  @ApiModelProperty(example = "75d289f7-9022-4950-a137-fed7aeae9cb1", value = "路由ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route route = (Route) o;
    return Objects.equals(this.type, route.type) &&
        Objects.equals(this.nexthop, route.nexthop) &&
        Objects.equals(this.destination, route.destination) &&
        Objects.equals(this.vpcId, route.vpcId) &&
        Objects.equals(this.tenantId, route.tenantId) &&
        Objects.equals(this.id, route.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, nexthop, destination, vpcId, tenantId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

