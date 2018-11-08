//package com.huaweicloud.cs.java;
//
//import com.huaweicloud.cs.java.model.HBaseOutputFormat;
//import org.apache.flink.streaming.api.datastream.DataStream;
//import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
//import org.apache.flink.streaming.api.functions.source.SourceFunction;
//
///**
// * This is an example how to write streams into HBase. In this example the
// * stream will be written into a local HBase but it is possible to adapt this
// * example for an HBase running in a cloud. You need a running local HBase with a
// * table "testTable" and a column "f1:c1". The local ip is 10.10.0.1.
// */
//public class FlinkHBaseSinkExample {
//
//  public static void main(String[] args) {
//    //write to hbase
//    FlinkHBaseSinkExample hbaseSink = new FlinkHBaseSinkExample();
//    hbaseSink.writeHbase();
//  }
//
//  public void writeHbase() {
//    final StreamExecutionEnvironment env = StreamExecutionEnvironment
//        .getExecutionEnvironment();
//
//    // data stream with random numbers
//    DataStream<String> dataStream = env.addSource(new SourceFunction<String>() {
//      private static final long serialVersionUID = 1L;
//
//      private volatile boolean isRunning = true;
//
//      @Override
//      public void run(SourceContext<String> out) throws Exception {
//        while (isRunning) {
//          out.collect(String.valueOf(Math.floor(Math.random() * 100)));
//        }
//
//      }
//
//      @Override
//      public void cancel() {
//        isRunning = false;
//      }
//    });
//    dataStream.writeUsingOutputFormat(new HBaseOutputFormat());
//
//    try {
//      env.execute();
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//  }
//
//}
