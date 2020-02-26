package factoryMethod.examples.animals

import factoryMethod.examples.animals.AnimalType.AnimalType

object AnimalType extends Enumeration {
  type AnimalType = Value
  val DOG, CAT, MOUSE = Value
}

// This is the Product hierarchy
trait Animal {
}
class Dog extends Animal
class Cat extends Animal

// This is the factory method
// This is like a static method because it's on a Scala's object
object Animal {
  def apply (animalType: AnimalType): Animal = animalType match {
    case AnimalType.DOG => new Dog
    case AnimalType.CAT => new Cat
  }
}
