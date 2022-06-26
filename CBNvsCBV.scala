object CBNvsCBV extends App{
  def callByValue(n:Long):Unit = {
    println("call by value " +n )
    println("call by value " +n )
  }
  def callByName(n : => Long):Unit={
    println("call by name " +n )
    println("call by name " +n )
  }
  callByValue(System.nanoTime())    //in this value of this will be passed in the function
  callByName(System.nanoTime())     //in this directly system.nanoTime will be passed in the function
}
