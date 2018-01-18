package com.huaweicloud.cs.scala.model

import org.apache.flink.api.common.io.OutputFormat
import org.apache.flink.configuration.Configuration
import org.apache.hadoop.hbase.client.{Connection, ConnectionFactory, Put, Table}
import org.apache.hadoop.hbase.{HBaseConfiguration, TableName}

/**
  * This class implements an OutputFormat for HBase.
  */
class HBaseOutputFormat(tableName: String, config: Configuration) extends OutputFormat[String] {

  private var conf: org.apache.hadoop.conf.Configuration = _
  private var con: Connection = _
  private var table: Table = _
  private var rowKey = 1

  def configure(parameters1: Configuration): Unit = {
    conf = HBaseConfiguration.create
    conf.set("hbase.zookeeper.quorum", config.getString("hbase.zookeeper.quorum", "127.0.0.1"))
    conf.set("hbase.master", config.getString("hbase.master", "127.0.0.1:60000"))
    conf.set("hbase.zookeeper.property.clientPort", config.getString("hbase.zookeeper.property.clientPort", "2181"))
    conf.setInt("hbase.rpc.timeout", config.getInteger("hbase.rpc.timeout", 20000))
    conf.setInt("hbase.client.operation.timeout", config.getInteger("hbase.client.operation.timeout", 30000))
    conf.setInt("hbase.client.scanner.timeout.period", config.getInteger("hbase.client.scanner.timeout.period", 20000))
  }

  def open(taskNumber: Int, numTasks: Int): Unit = {
    con = ConnectionFactory.createConnection(conf)
    val hTableName: TableName = TableName.valueOf(tableName)
    table = con.getTable(hTableName)
  }

  def writeRecord(record: String): Unit = {
    println(record)
    val put1 = new Put(org.apache.hadoop.hbase.util.Bytes.toBytes(rowKey.toString))
    put1.addColumn(FlinkHbaseConstants.CF_SOME, FlinkHbaseConstants.Q_SOME, org.apache.hadoop.hbase.util.Bytes.toBytes(record))
    table.put(put1)
    rowKey = rowKey + 1
  }

  def close(): Unit = {
    table.close()
    con.close()
  }

}