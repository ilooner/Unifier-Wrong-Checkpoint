/**
 * Put your copyright and license info here.
 */
package com.datatorrent.unifiercheck;

import org.apache.hadoop.conf.Configuration;

import com.datatorrent.api.annotation.ApplicationAnnotation;
import com.datatorrent.api.StreamingApplication;
import com.datatorrent.api.DAG;

@ApplicationAnnotation(name="Unifier Checkpoint Test")
public class Application implements StreamingApplication
{
  @Override
  public void populateDAG(DAG dag, Configuration conf)
  {
    RandomNumberGenerator randomGenerator = dag.addOperator("randomGenerator", RandomNumberGenerator.class);
    ConsumerOperator cons = dag.addOperator("consumer", new ConsumerOperator());
    dag.addStream("randomData", randomGenerator.out, cons.input);
  }
}
