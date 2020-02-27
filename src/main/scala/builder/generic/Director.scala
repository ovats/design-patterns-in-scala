package builder.generic

import builder.generic.builders.Builder

/**
 * Methods "make" builds different products, also each concrete builder makes different representation of
 * the same object.
 */

class Director {

  def makeA(builder: Builder) = {
    System.out.println("Director, making product A")
    builder.reset()
    builder.buildStepA()
    builder.buildStepZ()
  }

  def makeB(builder: Builder) = {
    System.out.println("Director, making product B")
    builder.reset()
    builder.buildStepB()
    builder.buildStepZ()
  }

}
