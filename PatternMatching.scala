object PatternMatching extends App{
  val integerValue = 55
  val order1 = integerValue match {
    case 1 => "first"
    case 3 => "Third"
    case _ => integerValue + "th"

  }
  case class person(name:String, age :Int)
  val bob = person("Naveen", 26)
  val bob1 = bob match {
    case person(n,a) => s"My name is $n and I am $a years old"  //here we are matching only the strcuture instead of string or int value
    case _ => "Something else" //pattern matching always executes in sequence it we would have written this line first then always output will come as "Something else"
  }

  val aTuple = ("Naveen", "Yadav")
  val FullName = aTuple match {
    case (fname, lname) => s"My full name is $fname $lname"     //here only we are matching the structure instead of string or int value
  }
val aList = List(1,2,3,4)
val headneeded = aList match {
  case 1::tail => s"here only head ${aList.head} was required"
}

val only2needed = aList match {
  case List(_,_,3,somethingElse) => s"here only 3 was required , so the 4th element is $somethingElse"
}

  val headNtail = aList match {
    case Nil => "empty list"
    case head :: tail => s"Head is $head and tail is $tail"
  }

  val dontCareAboutRest = aList match {
    case List(_,2,_*) => s"I care only about the second number ${aList(1)} rest is not required"
  }

  val mustEndWith = aList match {
    case List(1,2,_*) :+4 => s"last number of the list is matching i.e. ${aList(3)}"
  }                           //here the length of the list is doesnt matter it should start with 1,2 and end with 4.

  println(bob1)
  println(order1)
  println(FullName)
  println(headneeded)
  println(only2needed)
  println(headNtail)
  println(dontCareAboutRest)
  println(mustEndWith)
}
