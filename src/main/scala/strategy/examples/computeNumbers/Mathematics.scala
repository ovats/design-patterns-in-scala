package strategy.examples.computeNumbers

import strategy.examples.computeNumbers.StrategyAlgorithmType.StrategyAlgorithmType

object StrategyAlgorithmType {
  type StrategyAlgorithmType = (Int, Int) => Int
}

class Mathematics(calculusStrategy: StrategyAlgorithmType) {

  def makeCalculation(a: Int, b: Int): Int = { calculusStrategy(a, b) }

  def otherComputationA() = {
    // some implementation code goes here
  }

  def otherComputationB() = {
    // some implementation code goes here
  }

}

