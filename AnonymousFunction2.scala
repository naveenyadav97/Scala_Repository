object AnonymousFunction2 {
  def main(args: Array[String]): Unit = {
var listOfNum = List(1,2,3,4,5,6,7,8,9,10)
//    listOfNum.foreach(num =>
//                      if(num%3==0){
//                        println(num+ " is divisible by three")
//                      }
//                      else{
//                        println(num + " is not divisible by three ")
//                      })
//def divisbleByThree(x:Int)={
//  x%3==0
//}
//    var divisibleByThree = (x:Int) => x%3==0


//     listOfNum.foreach(num => if (divisibleByThree(num)) println(num))
 var divisibleByThree = listOfNum.filter(x => x%  3==0)
    divisibleByThree.foreach(println)
  }
}
