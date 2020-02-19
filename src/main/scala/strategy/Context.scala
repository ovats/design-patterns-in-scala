package strategy

import strategy.Context.Strategy


class Context (computer: Strategy) {
  def use(a: Int, b: Int): Int = { computer(a, b) }
}

object Context {
  type Strategy = (Int, Int) => Int
}

object Strategies {
  val add: Strategy = _ + _
  val multiply: Strategy = _ * _
}