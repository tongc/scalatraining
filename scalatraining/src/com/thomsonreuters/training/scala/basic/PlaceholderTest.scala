package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import scala.collection.immutable.HashSet

@RunWith(classOf[JUnitRunner])
class PlaceholderTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    it("should run") {
    	def sum(a:Int, b:Int):Int = {a+b}
    	val c = sum _
    	print(c(1,2));
    }
  }
}