object concatStringWithTailRec extends App{
  def concatStr(name:String, n:Int, accumulator:String):String={
    if(n<=0) accumulator
    else
      concatStr(name,n-1,name+accumulator)

  }
println(concatStr("Naveen",5,""))
}
