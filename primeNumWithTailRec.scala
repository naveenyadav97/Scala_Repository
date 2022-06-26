import scala.jdk.Accumulator

object primeNumWithTailRec extends App{
def isPrime(n:Int):Boolean={
  def isPrimeHelper(t:Int, isStillPrime:Boolean):Boolean={
    if (!isStillPrime) false
    else if(t<=1) true
    else isPrimeHelper(t-1, n%t !=0 && isStillPrime)
  }
  isPrimeHelper(n/2,true)
}
  println(isPrime(37))
}
