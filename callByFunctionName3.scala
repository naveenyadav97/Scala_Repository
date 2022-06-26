object callByFunctionName3 {
  def main(args: Array[String]): Unit = {
    println(calculator(add,2,5))
    println(calculator(sub,2,5))
    println(calculator(mul,2,5))
    println(calculator(div,10,2))
    println(calculator(rem,10,5))
  }
def calculator(m:(Int,Int)=>Int,x:Int,y:Int): Int ={
  m(x,y)
}
  var add = (x:Int, y:Int)=> x+y
  var sub = (x:Int, y:Int)=> x-y
  var mul = (x:Int, y:Int)=> x*y
  var div = (x:Int, y:Int)=> x/y
  var rem = (x:Int, y:Int)=> x%y
}
