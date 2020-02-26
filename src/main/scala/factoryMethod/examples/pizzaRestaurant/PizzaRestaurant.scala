package factoryMethod.examples.pizzaRestaurant

import factoryMethod.examples.pizzaRestaurant.products.{Pizza, PizzaType}
import factoryMethod.examples.pizzaRestaurant.create.PizzaFactory

class PizzaRestaurant extends App {

  def main() = {

    // we're going to create new pizzas using the factory method

    val pizzaPepperoni:Pizza = PizzaFactory.createPizza(PizzaType.PEPPERONI)

    val pizza4Cheese:Pizza = PizzaFactory.createPizza(PizzaType.FOUR_CHEESE)

  }

}
