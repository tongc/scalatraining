package com.thomsonreuters.training.scala.basic
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class ParallelCollectionTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    it("should run") {
    	var s = Set(1,2,3,4,5).par
    	for(i<-s) {
    	  print(i);
    	}
    }
  }
}