# TemplateApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createJobTemplate**](TemplateApi.md#createJobTemplate) | **POST** /{X-Project-Id}/job_template | create the job template
[**deleteJobTemplate**](TemplateApi.md#deleteJobTemplate) | **DELETE** /{X-Project-Id}/job_template/{template_id} | 删除作业模板
[**getJobTemplates**](TemplateApi.md#getJobTemplates) | **GET** /{X-Project-Id}/job_templates | query CloudStream Service job templates


<a name="createJobTemplate"></a>
# **createJobTemplate**
> JobTemplateCreateResponse createJobTemplate(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken)

create the job template

Create on job template from CloudStream Service

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
JobTemplateRequest body = new JobTemplateRequest(); // JobTemplateRequest | Create job template request
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    JobTemplateCreateResponse result = apiInstance.createJobTemplate(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#createJobTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | [**JobTemplateRequest**](JobTemplateRequest.md)| Create job template request |
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**JobTemplateCreateResponse**](JobTemplateCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTemplate"></a>
# **deleteJobTemplate**
> JobTemplateDeleteResponse deleteJobTemplate(xProjectId, templateId, xSdkDate, authorization, host, xProjectId2, xAuthToken)

删除作业模板

当前模板被引用也允许删除模板

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long templateId = 789L; // Long | 
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
try {
    JobTemplateDeleteResponse result = apiInstance.deleteJobTemplate(xProjectId, templateId, xSdkDate, authorization, host, xProjectId2, xAuthToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#deleteJobTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **templateId** | **Long**|  |
 **xSdkDate** | **String**| 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 | [optional]
 **authorization** | **String**| 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html | [optional]
 **host** | **String**| 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 | [optional]
 **xProjectId2** | **String**| 可选。project id，用于不同project取token。 | [optional]
 **xAuthToken** | **String**| 使用Token认证时必选: 用户Token | [optional]

### Return type

[**JobTemplateDeleteResponse**](JobTemplateDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTemplates"></a>
# **getJobTemplates**
> List&lt;JobTemplateListResponse&gt; getJobTemplates(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, limit, order)

query CloudStream Service job templates

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
Long cursor = 789L; // Long | 作业模板ID
Integer limit = 56; // Integer | 查询条数限制
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    List<JobTemplateListResponse> result = apiInstance.getJobTemplates(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#getJobTemplates");
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
 **cursor** | **Long**| 作业模板ID | [optional]
 **limit** | **Integer**| 查询条数限制 | [optional]
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [optional] [default to desc] [enum: desc, asc]

### Return type

[**List&lt;JobTemplateListResponse&gt;**](JobTemplateListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

