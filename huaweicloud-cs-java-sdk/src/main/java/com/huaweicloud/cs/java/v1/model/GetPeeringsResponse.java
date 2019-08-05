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
import com.huaweicloud.cs.java.v1.model.Peering;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetPeeringsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-02T13:59:14.712+08:00")
public class GetPeeringsResponse {
  @SerializedName("peerings")
  private List<Peering> peerings = null;

  public GetPeeringsResponse peerings(List<Peering> peerings) {
    this.peerings = peerings;
    return this;
  }

  public GetPeeringsResponse addPeeringsItem(Peering peeringsItem) {
    if (this.peerings == null) {
      this.peerings = new ArrayList<Peering>();
    }
    this.peerings.add(peeringsItem);
    return this;
  }

   /**
   * Get peerings
   * @return peerings
  **/
  @ApiModelProperty(value = "")
  public List<Peering> getPeerings() {
    return peerings;
  }

  public void setPeerings(List<Peering> peerings) {
    this.peerings = peerings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPeeringsResponse getPeeringsResponse = (GetPeeringsResponse) o;
    return Objects.equals(this.peerings, getPeeringsResponse.peerings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeeringsResponse {\n");
    
    sb.append("    peerings: ").append(toIndentedString(peerings)).append("\n");
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

