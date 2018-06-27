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

package com.huaweicloud.cs.java.v1.client.auth;

import com.huaweicloud.cs.java.v1.client.Pair;


import java.util.HashMap;
import java.util.Map;
import java.util.List;

/*import com.cloud.sdk.DefaultRequest;
import com.cloud.sdk.auth.credentials.BasicCredentials;
import com.cloud.sdk.auth.signer.Signer;
import com.cloud.sdk.auth.signer.SignerFactory;
import com.cloud.sdk.http.HttpMethodName;*/
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import okio.Buffer;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-27T15:44:02.666+08:00")
public class ApiKeyAuth implements Authentication {
    private String serviceName;
    private String region;
    private String accessKey;
    private String secretKey;

    public void setAksk(String serviceName, String region, String accessKey, String secretKey) {
        this.serviceName = serviceName;
        this.region = region;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {}

    public Request applyToParams(Request request) {
        /*if (serviceName == null || region == null || accessKey == null || secretKey == null) {
            return request;
        }
        DefaultRequest reqForSigner = new DefaultRequest(this.serviceName);
        try {
            reqForSigner.setEndpoint(request.uri());

            reqForSigner.setHttpMethod(HttpMethodName.valueOf(request.method()));

            // add query string
            String urlString = request.urlString();
            if (urlString.contains("?")) {
                String parameters = urlString.substring(urlString.indexOf("?") + 1);
                Map<String, String> parametersMap = new HashMap<>();

                if (!parameters.isEmpty()) {
                    for (String p : parameters.split("&")) {
                        String key = p.split("=")[0];
                        String value = p.split("=")[1];
                        parametersMap.put(key, value);
                    }
                    reqForSigner.setParameters(parametersMap);
                }
            }

            // add headers
            Map<String, String> headersMap = new HashMap<>();
            for (Map.Entry<String, List<String>> header: request.headers().toMultimap().entrySet()) {
                headersMap.putIfAbsent(header.getKey(), header.getValue().get(0));
            }
            reqForSigner.setHeaders(headersMap);

            // add body
            if (request.body() != null) {
                Request copy = request.newBuilder().build();
                Buffer buffer = new Buffer();
                copy.body().writeTo(buffer);
                reqForSigner.setContent(buffer.inputStream());
            }

            Signer signer = SignerFactory.getSigner(serviceName, region);
            signer.sign(reqForSigner, new BasicCredentials(this.accessKey, this.secretKey));

            Request.Builder builder = request.newBuilder();
            builder.headers(Headers.of(reqForSigner.getHeaders()));
            return builder.build();

        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return request;
    }
}

