
# JobEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **Long** | 作业ID |  [optional]
**name** | **String** | 作业名称 |  [optional]
**desc** | **String** | 作业描述 |  [optional]
**username** | **String** | 用户名, show_detail为false时独有 |  [optional]
**jobType** | **String** | 作业类型 |  [optional]
**status** | **String** | 作业状态 |  [optional]
**statusDesc** | **String** | 作业状态描述 |  [optional]
**createTime** | **Long** | 作业创建时间 |  [optional]
**startTime** | **Long** | 作业启动时间, 0尚未启动 |  [optional]
**duration** | **Long** | 作业运行时长, 单位ms, show_detail为false时独有 |  [optional]
**userId** | **String** | 作业所属用户标识, show_detail为true时独有 |  [optional]
**clusterId** | **Integer** | 独享集群资源ID, 当前用户有该独享资源的使用权限, show_detail为true时独有 |  [optional]
**projectId** | **String** | 作业所属项目标识, show_detail为true时独有 |  [optional]
**sqlBody** | **String** | Stream SQL语句, show_detail为true时独有 |  [optional]
**runMode** | [**RunModeEnum**](#RunModeEnum) | 作业运行模式，共享或者独享模式, show_detail为true时独有 |  [optional]
**spuNumber** | **Integer** | 用户为作业选择的SPU数量, show_detail为true时独有 |  [optional]
**parallelNumber** | **Integer** | 用户设置的作业并行数, show_detail为true时独有 |  [optional]
**jobConfig** | [**JobConfig**](JobConfig.md) |  |  [optional]
**jarUrl** | **String** | jar包的OBS路径, show_detail为true时独有 |  [optional]
**mainClass** | **String** | checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径, show_detail为true时独有 |  [optional]
**args** | **String** | jar包作业运行参数, show_detail为true时独有 |  [optional]
**executionGraph** | **String** | 作业执行计划, show_detail为true时独有 |  [optional]
**updateTime** | **Long** | 作业更新时间, show_detail为true时独有 |  [optional]


<a name="RunModeEnum"></a>
## Enum: RunModeEnum
Name | Value
---- | -----
SHARED_CLUSTER | &quot;shared_cluster&quot;
EXCLUSIVE_CLUSTER | &quot;exclusive_cluster&quot;



