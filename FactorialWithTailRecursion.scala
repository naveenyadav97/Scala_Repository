import scala.jdk.Accumulator

object FactorialWithTailRecursion extends App{

  def recursionFunc(n:Int):Int={
  def helperFunc(x:Int, accumulator:Int):Int={
    if(x<=1) accumulator
    else
        helperFunc(x-1, x * accumulator)
  }
    helperFunc(n,1)
  }
  println(recursionFunc(10))
}
