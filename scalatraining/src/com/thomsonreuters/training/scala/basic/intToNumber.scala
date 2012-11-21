package com.thomsonreuters.training.scala.basic

object Itr {
	implicit def intToNumber(x: Int) = new Number(x)

	implicit def intToNumber2(x: Int, y:Int) = new Number(x + y)

	def intToNumber3(x:Int, y:Int) = new Number(x +y)
}