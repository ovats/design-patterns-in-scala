package strategy.examples.computeNumbers

import strategy.examples.computeNumbers.StrategyAlgorithm.StrategyAlgorithm

object StrategyAlgorithm {
  type StrategyAlgorithm = (Int, Int) => Int
}

class Client (compute: StrategyAlgorithm) {

  def executeComputation(a: Int, b: Int): Int = { compute(a, b) }

  def otherComputationA() = {
    // some implementation code goes here
  }

  def otherComputationB() = {
    // some implementation code goes here
  }

}

