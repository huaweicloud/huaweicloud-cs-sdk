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
import com.huaweicloud.cs.java.v1.model.AddHostsInfoResponse;
import com.huaweicloud.cs.java.v1.model.Body;
import com.huaweicloud.cs.java.v1.model.Body1;
import com.huaweicloud.cs.java.v1.model.Body2;
import com.huaweicloud.cs.java.v1.model.CreateClusterResponse;
import com.huaweicloud.cs.java.v1.model.CreatePeeringRequest;
import com.huaweicloud.cs.java.v1.model.CreatePeeringResponse;
import com.huaweicloud.cs.java.v1.model.CreateRouteRequest;
import com.huaweicloud.cs.java.v1.model.CreateRouteResponse;
import com.huaweicloud.cs.java.v1.model.DeleteHostsInfoResponse;
import java.io.File;
import com.huaweicloud.cs.java.v1.model.GetPeeringsResponse;
import com.huaweicloud.cs.java.v1.model.GetRoutesResponse;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.GlobalResponse;
import com.huaweicloud.cs.java.v1.model.NewReservedClusterRequest;
import com.huaweicloud.cs.java.v1.model.QueryClusterHostsInfoResponse;
import com.huaweicloud.cs.java.v1.model.QueryClusterResponse;
import com.huaweicloud.cs.java.v1.model.QueryClustersResponse;
import com.huaweicloud.cs.java.v1.model.QueryJobListResponse;
import com.huaweicloud.cs.java.v1.model.QueryUserQuotaResponse;
import com.huaweicloud.cs.java.v1.model.QueryUserQuotasResponse;
import com.huaweicloud.cs.java.v1.model.RestartReservedClusterResponse;
import com.huaweicloud.cs.java.v1.model.StopReservedClusterResponse;
import com.huaweicloud.cs.java.v1.model.UpdateClusterRequest;
import com.huaweicloud.cs.java.v1.model.UpdateHostsInfoResponse;
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
     * 添加hosts文件
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addHostsFileTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        File hostsFile = null;
        List<AddHostsInfoResponse> response = api.addHostsFile(projectId, clusterId, hostsFile);

        // TODO: test validations
    }
    
    /**
     * 添加IP域名映射信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addHostsInfoTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        Body body = null;
        List<AddHostsInfoResponse> response = api.addHostsInfo(projectId, clusterId, body);

        // TODO: test validations
    }
    
    /**
     * 创建一个对等连接
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPeeringTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        CreatePeeringRequest body = null;
        CreatePeeringResponse response = api.createPeering(projectId, clusterId, body);

        // TODO: test validations
    }
    
    /**
     * 为具有cs_adm角色的CS用户创建一个独享计算集群, 独享集群会折算成SPU, 按需计费
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReservedClusterTest() throws ApiException {
        String projectId = null;
        NewReservedClusterRequest body = null;
        CreateClusterResponse response = api.createReservedCluster(projectId, body);

        // TODO: test validations
    }
    
    /**
     * 创建路由
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRouteTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        String peeringId = null;
        CreateRouteRequest body = null;
        CreateRouteResponse response = api.createRoute(projectId, clusterId, peeringId, body);

        // TODO: test validations
    }
    
    /**
     * 删除IP域名映射信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHostsInfoTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        Body1 body = null;
        List<DeleteHostsInfoResponse> response = api.deleteHostsInfo(projectId, clusterId, body);

        // TODO: test validations
    }
    
    /**
     * 删除对等连接
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePeeringTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        String peeringId = null;
        api.deletePeering(projectId, clusterId, peeringId);

        // TODO: test validations
    }
    
    /**
     * 删除独享集群, 如果集群中有运行的作业会自动立即停止
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReservedClusterTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        GlobalResponse response = api.deleteReservedCluster(projectId, clusterId);

        // TODO: test validations
    }
    
    /**
     * 删除路由
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRouteTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        String peeringId = null;
        String routeId = null;
        api.deleteRoute(projectId, clusterId, peeringId, routeId);

        // TODO: test validations
    }
    
    /**
     * 查询用户创建的独享集群信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void describeReservedClusterTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        QueryClusterResponse response = api.describeReservedCluster(projectId, clusterId);

        // TODO: test validations
    }
    
    /**
     * 查询独享集群下的作业列表
     *
     * 独享集群作业列表查询
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterJobsTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        String name = null;
        String status = null;
        Boolean showDetail = null;
        Long cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryJobListResponse response = api.getClusterJobs(projectId, clusterId, name, status, showDetail, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 查询指定集群的IP域名映射信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHostsInfoTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        String queryString = null;
        Long cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryClusterHostsInfoResponse response = api.getHostsInfo(projectId, clusterId, queryString, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 查询对等连接
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPeeringTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        String peeringId = null;
        CreatePeeringResponse response = api.getPeering(projectId, clusterId, peeringId);

        // TODO: test validations
    }
    
    /**
     * 查询对等连接列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPeeringsTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        GetPeeringsResponse response = api.getPeerings(projectId, clusterId);

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
        String projectId = null;
        String name = null;
        String status = null;
        Long cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryClustersResponse response = api.getReservedClusters(projectId, name, status, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 查询路由列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoutesTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        String peeringId = null;
        GetRoutesResponse response = api.getRoutes(projectId, clusterId, peeringId);

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
        String projectId = null;
        String userId = null;
        QueryUserQuotaResponse response = api.getUserQuota(projectId, userId);

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
        String projectId = null;
        String name = null;
        String cursor = null;
        Boolean next = null;
        Integer limit = null;
        String order = null;
        QueryUserQuotasResponse response = api.getUserQuotas(projectId, name, cursor, next, limit, order);

        // TODO: test validations
    }
    
    /**
     * 重启独享集群
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restartReservedClusterTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        RestartReservedClusterResponse response = api.restartReservedCluster(projectId, clusterId);

        // TODO: test validations
    }
    
    /**
     * 停止独享集群
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopReservedClusterTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        StopReservedClusterResponse response = api.stopReservedCluster(projectId, clusterId);

        // TODO: test validations
    }
    
    /**
     * 更新IP域名映射信息
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHostsInfoTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        Long hostId = null;
        Body2 body = null;
        UpdateHostsInfoResponse response = api.updateHostsInfo(projectId, clusterId, hostId, body);

        // TODO: test validations
    }
    
    /**
     * 更新独享集群
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReservedClusterTest() throws ApiException {
        String projectId = null;
        Integer clusterId = null;
        UpdateClusterRequest body = null;
        GlobalResponse response = api.updateReservedCluster(projectId, clusterId, body);

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
        String projectId = null;
        String userId = null;
        UpdateUserQuotaRequest body = null;
        GlobalResponse response = api.updateUserQuota(projectId, userId, body);

        // TODO: test validations
    }
    
}
