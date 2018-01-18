package com.huaweicloud.cs.scala

import com.huaweicloud.cs.scala.model.HBaseInputFormat
import org.apache.flink.api.java.tuple.Tuple2
import org.apache.flink.api.java.{DataSet, ExecutionEnvironment}

/**
  * This is an example how to read streams from HBase. In this example the
  * stream will be read from a local HBase but it is possible to adapt this
  * example for an HBase running in a cloud. You need a running local HBase with a
  * table "testTable" and a column "f1:c1".
  */
class FlinkHBaseSourceExample {

  def run(): Unit = {
    val env: ExecutionEnvironment = ExecutionEnvironment.getExecutionEnvironment
    val hbaseDs: DataSet[Tuple2[String, String]] = env.createInput(new HBaseInputFormat())
    hbaseDs.print()
  }

}