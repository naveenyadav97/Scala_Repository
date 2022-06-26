import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var array1 = new Array[Int](5)
    array1(0) =9
    array1(1) =10
    array1(2) =1
    array1(3) =8
    array1(4) =6
    array1.foreach(x => println(x ))
  }

}
