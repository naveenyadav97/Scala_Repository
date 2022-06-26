import scala.util.control.Breaks
object LastWordLength {
  def main(args: Array[String]): Unit = {

    val s = "I love scala  ".trim
    var len =0
    val breakObject = new Breaks
        breakObject.breakable{
        for(i<-(0 to s.length-1).reverse) {
         //if(s.charAt(i)==" ") {

          if (s.charAt(i).isWhitespace) {
            breakObject.break()

          }
          else
            len = len + 1

        }
        }
      println(len)
      }

}
