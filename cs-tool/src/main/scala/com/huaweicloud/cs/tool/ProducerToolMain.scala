package com.huaweicloud.cs.tool

import java.io.{File, FileInputStream}
import java.nio.ByteBuffer
import java.util
import java.util.Properties
import java.util.concurrent.ThreadLocalRandom

import com.huaweicloud.dis.exception.DISClientException
import com.huaweicloud.dis.iface.data.request.{PutRecordsRequest, PutRecordsRequestEntry}
import com.huaweicloud.dis.iface.data.response.PutRecordsResult
import com.huaweicloud.dis.{DIS, DISClientBuilder}
import org.slf4j.LoggerFactory

import scala.io.Source

/**
  * Use for send data to DIS
  */
object ProducerToolMain {
  private val logger = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]): Unit = {
    if (args == null || args.length != 3) {
      System.err.println("Please provide two parameter:\n" + "1. Absolute DIS configure file for include access key and so on.\n" + "2. Absolute Data file for send to DIS include data lines.\n\n" + "For example:\n" + "DIS-Demo /opt/dis.properties  /opt/dis_sample.txt\n\n")
      System.exit(1)
    }

    val topic = args(0)
    val cf = loadProperties(args(1))
    val data = new File(args(2))

    if (!data.exists) {
      System.err.println("The file " + args(1) + " is not exist. Please provide a data file.")
      System.exit(1)
    }

    // Create DIS client
    val client = DISClientBuilder.standard()
      .withEndpoint(cf.getProperty("endpoint"))
      .withAk(cf.getProperty("ak"))
      .withSk(cf.getProperty("sk"))
      .withProjectId(cf.getProperty("projectId"))
      .withRegion(cf.getProperty("region"))
      .build()

    while (true) {
      val lines = Source.fromFile(data).getLines()
      sendMessages(client, topic, lines)
      Thread.sleep(200)
    }
  }

  private def loadProperties(file: String): Properties = {
    val prop = new Properties()
    prop.load(new FileInputStream(file))
    prop
  }

  /**
    * @param disClient  DIS客户端实例
    * @param streamName 流名称
    * @param messages   上传的数据列表
    */
  private def sendMessages(disClient: DIS, streamName: String, messages: Iterator[String]): Unit = {
    val request = new PutRecordsRequest
    request.setStreamName(streamName)

    val list = new util.ArrayList[PutRecordsRequestEntry]
    messages.foreach(f => {
      val record = new PutRecordsRequestEntry
      val buffer = ByteBuffer.wrap(f.getBytes)
      record.setData(buffer)
      record.setPartitionKey(String.valueOf(ThreadLocalRandom.current.nextInt(1000000)))
      list.add(record)
    })
    request.setRecords(list)
    logger.info("========== BEGIN PUT ============")

    var response: PutRecordsResult = null
    try {
      response = disClient.putRecords(request)
    } catch {
      case e: DISClientException =>
        logger.error("Failed to get a normal response, please check params and retry. Error message [{}]", e)
      case e: Exception =>
        logger.error(e.getMessage, e)
    }
    import scala.collection.JavaConverters._
    response.getRecords.asScala.foreach(f => {
      println("getErrorCode:" + f.getErrorCode)
      println("getErrorMessage:" + f.getErrorMessage)
      println("getPartitionId:" + f.getPartitionId)
      println("getSequenceNumber:" + f.getSequenceNumber)
    })
    response.getRecords.asScala.zipWithIndex.foreach { f =>
      //      val entity = f._1
      //      val index = f._2
      //      if (StringUtils.isNullOrEmpty(entity.getErrorCode)) {
      //        logger.error("[{}] put failed, errorCode [{}], errorMessage [{}]", new String(list.get(index).getData.array), entity.getErrorCode, entity.getErrorMessage)
      //      } else {
      //        logger.info("[{}] put success, partitionId [{}], partitionKey [{}], sequenceNumber [{}]", new String(list.get(index).getData.array), entity.getPartitionId, list.get(index).getPartitionKey, entity.getSequenceNumber)
      //      }
    }
    logger.info("========== END PUT ============\n")
  }

}
