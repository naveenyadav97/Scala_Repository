import scala.util.matching.Regex
object regularExpression {
  def main(args: Array[String]): Unit = {
  val pattern = new Regex("(H|h)ello") //the string which you want to find
                                      //H|h means capital and small both it will consider
    val pattern1 = "Again".r   //another way of declaring pattern
  val stringToFind = "Hello how are you? hello Again"
      pattern.findFirstIn(stringToFind).getOrElse("No match found")  //this will return the string if not found it will "No match found"
      var occurance = pattern.findAllIn(stringToFind).mkString(",")
      pattern1.findFirstIn(stringToFind)
      println(occurance)

      //val pattern2 = new Regex("[0-9]+")  //it means range(0-9) and + means one or more numbers
  }

}
