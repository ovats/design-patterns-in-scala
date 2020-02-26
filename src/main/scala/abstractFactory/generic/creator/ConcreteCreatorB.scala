package abstractFactory.generic.creator

import abstractFactory.generic.products.Product
import abstractFactory.generic.products.ConcreteProductB

class ConcreteCreatorB extends Creator {

  override def createProduct(): Product = {
    new ConcreteProductB()
  }

}
