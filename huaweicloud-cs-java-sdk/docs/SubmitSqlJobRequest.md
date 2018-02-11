
# SubmitSqlJobRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 作业名称 | 
**desc** | **String** | 作业描述 |  [optional]
**templateId** | **Long** | 作业模板ID, 如果template_id和sql_body都不为空, 优先sql_body; 如果template_id不空, sql_body为空, 以template_id内容填充sql_body |  [optional]
**clusterId** | **Integer** | 独享集群资源ID, 前提是当前用户有该独享资源的使用权限 |  [optional]
**sqlBody** | **String** | Stream SQL语句, 至少包含source, query, sink三个部分 |  [optional]
**runMode** | [**RunModeEnum**](#RunModeEnum) | 作业运行模式，共享或者独享 | 
**spuNumber** | **Integer** | 用户为作业选择的SPU数量 |  [optional]
**parallelNumber** | **Integer** | 用户设置的作业并行数 |  [optional]
**checkpointEnabled** | **Boolean** | 是否开启作业自动快照功能, true开启, false关闭, 默认false |  [optional]
**checkpointMode** | [**CheckpointModeEnum**](#CheckpointModeEnum) | 快照模式, 两种可选, exactly_once和at_least_once |  [optional]
**checkpointInterval** | **Integer** | 快照时间间隔, 单位为秒 |  [optional]
**obsBucket** | **String** | checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径 |  [optional]
**logEnabled** | **Boolean** | 是否开启作业的日志上传到用户的OBS功能 |  [optional]


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



