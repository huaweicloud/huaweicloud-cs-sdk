# huaweicloud-cs-java-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.huaweicloud.cs</groupId>
    <artifactId>huaweicloud-cs-java-sdk</artifactId>
    <version>1.1.5-p</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.huaweicloud.cs:huaweicloud-cs-java-sdk:1.1.5-p"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/huaweicloud-cs-java-sdk-1.1.5-p.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.huaweicloud.cs.java.v1.client.*;
import com.huaweicloud.cs.java.v1.client.auth.*;
import com.huaweicloud.cs.java.v1.model.*;
import com.huaweicloud.cs.java.v1.AuthorizeApi;

import java.io.File;
import java.util.*;

public class AuthorizeApiExample {

    public static void main(String[] args) {
        
        AuthorizeApi apiInstance = new AuthorizeApi();
        String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
        List<String> body = Arrays.asList(new List<String>()); // List<String> | 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式
        try {
            GlobalResponse result = apiInstance.authorizeBucket(xProjectId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizeApi#authorizeBucket");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cs.&lt;region&gt;.myhuaweicloud.com/v1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorizeApi* | [**authorizeBucket**](docs/AuthorizeApi.md#authorizeBucket) | **POST** /{X-Project-Id}/obs_authorize | 用户主动授权起OBS桶的操作权限给CS服务, 用于保存用户作业的checkpoint、作业的运行日志等
*ClusterApi* | [**addHostsFile**](docs/ClusterApi.md#addHostsFile) | **POST** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts_file | 添加hosts文件
*ClusterApi* | [**addHostsInfo**](docs/ClusterApi.md#addHostsInfo) | **POST** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts | 添加IP域名映射信息
*ClusterApi* | [**createPeering**](docs/ClusterApi.md#createPeering) | **POST** /{X-Project-Id}/reserved_cluster/{cluster_id}/peering | 创建一个对等连接
*ClusterApi* | [**createReservedCluster**](docs/ClusterApi.md#createReservedCluster) | **POST** /{X-Project-Id}/reserved_cluster | 为具有cs_adm角色的CS用户创建一个独享计算集群
*ClusterApi* | [**createRoute**](docs/ClusterApi.md#createRoute) | **POST** /{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route | 创建路由
*ClusterApi* | [**deleteHostsInfo**](docs/ClusterApi.md#deleteHostsInfo) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts | 删除IP域名映射信息
*ClusterApi* | [**deletePeering**](docs/ClusterApi.md#deletePeering) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id} | 删除对等连接
*ClusterApi* | [**deleteReservedCluster**](docs/ClusterApi.md#deleteReservedCluster) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id} | 删除独享集群, 如果集群中有运行的作业会自动立即停止
*ClusterApi* | [**deleteRoute**](docs/ClusterApi.md#deleteRoute) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route/{route_id} | 删除路由
*ClusterApi* | [**describeReservedCluster**](docs/ClusterApi.md#describeReservedCluster) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id} | 查询用户创建的独享集群信息
*ClusterApi* | [**getClusterJobs**](docs/ClusterApi.md#getClusterJobs) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/jobs | 查询独享集群下的作业列表
*ClusterApi* | [**getHostsInfo**](docs/ClusterApi.md#getHostsInfo) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts | 查询指定集群的IP域名映射信息
*ClusterApi* | [**getPeering**](docs/ClusterApi.md#getPeering) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id} | 查询对等连接
*ClusterApi* | [**getPeerings**](docs/ClusterApi.md#getPeerings) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/peering | 查询对等连接列表
*ClusterApi* | [**getReservedClusters**](docs/ClusterApi.md#getReservedClusters) | **GET** /{X-Project-Id}/reserved_clusters | 查询租户下的集群列表
*ClusterApi* | [**getRoutes**](docs/ClusterApi.md#getRoutes) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/peering/{peering_id}/route | 查询路由列表
*ClusterApi* | [**getUserQuota**](docs/ClusterApi.md#getUserQuota) | **GET** /{X-Project-Id}/user_quota/{user_id} | 查询指定用户配额信息
*ClusterApi* | [**getUserQuotas**](docs/ClusterApi.md#getUserQuotas) | **GET** /{X-Project-Id}/user_quotas | 获取租户下的用户配额信息
*ClusterApi* | [**restartReservedCluster**](docs/ClusterApi.md#restartReservedCluster) | **POST** /{X-Project-Id}/reserved_cluster/{cluster_id}/restart | 重启独享集群
*ClusterApi* | [**stopReservedCluster**](docs/ClusterApi.md#stopReservedCluster) | **POST** /{X-Project-Id}/reserved_cluster/{cluster_id}/stop | 停止独享集群
*ClusterApi* | [**updateHostsInfo**](docs/ClusterApi.md#updateHostsInfo) | **PATCH** /{X-Project-Id}/reserved_cluster/{cluster_id}/hosts/{host_id} | 更新IP域名映射信息
*ClusterApi* | [**updateReservedCluster**](docs/ClusterApi.md#updateReservedCluster) | **PATCH** /{X-Project-Id}/reserved_cluster/{cluster_id} | 更新独享集群
*ClusterApi* | [**updateUserQuota**](docs/ClusterApi.md#updateUserQuota) | **PATCH** /{X-Project-Id}/user_quota/{user_id} | 更新指定用户配额信息
*JobApi* | [**deleteJob**](docs/JobApi.md#deleteJob) | **DELETE** /{X-Project-Id}/job/{job_id} | 删除作业
*JobApi* | [**getJobDetail**](docs/JobApi.md#getJobDetail) | **GET** /{X-Project-Id}/job/{job_id} | 查询作业详情
*JobApi* | [**getJobExecuteGraph**](docs/JobApi.md#getJobExecuteGraph) | **GET** /{X-Project-Id}/job/{job_id}/execute_graph | 查询作业执行计划图
*JobApi* | [**getJobs**](docs/JobApi.md#getJobs) | **GET** /{X-Project-Id}/jobs | 查询作业列表
*JobApi* | [**runJob**](docs/JobApi.md#runJob) | **POST** /{X-Project-Id}/job/{job_id}/run | 运行作业
*JobApi* | [**stopJob**](docs/JobApi.md#stopJob) | **POST** /{X-Project-Id}/job/{job_id}/stop | 停止作业
*JobApi* | [**submitJarJob**](docs/JobApi.md#submitJarJob) | **POST** /{X-Project-Id}/jar_job | 创建一个用户自定义作业
*JobApi* | [**submitSqlJob**](docs/JobApi.md#submitSqlJob) | **POST** /{X-Project-Id}/sql_job | 提交流式SQL作业到CS服务
*JobApi* | [**updateJarJob**](docs/JobApi.md#updateJarJob) | **PATCH** /{X-Project-Id}/jar_job | 更新用户自定义作业
*JobApi* | [**updateSqlJob**](docs/JobApi.md#updateSqlJob) | **PATCH** /{X-Project-Id}/sql_job | 更新流式SQL作业
*LogApi* | [**getAuditLogs**](docs/LogApi.md#getAuditLogs) | **GET** /{X-Project-Id}/audit_logs | 查询审计日志
*StatisticsApi* | [**getReleaseVersion**](docs/StatisticsApi.md#getReleaseVersion) | **GET** /versions | 查询CS当前发行版本信息
*StatisticsApi* | [**overview**](docs/StatisticsApi.md#overview) | **GET** /{X-Project-Id}/overview | 概要统计用户的资源使用情况
*TemplateApi* | [**createJobTemplate**](docs/TemplateApi.md#createJobTemplate) | **POST** /{X-Project-Id}/job_template | 创建作业模板
*TemplateApi* | [**deleteJobTemplate**](docs/TemplateApi.md#deleteJobTemplate) | **DELETE** /{X-Project-Id}/job_template/{template_id} | 删除作业模板
*TemplateApi* | [**getJobTemplates**](docs/TemplateApi.md#getJobTemplates) | **GET** /{X-Project-Id}/job_templates | 查询作业模板列表
*TemplateApi* | [**updateJobTemplate**](docs/TemplateApi.md#updateJobTemplate) | **PATCH** /{X-Project-Id}/job_template | 更新作业模板


## Documentation for Models

 - [AddHostsInfoResponse](docs/AddHostsInfoResponse.md)
 - [AddHostsInfoResponsePayload](docs/AddHostsInfoResponsePayload.md)
 - [AuditLog](docs/AuditLog.md)
 - [AuditLogResponse](docs/AuditLogResponse.md)
 - [AuditLogResponsePayload](docs/AuditLogResponsePayload.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body2](docs/Body2.md)
 - [ClusterHostsInfo](docs/ClusterHostsInfo.md)
 - [ClusterHostsInfoHostsInfo](docs/ClusterHostsInfoHostsInfo.md)
 - [ClusterInfo](docs/ClusterInfo.md)
 - [ClusterOverviewEntity](docs/ClusterOverviewEntity.md)
 - [CreateClusterResponse](docs/CreateClusterResponse.md)
 - [CreateClusterResponsePayload](docs/CreateClusterResponsePayload.md)
 - [CreateJobTemplateRequest](docs/CreateJobTemplateRequest.md)
 - [CreatePeeringRequest](docs/CreatePeeringRequest.md)
 - [CreatePeeringResponse](docs/CreatePeeringResponse.md)
 - [CreateRouteRequest](docs/CreateRouteRequest.md)
 - [CreateRouteResponse](docs/CreateRouteResponse.md)
 - [DeleteHostsInfoResponse](docs/DeleteHostsInfoResponse.md)
 - [EngineVersion](docs/EngineVersion.md)
 - [GetJobDetailResponse](docs/GetJobDetailResponse.md)
 - [GetPeeringsResponse](docs/GetPeeringsResponse.md)
 - [GetRoutesResponse](docs/GetRoutesResponse.md)
 - [GlobalErrorResponse](docs/GlobalErrorResponse.md)
 - [GlobalResponse](docs/GlobalResponse.md)
 - [HostIpInfo](docs/HostIpInfo.md)
 - [JobConfig](docs/JobConfig.md)
 - [JobDetailEntity](docs/JobDetailEntity.md)
 - [JobEntity](docs/JobEntity.md)
 - [JobExecutePlan](docs/JobExecutePlan.md)
 - [JobExecutePlanResponse](docs/JobExecutePlanResponse.md)
 - [JobOverviewEntity](docs/JobOverviewEntity.md)
 - [JobStatusInfo](docs/JobStatusInfo.md)
 - [JobStatusResponse](docs/JobStatusResponse.md)
 - [JobTemplate](docs/JobTemplate.md)
 - [JobTemplateCreateResponse](docs/JobTemplateCreateResponse.md)
 - [JobTemplateCreated](docs/JobTemplateCreated.md)
 - [JobTemplateDeleteResponse](docs/JobTemplateDeleteResponse.md)
 - [JobTemplateDeleted](docs/JobTemplateDeleted.md)
 - [JobTemplateListResponse](docs/JobTemplateListResponse.md)
 - [JobTemplateListResponsePayload](docs/JobTemplateListResponsePayload.md)
 - [JobTemplateUpdateResponse](docs/JobTemplateUpdateResponse.md)
 - [JobUpdateResponse](docs/JobUpdateResponse.md)
 - [JobUpdateTime](docs/JobUpdateTime.md)
 - [NewReservedClusterRequest](docs/NewReservedClusterRequest.md)
 - [OverviewEntity](docs/OverviewEntity.md)
 - [OverviewResponse](docs/OverviewResponse.md)
 - [Peering](docs/Peering.md)
 - [QueryClusterHostsInfoResponse](docs/QueryClusterHostsInfoResponse.md)
 - [QueryClusterResponse](docs/QueryClusterResponse.md)
 - [QueryClustersResponse](docs/QueryClustersResponse.md)
 - [QueryClustersResponsePayload](docs/QueryClustersResponsePayload.md)
 - [QueryJobListResponse](docs/QueryJobListResponse.md)
 - [QueryJobListResponsePayload](docs/QueryJobListResponsePayload.md)
 - [QueryUserQuotaResponse](docs/QueryUserQuotaResponse.md)
 - [QueryUserQuotasResponse](docs/QueryUserQuotasResponse.md)
 - [QueryUserQuotasResponsePayload](docs/QueryUserQuotasResponsePayload.md)
 - [ReleaseVersionResponse](docs/ReleaseVersionResponse.md)
 - [RestartReservedClusterResponse](docs/RestartReservedClusterResponse.md)
 - [Route](docs/Route.md)
 - [StopReservedClusterResponse](docs/StopReservedClusterResponse.md)
 - [SubmitJarJobRequest](docs/SubmitJarJobRequest.md)
 - [SubmitSqlJobRequest](docs/SubmitSqlJobRequest.md)
 - [UpdateClusterRequest](docs/UpdateClusterRequest.md)
 - [UpdateHostsInfoResponse](docs/UpdateHostsInfoResponse.md)
 - [UpdateJobTemplateRequest](docs/UpdateJobTemplateRequest.md)
 - [UpdateSqlJobRequest](docs/UpdateSqlJobRequest.md)
 - [UpdateUserQuotaRequest](docs/UpdateUserQuotaRequest.md)
 - [UserCluster](docs/UserCluster.md)
 - [UserQuotaInfo](docs/UserQuotaInfo.md)
 - [VpcInfo](docs/VpcInfo.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

huaweicloud.cs@huawei.com

