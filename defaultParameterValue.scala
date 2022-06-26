import java.lang.Math.round
import scala.io.StdIn.readInt

object defaultParameterValue {
  def div(x:Int = 10,y:Int=5)={
    x/y.toFloat
  }
  def main(args: Array[String]): Unit = {
    println("Enter two numbers")
    var a = readInt()
    var b = readInt()
    println(f"The dividend is " +(div(a,b)))

  }

}
