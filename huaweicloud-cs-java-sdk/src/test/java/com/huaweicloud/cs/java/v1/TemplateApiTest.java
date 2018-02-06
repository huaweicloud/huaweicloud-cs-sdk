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

import com.huaweicloud.cs.java.v1.client.ApiException;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateCreateResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateDeleteResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateListResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateApi
 */
@Ignore
public class TemplateApiTest {

    private final TemplateApi api = new TemplateApi();

    
    /**
     * create the job template
     *
     * Create on job template from CloudStream Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJobTemplateTest() throws ApiException {
        String xProjectId = null;
        JobTemplateRequest body = null;
        String xSdkDate = null;
        String authorization = null;
        String host = null;
        String xProjectId2 = null;
        String xAuthToken = null;
        JobTemplateCreateResponse response = api.createJobTemplate(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken);

        // TODO: test validations
    }
    
    /**
     * 删除作业模板
     *
     * 当前模板被引用也允许删除模板
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTemplateTest() throws ApiException {
        String xProjectId = null;
        Long templateId = null;
        String xSdkDate = null;
        String authorization = null;
        String host = null;
        String xProjectId2 = null;
        String xAuthToken = null;
        JobTemplateDeleteResponse response = api.deleteJobTemplate(xProjectId, templateId, xSdkDate, authorization, host, xProjectId2, xAuthToken);

        // TODO: test validations
    }
    
    /**
     * query CloudStream Service job templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTemplatesTest() throws ApiException {
        String xProjectId = null;
        String xSdkDate = null;
        String authorization = null;
        String host = null;
        String xProjectId2 = null;
        String xAuthToken = null;
        Long cursor = null;
        Integer limit = null;
        String order = null;
        JobTemplateListResponse response = api.getJobTemplates(xProjectId, xSdkDate, authorization, host, xProjectId2, xAuthToken, cursor, limit, order);

        // TODO: test validations
    }
    
}
