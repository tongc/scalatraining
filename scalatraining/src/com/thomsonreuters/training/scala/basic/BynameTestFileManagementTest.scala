package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import java.io.PrintWriter
import java.io.File

@RunWith(classOf[JUnitRunner])
class BynameFileManagementTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    var c = new ChecksumAccumulator();
    it("should run") {
      def fileo: String = {
        scala.io.Source.fromFile(new java.io.File("c:/utils/temp/settings.xml")).mkString
      }
      var a = true;
      def mya(fileop: => String): String =
        return fileop;
      println(mya(fileo))
    }

    it("should run2") {
      def withPrintWriter(file: File)(op: PrintWriter => Unit) {
        val writer = new PrintWriter(file)
        try {
          op(writer)
        } finally {
          writer.close()
        }
      }

      val file = new File("c:/utils/temp/settings.xml")
      withPrintWriter(file) { writer =>
        writer.println(new java.util.Date)
      }
    }

    it("should run3") {
      def withPrintWriter(file: File)(name: => String)(op: PrintWriter => Unit) {
        val writer = new PrintWriter(file + name)
        try {
          op(writer)
        } finally {
          writer.close()
        }
      }

      val file = new File("c:/utils/temp/")
      withPrintWriter(file){"settings.xml"} { writer =>
        writer.println(new java.util.Date)
      }
    }

    it("should run4") {
      def withPrintWriter(file: File, name: String)(op: PrintWriter => Unit) {
        val writer = new PrintWriter(file + name)
        try {
          op(writer)
        } finally {
          writer.close()
        }
      }

      val file = new File("c:/utils/temp/")
      withPrintWriter(file, "settings.xml") {writer =>
        writer.println(new java.util.Date)
      }
    }
  }
}