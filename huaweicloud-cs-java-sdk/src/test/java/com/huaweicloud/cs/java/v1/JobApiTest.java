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
import java.io.File;
import com.huaweicloud.cs.java.v1.model.GetJobDetailResponse;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.GlobalResponse;
import com.huaweicloud.cs.java.v1.model.JobExecutePlanResponse;
import com.huaweicloud.cs.java.v1.model.JobStatusResponse;
import com.huaweicloud.cs.java.v1.model.JobUpdateResponse;
import com.huaweicloud.cs.java.v1.model.QueryJobListResponse;
import com.huaweicloud.cs.java.v1.model.SubmitSqlJobRequest;
import com.huaweicloud.cs.java.v1.model.UpdateSqlJobRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
@Ignore
public class JobApiTest {

    private final JobApi api = new JobApi();

    
    /**
     * 删除作业
     *
     * 删除任何状态的作业
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTest() throws ApiException {
        String xProjectId = null;
        List<Long> body = null;
        GlobalResponse response = api.deleteJob(xProjectId, body);

        // TODO: test validations
    }
    
    /**
     * get job detail
     *
     * Get job detail information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobDetailTest() throws ApiException {
        String xProjectId = null;
        Long jobId = null;
        GetJobDetailResponse response = api.getJobDetail(xProjectId, jobId);

        // TODO: test validations
    }
    
    /**
     * get job execution graph
     *
     * The execution graph is json format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobExecuteGraphTest() throws ApiException {
        String xProjectId = null;
        Long jobId = null;
        JobExecutePlanResponse response = api.getJobExecuteGraph(xProjectId, jobId);

        // TODO: test validations
    }
    
    /**
     * 查询作业列表
     *
     * 作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order. The cursor here is job id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobsTest() throws ApiException {
        String xProjectId = null;
        String name = null;
        String status = null;
        Integer clusterId = null;
        Boolean showDetail = null;
        Long cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryJobListResponse response = api.getJobs(xProjectId, name, status, clusterId, showDetail, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 运行作业
     *
     * 触发运行作业
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runJobTest() throws ApiException {
        String xProjectId = null;
        List<Long> body = null;
        GlobalResponse response = api.runJob(xProjectId, body);

        // TODO: test validations
    }
    
    /**
     * Trigger to stop the running job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopJobTest() throws ApiException {
        String xProjectId = null;
        List<Long> body = null;
        GlobalResponse response = api.stopJob(xProjectId, body);

        // TODO: test validations
    }
    
    /**
     * 创建一个用户自定义作业
     *
     * 用户自定义作业目前支持jar格式, 运行在独享集群中
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitJarJobTest() throws ApiException {
        String xProjectId = null;
        String name = null;
        String desc = null;
        Integer clusterId = null;
        Integer spuNumber = null;
        Integer parallelNumber = null;
        String jobType = null;
        Boolean logEnabled = null;
        String obsBucket = null;
        File jar = null;
        File jarUrl = null;
        String mainClass = null;
        String args = null;
        JobStatusResponse response = api.submitJarJob(xProjectId, name, desc, clusterId, spuNumber, parallelNumber, jobType, logEnabled, obsBucket, jar, jarUrl, mainClass, args);

        // TODO: test validations
    }
    
    /**
     * 提交流式SQL作业到CloudStream服务
     *
     * 通过POST方式, 提交流式SQL作业, 请求体为JSON格式
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitSqlJobTest() throws ApiException {
        String xProjectId = null;
        SubmitSqlJobRequest body = null;
        JobStatusResponse response = api.submitSqlJob(xProjectId, body);

        // TODO: test validations
    }
    
    /**
     * 更新用户自定义作业
     *
     * 目前仅支持Jar格式, 运行在独享集群中
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJarJobTest() throws ApiException {
        String xProjectId = null;
        String jobId = null;
        String name = null;
        String desc = null;
        Integer clusterId = null;
        Integer spuNumber = null;
        Integer parallelNumber = null;
        Boolean logEnabled = null;
        String obsBucket = null;
        File jar = null;
        File jarUrl = null;
        String mainClass = null;
        String args = null;
        JobUpdateResponse response = api.updateJarJob(xProjectId, jobId, name, desc, clusterId, spuNumber, parallelNumber, logEnabled, obsBucket, jar, jarUrl, mainClass, args);

        // TODO: test validations
    }
    
    /**
     * 更新流式SQL作业
     *
     * 流式SQL的语法扩展了Apache Flink SQL, 具体详情请参考CloudStream官方文档
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSqlJobTest() throws ApiException {
        String xProjectId = null;
        UpdateSqlJobRequest body = null;
        JobUpdateResponse response = api.updateSqlJob(xProjectId, body);

        // TODO: test validations
    }
    
}
