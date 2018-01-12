# JobApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteJob**](JobApi.md#deleteJob) | **DELETE** /{X-Project-Id}/job | 删除作业
[**getJobDetail**](JobApi.md#getJobDetail) | **GET** /{X-Project-Id}/job/{job_id} | get job detail
[**getJobExecuteGraph**](JobApi.md#getJobExecuteGraph) | **GET** /{X-Project-Id}/job/{job_id}/execute_graph | get job execution graph
[**getJobs**](JobApi.md#getJobs) | **GET** /{X-Project-Id}/jobs | 查询作业列表
[**runJob**](JobApi.md#runJob) | **POST** /{X-Project-Id}/job/run | 运行作业
[**stopJob**](JobApi.md#stopJob) | **POST** /{X-Project-Id}/job/stop | Trigger to stop the running job
[**submitJarJob**](JobApi.md#submitJarJob) | **POST** /{X-Project-Id}/jar_job | 创建一个用户自定义作业
[**submitSqlJob**](JobApi.md#submitSqlJob) | **POST** /{X-Project-Id}/sql_job | 提交流式SQL作业到CloudStream服务
[**updateJarJob**](JobApi.md#updateJarJob) | **PATCH** /{X-Project-Id}/jar_job | 更新用户自定义作业
[**updateSqlJob**](JobApi.md#updateSqlJob) | **PATCH** /{X-Project-Id}/sql_job | 更新流式SQL作业


<a name="deleteJob"></a>
# **deleteJob**
> Boolean deleteJob(xProjectId, body)

删除作业

删除任何状态的作业

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
List<Long> body = Arrays.asList(new List<Long>()); // List<Long> | 删除作业, JSON数组中为一到多个作业ID
try {
    Boolean result = apiInstance.deleteJob(xProjectId, body);
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
 **body** | **List&lt;Long&gt;**| 删除作业, JSON数组中为一到多个作业ID |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobDetail"></a>
# **getJobDetail**
> GetJobDetailResponse getJobDetail(xProjectId, jobId)

get job detail

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

get job execution graph

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
> QueryJobListResponse getJobs(xProjectId, name, status, clusterId, showDetail, cursor, next, limit, order)

查询作业列表

作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order. The cursor here is job id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 作业名
String status = "status_example"; // String | 作业状态码, 请参考CloudStream文档
Integer clusterId = 56; // Integer | 用户预留集群ID
Boolean showDetail = false; // Boolean | 是否返回作业详情信息
Long cursor = 789L; // Long | 作业ID游标
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryJobListResponse result = apiInstance.getJobs(xProjectId, name, status, clusterId, showDetail, cursor, next, limit, order);
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
 **status** | **String**| 作业状态码, 请参考CloudStream文档 | [optional] [enum: job_init, job_submiting, job_submit_fail, job_running, job_running_exception, job_canceling, job_cancel_success, job_cancel_fail]
 **clusterId** | **Integer**| 用户预留集群ID | [optional]
 **showDetail** | **Boolean**| 是否返回作业详情信息 | [optional] [default to false]
 **cursor** | **Long**| 作业ID游标 | [optional]
 **next** | **Boolean**| 是否向下翻页 | [optional] [default to true]
 **limit** | **Integer**| 返回的数据条数 | [optional] [default to 20]
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [optional] [default to desc] [enum: desc, asc]

### Return type

[**QueryJobListResponse**](QueryJobListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runJob"></a>
# **runJob**
> JobStatusResponse runJob(xProjectId, body)

运行作业

触发运行作业

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
List<Long> body = Arrays.asList(new List<Long>()); // List<Long> | 运行作业, JSON数组中为一到多个作业ID
try {
    JobStatusResponse result = apiInstance.runJob(xProjectId, body);
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
 **body** | **List&lt;Long&gt;**| 运行作业, JSON数组中为一到多个作业ID |

### Return type

[**JobStatusResponse**](JobStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopJob"></a>
# **stopJob**
> JobStatusResponse stopJob(xProjectId, body)

Trigger to stop the running job

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
List<Long> body = Arrays.asList(new List<Long>()); // List<Long> | 停止作业, JSON数组中为一到多个作业ID
try {
    JobStatusResponse result = apiInstance.stopJob(xProjectId, body);
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
 **body** | **List&lt;Long&gt;**| 停止作业, JSON数组中为一到多个作业ID |

### Return type

[**JobStatusResponse**](JobStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitJarJob"></a>
# **submitJarJob**
> JobStatusResponse submitJarJob(xProjectId, name, desc, clusterId, spuNumber, logEnabled, obsBucket, jar, jobType, mainClass, args)

创建一个用户自定义作业

用户自定义作业目前支持jar格式, 运行在预留集群中

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 作业名称
String desc = "desc_example"; // String | 作业描述
Long clusterId = 789L; // Long | 预留的集群资源ID, 当前用户有该预留资源的使用权限
Integer spuNumber = 56; // Integer | 用户为作业选择的SPU数量
Boolean logEnabled = true; // Boolean | 是否开启作业日志, true开启, false关闭, 默认false
String obsBucket = "obsBucket_example"; // String | log_enabled==true是, 用户授权保存日志的OBS路径
File jar = new File("/path/to/file.txt"); // File | upload user defined jar
String jobType = "jobType_example"; // String | 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业
String mainClass = "mainClass_example"; // String | 作业入口类
String args = "args_example"; // String | 作业入口类参数
try {
    JobStatusResponse result = apiInstance.submitJarJob(xProjectId, name, desc, clusterId, spuNumber, logEnabled, obsBucket, jar, jobType, mainClass, args);
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
 **clusterId** | **Long**| 预留的集群资源ID, 当前用户有该预留资源的使用权限 |
 **spuNumber** | **Integer**| 用户为作业选择的SPU数量 |
 **logEnabled** | **Boolean**| 是否开启作业日志, true开启, false关闭, 默认false |
 **obsBucket** | **String**| log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 | [optional]
 **jar** | **File**| upload user defined jar | [optional]
 **jobType** | **String**| 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业 | [optional]
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

提交流式SQL作业到CloudStream服务

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
> JobStatusResponse updateJarJob(xProjectId, jobId, name, desc, clusterId, spuNumber, logEnabled, obsBucket, jar, mainClass, args)

更新用户自定义作业

目前仅支持Jar格式, 运行在预留集群中

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String jobId = "jobId_example"; // String | 作业ID
String name = "name_example"; // String | 作业名称
String desc = "desc_example"; // String | 作业描述
Long clusterId = 789L; // Long | 预留的集群资源ID, 当前用户有该预留资源的使用权限
Integer spuNumber = 56; // Integer | 用户为作业选择的SPU数量
Boolean logEnabled = true; // Boolean | 是否开启作业日志, true开启, false关闭, 默认false
String obsBucket = "obsBucket_example"; // String | log_enabled==true是, 用户授权保存日志的OBS路径
File jar = new File("/path/to/file.txt"); // File | upload user defined jar
String mainClass = "mainClass_example"; // String | 作业入口类
String args = "args_example"; // String | 作业入口类参数
try {
    JobStatusResponse result = apiInstance.updateJarJob(xProjectId, jobId, name, desc, clusterId, spuNumber, logEnabled, obsBucket, jar, mainClass, args);
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
 **jobId** | **String**| 作业ID |
 **name** | **String**| 作业名称 | [optional]
 **desc** | **String**| 作业描述 | [optional]
 **clusterId** | **Long**| 预留的集群资源ID, 当前用户有该预留资源的使用权限 | [optional]
 **spuNumber** | **Integer**| 用户为作业选择的SPU数量 | [optional]
 **logEnabled** | **Boolean**| 是否开启作业日志, true开启, false关闭, 默认false | [optional]
 **obsBucket** | **String**| log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 | [optional]
 **jar** | **File**| upload user defined jar | [optional]
 **mainClass** | **String**| 作业入口类 | [optional]
 **args** | **String**| 作业入口类参数 | [optional]

### Return type

[**JobStatusResponse**](JobStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateSqlJob"></a>
# **updateSqlJob**
> SqlJobUpdateResponse updateSqlJob(xProjectId, body)

更新流式SQL作业

流式SQL的语法扩展了Apache Flink SQL, 具体详情请参考CloudStream官方文档

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.JobApi;


JobApi apiInstance = new JobApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
UpdateSqlJobRequest body = new UpdateSqlJobRequest(); // UpdateSqlJobRequest | 提交修改SQL作业请求
try {
    SqlJobUpdateResponse result = apiInstance.updateSqlJob(xProjectId, body);
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

[**SqlJobUpdateResponse**](SqlJobUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

