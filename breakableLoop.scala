import scala.util.control.Breaks   //we need to import this package for break statement
object breakableLoop {
  def main(args: Array[String]): Unit = {
    val breakObject = new Breaks  //for using break we need to first create object of Breaks type
    breakObject.breakable{    //put your loop inside breakable
     for(i <- 1 to 10){
       if(i==5){
         println("executing Break statement")
         breakObject.break() }
       else println(i)
         }
       }

    }
    }

