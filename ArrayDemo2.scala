object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
  var marks = Array(11,46,46,73,89,54,76,23,90)
    var markswith10plus = marks.map(x=> x+10)
    markswith10plus.foreach(println)
  var avg = 0
  var total = 0

    for(i <- 0 to marks.length-1){
      total = total + marks(i)
    }
//  for(x<-marks){
//    total = total + x
//  }
    println("total marks is " +total)
    println("average marks is "+ total/marks.length)


  }
}
