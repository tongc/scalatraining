package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class HelloWorldTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    var helloWorld = new HelloWorldImpl with HelloWorld;
    it("should run") {
      helloWorld.hello() should be ("Hello World");
      helloWorld.hello() should not be ("Hello World 1");
    }
  }
}