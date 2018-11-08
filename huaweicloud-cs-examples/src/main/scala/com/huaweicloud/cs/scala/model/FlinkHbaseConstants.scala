package com.huaweicloud.cs.scala.model

import org.apache.flink.configuration.ConfigConstants

/**
  * This object config table info: table name, schema etc.
  */
object FlinkHbaseConstants {

  val TEST_TABLE_NAME = "testTable"
  val CF_SOME = "f1".getBytes(ConfigConstants.DEFAULT_CHARSET)
  val Q_SOME = "c1".getBytes(ConfigConstants.DEFAULT_CHARSET)

}