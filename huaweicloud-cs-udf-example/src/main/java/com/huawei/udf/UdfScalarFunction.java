package com.huawei.udf;

import org.apache.flink.table.functions.ScalarFunction;


public class UdfScalarFunction extends ScalarFunction {
  private int factor = 12;

  public UdfScalarFunction() {
    this.factor = 12;
  }

  public int eval(String s) {
    return s.hashCode() * factor;
  }
}

