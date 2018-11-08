//package com.huaweicloud.cs.java.model;
//
//import java.io.IOException;
//import org.apache.flink.api.common.io.OutputFormat;
//import org.apache.flink.configuration.Configuration;
//import org.apache.hadoop.hbase.HBaseConfiguration;
//import org.apache.hadoop.hbase.client.HTable;
//import org.apache.hadoop.hbase.client.Put;
//import org.apache.hadoop.hbase.util.Bytes;
//
///**
// * This class implements an OutputFormat for HBase.
// */
//public class HBaseOutputFormat implements OutputFormat<String> {
//
//    private org.apache.hadoop.conf.Configuration conf = null;
//    private HTable table = null;
//    private String taskNumber = null;
//    private int rowNumber = 0;
//
//    private static final long serialVersionUID = 1L;
//
//    @Override
//    public void configure(Configuration parameters) {
//        conf = HBaseConfiguration.create();
//        conf.set("hbase.zookeeper.quorum", "10.10.0.1");
//        conf.set("hbase.master", "10.10.0.1:60000");
//        conf.set("hbase.zookeeper.property.clientPort", "2181");
//    }
//
//    @Override
//    public void open(int taskNumber, int numTasks) throws IOException {
//        table = new HTable(conf, FlinkHBaseConstants.TEST_TABLE_NAME);
//        this.taskNumber = String.valueOf(taskNumber);
//    }
//
//    @Override
//    public void writeRecord(String record) throws IOException {
//        Put put = new Put(Bytes.toBytes(taskNumber + rowNumber));
//        put.add(FlinkHBaseConstants.CF_SOME, FlinkHBaseConstants.Q_SOME,
//                Bytes.toBytes(record));
//        rowNumber++;
//        table.put(put);
//    }
//
//    @Override
//    public void close() throws IOException {
//        table.flushCommits();
//        table.close();
//    }
//
//}
