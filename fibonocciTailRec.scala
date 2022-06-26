object fibonocciTailRec extends App{
def fibonocciSeries(n:Int):Int={
def fiboTailRec(i:Int, last:Int, nextToLast:Int):Int={
  if(i>=n) last
  else fiboTailRec(i+1, last+nextToLast, last)
  }
  if(n<=2) 1
  else fiboTailRec(2,1,1)
}
  println(fibonocciSeries(8))
}
