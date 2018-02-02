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

import com.cloud.sdk.DefaultRequest;
import com.cloud.sdk.auth.credentials.BasicCredentials;
import com.cloud.sdk.auth.signer.Signer;
import com.cloud.sdk.auth.signer.SignerFactory;
import com.google.gson.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.net.URISyntaxException;

public class AKSKSignUtil {
    private String serviceName;
    private String endpoint;
    private String region;
    private String ak;
    private String sk;
    private Logger logger = LogManager.getLogger(getClass());

    /**
     * init a SignUtil object
     *
     * @param serviceName service name, example: CS
     * @param endpoint    see http://developer.huaweicloud.com/endpoint, example: https://cs.cn-north-1.myhuaweicloud.com/v1.0
     * @param region      see http://developer.huaweicloud.com/endpoint, example: cn-north-1
     * @param ak          access key
     * @param sk          secret key
     */
    public AKSKSignUtil(String serviceName, String endpoint, String region, String ak, String sk) {
        this.serviceName = serviceName;
        this.endpoint = endpoint;
        this.region = region;
        this.ak = ak;
        this.sk = sk;
    }

    public JsonObject getSign() {
        DefaultRequest defaultRequest = new DefaultRequest(serviceName);

        try {
            defaultRequest.setEndpoint(new URI(endpoint));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        Signer signer = SignerFactory.getSigner(serviceName, region);

        signer.sign(defaultRequest, new BasicCredentials(ak, sk));
        System.out.println("request.getHeaders(): " + defaultRequest.getHeaders());

        String xSdkDate = defaultRequest.getHeaders().get("X-Sdk-Date").toString();
        String authorization = defaultRequest.getHeaders().get("Authorization").toString();
        String host = defaultRequest.getHeaders().get("Host").toString();

        JsonObject signObject = new JsonObject();
        signObject.addProperty("xSdkDate", xSdkDate);
        signObject.addProperty("authorization", authorization);
        signObject.addProperty("host", host);
        logger.info("signObject: " + signObject);

        return signObject;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

}
