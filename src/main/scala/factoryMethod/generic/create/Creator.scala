package factoryMethod.generic.create

import factoryMethod.generic.products.{ConcreteProductA, ConcreteProductB, ConcreteProductC, ProductType}
import factoryMethod.generic.products.ProductType.ProductType
import factoryMethod.generic.products.Product

// Insted of Class Creator, it's possible to use Object Creator, which
// allows to invoke the factory method as an static class in Java.
class Creator {

  def createProduct(productType: ProductType): Product = productType match {
    case ProductType.PRODUCT_A => new ConcreteProductA()
    case ProductType.PRODUCT_B => new ConcreteProductB()
    case ProductType.PRODUCT_C => new ConcreteProductC()
  }

}
