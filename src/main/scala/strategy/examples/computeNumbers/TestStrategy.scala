package strategy.examples.computeNumbers

object TestStrategy extends App{

  println("Strategy using multiply:")
  val algorithmWithMultiply = new Client(Strategies.multiply)
  println(algorithmWithMultiply.executeComputation(15, 3))

  println("Strategy using add:")
  val algorithWithAdd = new Client(Strategies.add)
  println(algorithWithAdd.executeComputation(15, 3))

}
