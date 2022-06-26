object callByFunctionName {
  def main(args: Array[String]): Unit = {
    printValue(add())
    printValue(sub())
  }
def printValue(m:Int)={
  println("The incremented value is " +m)
}

  def add(): Int = {
    var y = 3
    println("Value before increment " + y)
    var z = y + 1
    println("Value after increment " + z)
    z
  }
  def sub():Int={
    var y = 3
    println("Value before decrement "+y)
    var z = y-1
    println("Value after decrement "+z)
    z
  }
}
