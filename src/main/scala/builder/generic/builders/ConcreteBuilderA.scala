package builder.generic.builders

import builder.generic.products.ProductA

/**
 * Different concrete builder could refer to same object than other concrete builder but they
 * differ in the representation.
 */

class ConcreteBuilderA extends Builder {

  private val product = new ProductA()

  override def reset(): Unit = {
    println("Concrete Builder A: reset")
  }

  override def buildStepA(): Unit = {
    println("Concrete Builder A: step A")
  }

  override def buildStepB(): Unit = {
    println("Concrete Builder A: step B")
  }

  override def buildStepZ(): Unit = {
    println("Concrete Builder A: step Z")
  }

  def getResult(): ProductA = product

}
