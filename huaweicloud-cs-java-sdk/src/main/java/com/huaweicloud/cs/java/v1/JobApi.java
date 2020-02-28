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


import java.io.File;
import com.huaweicloud.cs.java.v1.model.FlinkGlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.GetJobDetailResponse;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.GlobalResponse;
import com.huaweicloud.cs.java.v1.model.JobApigSinksResponse;
import com.huaweicloud.cs.java.v1.model.JobExecutePlanResponse;
import com.huaweicloud.cs.java.v1.model.JobStatusResponse;
import com.huaweicloud.cs.java.v1.model.JobUpdateResponse;
import com.huaweicloud.cs.java.v1.model.QueryFlinkJobListResponse;
import com.huaweicloud.cs.java.v1.model.QueryJobListResponse;
import com.huaweicloud.cs.java.v1.model.SubmitSqlJobRequest;
import com.huaweicloud.cs.java.v1.model.UpdateSqlJobRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobApi {
    private ApiClient apiClient;

    public JobApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteJob
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteJobCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/job/{job_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

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
    private com.squareup.okhttp.Call deleteJobValidateBeforeCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling deleteJob(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling deleteJob(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteJobCall(projectId, jobId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 删除作业
     * 删除任何状态的作业
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return GlobalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalResponse deleteJob(String projectId, Long jobId) throws ApiException {
        ApiResponse<GlobalResponse> resp = deleteJobWithHttpInfo(projectId, jobId);
        return resp.getData();
    }

    /**
     * 删除作业
     * 删除任何状态的作业
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return ApiResponse&lt;GlobalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalResponse> deleteJobWithHttpInfo(String projectId, Long jobId) throws ApiException {
        com.squareup.okhttp.Call call = deleteJobValidateBeforeCall(projectId, jobId, null, null);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除作业 (asynchronously)
     * 删除任何状态的作业
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteJobAsync(String projectId, Long jobId, final ApiCallback<GlobalResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteJobValidateBeforeCall(projectId, jobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getApigSinks
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getApigSinksCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/job/{job_id}/apig_sinks"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

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
    private com.squareup.okhttp.Call getApigSinksValidateBeforeCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getApigSinks(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getApigSinks(Async)");
        }
        

        com.squareup.okhttp.Call call = getApigSinksCall(projectId, jobId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询作业apig网关服务访问地址
     * The apig sinks is json format.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return JobApigSinksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobApigSinksResponse getApigSinks(String projectId, Long jobId) throws ApiException {
        ApiResponse<JobApigSinksResponse> resp = getApigSinksWithHttpInfo(projectId, jobId);
        return resp.getData();
    }

    /**
     * 查询作业apig网关服务访问地址
     * The apig sinks is json format.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return ApiResponse&lt;JobApigSinksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobApigSinksResponse> getApigSinksWithHttpInfo(String projectId, Long jobId) throws ApiException {
        com.squareup.okhttp.Call call = getApigSinksValidateBeforeCall(projectId, jobId, null, null);
        Type localVarReturnType = new TypeToken<JobApigSinksResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询作业apig网关服务访问地址 (asynchronously)
     * The apig sinks is json format.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getApigSinksAsync(String projectId, Long jobId, final ApiCallback<JobApigSinksResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getApigSinksValidateBeforeCall(projectId, jobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobApigSinksResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFlinkJobs
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考DLI文档 (optional)
     * @param queueName 队列名称 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param offset 作业偏移量 (optional)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @param userName 用户名，可作为筛选条件 (optional)
     * @param jobType 作业类型 (optional)
     * @param showJobType 显示数据类型，可选spark，flink， all， 默认为all (optional, default to all)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFlinkJobsCall(String projectId, String name, String status, String queueName, Boolean showDetail, Long offset, Integer limit, String order, Long rootJobId, String userName, String jobType, String showJobType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/streaming/jobs"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (queueName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("queue_name", queueName));
        if (showDetail != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_detail", showDetail));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
        if (rootJobId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("root_job_id", rootJobId));
        if (userName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_name", userName));
        if (jobType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("job_type", jobType));
        if (showJobType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_job_type", showJobType));

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
    private com.squareup.okhttp.Call getFlinkJobsValidateBeforeCall(String projectId, String name, String status, String queueName, Boolean showDetail, Long offset, Integer limit, String order, Long rootJobId, String userName, String jobType, String showJobType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getFlinkJobs(Async)");
        }
        

        com.squareup.okhttp.Call call = getFlinkJobsCall(projectId, name, status, queueName, showDetail, offset, limit, order, rootJobId, userName, jobType, showJobType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询DLI流作业列表
     * DLI流作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order, root_job_id. The cursor here is job id.
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考DLI文档 (optional)
     * @param queueName 队列名称 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param offset 作业偏移量 (optional)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @param userName 用户名，可作为筛选条件 (optional)
     * @param jobType 作业类型 (optional)
     * @param showJobType 显示数据类型，可选spark，flink， all， 默认为all (optional, default to all)
     * @return QueryFlinkJobListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryFlinkJobListResponse getFlinkJobs(String projectId, String name, String status, String queueName, Boolean showDetail, Long offset, Integer limit, String order, Long rootJobId, String userName, String jobType, String showJobType) throws ApiException {
        ApiResponse<QueryFlinkJobListResponse> resp = getFlinkJobsWithHttpInfo(projectId, name, status, queueName, showDetail, offset, limit, order, rootJobId, userName, jobType, showJobType);
        return resp.getData();
    }

    /**
     * 查询DLI流作业列表
     * DLI流作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order, root_job_id. The cursor here is job id.
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考DLI文档 (optional)
     * @param queueName 队列名称 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param offset 作业偏移量 (optional)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @param userName 用户名，可作为筛选条件 (optional)
     * @param jobType 作业类型 (optional)
     * @param showJobType 显示数据类型，可选spark，flink， all， 默认为all (optional, default to all)
     * @return ApiResponse&lt;QueryFlinkJobListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryFlinkJobListResponse> getFlinkJobsWithHttpInfo(String projectId, String name, String status, String queueName, Boolean showDetail, Long offset, Integer limit, String order, Long rootJobId, String userName, String jobType, String showJobType) throws ApiException {
        com.squareup.okhttp.Call call = getFlinkJobsValidateBeforeCall(projectId, name, status, queueName, showDetail, offset, limit, order, rootJobId, userName, jobType, showJobType, null, null);
        Type localVarReturnType = new TypeToken<QueryFlinkJobListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询DLI流作业列表 (asynchronously)
     * DLI流作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order, root_job_id. The cursor here is job id.
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考DLI文档 (optional)
     * @param queueName 队列名称 (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param offset 作业偏移量 (optional)
     * @param limit 返回的数据条数 (optional, default to 10)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @param userName 用户名，可作为筛选条件 (optional)
     * @param jobType 作业类型 (optional)
     * @param showJobType 显示数据类型，可选spark，flink， all， 默认为all (optional, default to all)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFlinkJobsAsync(String projectId, String name, String status, String queueName, Boolean showDetail, Long offset, Integer limit, String order, Long rootJobId, String userName, String jobType, String showJobType, final ApiCallback<QueryFlinkJobListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFlinkJobsValidateBeforeCall(projectId, name, status, queueName, showDetail, offset, limit, order, rootJobId, userName, jobType, showJobType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryFlinkJobListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getJobDetail
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getJobDetailCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/job/{job_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

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
    private com.squareup.okhttp.Call getJobDetailValidateBeforeCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getJobDetail(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJobDetail(Async)");
        }
        

        com.squareup.okhttp.Call call = getJobDetailCall(projectId, jobId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询作业详情
     * Get job detail information.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return GetJobDetailResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetJobDetailResponse getJobDetail(String projectId, Long jobId) throws ApiException {
        ApiResponse<GetJobDetailResponse> resp = getJobDetailWithHttpInfo(projectId, jobId);
        return resp.getData();
    }

    /**
     * 查询作业详情
     * Get job detail information.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return ApiResponse&lt;GetJobDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetJobDetailResponse> getJobDetailWithHttpInfo(String projectId, Long jobId) throws ApiException {
        com.squareup.okhttp.Call call = getJobDetailValidateBeforeCall(projectId, jobId, null, null);
        Type localVarReturnType = new TypeToken<GetJobDetailResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询作业详情 (asynchronously)
     * Get job detail information.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobDetailAsync(String projectId, Long jobId, final ApiCallback<GetJobDetailResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobDetailValidateBeforeCall(projectId, jobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetJobDetailResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getJobExecuteGraph
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getJobExecuteGraphCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/job/{job_id}/execute_graph"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

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
    private com.squareup.okhttp.Call getJobExecuteGraphValidateBeforeCall(String projectId, Long jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getJobExecuteGraph(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJobExecuteGraph(Async)");
        }
        

        com.squareup.okhttp.Call call = getJobExecuteGraphCall(projectId, jobId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询作业执行计划图
     * The execution graph is json format.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return JobExecutePlanResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobExecutePlanResponse getJobExecuteGraph(String projectId, Long jobId) throws ApiException {
        ApiResponse<JobExecutePlanResponse> resp = getJobExecuteGraphWithHttpInfo(projectId, jobId);
        return resp.getData();
    }

    /**
     * 查询作业执行计划图
     * The execution graph is json format.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @return ApiResponse&lt;JobExecutePlanResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobExecutePlanResponse> getJobExecuteGraphWithHttpInfo(String projectId, Long jobId) throws ApiException {
        com.squareup.okhttp.Call call = getJobExecuteGraphValidateBeforeCall(projectId, jobId, null, null);
        Type localVarReturnType = new TypeToken<JobExecutePlanResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询作业执行计划图 (asynchronously)
     * The execution graph is json format.
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobExecuteGraphAsync(String projectId, Long jobId, final ApiCallback<JobExecutePlanResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobExecuteGraphValidateBeforeCall(projectId, jobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobExecutePlanResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getJobs
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param clusterId 用户独享集群ID (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getJobsCall(String projectId, String name, String status, Integer clusterId, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, Long rootJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/jobs"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
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
        if (rootJobId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("root_job_id", rootJobId));

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
    private com.squareup.okhttp.Call getJobsValidateBeforeCall(String projectId, String name, String status, Integer clusterId, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, Long rootJobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getJobs(Async)");
        }
        

        com.squareup.okhttp.Call call = getJobsCall(projectId, name, status, clusterId, showDetail, cursor, next, limit, order, rootJobId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 查询作业列表
     * 作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order, root_job_id. The cursor here is job id.
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param clusterId 用户独享集群ID (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @return QueryJobListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryJobListResponse getJobs(String projectId, String name, String status, Integer clusterId, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, Long rootJobId) throws ApiException {
        ApiResponse<QueryJobListResponse> resp = getJobsWithHttpInfo(projectId, name, status, clusterId, showDetail, cursor, next, limit, order, rootJobId);
        return resp.getData();
    }

    /**
     * 查询作业列表
     * 作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order, root_job_id. The cursor here is job id.
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param clusterId 用户独享集群ID (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @return ApiResponse&lt;QueryJobListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryJobListResponse> getJobsWithHttpInfo(String projectId, String name, String status, Integer clusterId, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, Long rootJobId) throws ApiException {
        com.squareup.okhttp.Call call = getJobsValidateBeforeCall(projectId, name, status, clusterId, showDetail, cursor, next, limit, order, rootJobId, null, null);
        Type localVarReturnType = new TypeToken<QueryJobListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询作业列表 (asynchronously)
     * 作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order, root_job_id. The cursor here is job id.
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名 (optional)
     * @param status 作业状态码, 请参考CS文档 (optional)
     * @param clusterId 用户独享集群ID (optional)
     * @param showDetail 是否返回作业详情信息 (optional, default to false)
     * @param cursor 作业ID (optional)
     * @param next 是否向下翻页 (optional, default to true)
     * @param limit 返回的数据条数 (optional, default to 20)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param rootJobId 边缘父作业ID, 用于查询指定边缘作业的子作业; 不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobsAsync(String projectId, String name, String status, Integer clusterId, Boolean showDetail, Long cursor, Boolean next, Integer limit, String order, Long rootJobId, final ApiCallback<QueryJobListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobsValidateBeforeCall(projectId, name, status, clusterId, showDetail, cursor, next, limit, order, rootJobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryJobListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for runJob
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param resumeSavePoint  (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call runJobCall(String projectId, Long jobId, Boolean resumeSavePoint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/job/{job_id}/run"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (resumeSavePoint != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resumeSavePoint", resumeSavePoint));

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
    private com.squareup.okhttp.Call runJobValidateBeforeCall(String projectId, Long jobId, Boolean resumeSavePoint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling runJob(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling runJob(Async)");
        }
        

        com.squareup.okhttp.Call call = runJobCall(projectId, jobId, resumeSavePoint, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 运行作业
     * 触发运行作业
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param resumeSavePoint  (optional, default to false)
     * @return GlobalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalResponse runJob(String projectId, Long jobId, Boolean resumeSavePoint) throws ApiException {
        ApiResponse<GlobalResponse> resp = runJobWithHttpInfo(projectId, jobId, resumeSavePoint);
        return resp.getData();
    }

    /**
     * 运行作业
     * 触发运行作业
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param resumeSavePoint  (optional, default to false)
     * @return ApiResponse&lt;GlobalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalResponse> runJobWithHttpInfo(String projectId, Long jobId, Boolean resumeSavePoint) throws ApiException {
        com.squareup.okhttp.Call call = runJobValidateBeforeCall(projectId, jobId, resumeSavePoint, null, null);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 运行作业 (asynchronously)
     * 触发运行作业
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param resumeSavePoint  (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call runJobAsync(String projectId, Long jobId, Boolean resumeSavePoint, final ApiCallback<GlobalResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = runJobValidateBeforeCall(projectId, jobId, resumeSavePoint, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for stopJob
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param triggerSavePoint  (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call stopJobCall(String projectId, Long jobId, Boolean triggerSavePoint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/job/{job_id}/stop"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (triggerSavePoint != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("triggerSavePoint", triggerSavePoint));

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
    private com.squareup.okhttp.Call stopJobValidateBeforeCall(String projectId, Long jobId, Boolean triggerSavePoint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling stopJob(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling stopJob(Async)");
        }
        

        com.squareup.okhttp.Call call = stopJobCall(projectId, jobId, triggerSavePoint, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 停止作业
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param triggerSavePoint  (optional, default to false)
     * @return GlobalResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalResponse stopJob(String projectId, Long jobId, Boolean triggerSavePoint) throws ApiException {
        ApiResponse<GlobalResponse> resp = stopJobWithHttpInfo(projectId, jobId, triggerSavePoint);
        return resp.getData();
    }

    /**
     * 停止作业
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param triggerSavePoint  (optional, default to false)
     * @return ApiResponse&lt;GlobalResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalResponse> stopJobWithHttpInfo(String projectId, Long jobId, Boolean triggerSavePoint) throws ApiException {
        com.squareup.okhttp.Call call = stopJobValidateBeforeCall(projectId, jobId, triggerSavePoint, null, null);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 停止作业 (asynchronously)
     * 
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param triggerSavePoint  (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call stopJobAsync(String projectId, Long jobId, Boolean triggerSavePoint, final ApiCallback<GlobalResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = stopJobValidateBeforeCall(projectId, jobId, triggerSavePoint, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for submitJarJob
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名称 (required)
     * @param desc 作业描述 (required)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param jobType 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业 (required)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitJarJobCall(String projectId, String name, String desc, Integer clusterId, Integer managerSpu, String jobType, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/jar_job"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (name != null)
        localVarFormParams.put("name", name);
        if (desc != null)
        localVarFormParams.put("desc", desc);
        if (clusterId != null)
        localVarFormParams.put("cluster_id", clusterId);
        if (spuNumber != null)
        localVarFormParams.put("spu_number", spuNumber);
        if (managerSpu != null)
        localVarFormParams.put("manager_spu", managerSpu);
        if (parallelNumber != null)
        localVarFormParams.put("parallel_number", parallelNumber);
        if (executorNumber != null)
        localVarFormParams.put("executor_number", executorNumber);
        if (executorSpu != null)
        localVarFormParams.put("executor_spu", executorSpu);
        if (logEnabled != null)
        localVarFormParams.put("log_enabled", logEnabled);
        if (obsBucket != null)
        localVarFormParams.put("obs_bucket", obsBucket);
        if (smnTopic != null)
        localVarFormParams.put("smn_topic", smnTopic);
        if (jar != null)
        localVarFormParams.put("jar", jar);
        if (jarUrl != null)
        localVarFormParams.put("jar_url", jarUrl);
        if (config != null)
        localVarFormParams.put("config", config);
        if (configUrl != null)
        localVarFormParams.put("config_url", configUrl);
        if (jobType != null)
        localVarFormParams.put("job_type", jobType);
        if (mainClass != null)
        localVarFormParams.put("main_class", mainClass);
        if (args != null)
        localVarFormParams.put("args", args);
        if (restartWhenException != null)
        localVarFormParams.put("restart_when_exception", restartWhenException);
        if (tags != null)
        localVarFormParams.put("tags", tags);
        if (sysEnterpriseProjectId != null)
        localVarFormParams.put("sys_enterprise_project_id", sysEnterpriseProjectId);

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
    private com.squareup.okhttp.Call submitJarJobValidateBeforeCall(String projectId, String name, String desc, Integer clusterId, Integer managerSpu, String jobType, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling submitJarJob(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling submitJarJob(Async)");
        }
        
        // verify the required parameter 'desc' is set
        if (desc == null) {
            throw new ApiException("Missing the required parameter 'desc' when calling submitJarJob(Async)");
        }
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling submitJarJob(Async)");
        }
        
        // verify the required parameter 'managerSpu' is set
        if (managerSpu == null) {
            throw new ApiException("Missing the required parameter 'managerSpu' when calling submitJarJob(Async)");
        }
        
        // verify the required parameter 'jobType' is set
        if (jobType == null) {
            throw new ApiException("Missing the required parameter 'jobType' when calling submitJarJob(Async)");
        }
        

        com.squareup.okhttp.Call call = submitJarJobCall(projectId, name, desc, clusterId, managerSpu, jobType, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 创建一个用户自定义作业
     * 用户自定义作业目前支持jar格式, 运行在独享集群中
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名称 (required)
     * @param desc 作业描述 (required)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param jobType 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业 (required)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @return JobStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobStatusResponse submitJarJob(String projectId, String name, String desc, Integer clusterId, Integer managerSpu, String jobType, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId) throws ApiException {
        ApiResponse<JobStatusResponse> resp = submitJarJobWithHttpInfo(projectId, name, desc, clusterId, managerSpu, jobType, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId);
        return resp.getData();
    }

    /**
     * 创建一个用户自定义作业
     * 用户自定义作业目前支持jar格式, 运行在独享集群中
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名称 (required)
     * @param desc 作业描述 (required)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param jobType 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业 (required)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @return ApiResponse&lt;JobStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobStatusResponse> submitJarJobWithHttpInfo(String projectId, String name, String desc, Integer clusterId, Integer managerSpu, String jobType, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId) throws ApiException {
        com.squareup.okhttp.Call call = submitJarJobValidateBeforeCall(projectId, name, desc, clusterId, managerSpu, jobType, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId, null, null);
        Type localVarReturnType = new TypeToken<JobStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 创建一个用户自定义作业 (asynchronously)
     * 用户自定义作业目前支持jar格式, 运行在独享集群中
     * @param projectId project id, 用于不同project取token. (required)
     * @param name 作业名称 (required)
     * @param desc 作业描述 (required)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param jobType 作业类型，flink_jar_job表示Flink自定义作业，spark_streaming_jar_job表示SparkStreaming自定义作业 (required)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitJarJobAsync(String projectId, String name, String desc, Integer clusterId, Integer managerSpu, String jobType, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId, final ApiCallback<JobStatusResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = submitJarJobValidateBeforeCall(projectId, name, desc, clusterId, managerSpu, jobType, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for submitSqlJob
     * @param projectId project id, 用于不同project取token. (required)
     * @param body JSON格式的请求体 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitSqlJobCall(String projectId, SubmitSqlJobRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{project_id}/sql_job"
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
    private com.squareup.okhttp.Call submitSqlJobValidateBeforeCall(String projectId, SubmitSqlJobRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling submitSqlJob(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitSqlJob(Async)");
        }
        

        com.squareup.okhttp.Call call = submitSqlJobCall(projectId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 提交流式SQL作业到CS服务
     * 通过POST方式, 提交流式SQL作业, 请求体为JSON格式
     * @param projectId project id, 用于不同project取token. (required)
     * @param body JSON格式的请求体 (required)
     * @return JobStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobStatusResponse submitSqlJob(String projectId, SubmitSqlJobRequest body) throws ApiException {
        ApiResponse<JobStatusResponse> resp = submitSqlJobWithHttpInfo(projectId, body);
        return resp.getData();
    }

    /**
     * 提交流式SQL作业到CS服务
     * 通过POST方式, 提交流式SQL作业, 请求体为JSON格式
     * @param projectId project id, 用于不同project取token. (required)
     * @param body JSON格式的请求体 (required)
     * @return ApiResponse&lt;JobStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobStatusResponse> submitSqlJobWithHttpInfo(String projectId, SubmitSqlJobRequest body) throws ApiException {
        com.squareup.okhttp.Call call = submitSqlJobValidateBeforeCall(projectId, body, null, null);
        Type localVarReturnType = new TypeToken<JobStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 提交流式SQL作业到CS服务 (asynchronously)
     * 通过POST方式, 提交流式SQL作业, 请求体为JSON格式
     * @param projectId project id, 用于不同project取token. (required)
     * @param body JSON格式的请求体 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitSqlJobAsync(String projectId, SubmitSqlJobRequest body, final ApiCallback<JobStatusResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = submitSqlJobValidateBeforeCall(projectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateJarJob
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param name 作业名称 (optional)
     * @param desc 作业描述 (optional)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (optional)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateJarJobCall(String projectId, Long jobId, Integer managerSpu, String name, String desc, Integer clusterId, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{project_id}/jar_job"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (jobId != null)
        localVarFormParams.put("job_id", jobId);
        if (name != null)
        localVarFormParams.put("name", name);
        if (desc != null)
        localVarFormParams.put("desc", desc);
        if (clusterId != null)
        localVarFormParams.put("cluster_id", clusterId);
        if (spuNumber != null)
        localVarFormParams.put("spu_number", spuNumber);
        if (managerSpu != null)
        localVarFormParams.put("manager_spu", managerSpu);
        if (parallelNumber != null)
        localVarFormParams.put("parallel_number", parallelNumber);
        if (executorNumber != null)
        localVarFormParams.put("executor_number", executorNumber);
        if (executorSpu != null)
        localVarFormParams.put("executor_spu", executorSpu);
        if (logEnabled != null)
        localVarFormParams.put("log_enabled", logEnabled);
        if (obsBucket != null)
        localVarFormParams.put("obs_bucket", obsBucket);
        if (smnTopic != null)
        localVarFormParams.put("smn_topic", smnTopic);
        if (jar != null)
        localVarFormParams.put("jar", jar);
        if (jarUrl != null)
        localVarFormParams.put("jar_url", jarUrl);
        if (config != null)
        localVarFormParams.put("config", config);
        if (configUrl != null)
        localVarFormParams.put("config_url", configUrl);
        if (mainClass != null)
        localVarFormParams.put("main_class", mainClass);
        if (args != null)
        localVarFormParams.put("args", args);
        if (restartWhenException != null)
        localVarFormParams.put("restart_when_exception", restartWhenException);
        if (tags != null)
        localVarFormParams.put("tags", tags);
        if (sysEnterpriseProjectId != null)
        localVarFormParams.put("sys_enterprise_project_id", sysEnterpriseProjectId);

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateJarJobValidateBeforeCall(String projectId, Long jobId, Integer managerSpu, String name, String desc, Integer clusterId, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling updateJarJob(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling updateJarJob(Async)");
        }
        
        // verify the required parameter 'managerSpu' is set
        if (managerSpu == null) {
            throw new ApiException("Missing the required parameter 'managerSpu' when calling updateJarJob(Async)");
        }
        

        com.squareup.okhttp.Call call = updateJarJobCall(projectId, jobId, managerSpu, name, desc, clusterId, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 更新用户自定义作业
     * 目前仅支持Jar格式, 运行在独享集群中
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param name 作业名称 (optional)
     * @param desc 作业描述 (optional)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (optional)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @return JobUpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobUpdateResponse updateJarJob(String projectId, Long jobId, Integer managerSpu, String name, String desc, Integer clusterId, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId) throws ApiException {
        ApiResponse<JobUpdateResponse> resp = updateJarJobWithHttpInfo(projectId, jobId, managerSpu, name, desc, clusterId, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId);
        return resp.getData();
    }

    /**
     * 更新用户自定义作业
     * 目前仅支持Jar格式, 运行在独享集群中
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param name 作业名称 (optional)
     * @param desc 作业描述 (optional)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (optional)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @return ApiResponse&lt;JobUpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobUpdateResponse> updateJarJobWithHttpInfo(String projectId, Long jobId, Integer managerSpu, String name, String desc, Integer clusterId, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId) throws ApiException {
        com.squareup.okhttp.Call call = updateJarJobValidateBeforeCall(projectId, jobId, managerSpu, name, desc, clusterId, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId, null, null);
        Type localVarReturnType = new TypeToken<JobUpdateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 更新用户自定义作业 (asynchronously)
     * 目前仅支持Jar格式, 运行在独享集群中
     * @param projectId project id, 用于不同project取token. (required)
     * @param jobId 作业ID (required)
     * @param managerSpu 用户为作业选择的管理节点SPU数量，Flink自定义作业对应为flink jobmanager数量，Spark自定义作业对应为spark driver数量。 (required)
     * @param name 作业名称 (optional)
     * @param desc 作业描述 (optional)
     * @param clusterId 独享集群资源ID, 当前用户有该独享资源的使用权限 (optional)
     * @param spuNumber 用户为作业选择的SPU数量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param parallelNumber 用户为作业选择的并发量, 提交Flink自定义作业时需要配置，Spark自定义作业不需要配置 (optional)
     * @param executorNumber Spark作业使用的executor个数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param executorSpu Spark作业每个executor所使用的SPU数, 提交Spark自定义作业时需要配置，Flink自定义作业不需要配置 (optional)
     * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false (optional)
     * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径 (optional)
     * @param smnTopic 当作业异常时，向该SMN主题推送告警信息 (optional)
     * @param jar 用户上传的jar文件, 优先级高于jar_url参数 (optional)
     * @param jarUrl 用户上传的jar包OBS路径 (optional)
     * @param config 用户上传的配置文件, 优先级高于config_url参数 (optional)
     * @param configUrl 用户上传的config包OBS路径 (optional)
     * @param mainClass 作业入口类 (optional)
     * @param args 作业入口类参数 (optional)
     * @param restartWhenException 是否开启异常重启功能 (optional, default to false)
     * @param tags 作业标签 (optional)
     * @param sysEnterpriseProjectId 作业所属的企业项目id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateJarJobAsync(String projectId, Long jobId, Integer managerSpu, String name, String desc, Integer clusterId, Integer spuNumber, Integer parallelNumber, Integer executorNumber, Integer executorSpu, Boolean logEnabled, String obsBucket, String smnTopic, File jar, String jarUrl, File config, String configUrl, String mainClass, String args, Boolean restartWhenException, String tags, String sysEnterpriseProjectId, final ApiCallback<JobUpdateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateJarJobValidateBeforeCall(projectId, jobId, managerSpu, name, desc, clusterId, spuNumber, parallelNumber, executorNumber, executorSpu, logEnabled, obsBucket, smnTopic, jar, jarUrl, config, configUrl, mainClass, args, restartWhenException, tags, sysEnterpriseProjectId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobUpdateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateSqlJob
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 提交修改SQL作业请求 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateSqlJobCall(String projectId, UpdateSqlJobRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{project_id}/sql_job"
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
    private com.squareup.okhttp.Call updateSqlJobValidateBeforeCall(String projectId, UpdateSqlJobRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling updateSqlJob(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateSqlJob(Async)");
        }
        

        com.squareup.okhttp.Call call = updateSqlJobCall(projectId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 更新流式SQL作业
     * 流式SQL的语法扩展了Apache Flink SQL, 具体详情请参考CS官方文档
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 提交修改SQL作业请求 (required)
     * @return JobUpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobUpdateResponse updateSqlJob(String projectId, UpdateSqlJobRequest body) throws ApiException {
        ApiResponse<JobUpdateResponse> resp = updateSqlJobWithHttpInfo(projectId, body);
        return resp.getData();
    }

    /**
     * 更新流式SQL作业
     * 流式SQL的语法扩展了Apache Flink SQL, 具体详情请参考CS官方文档
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 提交修改SQL作业请求 (required)
     * @return ApiResponse&lt;JobUpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobUpdateResponse> updateSqlJobWithHttpInfo(String projectId, UpdateSqlJobRequest body) throws ApiException {
        com.squareup.okhttp.Call call = updateSqlJobValidateBeforeCall(projectId, body, null, null);
        Type localVarReturnType = new TypeToken<JobUpdateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 更新流式SQL作业 (asynchronously)
     * 流式SQL的语法扩展了Apache Flink SQL, 具体详情请参考CS官方文档
     * @param projectId project id, 用于不同project取token. (required)
     * @param body 提交修改SQL作业请求 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSqlJobAsync(String projectId, UpdateSqlJobRequest body, final ApiCallback<JobUpdateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateSqlJobValidateBeforeCall(projectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobUpdateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
