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


import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class UserTokenUtil {
	private Logger logger = LoggerFactory.getLogger(getClass());

	private static final MediaType contentType = MediaType.parse("application/json; charset=utf-8");

	private String tokenUrl = "https://iam.cn-north-1.myhwclouds.com/v3/auth/tokens";
	private Map<String, String> headerMap = new HashMap<String, String>() {
		{
			put("Content-Type", "application/json;charset=UTF-8");
			put("Accept", "application/json");
		}
	};

	private String jsonBody;
//	private String token;
	private Request request;
	private Response response;
	private final OkHttpClient client;

	/**
	 * Set IAM tokenUrl
	 *
	 * @param tokenUrl request URL for getting IAM token(e.g https://iam.cn-north-1.myhwclouds.com/v3/auth/tokens)
	 * @return An instance of OkHttpClient
	 */
	public UserTokenUtil setTokenUrl(String tokenUrl) {
		this.tokenUrl = tokenUrl;
		return this;
	}

	/**
	 * Set IAM jsonBody
	 *
	 * @param jsonBody request body for getting IAM token
	 * @return An instance of UserTokenUtil
	 */
	public UserTokenUtil setJsonBody(String jsonBody) {
		this.jsonBody = jsonBody;
		return this;
	}

	/**
	 * Get IAM jsonBody
	 *
	 * @return IAM jsonBody
	 */
	public String getJsonBody() {
		return this.jsonBody;
	}

	/**
	 * Get user Token
	 *
	 * @param domainName
	 * @param userName
	 * @param password
	 * @param userName
	 * @return IAM token
	 */
	public String getUserToken(String domainName, String userName, String password, String projectId) {

		jsonBody = "{\"auth\":{\"identity\":{\"password\":{\"user\":{\"password\":\"" + password + "\",\"domain\":{\"name\":\"" + domainName + "\"},\"name\":\"" + userName + "\"}},\"methods\":[\"password\"]},\"scope\":{\"project\":{\"id\":\"" + projectId + "\"}}}}";

		RequestBody requestBody = RequestBody.create(contentType, jsonBody);
		this.request = requestBuilder(tokenUrl, headerMap).post(requestBody).build();
		logger.info("tokenUrl: " + tokenUrl + "\nheaderMap: " + headerMap + "\njsonBody: " + jsonBody);

		String token = "";
		try {
			client.newCall(this.request).execute();
			token = responseHeadStringByName();
			logger.info("token: " + token);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			this.close();
		}

		return token;
	}

	/**
	 * build request
	 *
	 * @param url
	 * @param headMap
	 * @return
	 */
	private Request.Builder requestBuilder(String url, Map<String, String> headMap) {
		Request.Builder builder = new Request.Builder().url(url);

		for (String key : headMap.keySet()) {
			builder.addHeader(key, headMap.get(key));
		}

		return builder;
	}

	/**
	 * Get OkHttpClient client
	 *
	 * @param isSafe
	 * @param connectTimeout
	 * @param readTimeout
	 */
	public UserTokenUtil(boolean isSafe, Integer connectTimeout, Integer readTimeout) {
		if (isSafe) {
			this.client = createSafeHttpClient(connectTimeout, readTimeout);
		} else {
			this.client = createHttpClient(connectTimeout, readTimeout);
		}
	}

	/**
	 * Get field value of response
	 *
	 * @return value of field
	 */
	private String responseHeadStringByName() throws IOException {
		if (this.response == null) {
			System.out.println("ERROR: Response is NULL.");

			return "";
		}
		if (!response.isSuccessful()) {
			System.out.println("ERROR: Response Failed: " + response.toString());

			return "";
		}
		if (!response.headers().names().contains("X-Subject-Token")) {
			System.out.println("ERROR: Response does not contain [" + "X-Subject-Token" + "] :" + response.toString());
			throw new IOException("ERROR: Response Header does not contain " + "X-Subject-Token");
		}

		return this.response.headers().get("X-Subject-Token");
	}

	/**
	 * create safe HttpClient
	 *
	 * @param connectTimeout
	 * @param readTimeout
	 * @return
	 */
	private OkHttpClient createSafeHttpClient(Integer connectTimeout, Integer readTimeout) {
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
		return new OkHttpClient().newBuilder()
				.connectTimeout(connectTimeout, TimeUnit.SECONDS)
				.readTimeout(readTimeout, TimeUnit.SECONDS)
				.sslSocketFactory(sslSocketFactory, trustManager)
				.hostnameVerifier((hostname, session) -> true).build();
	}

	/**
	 * create HttpClient
	 *
	 * @param connectTimeout
	 * @param readTimeout
	 * @return
	 */
	private OkHttpClient createHttpClient(Integer connectTimeout, Integer readTimeout) {
		return new OkHttpClient().newBuilder()
				.connectTimeout(connectTimeout, TimeUnit.SECONDS)
				.readTimeout(readTimeout, TimeUnit.SECONDS)
				.build();
	}

	/**
	 * close response
	 */
	private void close() {
		this.response.close();
	}
}

