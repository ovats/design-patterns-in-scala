package factoryMethod.examples.animals

// This is the Product hierarchy
trait Animal {
}
class Dog extends Animal
class Cat extends Animal

// This is the factory method
// This is like a static method because it's on a Scala's object
object Animal {
  def apply (animalType: String): Animal = animalType match {
    case "Dog" => new Dog
    case "Cat" => new Cat
  }
}
