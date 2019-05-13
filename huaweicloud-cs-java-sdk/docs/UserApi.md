# UserApi

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userRegister**](UserApi.md#userRegister) | **POST** /{X-Project-Id}/user_register | 用户注册使用CS服务


<a name="userRegister"></a>
# **userRegister**
> GlobalResponse userRegister(xProjectId)

用户注册使用CS服务



### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.UserApi;


UserApi apiInstance = new UserApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
try {
    GlobalResponse result = apiInstance.userRegister(xProjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userRegister");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |

### Return type

[**GlobalResponse**](GlobalResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

