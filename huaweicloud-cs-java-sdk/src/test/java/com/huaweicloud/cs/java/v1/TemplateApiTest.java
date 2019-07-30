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
import com.huaweicloud.cs.java.v1.model.CreateJobTemplateRequest;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateCreateResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateDeleteResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateListResponse;
import com.huaweicloud.cs.java.v1.model.JobTemplateUpdateResponse;
import com.huaweicloud.cs.java.v1.model.UpdateJobTemplateRequest;
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
     * 创建作业模板
     *
     * Create job template on Cloud Stream Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJobTemplateTest() throws ApiException {
        String projectId = null;
        CreateJobTemplateRequest body = null;
        JobTemplateCreateResponse response = api.createJobTemplate(projectId, body);

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
        String projectId = null;
        Long templateId = null;
        JobTemplateDeleteResponse response = api.deleteJobTemplate(projectId, templateId);

        // TODO: test validations
    }
    
    /**
     * 查询作业模板列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTemplatesTest() throws ApiException {
        String projectId = null;
        Long cursor = null;
        Integer limit = null;
        String order = null;
        JobTemplateListResponse response = api.getJobTemplates(projectId, cursor, limit, order);

        // TODO: test validations
    }
    
    /**
     * 更新作业模板
     *
     * Update job template on Cloud Stream Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobTemplateTest() throws ApiException {
        String projectId = null;
        UpdateJobTemplateRequest body = null;
        JobTemplateUpdateResponse response = api.updateJobTemplate(projectId, body);

        // TODO: test validations
    }
    
}
