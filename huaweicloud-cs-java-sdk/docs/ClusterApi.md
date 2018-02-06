# ClusterApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReservedCluster**](ClusterApi.md#createReservedCluster) | **POST** /{X-Project-Id}/reserved_cluster | 创建一个为具有cs_adm角色的CloudStream用户预留一个计算集群, 预留的集群会折算成SPU, 按需计费
[**deleteReservedCluster**](ClusterApi.md#deleteReservedCluster) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id} | 删除预留的集群, 如果集群中有运行的作业会自动立即停止
[**describeReservedCluster**](ClusterApi.md#describeReservedCluster) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id} | 查询用户创建的预留集群信息
[**getClusterJobs**](ClusterApi.md#getClusterJobs) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/jobs | 查询预留集群下的作业列表
[**getReservedClusters**](ClusterApi.md#getReservedClusters) | **GET** /{X-Project-Id}/reserved_clusters | 查询租户下的集群列表
[**getUserQuota**](ClusterApi.md#getUserQuota) | **GET** /{X-Project-Id}/user_quota/{user_id} | 查询指定用户配额信息
[**getUserQuotas**](ClusterApi.md#getUserQuotas) | **GET** /{X-Project-Id}/user_quotas | 获取租户下的用户配额信息
[**updateReservedCluster**](ClusterApi.md#updateReservedCluster) | **PATCH** /{X-Project-Id}/reserved_cluster/{cluster_id} | 更新预留的集群
[**updateUserQuota**](ClusterApi.md#updateUserQuota) | **PATCH** /{X-Project-Id}/user_quota/{user_id} | 更新指定用户配额信息


<a name="createReservedCluster"></a>
# **createReservedCluster**
> CreateClusterResponse createReservedCluster(xProjectId, body)

创建一个为具有cs_adm角色的CloudStream用户预留一个计算集群, 预留的集群会折算成SPU, 按需计费



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
NewReservedClusterRequest body = new NewReservedClusterRequest(); // NewReservedClusterRequest | 创建一个新的预留集群, 请求参数为json格式
try {
    CreateClusterResponse result = apiInstance.createReservedCluster(xProjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | [**NewReservedClusterRequest**](NewReservedClusterRequest.md)| 创建一个新的预留集群, 请求参数为json格式 |

### Return type

[**CreateClusterResponse**](CreateClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReservedCluster"></a>
# **deleteReservedCluster**
> GlobalResponse deleteReservedCluster(xProjectId, clusterId)

删除预留的集群, 如果集群中有运行的作业会自动立即停止



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long clusterId = 789L; // Long | 预留集群ID
try {
    GlobalResponse result = apiInstance.deleteReservedCluster(xProjectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Long**| 预留集群ID |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeReservedCluster"></a>
# **describeReservedCluster**
> QueryClusterResponse describeReservedCluster(xProjectId, clusterId)

查询用户创建的预留集群信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long clusterId = 789L; // Long | 预留集群ID.
try {
    QueryClusterResponse result = apiInstance.describeReservedCluster(xProjectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#describeReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Long**| 预留集群ID. |

### Return type

[**QueryClusterResponse**](QueryClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterJobs"></a>
# **getClusterJobs**
> QueryJobListResponse getClusterJobs(xProjectId, clusterId, name, status, showDetail, cursor, next, limit, order)

查询预留集群下的作业列表

预留集群作业列表查询

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long clusterId = 789L; // Long | 预留集群ID
String name = "name_example"; // String | 作业名
String status = "status_example"; // String | 作业状态码, 请参考CloudStream文档
Boolean showDetail = false; // Boolean | 是否返回作业详情信息
Long cursor = 789L; // Long | 作业ID游标
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryJobListResponse result = apiInstance.getClusterJobs(xProjectId, clusterId, name, status, showDetail, cursor, next, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Long**| 预留集群ID |
 **name** | **String**| 作业名 | [optional]
 **status** | **String**| 作业状态码, 请参考CloudStream文档 | [optional] [enum: job_init, job_submiting, job_submit_fail, job_running, job_running_exception, job_canceling, job_cancel_success, job_cancel_fail]
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

<a name="getReservedClusters"></a>
# **getReservedClusters**
> QueryClustersResponse getReservedClusters(xProjectId, name, status, cursor, next, limit, order)

查询租户下的集群列表

租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 集群名
String status = "status_example"; // String | 集群状态码, 请参考CloudStream文档
Long cursor = 789L; // Long | 集群ID游标
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 10; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryClustersResponse result = apiInstance.getReservedClusters(xProjectId, name, status, cursor, next, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getReservedClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **name** | **String**| 集群名 | [optional]
 **status** | **String**| 集群状态码, 请参考CloudStream文档 | [optional] [enum: cluster_creating, cluster_create_fail, cluster_create_success, cluster_starting, cluster_running, cluster_deleting, cluster_delete_fail]
 **cursor** | **Long**| 集群ID游标 | [optional]
 **next** | **Boolean**| 是否向下翻页 | [optional] [default to true]
 **limit** | **Integer**| 返回的数据条数 | [optional] [default to 10]
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [optional] [default to desc] [enum: desc, asc]

### Return type

[**QueryClustersResponse**](QueryClustersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserQuota"></a>
# **getUserQuota**
> QueryUserQuotaResponse getUserQuota(xProjectId, userId)

查询指定用户配额信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String userId = "userId_example"; // String | 用户ID
try {
    QueryUserQuotaResponse result = apiInstance.getUserQuota(xProjectId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getUserQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **userId** | **String**| 用户ID |

### Return type

[**QueryUserQuotaResponse**](QueryUserQuotaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserQuotas"></a>
# **getUserQuotas**
> QueryUserQuotasResponse getUserQuotas(xProjectId, name, cursor, next, limit, order)

获取租户下的用户配额信息

租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 用户名
String cursor = "cursor_example"; // String | 用户ID游标
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryUserQuotasResponse result = apiInstance.getUserQuotas(xProjectId, name, cursor, next, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getUserQuotas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **name** | **String**| 用户名 | [optional]
 **cursor** | **String**| 用户ID游标 | [optional]
 **next** | **Boolean**| 是否向下翻页 | [optional] [default to true]
 **limit** | **Integer**| 返回的数据条数 | [optional] [default to 20]
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [optional] [default to desc] [enum: desc, asc]

### Return type

[**QueryUserQuotasResponse**](QueryUserQuotasResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReservedCluster"></a>
# **updateReservedCluster**
> GlobalResponse updateReservedCluster(xProjectId, clusterId, body)

更新预留的集群



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long clusterId = 789L; // Long | 预留集群ID
UpdateClusterRequest body = new UpdateClusterRequest(); // UpdateClusterRequest | 提交修改集群请求
try {
    GlobalResponse result = apiInstance.updateReservedCluster(xProjectId, clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Long**| 预留集群ID |
 **body** | [**UpdateClusterRequest**](UpdateClusterRequest.md)| 提交修改集群请求 |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserQuota"></a>
# **updateUserQuota**
> GlobalResponse updateUserQuota(xProjectId, userId, body)

更新指定用户配额信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String userId = "userId_example"; // String | 用户ID
UpdateUserQuotaRequest body = new UpdateUserQuotaRequest(); // UpdateUserQuotaRequest | JSON格式的请求体
try {
    GlobalResponse result = apiInstance.updateUserQuota(xProjectId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateUserQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **userId** | **String**| 用户ID |
 **body** | [**UpdateUserQuotaRequest**](UpdateUserQuotaRequest.md)| JSON格式的请求体 |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

