package abstractFactory.generic.creator

import abstractFactory.generic.products.Product
// this class could be defined as trait or abstract class
trait Creator {

  def someOperation() = {
    val p: Product = createProduct()
    // some code to do operations on the product
  }

  // this method must be overridden in the subclasses
  def createProduct(): Product

}
