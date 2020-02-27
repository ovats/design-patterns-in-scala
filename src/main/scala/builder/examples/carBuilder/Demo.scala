package builder.examples.carBuilder

import _root_.builder.examples.carBuilder.director.Director
import _root_.builder.examples.carBuilder.builder._
import _root_.builder.examples.carBuilder.components._

object Demo extends App {

//  val carBuilder = new CarBuilder(CarType.SPORT_CAR,2,new Engine(), new Transmission(), new GPSNavigator())
//  val director = new Director(carBuilder)
//  director.constructSportCar()

  val director = Director()

  val carBuilder = CarBuilder()
  director.constructSportCar(carBuilder)

  val carManualBuilder = CarBuilder()
  director.constructSportCar(carManualBuilder)
}
