package strategy

object TestStrategy extends App{

  println("Strategy using multiply:")
  println(new Context(Strategies.multiply).use(15, 3))

  println("Strategy using add:")
  println(new Context(Strategies.add).use(15, 3))

}
