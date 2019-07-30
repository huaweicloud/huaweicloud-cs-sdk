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
import com.huaweicloud.cs.java.v1.model.Body3;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.QueryJobMetricsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetricApi
 */
@Ignore
public class MetricApiTest {

    private final MetricApi api = new MetricApi();

    
    /**
     * 查询作业监控信息
     *
     * 查询作业监控信息, 支持同时查询多个作业监控信息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobsMetricsTest() throws ApiException {
        String projectId = null;
        Body3 body = null;
        QueryJobMetricsResponse response = api.getJobsMetrics(projectId, body);

        // TODO: test validations
    }
    
}
