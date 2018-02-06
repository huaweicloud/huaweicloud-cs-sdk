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
import com.huaweicloud.cs.java.v1.model.JobTemplateCreateResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateDeleteResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateListResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateApi {
    private ApiClient apiClient;

    public TemplateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createJobTemplate
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body Create job template request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createJobTemplateCall(String xProjectId, JobTemplateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/job_template"
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
    private com.squareup.okhttp.Call createJobTemplateValidateBeforeCall(String xProjectId, JobTemplateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling createJobTemplate(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createJobTemplate(Async)");
        }
        

        com.squareup.okhttp.Call call = createJobTemplateCall(xProjectId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create the job template
     * Create on job template from CloudStream Service
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body Create job template request (required)
     * @return JobTemplateCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobTemplateCreateResponse createJobTemplate(String xProjectId, JobTemplateRequest body) throws ApiException {
        ApiResponse<JobTemplateCreateResponse> resp = createJobTemplateWithHttpInfo(xProjectId, body);
        return resp.getData();
    }

    /**
     * create the job template
     * Create on job template from CloudStream Service
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body Create job template request (required)
     * @return ApiResponse&lt;JobTemplateCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobTemplateCreateResponse> createJobTemplateWithHttpInfo(String xProjectId, JobTemplateRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createJobTemplateValidateBeforeCall(xProjectId, body, null, null);
        Type localVarReturnType = new TypeToken<JobTemplateCreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create the job template (asynchronously)
     * Create on job template from CloudStream Service
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body Create job template request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createJobTemplateAsync(String xProjectId, JobTemplateRequest body, final ApiCallback<JobTemplateCreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createJobTemplateValidateBeforeCall(xProjectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobTemplateCreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteJobTemplate
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteJobTemplateCall(String xProjectId, Long templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/job_template/{template_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

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
    private com.squareup.okhttp.Call deleteJobTemplateValidateBeforeCall(String xProjectId, Long templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling deleteJobTemplate(Async)");
        }
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling deleteJobTemplate(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteJobTemplateCall(xProjectId, templateId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 删除作业模板
     * 当前模板被引用也允许删除模板
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @return JobTemplateDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobTemplateDeleteResponse deleteJobTemplate(String xProjectId, Long templateId) throws ApiException {
        ApiResponse<JobTemplateDeleteResponse> resp = deleteJobTemplateWithHttpInfo(xProjectId, templateId);
        return resp.getData();
    }

    /**
     * 删除作业模板
     * 当前模板被引用也允许删除模板
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @return ApiResponse&lt;JobTemplateDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobTemplateDeleteResponse> deleteJobTemplateWithHttpInfo(String xProjectId, Long templateId) throws ApiException {
        com.squareup.okhttp.Call call = deleteJobTemplateValidateBeforeCall(xProjectId, templateId, null, null);
        Type localVarReturnType = new TypeToken<JobTemplateDeleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除作业模板 (asynchronously)
     * 当前模板被引用也允许删除模板
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteJobTemplateAsync(String xProjectId, Long templateId, final ApiCallback<JobTemplateDeleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteJobTemplateValidateBeforeCall(xProjectId, templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobTemplateDeleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getJobTemplates
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (optional)
     * @param limit 查询条数限制 (optional)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getJobTemplatesCall(String xProjectId, Long cursor, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/job_templates"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
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
    private com.squareup.okhttp.Call getJobTemplatesValidateBeforeCall(String xProjectId, Long cursor, Integer limit, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getJobTemplates(Async)");
        }
        

        com.squareup.okhttp.Call call = getJobTemplatesCall(xProjectId, cursor, limit, order, progressListener, progressRequestListener);
        return call;

    }

    /**
     * query CloudStream Service job templates
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (optional)
     * @param limit 查询条数限制 (optional)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return JobTemplateListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobTemplateListResponse getJobTemplates(String xProjectId, Long cursor, Integer limit, String order) throws ApiException {
        ApiResponse<JobTemplateListResponse> resp = getJobTemplatesWithHttpInfo(xProjectId, cursor, limit, order);
        return resp.getData();
    }

    /**
     * query CloudStream Service job templates
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (optional)
     * @param limit 查询条数限制 (optional)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @return ApiResponse&lt;JobTemplateListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobTemplateListResponse> getJobTemplatesWithHttpInfo(String xProjectId, Long cursor, Integer limit, String order) throws ApiException {
        com.squareup.okhttp.Call call = getJobTemplatesValidateBeforeCall(xProjectId, cursor, limit, order, null, null);
        Type localVarReturnType = new TypeToken<JobTemplateListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * query CloudStream Service job templates (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (optional)
     * @param limit 查询条数限制 (optional)
     * @param order 查询结果排序, 升序和降序两种可选 (optional, default to desc)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobTemplatesAsync(String xProjectId, Long cursor, Integer limit, String order, final ApiCallback<JobTemplateListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobTemplatesValidateBeforeCall(xProjectId, cursor, limit, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobTemplateListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
