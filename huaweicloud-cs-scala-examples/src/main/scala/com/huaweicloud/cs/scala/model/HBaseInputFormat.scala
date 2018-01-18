package com.huaweicloud.cs.scala.model

import org.apache.flink.addons.hbase.TableInputFormat
import org.apache.flink.api.java.tuple.Tuple2
import org.apache.hadoop.hbase.client.{Result, Scan}
import org.apache.hadoop.hbase.util.Bytes

/**
  * This class implements an TableInputFormat for HBase.
  */
class HBaseInputFormat extends TableInputFormat[Tuple2[String, String]] {

  val reuse = new Tuple2[String, String]

  def getTableName = FlinkHbaseConstants.TEST_TABLE_NAME

  def getScanner: Scan = {
    val scan = new Scan
    scan.addColumn(FlinkHbaseConstants.CF_SOME, FlinkHbaseConstants.Q_SOME)
    scan
  }

  def mapResultToTuple(r: Result): Tuple2[String, String] = {
    val key = Bytes.toString(r.getRow)
    val value = Bytes.toString(r.getValue(FlinkHbaseConstants.CF_SOME, FlinkHbaseConstants.Q_SOME))
    reuse.setField(key, 0)
    reuse.setField(value, 1)
    reuse
  }

}