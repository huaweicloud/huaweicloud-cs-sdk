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
import com.huaweicloud.cs.java.v1.model.OverviewResponse;
import com.huaweicloud.cs.java.v1.model.ReleaseVersionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsApi {
    private ApiClient apiClient;

    public StatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatisticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getReleaseVersion
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReleaseVersionCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/versions";

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getReleaseVersionValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getReleaseVersionCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询CS当前发行版本信息
     * 
     * @return ReleaseVersionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReleaseVersionResponse getReleaseVersion() throws ApiException {
        ApiResponse<ReleaseVersionResponse> resp = getReleaseVersionWithHttpInfo();
        return resp.getData();
    }

    /**
     * 查询CS当前发行版本信息
     * 
     * @return ApiResponse&lt;ReleaseVersionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReleaseVersionResponse> getReleaseVersionWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getReleaseVersionValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ReleaseVersionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询CS当前发行版本信息 (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReleaseVersionAsync(final ApiCallback<ReleaseVersionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getReleaseVersionValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReleaseVersionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for overview
     * @param projectId project id, 用于不同project取token. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call overviewCall(String projectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/overview"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call overviewValidateBeforeCall(String projectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling overview(Async)");
        }
        

        com.squareup.okhttp.Call call = overviewCall(projectId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 概要统计用户的资源使用情况(作业及费用)
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @return OverviewResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OverviewResponse overview(String projectId) throws ApiException {
        ApiResponse<OverviewResponse> resp = overviewWithHttpInfo(projectId);
        return resp.getData();
    }

    /**
     * 概要统计用户的资源使用情况(作业及费用)
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @return ApiResponse&lt;OverviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OverviewResponse> overviewWithHttpInfo(String projectId) throws ApiException {
        com.squareup.okhttp.Call call = overviewValidateBeforeCall(projectId, null, null);
        Type localVarReturnType = new TypeToken<OverviewResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 概要统计用户的资源使用情况(作业及费用) (asynchronously)
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call overviewAsync(String projectId, final ApiCallback<OverviewResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = overviewValidateBeforeCall(projectId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OverviewResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
