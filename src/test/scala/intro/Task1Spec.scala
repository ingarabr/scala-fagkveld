package intro

import org.scalatest.{FunSpec, Matchers}

/**
  * The intention of this task is to a bit familiar with how tests
  * can be written in scala and how the matchers are working.
  *
  * replace ignore with it to run the tests
  *
  * For more details se http://www.scalatest.org/user_guide/using_matchers
  */
class Task1Spec extends FunSpec with Matchers {

  describe("Task 1: Scalatest and matchers") {

    // todo: replace 'ignore' with 'it' to enable the test
    ignore("working with boolean matcher") {
      true should be(false)
    }

    ignore("working with String matchers") {
      "some text" should be("some_text")
      "some text" should contain("omee")
      "some text" should startWith("ome")
    }

    ignore("working with number matchers") {
      10 should be(11)
      10 should be > 10
      10 should be >= 11
    }

    ignore("working with list matcher") {
      List(1, 2, 3) should contain oneOf(4, 5)
      List(1, 2, 3) should contain inOrder(2, 1)
    }

  }
}
