package com.huaweicloud.cs.java.model;

import org.apache.flink.streaming.api.functions.source.SourceFunction;

/**
 * This class implements an SourceFunction for Kafka to generate data source.
 */
public class KafkaSourceGenerator implements SourceFunction<String> {

    private static final long serialVersionUID = 2174904787118597072L;
    private boolean running = true;
    private long i = 0;

    @Override
    public void run(SourceContext<String> ctx) throws Exception {
        while (running) {
            ctx.collect("element-" + (i++));
            Thread.sleep(1000);
        }
    }

    @Override
    public void cancel() {
        running = false;
    }

}
