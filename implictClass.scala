
//you can define this class by using "implicit" keyword in front of class.
//if we want to reuse the existing class code and may not having the source code for overwrite.
//  when you have import some for which you are having jar file not source code then we can use implicit class.
//you can not extend class to final class.

object implictClass {
  def main(args: Array[String]): Unit = {

    implicit class stringFnClass(s:String){
      def firstChar() = s.substring(0,3)

    }
    var firstCh = new stringFnClass("Naveen")
    println(firstCh.firstChar())

  }

}
