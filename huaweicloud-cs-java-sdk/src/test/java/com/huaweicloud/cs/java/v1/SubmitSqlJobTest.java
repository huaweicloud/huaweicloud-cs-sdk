package com.huaweicloud.cs.java.v1;

import com.huaweicloud.cs.java.v1.client.ApiClient;
import com.huaweicloud.cs.java.v1.client.ApiException;
import com.huaweicloud.cs.java.v1.model.JobStatusResponse;
import com.huaweicloud.cs.java.v1.model.SubmitSqlJobRequest;

public class SubmitSqlJobTest {

    public static void main(String[] args) {

        try {
            ApiClient apiClient = new ApiClient("cn-north-1");
            apiClient.useAksk("A1AJ0GQFQKIC2ZFSPCRM","IacvSp4CH1tQRcEQauTI4ifXWMpDMdsJgu70e4Od");
            apiClient.setDebugging(true);
            JobApi apiInstance = new JobApi(apiClient);
            String xProjectId = "034d83593b06464594f72c678cc16a8c"; // String | project id， 用于不同project取token.
            SubmitSqlJobRequest body = new SubmitSqlJobRequest(); // SubmitSqlJobRequest | JSON格式的请求体
            body.setName("myjob");
            try {
                //GetJobDetailResponse result = apiInstance.getJobDetail(xProjectId, 105207L);
                JobStatusResponse result = apiInstance.submitSqlJob(xProjectId, body);
                System.out.println(result);

            } catch (ApiException e) {
                System.err.println("Exception when calling JobApi#submitSqlJob");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
