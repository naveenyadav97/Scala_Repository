object AnonymousFunction3 {
  def main(args: Array[String]): Unit = {
    var listOfNumbers = List(1,2,3,4,5,6,7,8,9,10)
    //var squareOfNumbers = listOfNumbers.map(x=> x*x)
    listOfNumbers.foreach(x=> println("The square of " +x+ " is "+(x*x)))
  }
}
