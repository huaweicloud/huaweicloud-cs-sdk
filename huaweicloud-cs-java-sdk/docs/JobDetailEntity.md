
# JobDetailEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **Long** | 作业ID | 
**name** | **String** | 作业名称 |  [optional]
**desc** | **String** | 作业描述 |  [optional]
**createTime** | **Long** | 作业创建时间 | 
**startTime** | **Long** | 作业启动时间, 0尚未启动 |  [optional]
**statusCode** | **Integer** | 作业状态码 | 
**statusName** | **String** | 作业状态名称 |  [optional]
**statusDesc** | **String** | 作业状态描述 |  [optional]
**provider** | **String** | 作业提交者 |  [optional]
**clusterId** | **Long** | 预留的集群资源ID, 当前用户有该预留资源的使用权限 |  [optional]
**sqlBody** | **String** | Stream SQL语句分 |  [optional]
**jarBody** | **String** | CloudStream Service Jar job Size |  [optional]
**runMode** | [**RunModeEnum**](#RunModeEnum) | 作业运行模式，共享或者独享模式 |  [optional]
**spuNumber** | **Integer** | 用户为作业选择的SPU数量 |  [optional]
**parallelNumber** | **Integer** | 用户设置的作业并行数 |  [optional]
**checkpointEnabled** | **Boolean** | 是否开启作业自动快照功能, true开启, false关闭, 默认false |  [optional]
**checkpointMode** | [**CheckpointModeEnum**](#CheckpointModeEnum) | 快照模式, 两种可选, exactly_once和at_least_once |  [optional]
**obsBucket** | **String** | checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径 |  [optional]
**checkpointInterval** | **Integer** | 快照时间间隔, 单位为秒 |  [optional]


<a name="RunModeEnum"></a>
## Enum: RunModeEnum
Name | Value
---- | -----
SHARED_CLUSTER | &quot;shared_cluster&quot;
EXCLUSIVE_CLUSTER | &quot;exclusive_cluster&quot;


<a name="CheckpointModeEnum"></a>
## Enum: CheckpointModeEnum
Name | Value
---- | -----
EXACTLY_ONCE | &quot;exactly_once&quot;
AT_LEAST_ONCE | &quot;at_least_once&quot;



