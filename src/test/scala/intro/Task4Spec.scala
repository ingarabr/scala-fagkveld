package intro

import org.scalatest.{Matchers, FunSpec}

class Task4Spec extends FunSpec with Matchers {

  describe("Task 4: Basis FP") {

    ignore("Filtering on a collection on odd numbers") {
      val list = List(1, 2, 3, 4, 5, 6 ,7 ,8, 9, 10)

      val listWithOddNumbers: List[Int] =  ???

      listWithOddNumbers should be (1 :: 3 :: 5 :: 7 :: 9 :: Nil)
    }

    ignore("Transform: String -> Int") {
      val list = List("1", "2", "3")
      val listOfInts: List[Int] = ???

      listOfInts should be (1 :: 2 :: 3 :: Nil)
    }

    ignore("Find the names of persons with age between 25 and 36 ") {
      case class Person(name: String, age: Int)

      val persons:List[Person] = List(
        Person("John", 36),
        Person("Kari", 31),
        Person("Per", 21),
        Person("Barbra", 25)
      )

      val names: List[String] = ???

      names should be ("Kari" :: "Barbra" :: Nil)
    }
  }
}
