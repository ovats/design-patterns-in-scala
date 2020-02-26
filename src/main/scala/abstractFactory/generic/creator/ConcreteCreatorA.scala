package abstractFactory.generic.creator

import abstractFactory.generic.products.Product
import abstractFactory.generic.products.ConcreteProductA

class ConcreteCreatorA extends Creator {

  override def createProduct(): Product = {
    new ConcreteProductA()
  }

}
