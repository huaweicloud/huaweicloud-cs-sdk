# LogApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJobAuditLogs**](LogApi.md#getJobAuditLogs) | **GET** /{X-Project-Id}/audit_logs | query CloudStream Service job audit logs


<a name="getJobAuditLogs"></a>
# **getJobAuditLogs**
> List&lt;JobAuditLogResponse&gt; getJobAuditLogs(xProjectId, resourceType, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, resourceId, pageNumber, limit)

query CloudStream Service job audit logs

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.LogApi;


LogApi apiInstance = new LogApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String resourceType = "resourceType_example"; // String | 资源类型，包括job、template和cluster
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
String cursor = "cursor_example"; // String | 作业ID游标
String resourceId = "resourceId_example"; // String | 资源ID
Integer pageNumber = 0; // Integer | 查询的页码
Integer limit = 56; // Integer | 查询条数限制
try {
    List<JobAuditLogResponse> result = apiInstance.getJobAuditLogs(xProjectId, resourceType, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, resourceId, pageNumber, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#getJobAuditLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **resourceType** | **String**| 资源类型，包括job、template和cluster |
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]
 **cursor** | **String**| 作业ID游标 | [optional]
 **resourceId** | **String**| 资源ID | [optional]
 **pageNumber** | **Integer**| 查询的页码 | [optional] [default to 0]
 **limit** | **Integer**| 查询条数限制 | [optional]

### Return type

[**List&lt;JobAuditLogResponse&gt;**](JobAuditLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

