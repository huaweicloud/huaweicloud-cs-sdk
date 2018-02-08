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
import com.huaweicloud.cs.java.v1.model.CreateClusterResponse;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.GlobalResponse;
import com.huaweicloud.cs.java.v1.model.NewReservedClusterRequest;
import com.huaweicloud.cs.java.v1.model.QueryClusterResponse;
import com.huaweicloud.cs.java.v1.model.QueryClustersResponse;
import com.huaweicloud.cs.java.v1.model.QueryJobListResponse;
import com.huaweicloud.cs.java.v1.model.QueryUserQuotaResponse;
import com.huaweicloud.cs.java.v1.model.QueryUserQuotasResponse;
import com.huaweicloud.cs.java.v1.model.UpdateClusterRequest;
import com.huaweicloud.cs.java.v1.model.UpdateUserQuotaRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClusterApi
 */
@Ignore
public class ClusterApiTest {

    private final ClusterApi api = new ClusterApi();

    
    /**
     * 创建一个为具有cs_adm角色的CloudStream用户预留一个计算集群, 预留的集群会折算成SPU, 按需计费
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReservedClusterTest() throws ApiException {
        String xProjectId = null;
        NewReservedClusterRequest body = null;
        CreateClusterResponse response = api.createReservedCluster(xProjectId, body);

        // TODO: test validations
    }
    
    /**
     * 删除预留的集群, 如果集群中有运行的作业会自动立即停止
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReservedClusterTest() throws ApiException {
        String xProjectId = null;
        Long clusterId = null;
        GlobalResponse response = api.deleteReservedCluster(xProjectId, clusterId);

        // TODO: test validations
    }
    
    /**
     * 查询用户创建的预留集群信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void describeReservedClusterTest() throws ApiException {
        String xProjectId = null;
        Long clusterId = null;
        QueryClusterResponse response = api.describeReservedCluster(xProjectId, clusterId);

        // TODO: test validations
    }
    
    /**
     * 查询预留集群下的作业列表
     *
     * 预留集群作业列表查询
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterJobsTest() throws ApiException {
        String xProjectId = null;
        Long clusterId = null;
        String name = null;
        String status = null;
        Boolean showDetail = null;
        Long cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryJobListResponse response = api.getClusterJobs(xProjectId, clusterId, name, status, showDetail, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 查询租户下的集群列表
     *
     * 租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReservedClustersTest() throws ApiException {
        String xProjectId = null;
        String name = null;
        String status = null;
        Long cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryClustersResponse response = api.getReservedClusters(xProjectId, name, status, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 查询指定用户配额信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserQuotaTest() throws ApiException {
        String xProjectId = null;
        String userId = null;
        QueryUserQuotaResponse response = api.getUserQuota(xProjectId, userId);

        // TODO: test validations
    }
    
    /**
     * 获取租户下的用户配额信息
     *
     * 租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserQuotasTest() throws ApiException {
        String xProjectId = null;
        String name = null;
        String cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryUserQuotasResponse response = api.getUserQuotas(xProjectId, name, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 更新预留的集群
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReservedClusterTest() throws ApiException {
        String xProjectId = null;
        Long clusterId = null;
        UpdateClusterRequest body = null;
        GlobalResponse response = api.updateReservedCluster(xProjectId, clusterId, body);

        // TODO: test validations
    }
    
    /**
     * 更新指定用户配额信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserQuotaTest() throws ApiException {
        String xProjectId = null;
        String userId = null;
        UpdateUserQuotaRequest body = null;
        GlobalResponse response = api.updateUserQuota(xProjectId, userId, body);

        // TODO: test validations
    }
    
}
