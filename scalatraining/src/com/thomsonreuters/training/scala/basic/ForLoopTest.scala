package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import scala.collection.immutable.HashSet
import java.io.File

@RunWith(classOf[JUnitRunner])
class ForLoopTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    it("should run") {
      val forLineLengths =
        for {
          file <- (new java.io.File("c:/")).listFiles
          if file.getName.endsWith(".css")
          mymy = file.getAbsoluteFile().getName()
          //line <- fileLines(file)
          //trimmed = line.trim
          //if trimmed.matches(".*for.*")
        } yield mymy
        println(forLineLengths)
    }
  }
}