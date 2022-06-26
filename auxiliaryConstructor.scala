object auxiliaryConstructor {
class auxConst(val x: Int, val y:Double , val z:String){

  println("The value of x is "+x+ " ,value of y is "+y+ " and value of z " +z)

  def sum():Unit= {
    println(x + y)
  }

  def this(){
    this(10,11.5,"Naveen")
    println("We are in auxiliary constructor with 0 parameter")
  }
  def this(x:Int){
   this(x,12.5,"Muthu")
   println("We are in auxiliary constructor with 1 parameter")
  }

  def this(x:Int, y:Double){
    this(x,y,"Vipin")
    println("We are in auxiliary constructor with 2 parameter")
  }
}
  def main(args: Array[String]): Unit = {
  val object1 = new auxConst()
  object1.sum()

  }
}
