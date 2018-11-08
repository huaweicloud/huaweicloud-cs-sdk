//package com.huaweicloud.cs.scala
//
//import java.util.Properties
//import com.huaweicloud.cs.scala.model.HBaseOutputFormat
//import org.apache.flink.configuration.Configuration
//import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment
//import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010
//import org.apache.flink.streaming.util.serialization.SimpleStringSchema
//
///**
//  * This is an example how to write streams into HBase. In this example the
//  * stream will be written into a local HBase but it is possible to adapt this
//  * example for an HBase running in a cloud. You need a running local HBase with a
//  * table "testTable" and a column "f1:c1". The local ip is 10.10.0.1.
//  */
//class FlinkHBaseSinkExample {
//
//  def run(): Unit = {
//    //read from kafka
//    val topic = "testTopic"
//    val properties = new Properties()
//    properties.setProperty("bootstrap.servers", "10.10.0.1:9092")
//    val env = StreamExecutionEnvironment.getExecutionEnvironment
//    env.setParallelism(1)
//    val messageStream = env.addSource(new FlinkKafkaConsumer010(
//      topic, new SimpleStringSchema, properties))
//
//    //write to HBase
//    val tableName = "testTable"
//    val conf = new Configuration()
//    conf.setString("hbase.zookeeper.quorum", "10.10.0.1")
//    conf.setString("hbase.master", "10.10.0.1:60000")
//    conf.setString("hbase.zookeeper.property.clientPort", "2181")
//    messageStream.writeUsingOutputFormat(new HBaseOutputFormat(tableName, conf))
//    env.execute()
//  }
//
//}
