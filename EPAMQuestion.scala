object EPAMQuestion {
  def main(args: Array[String]): Unit = {
   val S = "bytdag"
   val A = Array(4,3,0,1,2,5)
   var newString = ""
   var nextA:Int = 0
   newString += S.charAt(nextA)
   nextA = A(nextA)
   for(i <- 1 to A.length - 1 if nextA!=0){

     newString += S.charAt(nextA)
     nextA = A(nextA)

   }
println(newString)

  }

}
