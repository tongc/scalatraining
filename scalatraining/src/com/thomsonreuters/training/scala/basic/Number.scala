package com.thomsonreuters.training.scala.basic

class Number (n:Int) {
	var num = n;
	def + (b:Number):Int = {
		return num + b.num;
	}

	def +++ (b:Number):Number = {
	  return new Number(num + b.num)
	}

	override def toString():String = {
	  return num.toString();
	}
}