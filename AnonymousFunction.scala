object AnonymousFunction {
  var increment = (x:Int) => x+1
  var printHelloWorld = () =>println("Hello World")
  var add = (a:Int, b:Int) => a+b
  def main(args: Array[String]): Unit = {

    println("Increment function output is " +increment(5))
    printHelloWorld()
    println("Addition of 3 and 5 is " +add(3,5))
  }

}
