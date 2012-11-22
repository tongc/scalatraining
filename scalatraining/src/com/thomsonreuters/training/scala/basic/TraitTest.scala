package com.thomsonreuters.training.scala.basic

package com.thomsonreuters.training.scala.basic

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class TraitTest extends Spec with ShouldMatchers {
  describe("Hello World") {
    it("should run") {
      abstract class IntQueue {
        def get(): Int
        def put(x: Int)
      }
      import scala.collection.mutable.ArrayBuffer
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
    }
  }
}