object callByFunctionName2 {
  def main(args: Array[String]): Unit = {
    printValue(add,2)
    printValue(sub,2)
  }
  def printValue(m:(Int)=>Int,x:Int)={
  println("Incremnented value is "+m(x))
  }
  def add(x:Int):Int={
    x+1
  }
  def sub(x:Int):Int={
    x-1
  }
}
