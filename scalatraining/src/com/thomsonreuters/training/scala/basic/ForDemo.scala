package com.thomsonreuters.training.scala.basic

class State(val code: String, val desc: String, val location: Symbol) {
  override def toString = desc
}

object ForDemo extends Application {
  val states = List(new State("DC", "District of Columbia", 'east),
    new State("VA", "Virginia", 'east),
    new State("MD", "Maryland", 'east),
    new State("CA", "California", 'west),
    new State("OK", "Oklahoma", 'midwest),
    new State("NE", "Nebraska", 'midwest),
    new State("AL", "Alabama", 'south))

  val noEastCoast =
    for (state <- states if state.location != 'east || state.code == "DC")
      yield state

  println(noEastCoast)

  val noEastCoast2 =
    for { state <- states if state.location != 'east || state.code == "DC" }
      yield state

  println(noEastCoast2)
}