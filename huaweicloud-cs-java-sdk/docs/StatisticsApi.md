# StatisticsApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**overview**](StatisticsApi.md#overview) | **GET** /{X-Project-Id}/overview | 概要统计用户的作业和费用情况


<a name="overview"></a>
# **overview**
> OverviewResponse overview(xProjectId)

概要统计用户的作业和费用情况



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

