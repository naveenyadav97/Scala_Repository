class companionClass{   //in this object name and class name are same
  var x = 5
  def getValue()={
    println(s"Value of x is ${x} and value of y is : ${companionClass.y}" ) //here we are accessing y with objectName
  }
}
object companionClass {
  val y = 3.5

  def main(args: Array[String]): Unit = {
    val objectForClass = new companionClass()
    println(s"value of x retrieved from companion class object is ${objectForClass.x}") //here we are accessing x with object name
    println(s"value of y retrieved from companion object is ${y}")
    objectForClass.getValue()
  }
}
