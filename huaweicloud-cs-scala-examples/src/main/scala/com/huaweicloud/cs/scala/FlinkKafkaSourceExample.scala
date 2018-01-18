package com.huaweicloud.cs.scala

import java.util.Properties
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010
import org.apache.flink.streaming.util.serialization.SimpleStringSchema

/**
  * This is an example how to read streams from Kafka. In this example the
  * stream will be read from a local Kafka but it is possible to adapt this
  * example for an HBase running in a cloud. You need a running local Kafa with a
  * topic "testTopic".The local ip is 10.10.0.1.
  */
class FlinkKafkaSourceExample {

  def run(): Unit = {
    val topic = "testTopic"
    val properties = new Properties()
    properties.setProperty("bootstrap.servers", "10.10.0.1:9092")

    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.setParallelism(1)
    val messageStream = env.addSource(new FlinkKafkaConsumer010(
      topic, new SimpleStringSchema, properties))
    messageStream.rebalance().print()
    env.execute()
  }

}