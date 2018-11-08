package com.huaweicloud.cs.java;

import java.util.Properties;

import com.huaweicloud.cs.java.model.KafkaSourceGenerator;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer010;
import org.apache.flink.streaming.util.serialization.SimpleStringSchema;

/**
 * This is an example how to write streams into Kafka. In this example the
 * stream will be written from a local Kafka. You need a running local Kafka with a
 * topic "testTopic".The local ip is 10.10.0.1.
 */
public class FlinkKafkaSinkExample {

    private String topic;
    private Properties properties;

    public static void main(String[] args) {
        //write to kafa
        String topic = "testTopic";
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "10.10.0.1:9092");
        FlinkKafkaSinkExample kafkaSink = new FlinkKafkaSinkExample(topic, properties);
        kafkaSink.writeKafka();
    }

    public FlinkKafkaSinkExample(String kafkaTopic, Properties proper) {
        topic = kafkaTopic;
        properties = proper;
    }

    public void writeKafka() {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        DataStream<String> messageStream = env.addSource(new KafkaSourceGenerator());
        messageStream.addSink(new FlinkKafkaProducer010<String>(topic,
                new SimpleStringSchema(),
                properties));
        try {
            env.execute();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
