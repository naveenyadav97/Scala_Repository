object coforgeQue {
  def main(args: Array[String]): Unit = {
    val array1 = Array(1, 2, 3, 4, 5, 6)
    var n = 0
    for (i <- 1 to 7 by 1) {
      for (j <- 0 to 3 by 1) {
        if(n==6){
          n = 0 }
          print(array1(n) + "," + " ")
          n = n + 1


      }
      println("\n")

    }
  }
}
