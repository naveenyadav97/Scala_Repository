import scala.annotation.tailrec

object HCF{
  @tailrec
  def HighestFactor(x:Int,y:Int):Int={
    if(y==0)x
    else(HighestFactor(y, y%x))
  }
  def main(args: Array[String]): Unit = {
    println(HighestFactor(12,18))
  }
}