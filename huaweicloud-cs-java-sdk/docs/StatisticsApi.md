# StatisticsApi

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReleaseVersion**](StatisticsApi.md#getReleaseVersion) | **GET** /versions | 查询CS当前发行版本信息
[**overview**](StatisticsApi.md#overview) | **GET** /{X-Project-Id}/overview | 概要统计用户的资源使用情况(作业及费用)


<a name="getReleaseVersion"></a>
# **getReleaseVersion**
> ReleaseVersionResponse getReleaseVersion()

查询CS当前发行版本信息



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.StatisticsApi;


StatisticsApi apiInstance = new StatisticsApi();
try {
    ReleaseVersionResponse result = apiInstance.getReleaseVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getReleaseVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReleaseVersionResponse**](ReleaseVersionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="overview"></a>
# **overview**
> OverviewResponse overview(xProjectId)

概要统计用户的资源使用情况(作业及费用)



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.StatisticsApi;


StatisticsApi apiInstance = new StatisticsApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
try {
    OverviewResponse result = apiInstance.overview(xProjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#overview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |

### Return type

[**OverviewResponse**](OverviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

