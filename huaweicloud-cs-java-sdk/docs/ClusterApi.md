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
> CreateClusterResponse createReservedCluster(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken)

创建一个为具有cs_adm角色的CloudStream用户预留一个计算集群, 预留的集群会折算成SPU, 按需计费



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
NewReservedClusterRequest body = new NewReservedClusterRequest(); // NewReservedClusterRequest | 创建一个新的预留集群, 请求参数为json格式
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    CreateClusterResponse result = apiInstance.createReservedCluster(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**CreateClusterResponse**](CreateClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReservedCluster"></a>
# **deleteReservedCluster**
> GlobalResponse deleteReservedCluster(xProjectId, clusterId, xSdkDate, authorization, host, xProjectId2, xAuthToken)

删除预留的集群, 如果集群中有运行的作业会自动立即停止



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long clusterId = 789L; // Long | 预留集群ID
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    GlobalResponse result = apiInstance.deleteReservedCluster(xProjectId, clusterId, xSdkDate, authorization, host, xProjectId2, xAuthToken);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describeReservedCluster"></a>
# **describeReservedCluster**
> QueryClusterResponse describeReservedCluster(xProjectId, clusterId, xSdkDate, authorization, host, xProjectId2, xAuthToken)

查询用户创建的预留集群信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long clusterId = 789L; // Long | 预留集群ID.
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    QueryClusterResponse result = apiInstance.describeReservedCluster(xProjectId, clusterId, xSdkDate, authorization, host, xProjectId2, xAuthToken);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**QueryClusterResponse**](QueryClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterJobs"></a>
# **getClusterJobs**
> QueryJobListResponse getClusterJobs(xProjectId, clusterId, xSdkDate, authorization, host, xProjectId2, xAuthToken, name, status, showDetail, cursor, next, limit, order)

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
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
String name = "name_example"; // String | 作业名
String status = "status_example"; // String | 作业状态码, 请参考CloudStream文档
Boolean showDetail = false; // Boolean | 是否返回作业详情信息
Long cursor = 789L; // Long | 作业ID游标
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryJobListResponse result = apiInstance.getClusterJobs(xProjectId, clusterId, xSdkDate, authorization, host, xProjectId2, xAuthToken, name, status, showDetail, cursor, next, limit, order);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]
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
> QueryClustersResponse getReservedClusters(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken, name, status, cursor, next, limit, order)

查询租户下的集群列表

租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
String name = "name_example"; // String | 集群名
String status = "status_example"; // String | 集群状态码, 请参考CloudStream文档
Long cursor = 789L; // Long | 集群ID游标
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 10; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryClustersResponse result = apiInstance.getReservedClusters(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken, name, status, cursor, next, limit, order);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]
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
> QueryUserQuotaResponse getUserQuota(xProjectId, userId, xSdkDate, authorization, host, xProjectId2, xAuthToken)

查询指定用户配额信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String userId = "userId_example"; // String | 用户ID
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    QueryUserQuotaResponse result = apiInstance.getUserQuota(xProjectId, userId, xSdkDate, authorization, host, xProjectId2, xAuthToken);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**QueryUserQuotaResponse**](QueryUserQuotaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserQuotas"></a>
# **getUserQuotas**
> QueryUserQuotasResponse getUserQuotas(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken, name, cursor, next, limit, order)

获取租户下的用户配额信息

租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
String name = "name_example"; // String | 用户名
String cursor = "cursor_example"; // String | 用户ID游标
Boolean next = true; // Boolean | 是否向下翻页
Integer limit = 20; // Integer | 返回的数据条数
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    QueryUserQuotasResponse result = apiInstance.getUserQuotas(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken, name, cursor, next, limit, order);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]
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
> GlobalResponse updateReservedCluster(xProjectId, clusterId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken)

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
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    GlobalResponse result = apiInstance.updateReservedCluster(xProjectId, clusterId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserQuota"></a>
# **updateUserQuota**
> GlobalResponse updateUserQuota(xProjectId, userId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken)

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
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    GlobalResponse result = apiInstance.updateUserQuota(xProjectId, userId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

