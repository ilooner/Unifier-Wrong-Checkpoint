/**
 * Put your copyright and license info here.
 */
package com.datatorrent.unifiercheck;

import com.datatorrent.api.DefaultOutputPort;
import com.datatorrent.api.InputOperator;
import com.datatorrent.common.util.BaseOperator;

/**
 * This is a simple operator that emits random number.
 */
public class RandomNumberGenerator extends BaseOperator implements InputOperator
{
  public final transient DefaultOutputPort<Double> out = new DefaultOutputPort<Double>();

  @Override
  public void beginWindow(long windowId)
  {
  }

  @Override
  public void emitTuples()
  {
    for(int counter = 0; counter < 1000; counter++) {
      out.emit(Math.random());
    }
  }
}
