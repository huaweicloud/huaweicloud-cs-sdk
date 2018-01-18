package com.huaweicloud.cs.java;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.util.serialization.SimpleStringSchema;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;
import java.util.Properties;

/**
 * This is an example how to read streams from Kafka. In this example the
 * stream will be read from a local Kafka but it is possible to adapt this
 * example for an HBase running in a cloud. You need a running local Kafa with a
 * topic "testTopic".The local ip is 10.10.0.1.
 */
public class FlinkKafkaSourceExample {

    private String topic;
    private Properties properties;

    public static void main(String[] args) {
        //read from kafa
        String topic = "testTopic";
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "10.10.0.1:9092");
        FlinkKafkaSourceExample kafaSource = new FlinkKafkaSourceExample(topic, properties);
        kafaSource.readKafka();
    }

    public FlinkKafkaSourceExample(String kafkaTopic, Properties proper) {
        topic = kafkaTopic;
        properties = proper;
    }

    public void readKafka() {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        DataStream<String> messageStream = env.addSource(new FlinkKafkaConsumer010<>(topic,
                new SimpleStringSchema(),
                properties));
        messageStream.rebalance().print();
        try {
            env.execute();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
