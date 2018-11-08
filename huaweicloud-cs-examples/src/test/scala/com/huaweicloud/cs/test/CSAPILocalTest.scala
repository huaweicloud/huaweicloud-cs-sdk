package com.huaweicloud.cs.test

import com.huaweicloud.cs.java.v1.JobApi
import com.huaweicloud.cs.java.v1.client.ApiException
import com.huaweicloud.cs.java.v1.client.ApiClient

object CSAPILocalTest {

  def main(args: Array[String]): Unit = {
    val xProjectId = "asdfasdfasfdasdfasdfasdfdsf"
    val client = new ApiClient("cn-north-1")
    client.useToken("xxxxx", "xxxxx", "xxxxxx", xProjectId)
    try {
      val apiInstance = new JobApi(client)
      val result = apiInstance.getJobs(xProjectId, null, "job_running", null, false, 0L, true, 20, "desc", null)
      println(result)
    } catch {
      case e: ApiException =>
        println("code: " + e.getCode)
        println("body: " + e.getResponseBody)
        println("heders: " + e.getResponseHeaders)
        e.printStackTrace()
    }
  }
}
