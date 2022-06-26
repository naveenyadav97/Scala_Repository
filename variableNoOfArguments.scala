object variableNoOfArguments {
  def printMultipleTimes(n:Int, word:String*): Unit ={  //here word can have multiple arguments because we have declared as String*
    for(i <- word){
      println(i*n)
    }
  }
  def main(args: Array[String]): Unit = {
    printMultipleTimes(3,"India","America","Japan")
  }

}
