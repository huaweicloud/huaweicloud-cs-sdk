package com.huaweicloud.cs.java.model;

import org.apache.flink.configuration.ConfigConstants;

/**
 * This object config table info: table name, schema etc.
 */
public class FlinkHBaseConstants {

    static final String TEST_TABLE_NAME = "testTable";
    static final byte[] CF_SOME = "f1".getBytes(ConfigConstants.DEFAULT_CHARSET);
    static final byte[] Q_SOME = "c1".getBytes(ConfigConstants.DEFAULT_CHARSET);

}