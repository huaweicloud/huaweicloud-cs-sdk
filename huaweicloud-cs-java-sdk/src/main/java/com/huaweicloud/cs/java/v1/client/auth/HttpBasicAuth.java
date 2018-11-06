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


import java.util.Map;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;

import com.squareup.okhttp.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-05T16:45:41.401+08:00")
public class HttpBasicAuth implements Authentication {
    private String token;

    public void useToken(OkHttpClient httpClient, String region, String domainName, String userName, String password, String projectId) {
        String iamUrl = "https://iam.<region>.myhuaweicloud.com/v3/auth/tokens";

        String tokenBody = "{\"auth\":{\"identity\":{\"password\":{\"user\":{\"password\":\"" + password + "\",\"domain\":{\"name\":\""
            + domainName + "\"},\"name\":\"" + userName + "\"}},\"methods\":[\"password\"]},\"scope\":{\"project\":{\"id\":\"" + projectId + "\"}}}}";

        MediaType JSON = MediaType.parse("application/json; charset=utf=8");
        RequestBody requestBody = RequestBody.create(JSON, tokenBody);

        Map<String, String> headerMap = new HashMap<String, String>() {
            {
                put("Content-Type", "application/json; charset=utf-8");
                put("Accept", "application/json");
            }
        };

        Request.Builder builder = new Request.Builder();
        builder.url(iamUrl.replace("<region>", region));
        for (String key : headerMap.keySet()) {
            builder.addHeader(key, headerMap.get(key));
        }
        builder.post(requestBody);
        Request request = builder.build();

        Response response = null;
        try {
            response = httpClient.newCall(request).execute();
            token = response.headers().get("X-Subject-Token");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) { }

    public Request applyToParams(Request request) {
        if (token == null) {
            return request;
        }
        Request.Builder builder = request.newBuilder();
        builder.addHeader("x-auth-token", token);
        return builder.build();
    }
}
