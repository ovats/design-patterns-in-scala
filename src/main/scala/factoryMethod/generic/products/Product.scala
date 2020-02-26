package factoryMethod.generic.products

// Trait or abstract class
trait Product {

  // this operations are implemented in this class and
  // used in subclasses

  def someOperationAForAllProduct() = {
    // some implementation code here
  }

  def someOperationBForAllProduct(){
    // some implementation code here
  }

  def someOperationCForAllProduct(){
    // some implementation code here
  }

}

object ProductType extends Enumeration {
  type ProductType = Value
  val PRODUCT_A, PRODUCT_B, PRODUCT_C = Value
}

