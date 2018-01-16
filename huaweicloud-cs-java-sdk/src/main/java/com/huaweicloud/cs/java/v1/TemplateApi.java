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
import com.huaweicloud.cs.java.v1.model.JobTemplate;
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
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createJobTemplateCall(String xProjectId, JobTemplateRequest body, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/job_template"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createJobTemplateValidateBeforeCall(String xProjectId, JobTemplateRequest body, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling createJobTemplate(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createJobTemplate(Async)");
        }
        

        com.squareup.okhttp.Call call = createJobTemplateCall(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create the job template
     * Create on job template from CloudStream Service
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body Create job template request (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @return Boolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Boolean createJobTemplate(String xProjectId, JobTemplateRequest body, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken) throws ApiException {
        ApiResponse<Boolean> resp = createJobTemplateWithHttpInfo(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken);
        return resp.getData();
    }

    /**
     * create the job template
     * Create on job template from CloudStream Service
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body Create job template request (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Boolean> createJobTemplateWithHttpInfo(String xProjectId, JobTemplateRequest body, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken) throws ApiException {
        com.squareup.okhttp.Call call = createJobTemplateValidateBeforeCall(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken, null, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create the job template (asynchronously)
     * Create on job template from CloudStream Service
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param body Create job template request (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createJobTemplateAsync(String xProjectId, JobTemplateRequest body, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ApiCallback<Boolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createJobTemplateValidateBeforeCall(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteJobTemplate
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteJobTemplateCall(String xProjectId, Long templateId, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{X-Project-Id}/job_template/{template_id}"
            .replaceAll("\\{" + "X-Project-Id" + "\\}", apiClient.escapeString(xProjectId.toString()))
            .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteJobTemplateValidateBeforeCall(String xProjectId, Long templateId, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling deleteJobTemplate(Async)");
        }
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling deleteJobTemplate(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteJobTemplateCall(xProjectId, templateId, xSdkDate, authorization, host, xProjectId2, xAuthToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 删除作业模板
     * 当前模板被引用也允许删除模板
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @return Boolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Boolean deleteJobTemplate(String xProjectId, Long templateId, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken) throws ApiException {
        ApiResponse<Boolean> resp = deleteJobTemplateWithHttpInfo(xProjectId, templateId, xSdkDate, authorization, host, xProjectId2, xAuthToken);
        return resp.getData();
    }

    /**
     * 删除作业模板
     * 当前模板被引用也允许删除模板
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Boolean> deleteJobTemplateWithHttpInfo(String xProjectId, Long templateId, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken) throws ApiException {
        com.squareup.okhttp.Call call = deleteJobTemplateValidateBeforeCall(xProjectId, templateId, xSdkDate, authorization, host, xProjectId2, xAuthToken, null, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 删除作业模板 (asynchronously)
     * 当前模板被引用也允许删除模板
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param templateId  (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteJobTemplateAsync(String xProjectId, Long templateId, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ApiCallback<Boolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteJobTemplateValidateBeforeCall(xProjectId, templateId, xSdkDate, authorization, host, xProjectId2, xAuthToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getJobTemplates
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (required)
     * @param limit 查询条数限制 (required)
     * @param order 查询结果排序, 升序和降序两种可选 (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getJobTemplatesCall(String xProjectId, Long cursor, Integer limit, String order, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call getJobTemplatesValidateBeforeCall(String xProjectId, Long cursor, Integer limit, String order, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xProjectId' is set
        if (xProjectId == null) {
            throw new ApiException("Missing the required parameter 'xProjectId' when calling getJobTemplates(Async)");
        }
        
        // verify the required parameter 'cursor' is set
        if (cursor == null) {
            throw new ApiException("Missing the required parameter 'cursor' when calling getJobTemplates(Async)");
        }
        
        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new ApiException("Missing the required parameter 'limit' when calling getJobTemplates(Async)");
        }
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new ApiException("Missing the required parameter 'order' when calling getJobTemplates(Async)");
        }
        

        com.squareup.okhttp.Call call = getJobTemplatesCall(xProjectId, cursor, limit, order, xSdkDate, authorization, host, xProjectId2, xAuthToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * query CloudStream Service job templates
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (required)
     * @param limit 查询条数限制 (required)
     * @param order 查询结果排序, 升序和降序两种可选 (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @return List&lt;JobTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<JobTemplate> getJobTemplates(String xProjectId, Long cursor, Integer limit, String order, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken) throws ApiException {
        ApiResponse<List<JobTemplate>> resp = getJobTemplatesWithHttpInfo(xProjectId, cursor, limit, order, xSdkDate, authorization, host, xProjectId2, xAuthToken);
        return resp.getData();
    }

    /**
     * query CloudStream Service job templates
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (required)
     * @param limit 查询条数限制 (required)
     * @param order 查询结果排序, 升序和降序两种可选 (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @return ApiResponse&lt;List&lt;JobTemplate&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<JobTemplate>> getJobTemplatesWithHttpInfo(String xProjectId, Long cursor, Integer limit, String order, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken) throws ApiException {
        com.squareup.okhttp.Call call = getJobTemplatesValidateBeforeCall(xProjectId, cursor, limit, order, xSdkDate, authorization, host, xProjectId2, xAuthToken, null, null);
        Type localVarReturnType = new TypeToken<List<JobTemplate>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * query CloudStream Service job templates (asynchronously)
     * 
     * @param xProjectId project id, 用于不同project取token. (required)
     * @param cursor 作业模板ID (required)
     * @param limit 查询条数限制 (required)
     * @param order 查询结果排序, 升序和降序两种可选 (required)
     * @param xSdkDate 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD&#39;T&#39;HHMMSS&#39;Z&#39;)。取值为当前系统的GMT时间。 (optional)
     * @param authorization 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html (optional)
     * @param host 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。 (optional)
     * @param xProjectId2 可选。project id，用于不同project取token。 (optional)
     * @param xAuthToken 使用Token认证时必选: 用户Token (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobTemplatesAsync(String xProjectId, Long cursor, Integer limit, String order, String xSdkDate, String authorization, String host, String xProjectId2, String xAuthToken, final ApiCallback<List<JobTemplate>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobTemplatesValidateBeforeCall(xProjectId, cursor, limit, order, xSdkDate, authorization, host, xProjectId2, xAuthToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<JobTemplate>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
