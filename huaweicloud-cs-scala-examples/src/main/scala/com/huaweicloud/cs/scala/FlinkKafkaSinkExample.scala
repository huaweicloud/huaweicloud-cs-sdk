package com.huaweicloud.cs.scala

import java.util.Properties
import com.huaweicloud.cs.scala.model.KafkaSourceGenerator
import org.apache.flink.streaming.api.datastream.DataStream
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer010
import org.apache.flink.streaming.util.serialization.SimpleStringSchema

/**
  * This is an example how to write streams into Kafka. In this example the
  * stream will be written from a local Kafka. You need a running local Kafka with a
  * topic "testTopic".The local ip is 10.10.0.1.
  */
class FlinkKafkaSinkExample {

  def run(): Unit = {
    val topic = "testTopic"
    val properties = new Properties()
    properties.setProperty("bootstrap.servers", "10.10.0.1:9092")

    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.setParallelism(1)
    val messageStream: DataStream[String] = env.addSource(new KafkaSourceGenerator)
    messageStream.addSink(new FlinkKafkaProducer010(
      topic, new SimpleStringSchema, properties))
    env.execute()
  }

}