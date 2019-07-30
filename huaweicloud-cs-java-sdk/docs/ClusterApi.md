# ClusterApi

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addHostsFile**](ClusterApi.md#addHostsFile) | **POST** /{project_id}/reserved_cluster/{cluster_id}/hosts_file | 添加hosts文件
[**addHostsInfo**](ClusterApi.md#addHostsInfo) | **POST** /{project_id}/reserved_cluster/{cluster_id}/hosts | 添加IP域名映射信息
[**createPeering**](ClusterApi.md#createPeering) | **POST** /{project_id}/reserved_cluster/{cluster_id}/peering | 创建一个对等连接
[**createReservedCluster**](ClusterApi.md#createReservedCluster) | **POST** /{project_id}/reserved_cluster | 为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费
[**createRoute**](ClusterApi.md#createRoute) | **POST** /{project_id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route | 创建路由
[**deleteHostsInfo**](ClusterApi.md#deleteHostsInfo) | **DELETE** /{project_id}/reserved_cluster/{cluster_id}/hosts | 删除IP域名映射信息
[**deletePeering**](ClusterApi.md#deletePeering) | **DELETE** /{project_id}/reserved_cluster/{cluster_id}/peering/{peering_id} | 删除对等连接
[**deleteReservedCluster**](ClusterApi.md#deleteReservedCluster) | **DELETE** /{project_id}/reserved_cluster/{cluster_id} | 删除独享集群, 如果集群中有运行的作业会自动立即停止
[**deleteRoute**](ClusterApi.md#deleteRoute) | **DELETE** /{project_id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route/{route_id} | 删除路由
[**describeReservedCluster**](ClusterApi.md#describeReservedCluster) | **GET** /{project_id}/reserved_cluster/{cluster_id} | 查询用户创建的独享集群信息
[**getClusterJobs**](ClusterApi.md#getClusterJobs) | **GET** /{project_id}/reserved_cluster/{cluster_id}/jobs | 查询独享集群下的作业列表
[**getHostsInfo**](ClusterApi.md#getHostsInfo) | **GET** /{project_id}/reserved_cluster/{cluster_id}/hosts | 查询指定集群的IP域名映射信息
[**getPeering**](ClusterApi.md#getPeering) | **GET** /{project_id}/reserved_cluster/{cluster_id}/peering/{peering_id} | 查询对等连接
[**getPeerings**](ClusterApi.md#getPeerings) | **GET** /{project_id}/reserved_cluster/{cluster_id}/peering | 查询对等连接列表
[**getReservedClusters**](ClusterApi.md#getReservedClusters) | **GET** /{project_id}/reserved_clusters | 查询租户下的集群列表
[**getRoutes**](ClusterApi.md#getRoutes) | **GET** /{project_id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route | 查询路由列表
[**getUserQuota**](ClusterApi.md#getUserQuota) | **GET** /{project_id}/user_quota/{user_id} | 查询指定用户配额信息
[**getUserQuotas**](ClusterApi.md#getUserQuotas) | **GET** /{project_id}/user_quotas | 获取租户下的用户配额信息
[**restartReservedCluster**](ClusterApi.md#restartReservedCluster) | **POST** /{project_id}/reserved_cluster/{cluster_id}/restart | 重启独享集群
[**stopReservedCluster**](ClusterApi.md#stopReservedCluster) | **POST** /{project_id}/reserved_cluster/{cluster_id}/stop | 停止独享集群
[**updateHostsInfo**](ClusterApi.md#updateHostsInfo) | **PATCH** /{project_id}/reserved_cluster/{cluster_id}/hosts/{host_id} | 更新IP域名映射信息
[**updateReservedCluster**](ClusterApi.md#updateReservedCluster) | **PATCH** /{project_id}/reserved_cluster/{cluster_id} | 更新独享集群
[**updateUserQuota**](ClusterApi.md#updateUserQuota) | **PATCH** /{project_id}/user_quota/{user_id} | 更新指定用户配额信息


<a name="addHostsFile"></a>
# **addHostsFile**
> List&lt;AddHostsInfoResponse&gt; addHostsFile(projectId, clusterId, hostsFile)

添加hosts文件



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
File hostsFile = new File("/path/to/file.txt"); // File | 用户用于上传的hosts文件
try {
    List<AddHostsInfoResponse> result = apiInstance.addHostsFile(projectId, clusterId, hostsFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#addHostsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **hostsFile** | **File**| 用户用于上传的hosts文件 |

### Return type

[**List&lt;AddHostsInfoResponse&gt;**](AddHostsInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="addHostsInfo"></a>
# **addHostsInfo**
> List&lt;AddHostsInfoResponse&gt; addHostsInfo(projectId, clusterId, body)

添加IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
Body body = new Body(); // Body | JSON格式的请求体
try {
    List<AddHostsInfoResponse> result = apiInstance.addHostsInfo(projectId, clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#addHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **body** | [**Body**](Body.md)| JSON格式的请求体 |

### Return type

[**List&lt;AddHostsInfoResponse&gt;**](AddHostsInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPeering"></a>
# **createPeering**
> CreatePeeringResponse createPeering(projectId, clusterId, body)

创建一个对等连接



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | 
Integer clusterId = 56; // Integer | 
CreatePeeringRequest body = new CreatePeeringRequest(); // CreatePeeringRequest | 创建一个对等连接, 请求参数为json格式
try {
    CreatePeeringResponse result = apiInstance.createPeering(projectId, clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createPeering");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **clusterId** | **Integer**|  |
 **body** | [**CreatePeeringRequest**](CreatePeeringRequest.md)| 创建一个对等连接, 请求参数为json格式 |

### Return type

[**CreatePeeringResponse**](CreatePeeringResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReservedCluster"></a>
# **createReservedCluster**
> CreateClusterResponse createReservedCluster(projectId, body)

为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
NewReservedClusterRequest body = new NewReservedClusterRequest(); // NewReservedClusterRequest | 创建一个新的独享集群, 请求参数为json格式
try {
    CreateClusterResponse result = apiInstance.createReservedCluster(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **body** | [**NewReservedClusterRequest**](NewReservedClusterRequest.md)| 创建一个新的独享集群, 请求参数为json格式 |

### Return type

[**CreateClusterResponse**](CreateClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRoute"></a>
# **createRoute**
> CreateRouteResponse createRoute(projectId, clusterId, peeringId, body)

创建路由



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | 
Integer clusterId = 56; // Integer | 
String peeringId = "peeringId_example"; // String | 
CreateRouteRequest body = new CreateRouteRequest(); // CreateRouteRequest | 创建一个路由, 请求参数为json格式
try {
    CreateRouteResponse result = apiInstance.createRoute(projectId, clusterId, peeringId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **clusterId** | **Integer**|  |
 **peeringId** | **String**|  |
 **body** | [**CreateRouteRequest**](CreateRouteRequest.md)| 创建一个路由, 请求参数为json格式 |

### Return type

[**CreateRouteResponse**](CreateRouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHostsInfo"></a>
# **deleteHostsInfo**
> List&lt;DeleteHostsInfoResponse&gt; deleteHostsInfo(projectId, clusterId, body)

删除IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
Body1 body = new Body1(); // Body1 | JSON格式的请求体
try {
    List<DeleteHostsInfoResponse> result = apiInstance.deleteHostsInfo(projectId, clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **body** | [**Body1**](Body1.md)| JSON格式的请求体 |

### Return type

[**List&lt;DeleteHostsInfoResponse&gt;**](DeleteHostsInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePeering"></a>
# **deletePeering**
> deletePeering(projectId, clusterId, peeringId)

删除对等连接



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | 
Integer clusterId = 56; // Integer | 
String peeringId = "peeringId_example"; // String | 
try {
    apiInstance.deletePeering(projectId, clusterId, peeringId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deletePeering");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **clusterId** | **Integer**|  |
 **peeringId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReservedCluster"></a>
# **deleteReservedCluster**
> GlobalResponse deleteReservedCluster(projectId, clusterId)

删除独享集群, 如果集群中有运行的作业会自动立即停止



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
try {
    GlobalResponse result = apiInstance.deleteReservedCluster(projectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRoute"></a>
# **deleteRoute**
> deleteRoute(projectId, clusterId, peeringId, routeId)

删除路由



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | 
Integer clusterId = 56; // Integer | 
String peeringId = "peeringId_example"; // String | 
String routeId = "routeId_example"; // String | 
try {
    apiInstance.deleteRoute(projectId, clusterId, peeringId, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **clusterId** | **Integer**|  |
 **peeringId** | **String**|  |
 **routeId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="describeReservedCluster"></a>
# **describeReservedCluster**
> QueryClusterResponse describeReservedCluster(projectId, clusterId)

查询用户创建的独享集群信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
try {
    QueryClusterResponse result = apiInstance.describeReservedCluster(projectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#describeReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
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
> QueryJobListResponse getClusterJobs(projectId, clusterId, name, status, showDetail, cursor, next, limit, order)

查询独享集群下的作业列表

独享集群作业列表查询

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
String name = "name_example"; // String | 作业名
String status = "status_example"; // String | 作业状态码, 请参考CS文档
Boolean showDetail = false; // Boolean | 是否返回作业详情信息
Long cursor = 789L; // Long | 作业ID
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryJobListResponse result = apiInstance.getClusterJobs(projectId, clusterId, name, status, showDetail, cursor, next, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
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
> QueryClusterHostsInfoResponse getHostsInfo(projectId, clusterId, queryString, cursor, next, limit, order)

查询指定集群的IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
String queryString = "queryString_example"; // String | 待查询的IP或者域名
Long cursor = 789L; // Long | 域名ID
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 10; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryClusterHostsInfoResponse result = apiInstance.getHostsInfo(projectId, clusterId, queryString, cursor, next, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **queryString** | **String**| 待查询的IP或者域名 | [optional]
 **cursor** | **Long**| 域名ID | [optional]
 **next** | **Boolean**| 是否向下翻页 | [optional] [default to true]
 **limit** | **Integer**| 返回的数据条数 | [optional] [default to 10]
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [optional] [default to desc] [enum: desc, asc]

### Return type

[**QueryClusterHostsInfoResponse**](QueryClusterHostsInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeering"></a>
# **getPeering**
> CreatePeeringResponse getPeering(projectId, clusterId, peeringId)

查询对等连接



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | 
Integer clusterId = 56; // Integer | 
String peeringId = "peeringId_example"; // String | 
try {
    CreatePeeringResponse result = apiInstance.getPeering(projectId, clusterId, peeringId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getPeering");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **clusterId** | **Integer**|  |
 **peeringId** | **String**|  |

### Return type

[**CreatePeeringResponse**](CreatePeeringResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeerings"></a>
# **getPeerings**
> GetPeeringsResponse getPeerings(projectId, clusterId)

查询对等连接列表



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | 
Integer clusterId = 56; // Integer | 
try {
    GetPeeringsResponse result = apiInstance.getPeerings(projectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getPeerings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **clusterId** | **Integer**|  |

### Return type

[**GetPeeringsResponse**](GetPeeringsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReservedClusters"></a>
# **getReservedClusters**
> QueryClustersResponse getReservedClusters(projectId, name, status, cursor, next, limit, order)

查询租户下的集群列表

租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 集群名
String status = "status_example"; // String | 集群状态码, 请参考CS文档
Long cursor = 789L; // Long | 集群ID
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 10; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryClustersResponse result = apiInstance.getReservedClusters(projectId, name, status, cursor, next, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getReservedClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
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

<a name="getRoutes"></a>
# **getRoutes**
> GetRoutesResponse getRoutes(projectId, clusterId, peeringId)

查询路由列表



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | 
Integer clusterId = 56; // Integer | 
String peeringId = "peeringId_example"; // String | 
try {
    GetRoutesResponse result = apiInstance.getRoutes(projectId, clusterId, peeringId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **clusterId** | **Integer**|  |
 **peeringId** | **String**|  |

### Return type

[**GetRoutesResponse**](GetRoutesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserQuota"></a>
# **getUserQuota**
> QueryUserQuotaResponse getUserQuota(projectId, userId)

查询指定用户配额信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
String userId = "userId_example"; // String | 用户ID
try {
    QueryUserQuotaResponse result = apiInstance.getUserQuota(projectId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getUserQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
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
> QueryUserQuotasResponse getUserQuotas(projectId, name, cursor, next, limit, order)

获取租户下的用户配额信息

租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
String name = "name_example"; // String | 用户名
String cursor = "cursor_example"; // String | 用户ID
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryUserQuotasResponse result = apiInstance.getUserQuotas(projectId, name, cursor, next, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getUserQuotas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
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

<a name="restartReservedCluster"></a>
# **restartReservedCluster**
> RestartReservedClusterResponse restartReservedCluster(projectId, clusterId)

重启独享集群



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
try {
    RestartReservedClusterResponse result = apiInstance.restartReservedCluster(projectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#restartReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID |

### Return type

[**RestartReservedClusterResponse**](RestartReservedClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopReservedCluster"></a>
# **stopReservedCluster**
> StopReservedClusterResponse stopReservedCluster(projectId, clusterId)

停止独享集群



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
try {
    StopReservedClusterResponse result = apiInstance.stopReservedCluster(projectId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#stopReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID |

### Return type

[**StopReservedClusterResponse**](StopReservedClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateHostsInfo"></a>
# **updateHostsInfo**
> UpdateHostsInfoResponse updateHostsInfo(projectId, clusterId, hostId, body)

更新IP域名映射信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID.
Long hostId = 789L; // Long | 域名ID.
Body2 body = new Body2(); // Body2 | JSON格式的请求体
try {
    UpdateHostsInfoResponse result = apiInstance.updateHostsInfo(projectId, clusterId, hostId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateHostsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **clusterId** | **Integer**| 独享集群ID. |
 **hostId** | **Long**| 域名ID. |
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
> GlobalResponse updateReservedCluster(projectId, clusterId, body)

更新独享集群



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
Integer clusterId = 56; // Integer | 独享集群ID
UpdateClusterRequest body = new UpdateClusterRequest(); // UpdateClusterRequest | 提交修改集群请求
try {
    GlobalResponse result = apiInstance.updateReservedCluster(projectId, clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateReservedCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
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
> GlobalResponse updateUserQuota(projectId, userId, body)

更新指定用户配额信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
String userId = "userId_example"; // String | 用户ID
UpdateUserQuotaRequest body = new UpdateUserQuotaRequest(); // UpdateUserQuotaRequest | JSON格式的请求体
try {
    GlobalResponse result = apiInstance.updateUserQuota(projectId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateUserQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |
 **userId** | **String**| 用户ID |
 **body** | [**UpdateUserQuotaRequest**](UpdateUserQuotaRequest.md)| JSON格式的请求体 |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

