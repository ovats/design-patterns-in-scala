package factoryMethod.examples.pizzaRestaurant.products

// Pizza it's the supertype of all products, in this case Pizzas
// All the methods are abstracts

abstract class Pizza (val price: Double){

  def makeDough() = {
    // some implementation here
  }

  def rollDough() = {
    // some implementation here
  }

  def bake() = {
    // some implementation here
  }

  def addSauce() = {
    // some implementation here
  }

  def addTopings() = {
    // some implementation here
  }

  def cutInSlices() = {
    // some implementation here
  }

}

object PizzaType extends Enumeration {
  type PizzaType = Value
  val FOUR_CHEESE, PEPPERONI, SPINACH_TOMATO = Value
}
