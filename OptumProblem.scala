object OptumProblem {
  def main(args: Array[String]): Unit = {

    val str = "Naveen"
    var rev_str = ""
    for (i <- (0 to str.length-1).reverse){
      rev_str += str.charAt(i)

    }
    println(rev_str)
  }

  //var fib_series: Array[Int] = Array(0)
  var a:Int =0
  var b:Int = 1
  for(i <- 0 to 10){
    print(a + ",")
    var c = a+b
    a = b
    b = c

  }


}
