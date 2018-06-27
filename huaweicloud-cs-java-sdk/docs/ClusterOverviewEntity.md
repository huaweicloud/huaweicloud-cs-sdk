
# ClusterOverviewEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalClusters** | **Integer** | 集群总数 |  [optional]
**runningClusterCount** | **Integer** | 运行的集群总数 |  [optional]
**exceptionClusterCount** | **Integer** | 已完成的集群总数 |  [optional]
**otherClusterCount** | **Integer** | 运行异常的集群总数 |  [optional]
**runningClusterCharge** | **Double** | 正在运行的集群总费用 |  [optional]
**runningClusterPrice** | **Double** | 正在运行的集群单价合计 |  [optional]
**runningClusterTotalSpu** | **Integer** | 正在运行的集群消耗SPU总数 |  [optional]
**runningClusterTotalTime** | **Integer** | 正在运行的集群总时长 |  [optional]
**billingUnit** | [**BillingUnitEnum**](#BillingUnitEnum) | 结算币种 |  [optional]
**timeUnit** | [**TimeUnitEnum**](#TimeUnitEnum) | 时间单位 |  [optional]


<a name="BillingUnitEnum"></a>
## Enum: BillingUnitEnum
Name | Value
---- | -----
CNY | &quot;CNY&quot;
HKD | &quot;HKD&quot;
EUR | &quot;EUR&quot;
DEM | &quot;DEM&quot;
USD | &quot;USD&quot;


<a name="TimeUnitEnum"></a>
## Enum: TimeUnitEnum
Name | Value
---- | -----
HOUR | &quot;HOUR&quot;



