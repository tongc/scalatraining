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
      val forLineLengths:Array[String] =
        for {
          file <- (new java.io.File("c:/utils/temp/")).listFiles
          if file.getName.endsWith(".xml")
          mymy = file.getAbsoluteFile().getName()
          line = scala.io.Source.fromFile(file).mkString
          //trimmed = line.trim
          //if trimmed.matches(".*for.*")
        } yield line
        println(forLineLengths.toList)
    }
    it("should run2") {
      val forLineLengths:Array[Char] =
        for {
          file <- (new java.io.File("c:/utils/temp/")).listFiles
          if file.getName.endsWith(".xml")
          mymy = file.getAbsoluteFile().getName()
          //iterate through the chars of giving string
          line <- scala.io.Source.fromFile(file).mkString
          //trimmed = line.trim
          //if trimmed.matches(".*for.*")
        } yield line
        println(forLineLengths.toList)
    }

  }
}