package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import scala.collection.mutable.ArrayBuffer

@RunWith(classOf[JUnitRunner])
class TraitTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    it("should run") {
      abstract class IntQueue {
        def get(): Int
        def put(x: Int)
      }
      class BasicIntQueue extends IntQueue {
        private val buf = new ArrayBuffer[Int]
        def get() = buf.remove(0)
        def put(x: Int) { buf += x }
      }

      trait Filtering extends IntQueue {
        abstract override def put(x: Int) { if (x >= 0) super.put(x) }
      }
      trait Incrementing extends IntQueue {
        abstract override def put(x: Int) { super.put(x + 1) }
      }
      val ifq = (new BasicIntQueue with Incrementing with Filtering)

      ifq.put(-1);
      println(ifq);

      abstract class Strategy[T] {
    	  def pr(v:T):T;
      }

      implicit object AStrategy extends Strategy[java.lang.String] {
    	  def pr(v:java.lang.String):java.lang.String = {
    	    return v.reverse;
    	  }
      }

      def dd[T](item: T)(implicit drink:Strategy[T]) {
    	  println(drink.pr(item))
      }

      dd("aaabbb")
    }
  }
}