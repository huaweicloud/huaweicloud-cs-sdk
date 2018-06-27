# ClusterApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addHostsInfo**](ClusterApi.md#addHostsInfo) | **POST** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts | 添加IP域名映射信息
[**createReservedCluster**](ClusterApi.md#createReservedCluster) | **POST** /{X-Project-Id}/reserved_cluster | 为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费
[**deleteHostsInfo**](ClusterApi.md#deleteHostsInfo) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts | 删除IP域名映射信息
[**deleteReservedCluster**](ClusterApi.md#deleteReservedCluster) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id} | 删除独享集群, 如果集群中有运行的作业会自动立即停止
[**describeReservedCluster**](ClusterApi.md#describeReservedCluster) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id} | 查询用户创建的独享集群信息
[**getClusterJobs**](ClusterApi.md#getClusterJobs) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/jobs | 查询独享集群下的作业列表
[**getHostsInfo**](ClusterApi.md#getHostsInfo) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts | 查询指定集群的IP域名映射信息
[**getReservedClusters**](ClusterApi.md#getReservedClusters) | **GET** /{X-Project-Id}/reserved_clusters | 查询租户下的集群列表
[**getUserQuota**](ClusterApi.md#getUserQuota) | **GET** /{X-Project-Id}/user_quota/{user_id} | 查询指定用户配额信息
[**getUserQuotas**](ClusterApi.md#getUserQuotas) | **GET** /{X-Project-Id}/user_quotas | 获取租户下的用户配额信息
[**updateHostsInfo**](ClusterApi.md#updateHostsInfo) | **PATCH** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts/{host_id} | 更新IP域名映射信息
[**updateReservedCluster**](ClusterApi.md#updateReservedCluster) | **PATCH** /{X-Project-Id}/reserved_cluster/{cluster_id} | 更新独享集群
[**updateUserQuota**](ClusterApi.md#updateUserQuota) | **PATCH** /{X-Project-Id}/user_quota/{user_id} | 更新指定用户配额信息


<a name="addHostsInfo"></a>
# **addHostsInfo**
> AddHostsInfoResponse addHostsInfo(xProjectId, clusterId, body)

添加IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
Body body = new Body(); // Body | JSON格式的请求体
try {
    AddHostsInfoResponse result = apiInstance.addHostsInfo(xProjectId, clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#addHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **body** | [**Body**](Body.md)| JSON格式的请求体 |

### Return type

[**AddHostsInfoResponse**](AddHostsInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReservedCluster"></a>
# **createReservedCluster**
> CreateClusterResponse createReservedCluster(xProjectId, body)

为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
NewReservedClusterRequest body = new NewReservedClusterRequest(); // NewReservedClusterRequest | 创建一个新的独享集群, 请求参数为json格式
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
 **body** | [**NewReservedClusterRequest**](NewReservedClusterRequest.md)| 创建一个新的独享集群, 请求参数为json格式 |

### Return type

[**CreateClusterResponse**](CreateClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHostsInfo"></a>
# **deleteHostsInfo**
> List&lt;DeleteHostsInfoResponse&gt; deleteHostsInfo(xProjectId, clusterId, body)

删除IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
Body1 body = new Body1(); // Body1 | JSON格式的请求体
try {
    List<DeleteHostsInfoResponse> result = apiInstance.deleteHostsInfo(xProjectId, clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **body** | [**Body1**](Body1.md)| JSON格式的请求体 |

### Return type

[**List&lt;DeleteHostsInfoResponse&gt;**](DeleteHostsInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReservedCluster"></a>
# **deleteReservedCluster**
> GlobalResponse deleteReservedCluster(xProjectId, clusterId)

删除独享集群, 如果集群中有运行的作业会自动立即停止



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
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
 **clusterId** | **Integer**| 独享集群ID |

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

查询用户创建的独享集群信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
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
 **clusterId** | **Integer**| 独享集群ID. |

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

查询独享集群下的作业列表

独享集群作业列表查询

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
String name = "name_example"; // String | 作业名
String status = "status_example"; // String | 作业状态码, 请参考CS文档
Boolean showDetail = false; // Boolean | 是否返回作业详情信息
Long cursor = 789L; // Long | 作业ID
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
 **clusterId** | **Integer**| 独享集群ID |
 **name** | **String**| 作业名 | [optional]
 **status** | **String**| 作业状态码, 请参考CS文档 | [optional] [enum: job_init, job_submitting, job_submit_fail, job_running, job_running_exception, job_canceling, job_cancel_success, job_cancel_fail]
 **showDetail** | **Boolean**| 是否返回作业详情信息 | [optional] [default to false]
 **cursor** | **Long**| 作业ID | [optional]
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

<a name="getHostsInfo"></a>
# **getHostsInfo**
> QueryClusterHostsInfoResponse getHostsInfo(xProjectId, clusterId)

查询指定集群的IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
try {
    QueryClusterHostsInfoResponse result = apiInstance.getHostsInfo(xProjectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |

### Return type

[**QueryClusterHostsInfoResponse**](QueryClusterHostsInfoResponse.md)

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
String status = "status_example"; // String | 集群状态码, 请参考CS文档
Long cursor = 789L; // Long | 集群ID
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
 **status** | **String**| 集群状态码, 请参考CS文档 | [optional] [enum: cluster_creating, cluster_create_fail, cluster_create_success, cluster_starting, cluster_running, cluster_deleting, cluster_delete_fail]
 **cursor** | **Long**| 集群ID | [optional]
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
String cursor = "cursor_example"; // String | 用户ID
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
 **cursor** | **String**| 用户ID | [optional]
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

<a name="updateHostsInfo"></a>
# **updateHostsInfo**
> UpdateHostsInfoResponse updateHostsInfo(xProjectId, clusterId, hostId, body)

更新IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
Integer hostId = 56; // Integer | 域名ID.
Body2 body = new Body2(); // Body2 | JSON格式的请求体
try {
    UpdateHostsInfoResponse result = apiInstance.updateHostsInfo(xProjectId, clusterId, hostId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **hostId** | **Integer**| 域名ID. |
 **body** | [**Body2**](Body2.md)| JSON格式的请求体 |

### Return type

[**UpdateHostsInfoResponse**](UpdateHostsInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReservedCluster"></a>
# **updateReservedCluster**
> GlobalResponse updateReservedCluster(xProjectId, clusterId, body)

更新独享集群



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
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
 **clusterId** | **Integer**| 独享集群ID |
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

