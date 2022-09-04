package com.rockthejvm

object ObjectOrientation extends App {

  // class and instance
  class Animal {
    //define fields and methods
    val age: Int = 0

    def eat(): Unit = println(s"Animal is $age years old")
  }

  val anAnimal = new Animal
  anAnimal.eat()

  //inheritance
  class Dog(val name: String) extends Animal {
    override val age: Int = 10

    override def eat(): Unit = println(s"Dog with name $name is $age years old")
  }

  // constructor arguments are NOT fields. We need to put val before the constructor name
  val aDog = new Dog("Lassie")
  println(aDog.name)
  aDog.eat()

  // polymorphism
  class Cat(val name: String) extends Animal {
    override val age: Int = 15

    override def eat(): Unit = println(s"Cat with name $name is $age years old")
  }

  val aCat: Animal = new Cat("Tom")
  aCat.eat()


}
