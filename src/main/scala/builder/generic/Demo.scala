package builder.generic

import builder.generic.builders.ConcreteBuilderA
import builder.generic.products.ProductA

object Demo extends App {

  val director = new Director()
  val builderA = new ConcreteBuilderA()
  director.makeA(builderA)
  val product: ProductA = builderA.getResult()

}
