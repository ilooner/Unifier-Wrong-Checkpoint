/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.datatorrent.unifiercheck;

import com.datatorrent.api.DefaultInputPort;
import com.datatorrent.common.util.BaseOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumerOperator extends BaseOperator
{
  public final transient DefaultInputPort<Double> input = new DefaultInputPort<Double>() {
    @Override
    public void process(Double tuple)
    {
    }
  };

  @Override
  public void beginWindow(long windowId)
  {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      throw new RuntimeException(ex);
    }
  }
}
