
# FlinkJobConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkpointEnabled** | **Boolean** | 是否开启作业自动快照功能, true开启, false关闭, 默认false |  [optional]
**checkpointMode** | [**CheckpointModeEnum**](#CheckpointModeEnum) | 快照模式, 两种可选, exactly_once和at_least_once |  [optional]
**checkpointInterval** | **Integer** | 快照时间间隔, 单位为秒 |  [optional]
**logEnabled** | **Boolean** | 是否启用日志存储 |  [optional]
**obsBucket** | **String** | OBS桶名 |  [optional]
**smnTopic** | **String** | SMN主题名 |  [optional]
**rootId** | **Long** | 父作业ID |  [optional]
**edgeGroupIds** | **List&lt;String&gt;** | 边缘计算组ID列表, 多个ID以逗号分隔 |  [optional]
**graphEditorEnabled** | **Boolean** | 是否启用可视化编辑 |  [optional]
**graphEditorData** | **String** | 可视化编辑数据 |  [optional]
**managerCuNumber** | **Integer** | 管理单元CU数 |  [optional]
**executorNumber** | **Integer** | 作业使用计算节点个数 |  [optional]
**executorCuNumber** | **Integer** | 计算节点cu数 |  [optional]
**cuNumber** | **Integer** | 用户为作业选择的CU数量, show_detail为true时独有 |  [optional]
**parallelNumber** | **Integer** | 用户设置的作业并行数, show_detail为true时独有 |  [optional]
**restartWhenException** | **Boolean** | 是否异常重启 |  [optional]
**idleStateRetention** | **Integer** | 空闲状态保留时间 |  [optional]
**configUrl** | **String** | 用户上传的配置文件的OBS路径 |  [optional]
**udfJarUrl** | **String** | sql作业udf jar所在的obs地址 |  [optional]
**entrypoint** | **String** |  |  [optional]
**dependencyJars** | **List&lt;String&gt;** | 依赖jar资源包列表 |  [optional]
**dependencyFiles** | **List&lt;String&gt;** | 依赖文件资源包列表 |  [optional]


<a name="CheckpointModeEnum"></a>
## Enum: CheckpointModeEnum
Name | Value
---- | -----
EXACTLY_ONCE | &quot;exactly_once&quot;
AT_LEAST_ONCE | &quot;at_least_once&quot;



