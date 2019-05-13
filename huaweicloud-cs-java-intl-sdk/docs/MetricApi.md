# MetricApi

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJobsMetrics**](MetricApi.md#getJobsMetrics) | **POST** /{X-Project-Id}/jobs/metrics | 查询作业监控信息


<a name="getJobsMetrics"></a>
# **getJobsMetrics**
> QueryJobMetricsResponse getJobsMetrics(xProjectId, body)

查询作业监控信息

查询作业监控信息, 支持同时查询多个作业监控信息

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java_intl.v1.client.ApiException;
//import com.huaweicloud.cs.java_intl.v1.MetricApi;


MetricApi apiInstance = new MetricApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Body3 body = new Body3(); // Body3 | 查询作业监控信息, 支持同时查询多个作业监控, 请求参数为json格式
try {
    QueryJobMetricsResponse result = apiInstance.getJobsMetrics(xProjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricApi#getJobsMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | [**Body3**](Body3.md)| 查询作业监控信息, 支持同时查询多个作业监控, 请求参数为json格式 |

### Return type

[**QueryJobMetricsResponse**](QueryJobMetricsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

