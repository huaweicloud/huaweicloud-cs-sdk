
# SubmitJarJobRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 作业名称 | 
**desc** | **String** | 作业描述 |  [optional]
**clusterId** | **Long** | 预留的集群资源ID, 当前用户有该预留资源的使用权限 | 
**spuNumber** | **Integer** | 用户为作业选择的SPU数量 |  [optional]
**obsBucket** | **String** | log_enabled&#x3D;&#x3D;true是, 用户授权保存作业日志的OBS路径 |  [optional]
**logEnabled** | **Boolean** | 是否开启作业的日志上传到用户的OBS功能 |  [optional]



