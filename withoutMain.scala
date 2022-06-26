object withoutMain extends App{

  class Animal{
    val age = 5
    def eat()= println("I'm eating")
  }

//  class Dog(name:String)
//  val eDog = new Dog
//  eDog.name         //here parameter name cant be used as fields

  class Dog(val name:String) extends Animal
  val eDog = new Dog("Lassie")
  println(eDog.name)     //constructor arguments are not fields: need to put a val before the constructor argument.

  val aDeclaredAnimal:Animal = new Dog("Hatchi")
   aDeclaredAnimal.eat()    //the most derived method will be called at runtime

  trait Carnivore{
    def eat(animal: Animal):Unit
  }
  class Crocodile extends Animal with Carnivore{
    override def eat(animal: Animal): Unit = println(s"Im eating you $animal")
  }
  val aCroc = new Crocodile
  aCroc.eat(eDog)
}
