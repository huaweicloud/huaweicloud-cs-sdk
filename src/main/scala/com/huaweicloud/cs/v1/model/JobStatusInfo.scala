/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.v1.model

import com.huaweicloud.cs.v1.client.ApiModel

case class JobStatusInfo(
  /* 作业ID */
  jobId: Option[Long],
  /* 当前状态名称 */
  statusName: Option[String],
  /* 当前状态描述 */
  statusDesc: Option[String]
) extends ApiModel


