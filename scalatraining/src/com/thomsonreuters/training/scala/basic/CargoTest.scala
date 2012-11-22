package com.thomsonreuters.training.scala.basic

class CargoTest {
	abstract class RollingStock {
		def name:String

	}

	abstract class Car extends RollingStock {
		def carries:String
	}

	abstract class Engine extends RollingStock {
		def maxCars:Int
	}

	class PassengerCar extends Car {
		override val name = "Passenger car";
		override val carries = "People"
	}

	class DiselEngine extends Engine {
		def name:String = {
			return "test";
		}
		def maxCars:Int = {
			return 5;
		}
	}
}