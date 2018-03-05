# LogApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuditLogs**](LogApi.md#getAuditLogs) | **GET** /{X-Project-Id}/audit_logs | query CloudStream Service audit logs


<a name="getAuditLogs"></a>
# **getAuditLogs**
> JobAuditLogResponse getAuditLogs(xProjectId, resourceType, cursor, resourceId, pageNumber, limit)

query CloudStream Service audit logs

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.LogApi;


LogApi apiInstance = new LogApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String resourceType = "resourceType_example"; // String | 资源类型，包括job、template和cluster
String cursor = "cursor_example"; // String | 作业/模板/集群ID游标
String resourceId = "resourceId_example"; // String | 资源ID
Integer pageNumber = 0; // Integer | 查询的页码
Integer limit = 56; // Integer | 查询条数限制
try {
    JobAuditLogResponse result = apiInstance.getAuditLogs(xProjectId, resourceType, cursor, resourceId, pageNumber, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#getAuditLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **resourceType** | **String**| 资源类型，包括job、template和cluster |
 **cursor** | **String**| 作业/模板/集群ID游标 | [optional]
 **resourceId** | **String**| 资源ID | [optional]
 **pageNumber** | **Integer**| 查询的页码 | [optional] [default to 0]
 **limit** | **Integer**| 查询条数限制 | [optional]

### Return type

[**JobAuditLogResponse**](JobAuditLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

