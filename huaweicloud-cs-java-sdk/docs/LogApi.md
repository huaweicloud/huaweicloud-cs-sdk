# LogApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJobAuditLogs**](LogApi.md#getJobAuditLogs) | **GET** /{X-Project-Id}/audit_logs | query CloudStream Service job audit logs


<a name="getJobAuditLogs"></a>
# **getJobAuditLogs**
> List&lt;JobAuditLog&gt; getJobAuditLogs(xProjectId, resourceType, cursor, resourceId, pageNumber, limit)

query CloudStream Service job audit logs

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.LogApi;


LogApi apiInstance = new LogApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String resourceType = "resourceType_example"; // String | 资源类型，包括job、template和cluster
String cursor = "cursor_example"; // String | 作业ID游标
String resourceId = "resourceId_example"; // String | 资源ID
Integer pageNumber = 0; // Integer | 查询的页码
Integer limit = 56; // Integer | 查询条数限制
try {
    List<JobAuditLog> result = apiInstance.getJobAuditLogs(xProjectId, resourceType, cursor, resourceId, pageNumber, limit);
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
 **cursor** | **String**| 作业ID游标 | [optional]
 **resourceId** | **String**| 资源ID | [optional]
 **pageNumber** | **Integer**| 查询的页码 | [optional] [default to 0]
 **limit** | **Integer**| 查询条数限制 | [optional]

### Return type

[**List&lt;JobAuditLog&gt;**](JobAuditLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

