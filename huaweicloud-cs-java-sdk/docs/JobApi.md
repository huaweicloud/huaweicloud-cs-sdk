# JobApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteJob**](JobApi.md#deleteJob) | **DELETE** /{X-Project-Id}/job/{job_id} | 删除作业
[**getJobDetail**](JobApi.md#getJobDetail) | **GET** /{X-Project-Id}/job/{job_id} | 查询作业详情
[**getJobExecuteGraph**](JobApi.md#getJobExecuteGraph) | **GET** /{X-Project-Id}/job/{job_id}/execute_graph | 查询作业执行计划图
[**getJobs**](JobApi.md#getJobs) | **GET** /{X-Project-Id}/jobs | 查询作业列表
[**runJob**](JobApi.md#runJob) | **POST** /{X-Project-Id}/job/{job_id}/run | 运行作业
[**stopJob**](JobApi.md#stopJob) | **POST** /{X-Project-Id}/job/{job_id}/stop | 停止作业
[**submitJarJob**](JobApi.md#submitJarJob) | **POST** /{X-Project-Id}/jar_job | 创建一个用户自定义作业
[**submitSqlJob**](JobApi.md#submitSqlJob) | **POST** /{X-Project-Id}/sql_job | 提交流式SQL作业到CS服务
[**updateJarJob**](JobApi.md#updateJarJob) | **PATCH** /{X-Project-Id}/jar_job | 更新用户自定义作业
[**updateSqlJob**](JobApi.md#updateSqlJob) | **PATCH** /{X-Project-Id}/sql_job | 更新流式SQL作业


<a name="deleteJob"></a>
# **deleteJob**
> GlobalResponse deleteJob(xProjectId, jobId)

删除作业

删除任何状态的作业

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long jobId = 789L; // Long | 作业ID
try {
    GlobalResponse result = apiInstance.deleteJob(xProjectId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **jobId** | **Long**| 作业ID |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobDetail"></a>
# **getJobDetail**
> GetJobDetailResponse getJobDetail(xProjectId, jobId)

查询作业详情

Get job detail information.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long jobId = 789L; // Long | 作业ID
try {
    GetJobDetailResponse result = apiInstance.getJobDetail(xProjectId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **jobId** | **Long**| 作业ID |

### Return type

[**GetJobDetailResponse**](GetJobDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobExecuteGraph"></a>
# **getJobExecuteGraph**
> JobExecutePlanResponse getJobExecuteGraph(xProjectId, jobId)

查询作业执行计划图

The execution graph is json format.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long jobId = 789L; // Long | 作业ID
try {
    JobExecutePlanResponse result = apiInstance.getJobExecuteGraph(xProjectId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobExecuteGraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **jobId** | **Long**| 作业ID |

### Return type

[**JobExecutePlanResponse**](JobExecutePlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobs"></a>
# **getJobs**
> QueryJobListResponse getJobs(xProjectId, name, status, clusterId, showDetail, cursor, next, limit, order, rootJobId)

查询作业列表

作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order, root_job_id. The cursor here is job id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 作业名
String status = "status_example"; // String | 作业状态码, 请参考CS文档
Integer clusterId = 56; // Integer | 用户独享集群ID
Boolean showDetail = false; // Boolean | 是否返回作业详情信息
Long cursor = 789L; // Long | 作业ID
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
Long rootJobId = 789L; // Long | 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业即边缘父作业, 不包括边缘子作业
try {
    QueryJobListResponse result = apiInstance.getJobs(xProjectId, name, status, clusterId, showDetail, cursor, next, limit, order, rootJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **name** | **String**| 作业名 | [optional]
 **status** | **String**| 作业状态码, 请参考CS文档 | [optional] [enum: job_init, job_submitting, job_submit_fail, job_running, job_running_exception, job_canceling, job_cancel_success, job_cancel_fail]
 **clusterId** | **Integer**| 用户独享集群ID | [optional]
 **showDetail** | **Boolean**| 是否返回作业详情信息 | [optional] [default to false]
 **cursor** | **Long**| 作业ID | [optional]
 **next** | **Boolean**| 是否向下翻页 | [optional] [default to true]
 **limit** | **Integer**| 返回的数据条数 | [optional] [default to 20]
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [optional] [default to desc] [enum: desc, asc]
 **rootJobId** | **Long**| 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业即边缘父作业, 不包括边缘子作业 | [optional]

### Return type

[**QueryJobListResponse**](QueryJobListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runJob"></a>
# **runJob**
> GlobalResponse runJob(xProjectId, jobId)

运行作业

触发运行作业

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long jobId = 789L; // Long | 作业ID
try {
    GlobalResponse result = apiInstance.runJob(xProjectId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#runJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **jobId** | **Long**| 作业ID |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopJob"></a>
# **stopJob**
> GlobalResponse stopJob(xProjectId, jobId)

停止作业

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long jobId = 789L; // Long | 作业ID
try {
    GlobalResponse result = apiInstance.stopJob(xProjectId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#stopJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **jobId** | **Long**| 作业ID |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitJarJob"></a>
# **submitJarJob**
> JobStatusResponse submitJarJob(xProjectId, name, desc, clusterId, managerSpu, jobType, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args)

创建一个用户自定义作业

用户自定义作业目前支持jar格式, 运行在独享集群中

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 作业名称
String desc = "desc_example"; // String | 作业描述
Integer clusterId = 56; // Integer | 独享集群资源ID, 当前用户有该独享资源的使用权限
Integer managerSpu = 56; // Integer | 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。
String jobType = "jobType_example"; // String | 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业
Integer spuNumber = 56; // Integer | 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置
Integer parallelNumber = 56; // Integer | 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置
Integer executorNumber = 56; // Integer | Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置
Integer executorSpu = 56; // Integer | Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置
Boolean logEnabled = true; // Boolean | 是否开启作业日志, true开启, false关闭, 默认false
String obsBucket = "obsBucket_example"; // String | log_enabled==true是, 用户授权保存日志的OBS路径
String smnTopic = "smnTopic_example"; // String | 当作业异常时，向该SMN主题推送告警信息
File jar = new File("/path/to/file.txt"); // File | 用户上传的jar文件, 优先级高于jar_url参数
String jarUrl = "jarUrl_example"; // String | 用户上传的jar包OBS路径
File config = new File("/path/to/file.txt"); // File | 用户上传的配置文件, 优先级高于config_url参数
String configUrl = "configUrl_example"; // String | 用户上传的config包OBS路径
String mainClass = "mainClass_example"; // String | 作业入口类
String args = "args_example"; // String | 作业入口类参数
try {
    JobStatusResponse result = apiInstance.submitJarJob(xProjectId, name, desc, clusterId, managerSpu, jobType, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#submitJarJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **name** | **String**| 作业名称 |
 **desc** | **String**| 作业描述 |
 **clusterId** | **Integer**| 独享集群资源ID, 当前用户有该独享资源的使用权限 |
 **managerSpu** | **Integer**| 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 |
 **jobType** | **String**| 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业 |
 **spuNumber** | **Integer**| 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 | [optional]
 **parallelNumber** | **Integer**| 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 | [optional]
 **executorNumber** | **Integer**| Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 | [optional]
 **executorSpu** | **Integer**| Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 | [optional]
 **logEnabled** | **Boolean**| 是否开启作业日志, true开启, false关闭, 默认false | [optional]
 **obsBucket** | **String**| log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 | [optional]
 **smnTopic** | **String**| 当作业异常时，向该SMN主题推送告警信息 | [optional]
 **jar** | **File**| 用户上传的jar文件, 优先级高于jar_url参数 | [optional]
 **jarUrl** | **String**| 用户上传的jar包OBS路径 | [optional]
 **config** | **File**| 用户上传的配置文件, 优先级高于config_url参数 | [optional]
 **configUrl** | **String**| 用户上传的config包OBS路径 | [optional]
 **mainClass** | **String**| 作业入口类 | [optional]
 **args** | **String**| 作业入口类参数 | [optional]

### Return type

[**JobStatusResponse**](JobStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="submitSqlJob"></a>
# **submitSqlJob**
> JobStatusResponse submitSqlJob(xProjectId, body)

提交流式SQL作业到CS服务

通过POST方式, 提交流式SQL作业, 请求体为JSON格式

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
SubmitSqlJobRequest body = new SubmitSqlJobRequest(); // SubmitSqlJobRequest | JSON格式的请求体
try {
    JobStatusResponse result = apiInstance.submitSqlJob(xProjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#submitSqlJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | [**SubmitSqlJobRequest**](SubmitSqlJobRequest.md)| JSON格式的请求体 |

### Return type

[**JobStatusResponse**](JobStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJarJob"></a>
# **updateJarJob**
> JobUpdateResponse updateJarJob(xProjectId, jobId, managerSpu, name, desc, clusterId, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args)

更新用户自定义作业

目前仅支持Jar格式, 运行在独享集群中

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long jobId = 789L; // Long | 作业ID
Integer managerSpu = 56; // Integer | 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。
String name = "name_example"; // String | 作业名称
String desc = "desc_example"; // String | 作业描述
Integer clusterId = 56; // Integer | 独享集群资源ID, 当前用户有该独享资源的使用权限
Integer spuNumber = 56; // Integer | 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置
Integer parallelNumber = 56; // Integer | 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置
Integer executorNumber = 56; // Integer | Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置
Integer executorSpu = 56; // Integer | Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置
Boolean logEnabled = true; // Boolean | 是否开启作业日志, true开启, false关闭, 默认false
String obsBucket = "obsBucket_example"; // String | log_enabled==true是, 用户授权保存日志的OBS路径
String smnTopic = "smnTopic_example"; // String | 当作业异常时，向该SMN主题推送告警信息
File jar = new File("/path/to/file.txt"); // File | 用户上传的jar文件, 优先级高于jar_url参数
String jarUrl = "jarUrl_example"; // String | 用户上传的jar包OBS路径
File config = new File("/path/to/file.txt"); // File | 用户上传的配置文件, 优先级高于config_url参数
String configUrl = "configUrl_example"; // String | 用户上传的config包OBS路径
String mainClass = "mainClass_example"; // String | 作业入口类
String args = "args_example"; // String | 作业入口类参数
try {
    JobUpdateResponse result = apiInstance.updateJarJob(xProjectId, jobId, managerSpu, name, desc, clusterId, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateJarJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **jobId** | **Long**| 作业ID |
 **managerSpu** | **Integer**| 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 |
 **name** | **String**| 作业名称 | [optional]
 **desc** | **String**| 作业描述 | [optional]
 **clusterId** | **Integer**| 独享集群资源ID, 当前用户有该独享资源的使用权限 | [optional]
 **spuNumber** | **Integer**| 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 | [optional]
 **parallelNumber** | **Integer**| 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 | [optional]
 **executorNumber** | **Integer**| Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 | [optional]
 **executorSpu** | **Integer**| Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 | [optional]
 **logEnabled** | **Boolean**| 是否开启作业日志, true开启, false关闭, 默认false | [optional]
 **obsBucket** | **String**| log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 | [optional]
 **smnTopic** | **String**| 当作业异常时，向该SMN主题推送告警信息 | [optional]
 **jar** | **File**| 用户上传的jar文件, 优先级高于jar_url参数 | [optional]
 **jarUrl** | **String**| 用户上传的jar包OBS路径 | [optional]
 **config** | **File**| 用户上传的配置文件, 优先级高于config_url参数 | [optional]
 **configUrl** | **String**| 用户上传的config包OBS路径 | [optional]
 **mainClass** | **String**| 作业入口类 | [optional]
 **args** | **String**| 作业入口类参数 | [optional]

### Return type

[**JobUpdateResponse**](JobUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateSqlJob"></a>
# **updateSqlJob**
> JobUpdateResponse updateSqlJob(xProjectId, body)

更新流式SQL作业

流式SQL的语法扩展了Apache Flink SQL, 具体详情请参考CS官方文档

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
UpdateSqlJobRequest body = new UpdateSqlJobRequest(); // UpdateSqlJobRequest | 提交修改SQL作业请求
try {
    JobUpdateResponse result = apiInstance.updateSqlJob(xProjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateSqlJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | [**UpdateSqlJobRequest**](UpdateSqlJobRequest.md)| 提交修改SQL作业请求 |

### Return type

[**JobUpdateResponse**](JobUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

