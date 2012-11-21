package com.thomsonreuters.training.scala.basic
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import scala.AnyVal

@RunWith(classOf[JUnitRunner])
class CastTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    it("should run") {
      var a: Any = Nil
      intercept[ClassCastException] {
        println(a.asInstanceOf[String])
      }
      intercept[ClassCastException] {
        var b = a match {
          case a2: String => a2
          case _ => throw new ClassCastException
        }
        println(b);
      }
    }
  }
}