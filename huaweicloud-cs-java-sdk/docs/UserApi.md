# UserApi

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userRegister**](UserApi.md#userRegister) | **POST** /{project_id}/user_register | 用户注册使用CS服务


<a name="userRegister"></a>
# **userRegister**
> GlobalResponse userRegister(projectId)

用户注册使用CS服务



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.UserApi;


UserApi apiInstance = new UserApi();
String projectId = "projectId_example"; // String | project id, 用于不同project取token.
try {
    GlobalResponse result = apiInstance.userRegister(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userRegister");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| project id, 用于不同project取token. |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

