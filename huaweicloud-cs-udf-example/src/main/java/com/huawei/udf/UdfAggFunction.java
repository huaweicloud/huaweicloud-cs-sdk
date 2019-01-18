package com.huawei.udf;


import org.apache.flink.table.functions.AggregateFunction;

import java.util.Iterator;

/**
 * Weighted Average user-defined aggregate function.
 */
public class UdfAggFunction extends AggregateFunction<Long, WeightedAvgAccum> {

  @Override
  public WeightedAvgAccum createAccumulator() {
    return new WeightedAvgAccum();
  }

  @Override
  public Long getValue(WeightedAvgAccum acc) {
    if (acc.count == 0) {
      return null;
    } else {
      return acc.sum / acc.count;
    }
  }

  public void accumulate(WeightedAvgAccum acc, long iValue) {
    acc.sum += iValue;
    acc.count += 1;
  }

  public void retract(WeightedAvgAccum acc, long iValue) {
    acc.sum -= iValue;
    acc.count -= 1;
  }

  public void merge(WeightedAvgAccum acc, Iterable<WeightedAvgAccum> it) {
    Iterator<WeightedAvgAccum> iter = it.iterator();
    while (iter.hasNext()) {
      WeightedAvgAccum a = iter.next();
      acc.count += a.count;
      acc.sum += a.sum;
    }
  }

  public void resetAccumulator(WeightedAvgAccum acc) {
    acc.count = 0;
    acc.sum = 0L;
  }
}