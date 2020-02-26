package factoryMethod.examples.animals

import factoryMethod.examples.animals.AnimalType.AnimalType

class God extends App{

  // "God" is going to create new dogs and cats using
  // a factory method

  def main() = {
    val firstDog: Animal = Animal(AnimalType.DOG)
    val firstCat: Animal = Animal(AnimalType.CAT)
  }

}
