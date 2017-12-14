/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.v1.model

import com.huaweicloud.cs.v1.client.ApiModel

case class JobAuditLog(
  resourceId: Option[String],
  resourceName: Option[String],
  eventName: Option[String],
  eventType: Option[String],
  eventRating: Option[String],
  opUser: Option[String],
  opTime: Option[Long],
  opIp: Option[String],
  opResult: Option[String]
) extends ApiModel


