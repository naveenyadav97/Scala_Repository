object fibonocciSeries extends App{
  def fiboFunction(n:Int): Int ={
    if(n<=2) 1
    else fiboFunction(n-1) + fiboFunction(n-2)
  }
 println(fiboFunction(5))
}
