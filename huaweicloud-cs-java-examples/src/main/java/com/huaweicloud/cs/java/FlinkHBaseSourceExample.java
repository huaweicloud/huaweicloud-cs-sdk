package com.huaweicloud.cs.java;

import com.huaweicloud.cs.java.model.HBaseInputFormat;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple2;

/**
 * This is an example how to read streams from HBase. In this example the
 * stream will be read from a local HBase but it is possible to adapt this
 * example for an HBase running in a cloud. You need a running local HBase with a
 * table "testTable" and a column "f1:c1".
 */
public class FlinkHBaseSourceExample {

    public static void main(String[] args) {
        //read from hbase
        FlinkHBaseSourceExample hBaseSource = new FlinkHBaseSourceExample();
        hBaseSource.readHbase();
    }

    public void readHbase() {
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSet<Tuple2<String, String>> hBaseDs = env.createInput(new HBaseInputFormat());
        try {
            hBaseDs.print();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
