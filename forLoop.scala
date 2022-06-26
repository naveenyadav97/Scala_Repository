object forLoop {
  def main(args: Array[String]): Unit = {
    var newvar = for(x <- 1 until  10 if x%2==0)  yield x   //until it will print only upto 9 but if we use to then it will print upto 10
    println(newvar)         //yield creates a sequence of list, you can use again loop to print those values
    for(j<- newvar)
      {
        println(j)
      }



  }

}
