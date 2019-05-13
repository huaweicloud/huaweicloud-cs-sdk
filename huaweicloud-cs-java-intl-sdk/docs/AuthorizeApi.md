# AuthorizeApi

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeBucket**](AuthorizeApi.md#authorizeBucket) | **POST** /{X-Project-Id}/obs_authorize | 用户主动授权起OBS桶的操作权限给CS服务, 用于保存用户作业的checkpoint、作业的运行日志等


<a name="authorizeBucket"></a>
# **authorizeBucket**
> GlobalResponse authorizeBucket(xProjectId, body)

用户主动授权起OBS桶的操作权限给CS服务, 用于保存用户作业的checkpoint、作业的运行日志等



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java_intl.v1.client.ApiException;
//import com.huaweicloud.cs.java_intl.v1.AuthorizeApi;


AuthorizeApi apiInstance = new AuthorizeApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
List<String> body = Arrays.asList(new List<String>()); // List<String> | 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式
try {
    GlobalResponse result = apiInstance.authorizeBucket(xProjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizeApi#authorizeBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | **List&lt;String&gt;**| 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式 |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

