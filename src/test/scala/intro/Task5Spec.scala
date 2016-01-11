package intro

import org.scalatest.{FunSpec, Matchers}

/**
  * Now we will look at how we can create an API where we can
  * use functions as parameters. If we look at the regular
  * parameter argument:
  *
  * def doSomething(aValue: Int): Int = ???
  *
  * and add an arrow with another type to at the end, like this:
  *
  * def doSomething(aFunction: Int => Int): Int = ???
  *
  * now we can call the function with one Int argument.
  */
class Task5Spec extends FunSpec with Matchers {

  case class Employee(name: String, available: Double)

  case class ProjectEstimates(taskEstimate: List[Int], persons: List[Employee]) {
    def estimate(): Int = ???
  }


  /**
    * Start with creating fishing up the function above. In this task you should
    * take in an higher order function to modify the result of the estimation model.
    * We will implement two models, best and worst estimate. The estimation
    * model is different from project to project so we can't have it in the domain
    * classes above.
    */
  describe("Task 5: Higher order functions") {

    val projectEstimates = ProjectEstimates(
      List(5, 8, 3, 21, 21, 8, 1, 3, 3, 5, 5), List(
        Employee("Per", 0.7),
        Employee("Kari", 0.8),
        Employee("Tore", 0.6),
        Employee("Mari", 0.2)))

    ignore("model for best estimate") {
      val estimate = projectEstimates.estimate()

      estimate should be > 0
    }

    ignore("model for worst estimate") {
      // now you can enough scala to implement this yourself!
    }

    /**
      * The estimates we have is relative and might change from team to team. The
      * teams have been working some time together so we're able to calculate
      * the approximately time used with modifying the estimate with a factor.
      *
      * Modify the estimate function to have a default modifier on 1 that can
      * be change in the test below. Note, you should not do any changes to the
      * API for the existing tests above.
      */
    ignore("model that convert the estimate to hours") {
      // now you can enough scala to implement this yourself!
    }
  }
}
