package factoryMethod.examples.pizzaRestaurant.create

import factoryMethod.examples.pizzaRestaurant.products.{FourCheesePizza, PepperoniPizza, Pizza, PizzaType, SpinachTomatoPizza}
import factoryMethod.examples.pizzaRestaurant.products.PizzaType.PizzaType

// Instead of using a class for the factory method,
// we are using an static factory method, which
// in Scala is using an object.

object PizzaFactory {

  def createPizza (pizzaType: PizzaType): Pizza = pizzaType match {
    case PizzaType.FOUR_CHEESE => new FourCheesePizza(10)
    case PizzaType.PEPPERONI => new PepperoniPizza(11)
    case PizzaType.SPINACH_TOMATO => new SpinachTomatoPizza(12)
  }

}
