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
 * 集群概要统计信息实体
 */
@ApiModel(description = "集群概要统计信息实体")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T10:03:30.829+08:00")
public class ClusterOverviewEntity {
  @SerializedName("total_clusters")
  private Integer totalClusters = null;

  @SerializedName("running_cluster_count")
  private Integer runningClusterCount = null;

  @SerializedName("exception_cluster_count")
  private Integer exceptionClusterCount = null;

  @SerializedName("other_cluster_count")
  private Integer otherClusterCount = null;

  @SerializedName("running_cluster_charge")
  private Double runningClusterCharge = null;

  @SerializedName("running_cluster_price")
  private Double runningClusterPrice = null;

  @SerializedName("running_cluster_total_spu")
  private Integer runningClusterTotalSpu = null;

  @SerializedName("running_cluster_total_time")
  private Double runningClusterTotalTime = null;

  /**
   * 结算币种
   */
  @JsonAdapter(BillingUnitEnum.Adapter.class)
  public enum BillingUnitEnum {
    CNY("CNY"),
    
    HKD("HKD"),
    
    EUR("EUR"),
    
    DEM("DEM"),
    
    USD("USD");

    private String value;

    BillingUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BillingUnitEnum fromValue(String text) {
      for (BillingUnitEnum b : BillingUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BillingUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BillingUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BillingUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("billing_unit")
  private BillingUnitEnum billingUnit = null;

  /**
   * 时间单位
   */
  @JsonAdapter(TimeUnitEnum.Adapter.class)
  public enum TimeUnitEnum {
    HOUR("HOUR");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeUnitEnum fromValue(String text) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TimeUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("time_unit")
  private TimeUnitEnum timeUnit = null;

  public ClusterOverviewEntity totalClusters(Integer totalClusters) {
    this.totalClusters = totalClusters;
    return this;
  }

   /**
   * 集群总数
   * @return totalClusters
  **/
  @ApiModelProperty(example = "100", value = "集群总数")
  public Integer getTotalClusters() {
    return totalClusters;
  }

  public void setTotalClusters(Integer totalClusters) {
    this.totalClusters = totalClusters;
  }

  public ClusterOverviewEntity runningClusterCount(Integer runningClusterCount) {
    this.runningClusterCount = runningClusterCount;
    return this;
  }

   /**
   * 运行的集群总数
   * @return runningClusterCount
  **/
  @ApiModelProperty(example = "100", value = "运行的集群总数")
  public Integer getRunningClusterCount() {
    return runningClusterCount;
  }

  public void setRunningClusterCount(Integer runningClusterCount) {
    this.runningClusterCount = runningClusterCount;
  }

  public ClusterOverviewEntity exceptionClusterCount(Integer exceptionClusterCount) {
    this.exceptionClusterCount = exceptionClusterCount;
    return this;
  }

   /**
   * 已完成的集群总数
   * @return exceptionClusterCount
  **/
  @ApiModelProperty(example = "100", value = "已完成的集群总数")
  public Integer getExceptionClusterCount() {
    return exceptionClusterCount;
  }

  public void setExceptionClusterCount(Integer exceptionClusterCount) {
    this.exceptionClusterCount = exceptionClusterCount;
  }

  public ClusterOverviewEntity otherClusterCount(Integer otherClusterCount) {
    this.otherClusterCount = otherClusterCount;
    return this;
  }

   /**
   * 运行异常的集群总数
   * @return otherClusterCount
  **/
  @ApiModelProperty(example = "100", value = "运行异常的集群总数")
  public Integer getOtherClusterCount() {
    return otherClusterCount;
  }

  public void setOtherClusterCount(Integer otherClusterCount) {
    this.otherClusterCount = otherClusterCount;
  }

  public ClusterOverviewEntity runningClusterCharge(Double runningClusterCharge) {
    this.runningClusterCharge = runningClusterCharge;
    return this;
  }

   /**
   * 正在运行的集群总费用
   * @return runningClusterCharge
  **/
  @ApiModelProperty(example = "10.2", value = "正在运行的集群总费用")
  public Double getRunningClusterCharge() {
    return runningClusterCharge;
  }

  public void setRunningClusterCharge(Double runningClusterCharge) {
    this.runningClusterCharge = runningClusterCharge;
  }

  public ClusterOverviewEntity runningClusterPrice(Double runningClusterPrice) {
    this.runningClusterPrice = runningClusterPrice;
    return this;
  }

   /**
   * 正在运行的集群单价合计
   * @return runningClusterPrice
  **/
  @ApiModelProperty(example = "10.2", value = "正在运行的集群单价合计")
  public Double getRunningClusterPrice() {
    return runningClusterPrice;
  }

  public void setRunningClusterPrice(Double runningClusterPrice) {
    this.runningClusterPrice = runningClusterPrice;
  }

  public ClusterOverviewEntity runningClusterTotalSpu(Integer runningClusterTotalSpu) {
    this.runningClusterTotalSpu = runningClusterTotalSpu;
    return this;
  }

   /**
   * 正在运行的集群消耗SPU总数
   * @return runningClusterTotalSpu
  **/
  @ApiModelProperty(example = "100", value = "正在运行的集群消耗SPU总数")
  public Integer getRunningClusterTotalSpu() {
    return runningClusterTotalSpu;
  }

  public void setRunningClusterTotalSpu(Integer runningClusterTotalSpu) {
    this.runningClusterTotalSpu = runningClusterTotalSpu;
  }

  public ClusterOverviewEntity runningClusterTotalTime(Double runningClusterTotalTime) {
    this.runningClusterTotalTime = runningClusterTotalTime;
    return this;
  }

   /**
   * 正在运行的集群总时长
   * @return runningClusterTotalTime
  **/
  @ApiModelProperty(example = "100.0", value = "正在运行的集群总时长")
  public Double getRunningClusterTotalTime() {
    return runningClusterTotalTime;
  }

  public void setRunningClusterTotalTime(Double runningClusterTotalTime) {
    this.runningClusterTotalTime = runningClusterTotalTime;
  }

  public ClusterOverviewEntity billingUnit(BillingUnitEnum billingUnit) {
    this.billingUnit = billingUnit;
    return this;
  }

   /**
   * 结算币种
   * @return billingUnit
  **/
  @ApiModelProperty(example = "CNY", value = "结算币种")
  public BillingUnitEnum getBillingUnit() {
    return billingUnit;
  }

  public void setBillingUnit(BillingUnitEnum billingUnit) {
    this.billingUnit = billingUnit;
  }

  public ClusterOverviewEntity timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * 时间单位
   * @return timeUnit
  **/
  @ApiModelProperty(example = "HOUR", value = "时间单位")
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterOverviewEntity clusterOverviewEntity = (ClusterOverviewEntity) o;
    return Objects.equals(this.totalClusters, clusterOverviewEntity.totalClusters) &&
        Objects.equals(this.runningClusterCount, clusterOverviewEntity.runningClusterCount) &&
        Objects.equals(this.exceptionClusterCount, clusterOverviewEntity.exceptionClusterCount) &&
        Objects.equals(this.otherClusterCount, clusterOverviewEntity.otherClusterCount) &&
        Objects.equals(this.runningClusterCharge, clusterOverviewEntity.runningClusterCharge) &&
        Objects.equals(this.runningClusterPrice, clusterOverviewEntity.runningClusterPrice) &&
        Objects.equals(this.runningClusterTotalSpu, clusterOverviewEntity.runningClusterTotalSpu) &&
        Objects.equals(this.runningClusterTotalTime, clusterOverviewEntity.runningClusterTotalTime) &&
        Objects.equals(this.billingUnit, clusterOverviewEntity.billingUnit) &&
        Objects.equals(this.timeUnit, clusterOverviewEntity.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalClusters, runningClusterCount, exceptionClusterCount, otherClusterCount, runningClusterCharge, runningClusterPrice, runningClusterTotalSpu, runningClusterTotalTime, billingUnit, timeUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterOverviewEntity {\n");
    
    sb.append("    totalClusters: ").append(toIndentedString(totalClusters)).append("\n");
    sb.append("    runningClusterCount: ").append(toIndentedString(runningClusterCount)).append("\n");
    sb.append("    exceptionClusterCount: ").append(toIndentedString(exceptionClusterCount)).append("\n");
    sb.append("    otherClusterCount: ").append(toIndentedString(otherClusterCount)).append("\n");
    sb.append("    runningClusterCharge: ").append(toIndentedString(runningClusterCharge)).append("\n");
    sb.append("    runningClusterPrice: ").append(toIndentedString(runningClusterPrice)).append("\n");
    sb.append("    runningClusterTotalSpu: ").append(toIndentedString(runningClusterTotalSpu)).append("\n");
    sb.append("    runningClusterTotalTime: ").append(toIndentedString(runningClusterTotalTime)).append("\n");
    sb.append("    billingUnit: ").append(toIndentedString(billingUnit)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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

