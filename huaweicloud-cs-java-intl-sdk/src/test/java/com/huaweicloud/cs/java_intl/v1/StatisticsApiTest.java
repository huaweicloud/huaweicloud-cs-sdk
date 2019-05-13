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

package com.huaweicloud.cs.java_intl.v1;

import com.huaweicloud.cs.java_intl.v1.client.ApiException;
import com.huaweicloud.cs.java_intl.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java_intl.v1.model.OverviewResponse;
import com.huaweicloud.cs.java_intl.v1.model.ReleaseVersionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatisticsApi
 */
@Ignore
public class StatisticsApiTest {

    private final StatisticsApi api = new StatisticsApi();

    
    /**
     * 查询CS当前发行版本信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReleaseVersionTest() throws ApiException {
        ReleaseVersionResponse response = api.getReleaseVersion();

        // TODO: test validations
    }
    
    /**
     * 概要统计用户的资源使用情况
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void overviewTest() throws ApiException {
        String xProjectId = null;
        OverviewResponse response = api.overview(xProjectId);

        // TODO: test validations
    }
    
}
