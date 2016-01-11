package intro

import org.scalatest.{FunSpec, Matchers}

/**
  * Case classes in scala is a kind of structure class.
  * By default is embrace immutability something that is
  * good. It also implements hashCode, equals and toString
  *
  * In this task you will create a case class and learn how
  * to utilize it.
  */
class Task2Spec extends FunSpec with Matchers {

  //todo impl!
  class Person
  class Address

  describe("Task2: Case classes") {

    /**
      * Create a case class that have the following properties:
      * - name
      * - age
      */
    ignore("Creating a case class") {
      val person: Person = ???

      person.toString should include("John")
      person.toString should include("10")
    }

    /**
      * Data strutures in java can be a hasle working with
      * when you need to support hashCode, equal.
      */
    describe("Equality") {
      ignore("Two equal case classes") {
        val personOne: Person = ???
        val personTwo: Person = ???

        personOne should be(personTwo)
      }

      /**
        * Create a set with two Persons.
        * We will remove person one from the set. In java you have to implement
        * hash
        */
      ignore("Keys in a set") {
        val personOne: Person = ???
        val personEqualToPersonOne: Person = ??? // this can't be the same instance
        val personTwo: Person = ???

        val persons: Set[Person] = Set(personOne, personTwo)
        val personsWithoutPersonOne: Set[Person] = persons - personEqualToPersonOne

        personEqualToPersonOne should not be theSameInstanceAs(personOne)
        personsWithoutPersonOne should contain only personTwo
      }
    }

    /**
      * The task here is to create a new instance of the case class
      * that have some of the values changed but have to be based on
      * the first one.
      */
    ignore("Working with immutable classes") {
      val personOne: Person = ???
      val personTwo: Person = ???

      personOne should not be personTwo
    }

    /**
      * This is to show that we still can use mutation.
      * Comment inn the matchers when your have implemented the case class.
      */
    ignore("Working with mutable classes") {
      val street = "Some address"
      val address: Address = ???

//      address.street = "some other address"
//      address.street should not be street
    }

  }
}
