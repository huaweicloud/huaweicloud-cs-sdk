
# UpdateSqlJobRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **Long** | 作业ID | 
**name** | **String** | 作业名称 |  [optional]
**desc** | **String** | 作业描述 |  [optional]
**clusterId** | **Integer** | 独享集群资源ID, 当前用户有该独享资源的使用权限 |  [optional]
**sqlBody** | **String** | Stream SQL语句, 至少包含source, query, sink三个部分 |  [optional]
**runMode** | [**RunModeEnum**](#RunModeEnum) | 作业运行模式，共享或者独享或者边缘节点 |  [optional]
**spuNumber** | **Integer** | 用户为作业选择的SPU数量 |  [optional]
**parallelNumber** | **Integer** | 用户设置的作业并行数 |  [optional]
**checkpointEnabled** | **Boolean** | 是否开启作业自动快照功能, true开启, false关闭, 默认false |  [optional]
**checkpointMode** | [**CheckpointModeEnum**](#CheckpointModeEnum) | 快照模式, 两种可选, exactly_once和at_least_once |  [optional]
**checkpointInterval** | **Integer** | 快照时间间隔, 单位为秒 |  [optional]
**obsBucket** | **String** | checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径 |  [optional]
**logEnabled** | **Boolean** | 是否开启作业的日志上传到用户的OBS功能 |  [optional]
**smnTopic** | **String** | 当作业异常时，向该SMN主题推送告警信息 |  [optional]
**restartWhenException** | **Boolean** | 是否开启异常重启功能 |  [optional]
**idleStateRetention** | **Integer** | 空闲状态最长保留时间，超过该时间没有进行更新的中间状态会被删除，单位为秒 |  [optional]
**edgeGroupIds** | **String** | 边缘计算组ID列表, 多个ID以逗号分隔 |  [optional]
**sysEnterpriseProjectId** | **String** | 作业所属的企业项目id |  [optional]
**udfJarUrl** | **String** | sql作业udf jar所在的obs地址 |  [optional]
**dirtyDataStrategy** | **String** | 作业脏数据策略 |  [optional]


<a name="RunModeEnum"></a>
## Enum: RunModeEnum
Name | Value
---- | -----
SHARED_CLUSTER | &quot;shared_cluster&quot;
EXCLUSIVE_CLUSTER | &quot;exclusive_cluster&quot;
EDGE_NODE | &quot;edge_node&quot;


<a name="CheckpointModeEnum"></a>
## Enum: CheckpointModeEnum
Name | Value
---- | -----
EXACTLY_ONCE | &quot;exactly_once&quot;
AT_LEAST_ONCE | &quot;at_least_once&quot;



