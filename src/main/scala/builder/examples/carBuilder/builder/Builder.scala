package builder.examples.carBuilder.builder

import builder.examples.carBuilder.builder.CarType.CarType
import builder.examples.carBuilder.components.{Engine, GPSNavigator, Transmission}

object CarType extends Enumeration {
  type CarType = Value
  val CITY_CAR, SPORT_CAR, SUV = Value
}

abstract class Builder (val carType: Option[CarType] = None,
                        val seats: Option[Int] = None,
                        val engine: Option[Engine] = None,
                        val transmission: Option[Transmission] = None,
                        val gpsNavigator: Option[GPSNavigator] = None)  {

}
