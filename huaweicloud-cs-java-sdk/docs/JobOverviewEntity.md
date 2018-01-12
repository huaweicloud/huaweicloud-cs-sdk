
# JobOverviewEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalJobs** | **Integer** | 作业总数 |  [optional]
**runningJobsCount** | **Integer** | 运行的作业总数 |  [optional]
**finishedJobCount** | **Integer** | 已完成的作业总数 |  [optional]
**exceptionJobCount** | **Integer** | 运行异常的作业总数 |  [optional]
**runningJobCharge** | **Integer** | 正在运行的作业总费用 |  [optional]
**runningJobPrice** | **Integer** | 正在运行的作业单价合计 |  [optional]
**runningJobTotalSpu** | **Integer** | 正在运行的作业消耗SPU总数 |  [optional]
**runningJobTotalTime** | **Integer** | 正在运行的作业总时长 |  [optional]
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



