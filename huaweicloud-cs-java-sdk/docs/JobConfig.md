
# JobConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkpointEnabled** | **Boolean** | 是否开启作业自动快照功能, true开启, false关闭, 默认false |  [optional]
**checkpointMode** | [**CheckpointModeEnum**](#CheckpointModeEnum) | 快照模式, 两种可选, exactly_once和at_least_once |  [optional]
**checkpointInterval** | **Integer** | 快照时间间隔, 单位为秒 |  [optional]
**logEnabled** | **Boolean** | 是否启用日志存储 |  [optional]
**obsBucket** | **String** | OBS桶名 |  [optional]
**rootId** | **Long** | 父作业ID |  [optional]
**edgeGroupIds** | **String** | 边缘计算组ID列表, 多个ID以逗号分隔 |  [optional]
**managerSpu** | **Integer** | 管理单元SPU数 |  [optional]


<a name="CheckpointModeEnum"></a>
## Enum: CheckpointModeEnum
Name | Value
---- | -----
EXACTLY_ONCE | &quot;exactly_once&quot;
AT_LEAST_ONCE | &quot;at_least_once&quot;



