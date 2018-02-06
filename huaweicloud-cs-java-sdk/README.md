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
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.huaweicloud.cs:huaweicloud-cs-java-sdk:1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/huaweicloud-cs-java-sdk-1.0-SNAPSHOT.jar
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
        String xSdkDate = "xSdkDate_example"; // String | 使用AK/SK认证时必选: 请求的发生时间，格式为(YYYYMMDD'T'HHMMSS'Z')。取值为当前系统的GMT时间。
        String authorization = "authorization_example"; // String | 使用AK/SK认证时必选: 签名认证信息。该值来源于请求签名结果。请参考请求签名流程。http://support.huaweicloud.com/api-cs/cs_02_0008.html
        String host = "host_example"; // String | 使用AK/SK认证时必选: 请求的服务器信息，从服务API的URL中获取。值为hostname[:port]。端口缺省时使用默认的端口，https的默认端口为443。
        String xProjectId2 = "xProjectId_example"; // String | 可选。project id，用于不同project取token。
        String xAuthToken = "xAuthToken_example"; // String | 使用Token认证时必选: 用户Token
        try {
            GlobalResponse result = apiInstance.authorizeBucket(xProjectId, body, xSdkDate, authorization, host, xProjectId2, xAuthToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizeApi#authorizeBucket");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorizeApi* | [**authorizeBucket**](docs/AuthorizeApi.md#authorizeBucket) | **POST** /{X-Project-Id}/obs_authorize | 用户主动授权起OBS桶的操作权限给CloudStream服务, 用于保存用户作业的checkpoint、作业的运行日志等
*ClusterApi* | [**createReservedCluster**](docs/ClusterApi.md#createReservedCluster) | **POST** /{X-Project-Id}/reserved_cluster | 创建一个为具有cs_adm角色的CloudStream用户预留一个计算集群, 预留的集群会折算成SPU, 按需计费
*ClusterApi* | [**deleteReservedCluster**](docs/ClusterApi.md#deleteReservedCluster) | **DELETE** /{X-Project-Id}/reserved_cluster/{cluster_id} | 删除预留的集群, 如果集群中有运行的作业会自动立即停止
*ClusterApi* | [**describeReservedCluster**](docs/ClusterApi.md#describeReservedCluster) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id} | 查询用户创建的预留集群信息
*ClusterApi* | [**getClusterJobs**](docs/ClusterApi.md#getClusterJobs) | **GET** /{X-Project-Id}/reserved_cluster/{cluster_id}/jobs | 查询预留集群下的作业列表
*ClusterApi* | [**getReservedClusters**](docs/ClusterApi.md#getReservedClusters) | **GET** /{X-Project-Id}/reserved_clusters | 查询租户下的集群列表
*ClusterApi* | [**getUserQuota**](docs/ClusterApi.md#getUserQuota) | **GET** /{X-Project-Id}/user_quota/{user_id} | 查询指定用户配额信息
*ClusterApi* | [**getUserQuotas**](docs/ClusterApi.md#getUserQuotas) | **GET** /{X-Project-Id}/user_quotas | 获取租户下的用户配额信息
*ClusterApi* | [**updateReservedCluster**](docs/ClusterApi.md#updateReservedCluster) | **PATCH** /{X-Project-Id}/reserved_cluster/{cluster_id} | 更新预留的集群
*ClusterApi* | [**updateUserQuota**](docs/ClusterApi.md#updateUserQuota) | **PATCH** /{X-Project-Id}/user_quota/{user_id} | 更新指定用户配额信息
*JobApi* | [**deleteJob**](docs/JobApi.md#deleteJob) | **DELETE** /{X-Project-Id}/job | 删除作业
*JobApi* | [**getJobDetail**](docs/JobApi.md#getJobDetail) | **GET** /{X-Project-Id}/job/{job_id} | get job detail
*JobApi* | [**getJobExecuteGraph**](docs/JobApi.md#getJobExecuteGraph) | **GET** /{X-Project-Id}/job/{job_id}/execute_graph | get job execution graph
*JobApi* | [**getJobs**](docs/JobApi.md#getJobs) | **GET** /{X-Project-Id}/jobs | 查询作业列表
*JobApi* | [**runJob**](docs/JobApi.md#runJob) | **POST** /{X-Project-Id}/job/run | 运行作业
*JobApi* | [**stopJob**](docs/JobApi.md#stopJob) | **POST** /{X-Project-Id}/job/stop | Trigger to stop the running job
*JobApi* | [**submitJarJob**](docs/JobApi.md#submitJarJob) | **POST** /{X-Project-Id}/jar_job | 创建一个用户自定义作业
*JobApi* | [**submitSqlJob**](docs/JobApi.md#submitSqlJob) | **POST** /{X-Project-Id}/sql_job | 提交流式SQL作业到CloudStream服务
*JobApi* | [**updateJarJob**](docs/JobApi.md#updateJarJob) | **PATCH** /{X-Project-Id}/jar_job | 更新用户自定义作业
*JobApi* | [**updateSqlJob**](docs/JobApi.md#updateSqlJob) | **PATCH** /{X-Project-Id}/sql_job | 更新流式SQL作业
*LogApi* | [**getJobAuditLogs**](docs/LogApi.md#getJobAuditLogs) | **GET** /{X-Project-Id}/audit_logs | query CloudStream Service job audit logs
*StatisticsApi* | [**overview**](docs/StatisticsApi.md#overview) | **GET** /{X-Project-Id}/overview | 概要统计用户的作业和费用情况
*TemplateApi* | [**createJobTemplate**](docs/TemplateApi.md#createJobTemplate) | **POST** /{X-Project-Id}/job_template | create the job template
*TemplateApi* | [**deleteJobTemplate**](docs/TemplateApi.md#deleteJobTemplate) | **DELETE** /{X-Project-Id}/job_template/{template_id} | 删除作业模板
*TemplateApi* | [**getJobTemplates**](docs/TemplateApi.md#getJobTemplates) | **GET** /{X-Project-Id}/job_templates | query CloudStream Service job templates


## Documentation for Models

 - [ClusterInfo](docs/ClusterInfo.md)
 - [ClusterOverviewEntity](docs/ClusterOverviewEntity.md)
 - [CreateClusterResponse](docs/CreateClusterResponse.md)
 - [CreateClusterResponsePayload](docs/CreateClusterResponsePayload.md)
 - [GetJobDetailResponse](docs/GetJobDetailResponse.md)
 - [GlobalErrorResponse](docs/GlobalErrorResponse.md)
 - [GlobalResponse](docs/GlobalResponse.md)
 - [JobAuditLog](docs/JobAuditLog.md)
 - [JobAuditLogResponse](docs/JobAuditLogResponse.md)
 - [JobAuditLogResponsePayload](docs/JobAuditLogResponsePayload.md)
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
 - [JobTemplateRequest](docs/JobTemplateRequest.md)
 - [JobUpdateResponse](docs/JobUpdateResponse.md)
 - [JobUpdateTime](docs/JobUpdateTime.md)
 - [NewReservedClusterRequest](docs/NewReservedClusterRequest.md)
 - [OverviewEntity](docs/OverviewEntity.md)
 - [OverviewResponse](docs/OverviewResponse.md)
 - [QueryClusterResponse](docs/QueryClusterResponse.md)
 - [QueryClustersResponse](docs/QueryClustersResponse.md)
 - [QueryClustersResponsePayload](docs/QueryClustersResponsePayload.md)
 - [QueryJobListResponse](docs/QueryJobListResponse.md)
 - [QueryJobListResponsePayload](docs/QueryJobListResponsePayload.md)
 - [QueryUserQuotaResponse](docs/QueryUserQuotaResponse.md)
 - [QueryUserQuotasResponse](docs/QueryUserQuotasResponse.md)
 - [QueryUserQuotasResponsePayload](docs/QueryUserQuotasResponsePayload.md)
 - [SubmitJarJobRequest](docs/SubmitJarJobRequest.md)
 - [SubmitSqlJobRequest](docs/SubmitSqlJobRequest.md)
 - [UpdateClusterRequest](docs/UpdateClusterRequest.md)
 - [UpdateSqlJobRequest](docs/UpdateSqlJobRequest.md)
 - [UpdateUserQuotaRequest](docs/UpdateUserQuotaRequest.md)
 - [UserCluster](docs/UserCluster.md)
 - [UserQuotaInfo](docs/UserQuotaInfo.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

CloudStream@huawei.com

