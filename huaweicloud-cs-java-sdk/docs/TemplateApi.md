# TemplateApi

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createJobTemplate**](TemplateApi.md#createJobTemplate) | **POST** /{X-Project-Id}/job_template | 创建作业模板
[**deleteJobTemplate**](TemplateApi.md#deleteJobTemplate) | **DELETE** /{X-Project-Id}/job_template/{template_id} | 删除作业模板
[**getJobTemplates**](TemplateApi.md#getJobTemplates) | **GET** /{X-Project-Id}/job_templates | 查询作业模板列表
[**updateJobTemplate**](TemplateApi.md#updateJobTemplate) | **PATCH** /{X-Project-Id}/job_template | 更新作业模板


<a name="createJobTemplate"></a>
# **createJobTemplate**
> JobTemplateCreateResponse createJobTemplate(xProjectId, body)

创建作业模板

Create job template on Cloud Stream Service

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
CreateJobTemplateRequest body = new CreateJobTemplateRequest(); // CreateJobTemplateRequest | Create job template request
try {
    JobTemplateCreateResponse result = apiInstance.createJobTemplate(xProjectId, body);
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
 **body** | [**CreateJobTemplateRequest**](CreateJobTemplateRequest.md)| Create job template request |

### Return type

[**JobTemplateCreateResponse**](JobTemplateCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTemplate"></a>
# **deleteJobTemplate**
> JobTemplateDeleteResponse deleteJobTemplate(xProjectId, templateId)

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
try {
    JobTemplateDeleteResponse result = apiInstance.deleteJobTemplate(xProjectId, templateId);
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

### Return type

[**JobTemplateDeleteResponse**](JobTemplateDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTemplates"></a>
# **getJobTemplates**
> JobTemplateListResponse getJobTemplates(xProjectId, cursor, limit, order)

查询作业模板列表

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long cursor = 789L; // Long | 作业模板ID
Integer limit = 56; // Integer | 查询条数限制
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    JobTemplateListResponse result = apiInstance.getJobTemplates(xProjectId, cursor, limit, order);
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
 **cursor** | **Long**| 作业模板ID | [optional]
 **limit** | **Integer**| 查询条数限制 | [optional]
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [optional] [default to desc] [enum: desc, asc]

### Return type

[**JobTemplateListResponse**](JobTemplateListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJobTemplate"></a>
# **updateJobTemplate**
> JobTemplateUpdateResponse updateJobTemplate(xProjectId, body)

更新作业模板

Update job template on Cloud Stream Service

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
UpdateJobTemplateRequest body = new UpdateJobTemplateRequest(); // UpdateJobTemplateRequest | 提交修改SQL作业模板请求
try {
    JobTemplateUpdateResponse result = apiInstance.updateJobTemplate(xProjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#updateJobTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | [**UpdateJobTemplateRequest**](UpdateJobTemplateRequest.md)| 提交修改SQL作业模板请求 |

### Return type

[**JobTemplateUpdateResponse**](JobTemplateUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

