object patternMatchin2 {
  case class carName(name:String, cost :Int)
  def main(args: Array[String]): Unit = {
    val mercedes = new carName("Mercedes", 50000)
    val bmw = new carName("BMW", 70000)
    val jaguar = new carName("Jaguar", 80000)

    for(car <- List(mercedes,bmw,jaguar)) {
      car match {
        case carName("Mercedes", 50000) => println("Car is Mercedes, Congrats!!!")
        case carName("BMW", 70000) => println("Car is BMW, wao!!")
        case carName(name, cost) => println("Car is " + name + " the cost is " + cost + "that's awesome") //regex is used with case class also
      }
    }
  }

}
