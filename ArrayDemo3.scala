object ArrayDemo3 {
  def main(args: Array[String]): Unit = {
   var marks = Array(34,56,23,76,23,67,26,87,56,78,56,78,34,87)
    var marks2 = Array(10,20,30)
    var concatMarks = marks.concat(marks2)
    var totalMarks = marks.reduceLeft(_+_)    //we can use reduceRight also instead of leftReduce
    var avgMarks = marks.reduceLeft(_/2 +_/2)
    var minMark = marks.reduceLeft(_ min _)
    var maxMark = marks.reduceLeft(_ max _)
    println(totalMarks)
    println(avgMarks)
    println(minMark)
    println(maxMark)
    concatMarks.foreach(println)

  }
}
