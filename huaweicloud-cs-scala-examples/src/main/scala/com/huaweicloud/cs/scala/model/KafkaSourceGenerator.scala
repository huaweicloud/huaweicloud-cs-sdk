package com.huaweicloud.cs.scala.model

import org.apache.flink.streaming.api.functions.source.SourceFunction
import org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext

/**
  * This class implements an SourceFunction for Kafka to generate data source.
  */
class KafkaSourceGenerator extends SourceFunction[String] {

  var running = true
  var i = 0

  override def run(ctx: SourceContext[String]) {
    while (running) {
      ctx.collect("element-" + i)
      i += 1
      Thread.sleep(1000)
    }
  }

  override def cancel() {
    running = false
  }

}