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
import com.huaweicloud.cs.java.v1.model.GlobalResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorizeApi {
    private ApiClient apiClient;

    public AuthorizeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthorizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authorizeBucket
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authorizeBucketCall(String projectId, List<String> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{project_id}/obs_authorize"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authorizeBucketValidateBeforeCall(String projectId, List<String> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling authorizeBucket(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authorizeBucket(Async)");
        }
        

        com.squareup.okhttp.Call call = authorizeBucketCall(projectId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 用户主动授权起OBS桶的操作权限给CS服务, 用于保存用户作业的checkpoint、作业的运行日志等
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式 (required)
     * @return GlobalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalResponse authorizeBucket(String projectId, List<String> body) throws ApiException {
        ApiResponse<GlobalResponse> resp = authorizeBucketWithHttpInfo(projectId, body);
        return resp.getData();
    }

    /**
     * 用户主动授权起OBS桶的操作权限给CS服务, 用于保存用户作业的checkpoint、作业的运行日志等
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式 (required)
     * @return ApiResponse&lt;GlobalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalResponse> authorizeBucketWithHttpInfo(String projectId, List<String> body) throws ApiException {
        com.squareup.okhttp.Call call = authorizeBucketValidateBeforeCall(projectId, body, null, null);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 用户主动授权起OBS桶的操作权限给CS服务, 用于保存用户作业的checkpoint、作业的运行日志等 (asynchronously)
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authorizeBucketAsync(String projectId, List<String> body, final ApiCallback<GlobalResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authorizeBucketValidateBeforeCall(projectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
