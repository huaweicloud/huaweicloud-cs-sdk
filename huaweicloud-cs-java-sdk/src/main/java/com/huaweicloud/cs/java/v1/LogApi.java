/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.cs.java.v1;

import com.huaweicloud.cs.java.v1.client.ApiCallback;
import com.huaweicloud.cs.java.v1.client.ApiClient;
import com.huaweicloud.cs.java.v1.client.ApiException;
import com.huaweicloud.cs.java.v1.client.ApiResponse;
import com.huaweicloud.cs.java.v1.client.Configuration;
import com.huaweicloud.cs.java.v1.client.Pair;
import com.huaweicloud.cs.java.v1.client.ProgressRequestBody;
import com.huaweicloud.cs.java.v1.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.JobAuditLogResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogApi {
    private ApiClient apiClient;

    public LogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getJobAuditLogs
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param resourceType 资源类型，包括job、template和cluster (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param cursor 作业ID游标 (optional)
     * @param resourceId 资源ID (optional)
     * @param pageNumber 查询的页码 (optional, default to 0)
     * @param limit 查询条数限制 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getJobAuditLogsCall(String xProjectId, String resourceType, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, String cursor, String resourceId, Integer pageNumber, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/audit_logs"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (resourceType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resource_type", resourceType));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (resourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resource_id", resourceId));
        if (pageNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_number", pageNumber));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xSdkDate != null)
        localVarHeaderParams.put("X-Sdk-Date", apiClient.parameterToString(xSdkDate));
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (host != null)
        localVarHeaderParams.put("Host", apiClient.parameterToString(host));
        if (xProjectId2 != null)
        localVarHeaderParams.put("X-Project-Id", apiClient.parameterToString(xProjectId2));
        if (xAuthToken != null)
        localVarHeaderParams.put("X-Auth-Token", apiClient.parameterToString(xAuthToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getJobAuditLogsValidateBeforeCall(String xProjectId, String resourceType, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, String cursor, String resourceId, Integer pageNumber, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getJobAuditLogs(Async)");
        }
        
        // verify the required parameter 'resourceType' is set
        if (resourceType == null) {
            throw new ApiException("Missing the required parameter 'resourceType' when calling getJobAuditLogs(Async)");
        }
        

        com.squareup.okhttp.Call call = getJobAuditLogsCall(xProjectId, resourceType, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, resourceId, pageNumber, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * query CloudStream Service job audit logs
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param resourceType 资源类型，包括job、template和cluster (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param cursor 作业ID游标 (optional)
     * @param resourceId 资源ID (optional)
     * @param pageNumber 查询的页码 (optional, default to 0)
     * @param limit 查询条数限制 (optional)
     * @return List&lt;JobAuditLogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<JobAuditLogResponse> getJobAuditLogs(String xProjectId, String resourceType, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, String cursor, String resourceId, Integer pageNumber, Integer limit) throws ApiException {
        ApiResponse<List<JobAuditLogResponse>> resp = getJobAuditLogsWithHttpInfo(xProjectId, resourceType, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, resourceId, pageNumber, limit);
        return resp.getData();
    }

    /**
     * query CloudStream Service job audit logs
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param resourceType 资源类型，包括job、template和cluster (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param cursor 作业ID游标 (optional)
     * @param resourceId 资源ID (optional)
     * @param pageNumber 查询的页码 (optional, default to 0)
     * @param limit 查询条数限制 (optional)
     * @return ApiResponse&lt;List&lt;JobAuditLogResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<JobAuditLogResponse>> getJobAuditLogsWithHttpInfo(String xProjectId, String resourceType, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, String cursor, String resourceId, Integer pageNumber, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getJobAuditLogsValidateBeforeCall(xProjectId, resourceType, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, resourceId, pageNumber, limit, null, null);
        Type localVarReturnType = new TypeToken<List<JobAuditLogResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * query CloudStream Service job audit logs (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param resourceType 资源类型，包括job、template和cluster (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param cursor 作业ID游标 (optional)
     * @param resourceId 资源ID (optional)
     * @param pageNumber 查询的页码 (optional, default to 0)
     * @param limit 查询条数限制 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobAuditLogsAsync(String xProjectId, String resourceType, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, String cursor, String resourceId, Integer pageNumber, Integer limit, final ApiCallback<List<JobAuditLogResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getJobAuditLogsValidateBeforeCall(xProjectId, resourceType, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, resourceId, pageNumber, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<JobAuditLogResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
