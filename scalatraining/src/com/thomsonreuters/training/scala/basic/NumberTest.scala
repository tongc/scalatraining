package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import Itr._

@RunWith(classOf[JUnitRunner])
class NumberTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    var c = new Number(5);
    it("should run") {
    	println(new Number(5) + new Number(6));
    	println(new Number(5) +++ new Number(6));
    	println(5 + new Number(10));
    	println(6,6 +++ new Number(10));
    	println(intToNumber2(6,6) +++ new Number(10));
    	println(intToNumber3(6,6) +++ new Number(10));
    }
  }
}