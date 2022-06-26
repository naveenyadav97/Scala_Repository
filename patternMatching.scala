object patternMatching {
    def main(args: Array[String]): Unit = {
    println(matchPattern(2))
    def matchPattern(x:Int) = x match {
      case 1 => "One"
      case 2 => "Two"
      case _ => "None of the above"
    }

    println(matchPattern1("One"))
      def matchPattern1(x:Any) = x match {
        case 1 => "One"
        case 2 => "Two"
        case "Three" => 3
        case "Four" => 4
        case _ => "None of the above"


        }
    }
}
