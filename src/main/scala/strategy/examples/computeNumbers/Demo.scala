package strategy.examples.computeNumbers

object Demo extends App{

  println("Strategy using multiply:")
  val algorithmWithMultiply = new Mathematics(Strategies.calculationMultiply)
  println(algorithmWithMultiply.makeCalculation(15, 3))

  println("Strategy using add:")
  val algorithWithAdd = new Mathematics(Strategies.calculationAdd)
  println(algorithWithAdd.makeCalculation(15, 3))

}
