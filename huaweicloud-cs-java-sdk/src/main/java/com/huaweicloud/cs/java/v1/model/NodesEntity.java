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
import com.huaweicloud.cs.java.v1.model.InputsEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T09:59:30.710+08:00")
public class NodesEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parallelism")
  private Integer parallelism = null;

  @SerializedName("operator")
  private String operator = null;

  @SerializedName("operator_strategy")
  private String operatorStrategy = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("optimizer_properties")
  private Object optimizerProperties = null;

  @SerializedName("inputs")
  private List<InputsEntity> inputs = null;

  public NodesEntity id(String id) {
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

  public NodesEntity parallelism(Integer parallelism) {
    this.parallelism = parallelism;
    return this;
  }

   /**
   * 
   * @return parallelism
  **/
  @ApiModelProperty(value = "")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  public NodesEntity operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * 
   * @return operator
  **/
  @ApiModelProperty(value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public NodesEntity operatorStrategy(String operatorStrategy) {
    this.operatorStrategy = operatorStrategy;
    return this;
  }

   /**
   * 
   * @return operatorStrategy
  **/
  @ApiModelProperty(value = "")
  public String getOperatorStrategy() {
    return operatorStrategy;
  }

  public void setOperatorStrategy(String operatorStrategy) {
    this.operatorStrategy = operatorStrategy;
  }

  public NodesEntity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NodesEntity optimizerProperties(Object optimizerProperties) {
    this.optimizerProperties = optimizerProperties;
    return this;
  }

   /**
   * 
   * @return optimizerProperties
  **/
  @ApiModelProperty(value = "")
  public Object getOptimizerProperties() {
    return optimizerProperties;
  }

  public void setOptimizerProperties(Object optimizerProperties) {
    this.optimizerProperties = optimizerProperties;
  }

  public NodesEntity inputs(List<InputsEntity> inputs) {
    this.inputs = inputs;
    return this;
  }

  public NodesEntity addInputsItem(InputsEntity inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<InputsEntity>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public List<InputsEntity> getInputs() {
    return inputs;
  }

  public void setInputs(List<InputsEntity> inputs) {
    this.inputs = inputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodesEntity nodesEntity = (NodesEntity) o;
    return Objects.equals(this.id, nodesEntity.id) &&
        Objects.equals(this.parallelism, nodesEntity.parallelism) &&
        Objects.equals(this.operator, nodesEntity.operator) &&
        Objects.equals(this.operatorStrategy, nodesEntity.operatorStrategy) &&
        Objects.equals(this.description, nodesEntity.description) &&
        Objects.equals(this.optimizerProperties, nodesEntity.optimizerProperties) &&
        Objects.equals(this.inputs, nodesEntity.inputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parallelism, operator, operatorStrategy, description, optimizerProperties, inputs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodesEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operatorStrategy: ").append(toIndentedString(operatorStrategy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    optimizerProperties: ").append(toIndentedString(optimizerProperties)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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

