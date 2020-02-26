package factoryMethod.generic

import factoryMethod.generic.create.Creator
import factoryMethod.generic.products.ProductType

object Demo extends App{

  def main() = {
    val factory = new Creator()

    val productA = factory.createProduct(ProductType.PRODUCT_A)
    val productB = factory.createProduct(ProductType.PRODUCT_B)
    val productC = factory.createProduct(ProductType.PRODUCT_C)
  }

}
