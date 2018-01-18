package com.huaweicloud.cs.java.model;

import org.apache.flink.addons.hbase.TableInputFormat;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * This class implements an TableInputFormat for HBase.
 */
public class HBaseInputFormat extends TableInputFormat<Tuple2<String, String>> {

    private Tuple2<String, String> reuse = new Tuple2<>();

    @Override
    public String getTableName() {
        return FlinkHBaseConstants.TEST_TABLE_NAME;
    }

    @Override
    protected Scan getScanner() {
        Scan scan = new Scan();
        scan.addColumn(FlinkHBaseConstants.CF_SOME, FlinkHBaseConstants.Q_SOME);
        return scan;
    }

    @Override
    protected Tuple2<String, String> mapResultToTuple(Result r) {
        String key = Bytes.toString(r.getRow());
        String val = Bytes.toString(r.getValue(FlinkHBaseConstants.CF_SOME, FlinkHBaseConstants.Q_SOME));
        reuse.setField(key, 0);
        reuse.setField(val, 1);
        return reuse;
    }

}
