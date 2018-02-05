/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huaweicloud.cs.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class UserAuthUtil {
    private final OkHttpClient client;
    private Map<String, String> headerMap = new HashMap<String, String>() {
        {
            put("Content-Type", "application/json; charset=utf-8");
            put("Accept", "application/json");
        }
    };
    private String tokenUrl = "https://iam.cn-north-1.myhwclouds.com/v3/auth/tokens";
    private String tokenBody;
    private String akSKUrl = "https://iam.cn-north-1.myhwclouds.com/v3-huawei/auth/credential";
    private String akSKBody;
    private Logger logger = LogManager.getLogger(getClass());

    /**
     * create secure HTTPS connection
     *
     * @param connectTimeout connect timeout
     * @param readTimeout    read timeout
     */
    public UserAuthUtil(Integer connectTimeout, Integer readTimeout) {
        client = createHttpsClient(connectTimeout, readTimeout);
    }

    /**
     * Get user Token and AKSK
     *
     * @param domainName domain name for Logging console
     * @param userName   user name for Logging console
     * @param password   password for Logging console
     * @param projectId  project ID getting from project list in user credential
     * @return user temporary Token and AKSK
     */
    public JsonObject getUserAuth(String domainName, String userName, String password, String projectId) {
        tokenBody = "{\"auth\":{\"identity\":{\"password\":{\"user\":{\"password\":\"" + password + "\",\"domain\":{\"name\":\"" + domainName + "\"},\"name\":\"" + userName + "\"}},\"methods\":[\"password\"]},\"scope\":{\"project\":{\"id\":\"" + projectId + "\"}}}}";

        MediaType JSON = MediaType.parse("application/json; charset=utf=8");
        RequestBody requestBody = RequestBody.create(JSON, tokenBody);
        Request request = requestBuilder(tokenUrl, headerMap, requestBody).build();
        logger.info("tokenUrl: " + tokenUrl + "\nheaderMap: " + headerMap + "\ntokenBody: " + tokenBody);

        String token = "";
        Response response = null;
        try {
            response = client.newCall(request).execute();
            token = response.headers().get("X-Subject-Token");
            logger.info("token: " + token);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert response != null;
        }

        akSKBody = "{\"auth\":{\"identity\":{\"methods\":[\"token\"],\"token\":{\"id\":\"" + token + "\"}}}}";
        requestBody = RequestBody.create(JSON, akSKBody);
        request = requestBuilder(akSKUrl, headerMap, requestBody).build();
        logger.info("akSKUrl: " + akSKUrl + "\nheaderMap: " + headerMap + "\nakSKBody: " + akSKBody);

        String ak = "";
        String sk = "";
        try {
            response = client.newCall(request).execute();
            String resp = response.body().string();
            JsonObject jsonObject = new JsonParser().parse(resp).getAsJsonObject().getAsJsonObject("credential");
            ak = jsonObject.get("access").getAsString();
            sk = jsonObject.get("secret").getAsString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert response != null;
        }

        JsonObject authObject = new JsonObject();
        authObject.addProperty("token", token);
        authObject.addProperty("ak", ak);
        authObject.addProperty("sk", sk);

        return authObject;
    }

    /**
     * request build
     *
     * @param url     request URL
     * @param headMap map of request header
     * @param body    request body
     * @return request builder
     */
    private Request.Builder requestBuilder(String url, Map<String, String> headMap, RequestBody body) {
        Request.Builder builder = new Request.Builder();

        builder.url(url);
        for (String key : headMap.keySet()) {
            builder.addHeader(key, headMap.get(key));
        }
        builder.post(body);

        return builder;
    }

    /**
     * Set IAM tokenUrl
     *
     * @param tokenUrl request URL for getting IAM token(e.g https://iam.cn-north-1.myhwclouds.com/v3/auth/tokens)
     * @return An instance of OkHttpClient
     */
    public UserAuthUtil setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;

        return this;
    }

    /**
     * Set IAM tokenBody
     *
     * @param jsonBody request body for getting IAM token
     * @return An instance of UserAuthUtil
     */
    public UserAuthUtil setTokenBody(String jsonBody) {
        this.tokenBody = jsonBody;

        return this;
    }

    /**
     * Set IAM akSKUrl
     *
     * @param akSKUrl request URL for getting IAM AKSK(e.g https://iam.cn-north-1.myhwclouds.com/v3-huawei/auth/credential)
     * @return An instance of OkHttpClient
     */
    public UserAuthUtil setAKSKUrl(String akSKUrl) {
        this.akSKUrl = akSKUrl;

        return this;
    }

    /**
     * Set IAM akSKBody
     *
     * @param jsonBody request body for getting IAM AKSK
     * @return An instance of UserAuthUtil
     */
    public UserAuthUtil setAKSKBody(String jsonBody) {
        this.akSKBody = jsonBody;

        return this;
    }

    /**
     * Set IAM headerMap
     *
     * @param headerMap key:value map of request header
     * @return UserAuthUtil
     */
    public UserAuthUtil setHeader(Map<String, String> headerMap) {
        this.headerMap = headerMap;

        return this;
    }

    /**
     * create secure HTTPS connection
     *
     * @param connectTimeout connect timeout, milliseconds
     * @param readTimeout    read timeout, milliseconds
     * @return okHttpClient
     */
    private OkHttpClient createHttpsClient(Integer connectTimeout, Integer readTimeout) {
        X509TrustManager trustManager;
        SSLSocketFactory sslSocketFactory;
        try {
            trustManager = new X509TrustManager() {
                @Override
                public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
                        throws CertificateException {
                }

                @Override
                public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
                        throws CertificateException {
                }

                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {

                    return new java.security.cert.X509Certificate[]{};
                }
            };
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, new TrustManager[]{trustManager}, new java.security.SecureRandom());
            sslSocketFactory = sslContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }

        //set okHttpClient
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(connectTimeout, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(readTimeout, TimeUnit.SECONDS);
        okHttpClient.setSslSocketFactory(sslSocketFactory).setHostnameVerifier((hostname, session) -> true);

        return okHttpClient;
    }

    /**
     * get client which has disabled SSL certification
     *
     * @return client
     */
    public OkHttpClient getClient() {
        return client;
    }
}
