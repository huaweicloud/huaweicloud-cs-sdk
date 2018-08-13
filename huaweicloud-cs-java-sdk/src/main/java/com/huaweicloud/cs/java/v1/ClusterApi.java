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


import com.huaweicloud.cs.java.v1.model.AddHostsInfoResponse;
import com.huaweicloud.cs.java.v1.model.Body;
import com.huaweicloud.cs.java.v1.model.Body1;
import com.huaweicloud.cs.java.v1.model.Body2;
import com.huaweicloud.cs.java.v1.model.CreateClusterResponse;
import com.huaweicloud.cs.java.v1.model.CreatePeeringRequest;
import com.huaweicloud.cs.java.v1.model.CreatePeeringResponse;
import com.huaweicloud.cs.java.v1.model.CreateRouteRequest;
import com.huaweicloud.cs.java.v1.model.CreateRouteResponse;
import com.huaweicloud.cs.java.v1.model.DeleteHostsInfoResponse;
import java.io.File;
import com.huaweicloud.cs.java.v1.model.GetPeeringsResponse;
import com.huaweicloud.cs.java.v1.model.GetRoutesResponse;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.GlobalResponse;
import com.huaweicloud.cs.java.v1.model.NewReservedClusterRequest;
import com.huaweicloud.cs.java.v1.model.QueryClusterHostsInfoResponse;
import com.huaweicloud.cs.java.v1.model.QueryClusterResponse;
import com.huaweicloud.cs.java.v1.model.QueryClustersResponse;
import com.huaweicloud.cs.java.v1.model.QueryJobListResponse;
import com.huaweicloud.cs.java.v1.model.QueryUserQuotaResponse;
import com.huaweicloud.cs.java.v1.model.QueryUserQuotasResponse;
import com.huaweicloud.cs.java.v1.model.RestartReservedClusterResponse;
import com.huaweicloud.cs.java.v1.model.StopReservedClusterResponse;
import com.huaweicloud.cs.java.v1.model.UpdateClusterRequest;
import com.huaweicloud.cs.java.v1.model.UpdateHostsInfoResponse;
import com.huaweicloud.cs.java.v1.model.UpdateUserQuotaRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClusterApi {
    private ApiClient apiClient;

    public ClusterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClusterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addHostsFile
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostsFile 用户用于上传的hosts文件 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addHostsFileCall(String xProjectId, Integer clusterId, File hostsFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/hosts_file"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (hostsFile != null)
        localVarFormParams.put("hosts_file", hostsFile);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call addHostsFileValidateBeforeCall(String xProjectId, Integer clusterId, File hostsFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling addHostsFile(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling addHostsFile(Async)");
        }
        
        // verify the required parameter 'hostsFile' is set
        if (hostsFile == null) {
            throw new ApiException("Missing the required parameter 'hostsFile' when calling addHostsFile(Async)");
        }
        

        com.squareup.okhttp.Call call = addHostsFileCall(xProjectId, clusterId, hostsFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 添加hosts文件
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostsFile 用户用于上传的hosts文件 (required)
     * @return List&lt;AddHostsInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AddHostsInfoResponse> addHostsFile(String xProjectId, Integer clusterId, File hostsFile) throws ApiException {
        ApiResponse<List<AddHostsInfoResponse>> resp = addHostsFileWithHttpInfo(xProjectId, clusterId, hostsFile);
        return resp.getData();
    }

    /**
     * 添加hosts文件
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostsFile 用户用于上传的hosts文件 (required)
     * @return ApiResponse&lt;List&lt;AddHostsInfoResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AddHostsInfoResponse>> addHostsFileWithHttpInfo(String xProjectId, Integer clusterId, File hostsFile) throws ApiException {
        com.squareup.okhttp.Call call = addHostsFileValidateBeforeCall(xProjectId, clusterId, hostsFile, null, null);
        Type localVarReturnType = new TypeToken<List<AddHostsInfoResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 添加hosts文件 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostsFile 用户用于上传的hosts文件 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addHostsFileAsync(String xProjectId, Integer clusterId, File hostsFile, final ApiCallback<List<AddHostsInfoResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addHostsFileValidateBeforeCall(xProjectId, clusterId, hostsFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AddHostsInfoResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addHostsInfo
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addHostsInfoCall(String xProjectId, Integer clusterId, Body body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/hosts"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
    private com.squareup.okhttp.Call addHostsInfoValidateBeforeCall(String xProjectId, Integer clusterId, Body body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling addHostsInfo(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling addHostsInfo(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addHostsInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = addHostsInfoCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 添加IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @return List&lt;AddHostsInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AddHostsInfoResponse> addHostsInfo(String xProjectId, Integer clusterId, Body body) throws ApiException {
        ApiResponse<List<AddHostsInfoResponse>> resp = addHostsInfoWithHttpInfo(xProjectId, clusterId, body);
        return resp.getData();
    }

    /**
     * 添加IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @return ApiResponse&lt;List&lt;AddHostsInfoResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AddHostsInfoResponse>> addHostsInfoWithHttpInfo(String xProjectId, Integer clusterId, Body body) throws ApiException {
        com.squareup.okhttp.Call call = addHostsInfoValidateBeforeCall(xProjectId, clusterId, body, null, null);
        Type localVarReturnType = new TypeToken<List<AddHostsInfoResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 添加IP域名映射信息 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addHostsInfoAsync(String xProjectId, Integer clusterId, Body body, final ApiCallback<List<AddHostsInfoResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addHostsInfoValidateBeforeCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AddHostsInfoResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createPeering
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param body 创建一个对等连接, 请求参数为json格式 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPeeringCall(String xProjectId, Integer clusterId, CreatePeeringRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/peering"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
    private com.squareup.okhttp.Call createPeeringValidateBeforeCall(String xProjectId, Integer clusterId, CreatePeeringRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling createPeering(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling createPeering(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createPeering(Async)");
        }
        

        com.squareup.okhttp.Call call = createPeeringCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 创建一个对等连接
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param body 创建一个对等连接, 请求参数为json格式 (required)
     * @return CreatePeeringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatePeeringResponse createPeering(String xProjectId, Integer clusterId, CreatePeeringRequest body) throws ApiException {
        ApiResponse<CreatePeeringResponse> resp = createPeeringWithHttpInfo(xProjectId, clusterId, body);
        return resp.getData();
    }

    /**
     * 创建一个对等连接
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param body 创建一个对等连接, 请求参数为json格式 (required)
     * @return ApiResponse&lt;CreatePeeringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatePeeringResponse> createPeeringWithHttpInfo(String xProjectId, Integer clusterId, CreatePeeringRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createPeeringValidateBeforeCall(xProjectId, clusterId, body, null, null);
        Type localVarReturnType = new TypeToken<CreatePeeringResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建一个对等连接 (asynchronously)
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param body 创建一个对等连接, 请求参数为json格式 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPeeringAsync(String xProjectId, Integer clusterId, CreatePeeringRequest body, final ApiCallback<CreatePeeringResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPeeringValidateBeforeCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatePeeringResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createReservedCluster
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body 创建一个新的独享集群, 请求参数为json格式 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createReservedClusterCall(String xProjectId, NewReservedClusterRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()));

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
    private com.squareup.okhttp.Call createReservedClusterValidateBeforeCall(String xProjectId, NewReservedClusterRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling createReservedCluster(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createReservedCluster(Async)");
        }
        

        com.squareup.okhttp.Call call = createReservedClusterCall(xProjectId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body 创建一个新的独享集群, 请求参数为json格式 (required)
     * @return CreateClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateClusterResponse createReservedCluster(String xProjectId, NewReservedClusterRequest body) throws ApiException {
        ApiResponse<CreateClusterResponse> resp = createReservedClusterWithHttpInfo(xProjectId, body);
        return resp.getData();
    }

    /**
     * 为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body 创建一个新的独享集群, 请求参数为json格式 (required)
     * @return ApiResponse&lt;CreateClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateClusterResponse> createReservedClusterWithHttpInfo(String xProjectId, NewReservedClusterRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createReservedClusterValidateBeforeCall(xProjectId, body, null, null);
        Type localVarReturnType = new TypeToken<CreateClusterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body 创建一个新的独享集群, 请求参数为json格式 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createReservedClusterAsync(String xProjectId, NewReservedClusterRequest body, final ApiCallback<CreateClusterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createReservedClusterValidateBeforeCall(xProjectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateClusterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createRoute
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param body 创建一个路由, 请求参数为json格式 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createRouteCall(String xProjectId, Integer clusterId, String peeringId, CreateRouteRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
            .replaceAll("\\{" + "peering_id" + "\\}", apiClient.escapeString(peeringId.toString()));

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
    private com.squareup.okhttp.Call createRouteValidateBeforeCall(String xProjectId, Integer clusterId, String peeringId, CreateRouteRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling createRoute(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling createRoute(Async)");
        }
        
        // verify the required parameter 'peeringId' is set
        if (peeringId == null) {
            throw new ApiException("Missing the required parameter 'peeringId' when calling createRoute(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createRoute(Async)");
        }
        

        com.squareup.okhttp.Call call = createRouteCall(xProjectId, clusterId, peeringId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 创建路由
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param body 创建一个路由, 请求参数为json格式 (required)
     * @return CreateRouteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateRouteResponse createRoute(String xProjectId, Integer clusterId, String peeringId, CreateRouteRequest body) throws ApiException {
        ApiResponse<CreateRouteResponse> resp = createRouteWithHttpInfo(xProjectId, clusterId, peeringId, body);
        return resp.getData();
    }

    /**
     * 创建路由
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param body 创建一个路由, 请求参数为json格式 (required)
     * @return ApiResponse&lt;CreateRouteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateRouteResponse> createRouteWithHttpInfo(String xProjectId, Integer clusterId, String peeringId, CreateRouteRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createRouteValidateBeforeCall(xProjectId, clusterId, peeringId, body, null, null);
        Type localVarReturnType = new TypeToken<CreateRouteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建路由 (asynchronously)
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param body 创建一个路由, 请求参数为json格式 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createRouteAsync(String xProjectId, Integer clusterId, String peeringId, CreateRouteRequest body, final ApiCallback<CreateRouteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createRouteValidateBeforeCall(xProjectId, clusterId, peeringId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateRouteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteHostsInfo
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteHostsInfoCall(String xProjectId, Integer clusterId, Body1 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/hosts"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteHostsInfoValidateBeforeCall(String xProjectId, Integer clusterId, Body1 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling deleteHostsInfo(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling deleteHostsInfo(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteHostsInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteHostsInfoCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 删除IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @return List&lt;DeleteHostsInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DeleteHostsInfoResponse> deleteHostsInfo(String xProjectId, Integer clusterId, Body1 body) throws ApiException {
        ApiResponse<List<DeleteHostsInfoResponse>> resp = deleteHostsInfoWithHttpInfo(xProjectId, clusterId, body);
        return resp.getData();
    }

    /**
     * 删除IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @return ApiResponse&lt;List&lt;DeleteHostsInfoResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DeleteHostsInfoResponse>> deleteHostsInfoWithHttpInfo(String xProjectId, Integer clusterId, Body1 body) throws ApiException {
        com.squareup.okhttp.Call call = deleteHostsInfoValidateBeforeCall(xProjectId, clusterId, body, null, null);
        Type localVarReturnType = new TypeToken<List<DeleteHostsInfoResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除IP域名映射信息 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param body JSON格式的请求体 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteHostsInfoAsync(String xProjectId, Integer clusterId, Body1 body, final ApiCallback<List<DeleteHostsInfoResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteHostsInfoValidateBeforeCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DeleteHostsInfoResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deletePeering
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePeeringCall(String xProjectId, Integer clusterId, String peeringId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
            .replaceAll("\\{" + "peering_id" + "\\}", apiClient.escapeString(peeringId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePeeringValidateBeforeCall(String xProjectId, Integer clusterId, String peeringId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling deletePeering(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling deletePeering(Async)");
        }
        
        // verify the required parameter 'peeringId' is set
        if (peeringId == null) {
            throw new ApiException("Missing the required parameter 'peeringId' when calling deletePeering(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePeeringCall(xProjectId, clusterId, peeringId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 删除对等连接
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePeering(String xProjectId, Integer clusterId, String peeringId) throws ApiException {
        deletePeeringWithHttpInfo(xProjectId, clusterId, peeringId);
    }

    /**
     * 删除对等连接
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePeeringWithHttpInfo(String xProjectId, Integer clusterId, String peeringId) throws ApiException {
        com.squareup.okhttp.Call call = deletePeeringValidateBeforeCall(xProjectId, clusterId, peeringId, null, null);
        return apiClient.execute(call);
    }

    /**
     * 删除对等连接 (asynchronously)
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePeeringAsync(String xProjectId, Integer clusterId, String peeringId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePeeringValidateBeforeCall(xProjectId, clusterId, peeringId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteReservedCluster
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteReservedClusterCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteReservedClusterValidateBeforeCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling deleteReservedCluster(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling deleteReservedCluster(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteReservedClusterCall(xProjectId, clusterId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 删除独享集群, 如果集群中有运行的作业会自动立即停止
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @return GlobalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalResponse deleteReservedCluster(String xProjectId, Integer clusterId) throws ApiException {
        ApiResponse<GlobalResponse> resp = deleteReservedClusterWithHttpInfo(xProjectId, clusterId);
        return resp.getData();
    }

    /**
     * 删除独享集群, 如果集群中有运行的作业会自动立即停止
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @return ApiResponse&lt;GlobalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalResponse> deleteReservedClusterWithHttpInfo(String xProjectId, Integer clusterId) throws ApiException {
        com.squareup.okhttp.Call call = deleteReservedClusterValidateBeforeCall(xProjectId, clusterId, null, null);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除独享集群, 如果集群中有运行的作业会自动立即停止 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteReservedClusterAsync(String xProjectId, Integer clusterId, final ApiCallback<GlobalResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteReservedClusterValidateBeforeCall(xProjectId, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRoute
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param routeId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRouteCall(String xProjectId, Integer clusterId, String peeringId, String routeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route/{route_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
            .replaceAll("\\{" + "peering_id" + "\\}", apiClient.escapeString(peeringId.toString()))
            .replaceAll("\\{" + "route_id" + "\\}", apiClient.escapeString(routeId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRouteValidateBeforeCall(String xProjectId, Integer clusterId, String peeringId, String routeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling deleteRoute(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling deleteRoute(Async)");
        }
        
        // verify the required parameter 'peeringId' is set
        if (peeringId == null) {
            throw new ApiException("Missing the required parameter 'peeringId' when calling deleteRoute(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling deleteRoute(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRouteCall(xProjectId, clusterId, peeringId, routeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 删除路由
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param routeId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRoute(String xProjectId, Integer clusterId, String peeringId, String routeId) throws ApiException {
        deleteRouteWithHttpInfo(xProjectId, clusterId, peeringId, routeId);
    }

    /**
     * 删除路由
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param routeId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteRouteWithHttpInfo(String xProjectId, Integer clusterId, String peeringId, String routeId) throws ApiException {
        com.squareup.okhttp.Call call = deleteRouteValidateBeforeCall(xProjectId, clusterId, peeringId, routeId, null, null);
        return apiClient.execute(call);
    }

    /**
     * 删除路由 (asynchronously)
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param routeId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRouteAsync(String xProjectId, Integer clusterId, String peeringId, String routeId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRouteValidateBeforeCall(xProjectId, clusterId, peeringId, routeId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for describeReservedCluster
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call describeReservedClusterCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
    private com.squareup.okhttp.Call describeReservedClusterValidateBeforeCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling describeReservedCluster(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling describeReservedCluster(Async)");
        }
        

        com.squareup.okhttp.Call call = describeReservedClusterCall(xProjectId, clusterId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询用户创建的独享集群信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @return QueryClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryClusterResponse describeReservedCluster(String xProjectId, Integer clusterId) throws ApiException {
        ApiResponse<QueryClusterResponse> resp = describeReservedClusterWithHttpInfo(xProjectId, clusterId);
        return resp.getData();
    }

    /**
     * 查询用户创建的独享集群信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @return ApiResponse&lt;QueryClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryClusterResponse> describeReservedClusterWithHttpInfo(String xProjectId, Integer clusterId) throws ApiException {
        com.squareup.okhttp.Call call = describeReservedClusterValidateBeforeCall(xProjectId, clusterId, null, null);
        Type localVarReturnType = new TypeToken<QueryClusterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询用户创建的独享集群信息 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call describeReservedClusterAsync(String xProjectId, Integer clusterId, final ApiCallback<QueryClusterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = describeReservedClusterValidateBeforeCall(xProjectId, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryClusterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getClusterJobs
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getClusterJobsCall(String xProjectId, Integer clusterId, String name, String status, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/jobs"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (showDetail != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_detail", showDetail));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (next != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next", next));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call getClusterJobsValidateBeforeCall(String xProjectId, Integer clusterId, String name, String status, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getClusterJobs(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling getClusterJobs(Async)");
        }
        

        com.squareup.okhttp.Call call = getClusterJobsCall(xProjectId, clusterId, name, status, showDetail, cursor, next, limit, order, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询独享集群下的作业列表
     * 独享集群作业列表查询
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return QueryJobListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryJobListResponse getClusterJobs(String xProjectId, Integer clusterId, String name, String status, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order) throws ApiException {
        ApiResponse<QueryJobListResponse> resp = getClusterJobsWithHttpInfo(xProjectId, clusterId, name, status, showDetail, cursor, next, limit, order);
        return resp.getData();
    }

    /**
     * 查询独享集群下的作业列表
     * 独享集群作业列表查询
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return ApiResponse&lt;QueryJobListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryJobListResponse> getClusterJobsWithHttpInfo(String xProjectId, Integer clusterId, String name, String status, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order) throws ApiException {
        com.squareup.okhttp.Call call = getClusterJobsValidateBeforeCall(xProjectId, clusterId, name, status, showDetail, cursor, next, limit, order, null, null);
        Type localVarReturnType = new TypeToken<QueryJobListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询独享集群下的作业列表 (asynchronously)
     * 独享集群作业列表查询
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getClusterJobsAsync(String xProjectId, Integer clusterId, String name, String status, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, final ApiCallback<QueryJobListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getClusterJobsValidateBeforeCall(xProjectId, clusterId, name, status, showDetail, cursor, next, limit, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryJobListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHostsInfo
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param queryString 待查询的IP或者域名 (optional)
     * @param cursor 域名ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHostsInfoCall(String xProjectId, Integer clusterId, String queryString, Long cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/hosts"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (queryString != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query_string", queryString));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (next != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next", next));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call getHostsInfoValidateBeforeCall(String xProjectId, Integer clusterId, String queryString, Long cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getHostsInfo(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling getHostsInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = getHostsInfoCall(xProjectId, clusterId, queryString, cursor, next, limit, order, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询指定集群的IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param queryString 待查询的IP或者域名 (optional)
     * @param cursor 域名ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return QueryClusterHostsInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryClusterHostsInfoResponse getHostsInfo(String xProjectId, Integer clusterId, String queryString, Long cursor, Boolean next, Integer limit, String order) throws ApiException {
        ApiResponse<QueryClusterHostsInfoResponse> resp = getHostsInfoWithHttpInfo(xProjectId, clusterId, queryString, cursor, next, limit, order);
        return resp.getData();
    }

    /**
     * 查询指定集群的IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param queryString 待查询的IP或者域名 (optional)
     * @param cursor 域名ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return ApiResponse&lt;QueryClusterHostsInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryClusterHostsInfoResponse> getHostsInfoWithHttpInfo(String xProjectId, Integer clusterId, String queryString, Long cursor, Boolean next, Integer limit, String order) throws ApiException {
        com.squareup.okhttp.Call call = getHostsInfoValidateBeforeCall(xProjectId, clusterId, queryString, cursor, next, limit, order, null, null);
        Type localVarReturnType = new TypeToken<QueryClusterHostsInfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询指定集群的IP域名映射信息 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param queryString 待查询的IP或者域名 (optional)
     * @param cursor 域名ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHostsInfoAsync(String xProjectId, Integer clusterId, String queryString, Long cursor, Boolean next, Integer limit, String order, final ApiCallback<QueryClusterHostsInfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getHostsInfoValidateBeforeCall(xProjectId, clusterId, queryString, cursor, next, limit, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryClusterHostsInfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPeering
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPeeringCall(String xProjectId, Integer clusterId, String peeringId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
            .replaceAll("\\{" + "peering_id" + "\\}", apiClient.escapeString(peeringId.toString()));

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
    private com.squareup.okhttp.Call getPeeringValidateBeforeCall(String xProjectId, Integer clusterId, String peeringId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getPeering(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling getPeering(Async)");
        }
        
        // verify the required parameter 'peeringId' is set
        if (peeringId == null) {
            throw new ApiException("Missing the required parameter 'peeringId' when calling getPeering(Async)");
        }
        

        com.squareup.okhttp.Call call = getPeeringCall(xProjectId, clusterId, peeringId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询对等连接
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @return CreatePeeringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatePeeringResponse getPeering(String xProjectId, Integer clusterId, String peeringId) throws ApiException {
        ApiResponse<CreatePeeringResponse> resp = getPeeringWithHttpInfo(xProjectId, clusterId, peeringId);
        return resp.getData();
    }

    /**
     * 查询对等连接
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @return ApiResponse&lt;CreatePeeringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatePeeringResponse> getPeeringWithHttpInfo(String xProjectId, Integer clusterId, String peeringId) throws ApiException {
        com.squareup.okhttp.Call call = getPeeringValidateBeforeCall(xProjectId, clusterId, peeringId, null, null);
        Type localVarReturnType = new TypeToken<CreatePeeringResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询对等连接 (asynchronously)
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPeeringAsync(String xProjectId, Integer clusterId, String peeringId, final ApiCallback<CreatePeeringResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPeeringValidateBeforeCall(xProjectId, clusterId, peeringId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatePeeringResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPeerings
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPeeringsCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/peering"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
    private com.squareup.okhttp.Call getPeeringsValidateBeforeCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getPeerings(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling getPeerings(Async)");
        }
        

        com.squareup.okhttp.Call call = getPeeringsCall(xProjectId, clusterId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询对等连接列表
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @return GetPeeringsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPeeringsResponse getPeerings(String xProjectId, Integer clusterId) throws ApiException {
        ApiResponse<GetPeeringsResponse> resp = getPeeringsWithHttpInfo(xProjectId, clusterId);
        return resp.getData();
    }

    /**
     * 查询对等连接列表
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @return ApiResponse&lt;GetPeeringsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPeeringsResponse> getPeeringsWithHttpInfo(String xProjectId, Integer clusterId) throws ApiException {
        com.squareup.okhttp.Call call = getPeeringsValidateBeforeCall(xProjectId, clusterId, null, null);
        Type localVarReturnType = new TypeToken<GetPeeringsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询对等连接列表 (asynchronously)
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPeeringsAsync(String xProjectId, Integer clusterId, final ApiCallback<GetPeeringsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPeeringsValidateBeforeCall(xProjectId, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPeeringsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getReservedClusters
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 集群名 (optional)
     * @param status 集群状态码, 请参考CS文档 (optional)
     * @param cursor 集群ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReservedClustersCall(String xProjectId, String name, String status, Long cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_clusters"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (next != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next", next));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call getReservedClustersValidateBeforeCall(String xProjectId, String name, String status, Long cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getReservedClusters(Async)");
        }
        

        com.squareup.okhttp.Call call = getReservedClustersCall(xProjectId, name, status, cursor, next, limit, order, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询租户下的集群列表
     * 租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 集群名 (optional)
     * @param status 集群状态码, 请参考CS文档 (optional)
     * @param cursor 集群ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return QueryClustersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryClustersResponse getReservedClusters(String xProjectId, String name, String status, Long cursor, Boolean next, Integer limit, String order) throws ApiException {
        ApiResponse<QueryClustersResponse> resp = getReservedClustersWithHttpInfo(xProjectId, name, status, cursor, next, limit, order);
        return resp.getData();
    }

    /**
     * 查询租户下的集群列表
     * 租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 集群名 (optional)
     * @param status 集群状态码, 请参考CS文档 (optional)
     * @param cursor 集群ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return ApiResponse&lt;QueryClustersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryClustersResponse> getReservedClustersWithHttpInfo(String xProjectId, String name, String status, Long cursor, Boolean next, Integer limit, String order) throws ApiException {
        com.squareup.okhttp.Call call = getReservedClustersValidateBeforeCall(xProjectId, name, status, cursor, next, limit, order, null, null);
        Type localVarReturnType = new TypeToken<QueryClustersResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询租户下的集群列表 (asynchronously)
     * 租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 集群名 (optional)
     * @param status 集群状态码, 请参考CS文档 (optional)
     * @param cursor 集群ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReservedClustersAsync(String xProjectId, String name, String status, Long cursor, Boolean next, Integer limit, String order, final ApiCallback<QueryClustersResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getReservedClustersValidateBeforeCall(xProjectId, name, status, cursor, next, limit, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryClustersResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRoutes
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRoutesCall(String xProjectId, Integer clusterId, String peeringId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
            .replaceAll("\\{" + "peering_id" + "\\}", apiClient.escapeString(peeringId.toString()));

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
    private com.squareup.okhttp.Call getRoutesValidateBeforeCall(String xProjectId, Integer clusterId, String peeringId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getRoutes(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling getRoutes(Async)");
        }
        
        // verify the required parameter 'peeringId' is set
        if (peeringId == null) {
            throw new ApiException("Missing the required parameter 'peeringId' when calling getRoutes(Async)");
        }
        

        com.squareup.okhttp.Call call = getRoutesCall(xProjectId, clusterId, peeringId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询路由列表
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @return GetRoutesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRoutesResponse getRoutes(String xProjectId, Integer clusterId, String peeringId) throws ApiException {
        ApiResponse<GetRoutesResponse> resp = getRoutesWithHttpInfo(xProjectId, clusterId, peeringId);
        return resp.getData();
    }

    /**
     * 查询路由列表
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @return ApiResponse&lt;GetRoutesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetRoutesResponse> getRoutesWithHttpInfo(String xProjectId, Integer clusterId, String peeringId) throws ApiException {
        com.squareup.okhttp.Call call = getRoutesValidateBeforeCall(xProjectId, clusterId, peeringId, null, null);
        Type localVarReturnType = new TypeToken<GetRoutesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询路由列表 (asynchronously)
     * 
     * @param xProjectId  (required)
     * @param clusterId  (required)
     * @param peeringId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRoutesAsync(String xProjectId, Integer clusterId, String peeringId, final ApiCallback<GetRoutesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRoutesValidateBeforeCall(xProjectId, clusterId, peeringId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetRoutesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserQuota
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserQuotaCall(String xProjectId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/user_quota/{user_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
    private com.squareup.okhttp.Call getUserQuotaValidateBeforeCall(String xProjectId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getUserQuota(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserQuota(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserQuotaCall(xProjectId, userId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询指定用户配额信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @return QueryUserQuotaResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryUserQuotaResponse getUserQuota(String xProjectId, String userId) throws ApiException {
        ApiResponse<QueryUserQuotaResponse> resp = getUserQuotaWithHttpInfo(xProjectId, userId);
        return resp.getData();
    }

    /**
     * 查询指定用户配额信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @return ApiResponse&lt;QueryUserQuotaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryUserQuotaResponse> getUserQuotaWithHttpInfo(String xProjectId, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getUserQuotaValidateBeforeCall(xProjectId, userId, null, null);
        Type localVarReturnType = new TypeToken<QueryUserQuotaResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询指定用户配额信息 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserQuotaAsync(String xProjectId, String userId, final ApiCallback<QueryUserQuotaResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserQuotaValidateBeforeCall(xProjectId, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryUserQuotaResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserQuotas
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 用户名 (optional)
     * @param cursor 用户ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserQuotasCall(String xProjectId, String name, String cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/user_quotas"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (next != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next", next));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call getUserQuotasValidateBeforeCall(String xProjectId, String name, String cursor, Boolean next, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getUserQuotas(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserQuotasCall(xProjectId, name, cursor, next, limit, order, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 获取租户下的用户配额信息
     * 租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 用户名 (optional)
     * @param cursor 用户ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return QueryUserQuotasResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryUserQuotasResponse getUserQuotas(String xProjectId, String name, String cursor, Boolean next, Integer limit, String order) throws ApiException {
        ApiResponse<QueryUserQuotasResponse> resp = getUserQuotasWithHttpInfo(xProjectId, name, cursor, next, limit, order);
        return resp.getData();
    }

    /**
     * 获取租户下的用户配额信息
     * 租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 用户名 (optional)
     * @param cursor 用户ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return ApiResponse&lt;QueryUserQuotasResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryUserQuotasResponse> getUserQuotasWithHttpInfo(String xProjectId, String name, String cursor, Boolean next, Integer limit, String order) throws ApiException {
        com.squareup.okhttp.Call call = getUserQuotasValidateBeforeCall(xProjectId, name, cursor, next, limit, order, null, null);
        Type localVarReturnType = new TypeToken<QueryUserQuotasResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取租户下的用户配额信息 (asynchronously)
     * 租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param name 用户名 (optional)
     * @param cursor 用户ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserQuotasAsync(String xProjectId, String name, String cursor, Boolean next, Integer limit, String order, final ApiCallback<QueryUserQuotasResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserQuotasValidateBeforeCall(xProjectId, name, cursor, next, limit, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryUserQuotasResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for restartReservedCluster
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call restartReservedClusterCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/restart"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
    private com.squareup.okhttp.Call restartReservedClusterValidateBeforeCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling restartReservedCluster(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling restartReservedCluster(Async)");
        }
        

        com.squareup.okhttp.Call call = restartReservedClusterCall(xProjectId, clusterId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 重启独享集群
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @return RestartReservedClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestartReservedClusterResponse restartReservedCluster(String xProjectId, Integer clusterId) throws ApiException {
        ApiResponse<RestartReservedClusterResponse> resp = restartReservedClusterWithHttpInfo(xProjectId, clusterId);
        return resp.getData();
    }

    /**
     * 重启独享集群
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @return ApiResponse&lt;RestartReservedClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestartReservedClusterResponse> restartReservedClusterWithHttpInfo(String xProjectId, Integer clusterId) throws ApiException {
        com.squareup.okhttp.Call call = restartReservedClusterValidateBeforeCall(xProjectId, clusterId, null, null);
        Type localVarReturnType = new TypeToken<RestartReservedClusterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 重启独享集群 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call restartReservedClusterAsync(String xProjectId, Integer clusterId, final ApiCallback<RestartReservedClusterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = restartReservedClusterValidateBeforeCall(xProjectId, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestartReservedClusterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for stopReservedCluster
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call stopReservedClusterCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/stop"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
    private com.squareup.okhttp.Call stopReservedClusterValidateBeforeCall(String xProjectId, Integer clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling stopReservedCluster(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling stopReservedCluster(Async)");
        }
        

        com.squareup.okhttp.Call call = stopReservedClusterCall(xProjectId, clusterId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 停止独享集群
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @return StopReservedClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StopReservedClusterResponse stopReservedCluster(String xProjectId, Integer clusterId) throws ApiException {
        ApiResponse<StopReservedClusterResponse> resp = stopReservedClusterWithHttpInfo(xProjectId, clusterId);
        return resp.getData();
    }

    /**
     * 停止独享集群
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @return ApiResponse&lt;StopReservedClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StopReservedClusterResponse> stopReservedClusterWithHttpInfo(String xProjectId, Integer clusterId) throws ApiException {
        com.squareup.okhttp.Call call = stopReservedClusterValidateBeforeCall(xProjectId, clusterId, null, null);
        Type localVarReturnType = new TypeToken<StopReservedClusterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 停止独享集群 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call stopReservedClusterAsync(String xProjectId, Integer clusterId, final ApiCallback<StopReservedClusterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = stopReservedClusterValidateBeforeCall(xProjectId, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StopReservedClusterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateHostsInfo
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostId 域名ID. (required)
     * @param body JSON格式的请求体 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateHostsInfoCall(String xProjectId, Integer clusterId, Long hostId, Body2 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}/hosts/{host_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()))
            .replaceAll("\\{" + "host_id" + "\\}", apiClient.escapeString(hostId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateHostsInfoValidateBeforeCall(String xProjectId, Integer clusterId, Long hostId, Body2 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling updateHostsInfo(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling updateHostsInfo(Async)");
        }
        
        // verify the required parameter 'hostId' is set
        if (hostId == null) {
            throw new ApiException("Missing the required parameter 'hostId' when calling updateHostsInfo(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateHostsInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = updateHostsInfoCall(xProjectId, clusterId, hostId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 更新IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostId 域名ID. (required)
     * @param body JSON格式的请求体 (required)
     * @return UpdateHostsInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateHostsInfoResponse updateHostsInfo(String xProjectId, Integer clusterId, Long hostId, Body2 body) throws ApiException {
        ApiResponse<UpdateHostsInfoResponse> resp = updateHostsInfoWithHttpInfo(xProjectId, clusterId, hostId, body);
        return resp.getData();
    }

    /**
     * 更新IP域名映射信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostId 域名ID. (required)
     * @param body JSON格式的请求体 (required)
     * @return ApiResponse&lt;UpdateHostsInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateHostsInfoResponse> updateHostsInfoWithHttpInfo(String xProjectId, Integer clusterId, Long hostId, Body2 body) throws ApiException {
        com.squareup.okhttp.Call call = updateHostsInfoValidateBeforeCall(xProjectId, clusterId, hostId, body, null, null);
        Type localVarReturnType = new TypeToken<UpdateHostsInfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 更新IP域名映射信息 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID. (required)
     * @param hostId 域名ID. (required)
     * @param body JSON格式的请求体 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateHostsInfoAsync(String xProjectId, Integer clusterId, Long hostId, Body2 body, final ApiCallback<UpdateHostsInfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateHostsInfoValidateBeforeCall(xProjectId, clusterId, hostId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateHostsInfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateReservedCluster
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param body 提交修改集群请求 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateReservedClusterCall(String xProjectId, Integer clusterId, UpdateClusterRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/reserved_cluster/{cluster_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "cluster_id" + "\\}", apiClient.escapeString(clusterId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateReservedClusterValidateBeforeCall(String xProjectId, Integer clusterId, UpdateClusterRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling updateReservedCluster(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling updateReservedCluster(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateReservedCluster(Async)");
        }
        

        com.squareup.okhttp.Call call = updateReservedClusterCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 更新独享集群
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param body 提交修改集群请求 (required)
     * @return GlobalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalResponse updateReservedCluster(String xProjectId, Integer clusterId, UpdateClusterRequest body) throws ApiException {
        ApiResponse<GlobalResponse> resp = updateReservedClusterWithHttpInfo(xProjectId, clusterId, body);
        return resp.getData();
    }

    /**
     * 更新独享集群
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param body 提交修改集群请求 (required)
     * @return ApiResponse&lt;GlobalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalResponse> updateReservedClusterWithHttpInfo(String xProjectId, Integer clusterId, UpdateClusterRequest body) throws ApiException {
        com.squareup.okhttp.Call call = updateReservedClusterValidateBeforeCall(xProjectId, clusterId, body, null, null);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 更新独享集群 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param clusterId 独享集群ID (required)
     * @param body 提交修改集群请求 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateReservedClusterAsync(String xProjectId, Integer clusterId, UpdateClusterRequest body, final ApiCallback<GlobalResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateReservedClusterValidateBeforeCall(xProjectId, clusterId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUserQuota
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @param body JSON格式的请求体 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUserQuotaCall(String xProjectId, String userId, UpdateUserQuotaRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/user_quota/{user_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateUserQuotaValidateBeforeCall(String xProjectId, String userId, UpdateUserQuotaRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling updateUserQuota(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateUserQuota(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateUserQuota(Async)");
        }
        

        com.squareup.okhttp.Call call = updateUserQuotaCall(xProjectId, userId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 更新指定用户配额信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @param body JSON格式的请求体 (required)
     * @return GlobalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalResponse updateUserQuota(String xProjectId, String userId, UpdateUserQuotaRequest body) throws ApiException {
        ApiResponse<GlobalResponse> resp = updateUserQuotaWithHttpInfo(xProjectId, userId, body);
        return resp.getData();
    }

    /**
     * 更新指定用户配额信息
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @param body JSON格式的请求体 (required)
     * @return ApiResponse&lt;GlobalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalResponse> updateUserQuotaWithHttpInfo(String xProjectId, String userId, UpdateUserQuotaRequest body) throws ApiException {
        com.squareup.okhttp.Call call = updateUserQuotaValidateBeforeCall(xProjectId, userId, body, null, null);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 更新指定用户配额信息 (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param userId 用户ID (required)
     * @param body JSON格式的请求体 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUserQuotaAsync(String xProjectId, String userId, UpdateUserQuotaRequest body, final ApiCallback<GlobalResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateUserQuotaValidateBeforeCall(xProjectId, userId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
