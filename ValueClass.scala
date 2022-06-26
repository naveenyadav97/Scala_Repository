//value class can not allocate run time object
//value class always has only 1 parameter with type as val
//you can not extend the value class.
//value class cannot extend a trait that's why you have universal trait
trait Car extends Any{ //for creating a universal trait it needs to extends Any
  def print()= {println(this)}
}
class mercedes(val x:Int) extends AnyVal with Car {  //here in value class has only one parameter of type val. It should extend AnyVal and universal trait
//  val a =1  //you cannot declare any variable inside the value class
  def hello()={   //you can only define a methods
    println("Hello")
  }
}
object ValueClass {
  def main(args: Array[String]): Unit = {
  val m1 = new mercedes(5)
  m1.print()
  m1.hello()
  }

}
