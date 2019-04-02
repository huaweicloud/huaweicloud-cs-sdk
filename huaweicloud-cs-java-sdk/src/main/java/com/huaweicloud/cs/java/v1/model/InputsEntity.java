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
public class InputsEntity {
  @SerializedName("num")
  private Long num = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ship_strategy")
  private String shipStrategy = null;

  @SerializedName("exchange")
  private String exchange = null;

  public InputsEntity num(Long num) {
    this.num = num;
    return this;
  }

   /**
   * 
   * @return num
  **/
  @ApiModelProperty(value = "")
  public Long getNum() {
    return num;
  }

  public void setNum(Long num) {
    this.num = num;
  }

  public InputsEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InputsEntity shipStrategy(String shipStrategy) {
    this.shipStrategy = shipStrategy;
    return this;
  }

   /**
   * 
   * @return shipStrategy
  **/
  @ApiModelProperty(value = "")
  public String getShipStrategy() {
    return shipStrategy;
  }

  public void setShipStrategy(String shipStrategy) {
    this.shipStrategy = shipStrategy;
  }

  public InputsEntity exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * 
   * @return exchange
  **/
  @ApiModelProperty(value = "")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputsEntity inputsEntity = (InputsEntity) o;
    return Objects.equals(this.num, inputsEntity.num) &&
        Objects.equals(this.id, inputsEntity.id) &&
        Objects.equals(this.shipStrategy, inputsEntity.shipStrategy) &&
        Objects.equals(this.exchange, inputsEntity.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(num, id, shipStrategy, exchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputsEntity {\n");
    
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shipStrategy: ").append(toIndentedString(shipStrategy)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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

