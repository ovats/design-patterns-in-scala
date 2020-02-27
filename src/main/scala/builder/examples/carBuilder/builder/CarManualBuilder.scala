package builder.examples.carBuilder.builder

import builder.examples.carBuilder.builder.CarType.CarType
import builder.examples.carBuilder.components.{Engine, GPSNavigator, Transmission}

case class CarManualBuilder (override val carType: Option[CarType] = None,
                             override val seats: Option[Int] = None,
                             override val engine: Option[Engine] = None,
                             override val transmission: Option[Transmission] = None,
                             override val gpsNavigator: Option[GPSNavigator] = None)
  extends Builder (carType, seats, engine, transmission, gpsNavigator) {

}
