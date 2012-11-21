package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class ChecksumAccumulatorTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    var c = new ChecksumAccumulator();
    it("should run") {
    	println(c.checksum());
    }
  }
}