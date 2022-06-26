import Array._
object multiDimArray {
  def main(args: Array[String]): Unit = {
    var matrixEx = ofDim[Int](3,3)
    for(row <- 0 to 2){
      for(column <- 0 to 2){
        matrixEx(row)(column) = column+3
      }
    }
    for(row <- 0 to 2){
      for(column <- 0 to 2){
        print(matrixEx(row)(column))
        print(" ")
      }
      print("\n")
    }
  }

}
