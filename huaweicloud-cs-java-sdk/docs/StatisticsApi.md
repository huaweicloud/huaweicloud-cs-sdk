# StatisticsApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**overview**](StatisticsApi.md#overview) | **GET** /{X-Project-Id}/overview | 概要统计用户的作业和费用情况


<a name="overview"></a>
# **overview**
> OverviewResponse overview(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken)

概要统计用户的作业和费用情况



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.StatisticsApi;


StatisticsApi apiInstance = new StatisticsApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    OverviewResponse result = apiInstance.overview(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken);
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
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**OverviewResponse**](OverviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

