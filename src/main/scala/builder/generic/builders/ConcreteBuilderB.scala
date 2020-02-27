package builder.generic.builders

import builder.generic.products.ProductB

/**
 * Different concrete builder could refer to same object than other concrete builder but they
 * differ in the representation.
 */

class ConcreteBuilderB extends Builder {

  private val product = new ProductB()

  override def reset(): Unit = {
    System.out.println("Concrete Builder B: reset")
  }

  override def buildStepA(): Unit = {
    System.out.println("Concrete Builder B: step A")
  }

  override def buildStepB(): Unit = {
    System.out.println("Concrete Builder B: step B")
  }

  override def buildStepZ(): Unit = {
    System.out.println("Concrete Builder B: step Z")
  }

  def getResult(): ProductB = product
}
