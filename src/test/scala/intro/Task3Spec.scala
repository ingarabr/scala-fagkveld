package intro

import org.scalatest.{FunSpec, Matchers}

/**
  * Here we will look into something awesome called pattern matching.
  * It is a switch case on steroids!
  *
  * Notes:
  * A trait is scalas answer to an interface, but of course more powerful.
  * A sealed trait is an restriction that allows only creating of sub types
  * to be done in this source file. This restriction is realy useful since
  * the compiler now can know that all expected outcome of a match expression
  * is covered.
  */
class Task3Spec extends FunSpec with Matchers {

  case class Commando(operation: String, arguments: List[String] = List())

  sealed trait Result
  case class Success(message: String) extends Result
  case object Failure extends Result

  describe("Task 3: Using pattern matching") {

    /**
      * Here you should use the match keyword to
      * pattern match on the command for a given
      * keyword. Return Success if we have a match
      * or Failure if no match found.
      */
    ignore("Matching one operation") {
      val cmd = Commando("list")

      val result: Result = cmd match {
        case _ => Failure
      }

      result should be theSameInstanceAs Success
    }

    /**
      * We can also match on lists.
      * A list can be constructed the following way:
      * - List("1", "2", "3")
      * - "1" :: "2" :: "3" :: Nil
      *
      * Use the last way and create a matcher that matches
      * on the following patterns:
      * - A empty list. Return Success("Empty")
      * - a list with the first element is "1". return Success("One")
      *
      */
    ignore("Matching on lists") {
      val cmd = Commando("load", List("1"))

      def matchOn(cmd: Commando): Result = cmd match {
        case _ => Failure
      }

      matchOn(Commando("load", List())) should be(Success("Empty"))
      matchOn(Commando("load", List("1"))) should be(Success("One"))
      matchOn(Commando("load", List("1", "2"))) should be(Success("One"))
      matchOn(Commando("load", List("2"))) should be(Failure)
    }
  }
}
