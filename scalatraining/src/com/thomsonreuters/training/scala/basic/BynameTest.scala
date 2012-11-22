package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class BynameTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    var c = new ChecksumAccumulator();
    it("should run") {
      def d: Boolean = {
        return false;
      }
      var a = true;
      def mya(test: => Boolean): Boolean =
        return !test;
      println(mya(mya(d)))
      println(mya(mya(mya(d))))
    }
  }
}