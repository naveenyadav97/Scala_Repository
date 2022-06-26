object traitsDemo2 {
  trait  fourWheeler {
    def engine() = {
      println("engine is 1000cc")
    }
    def tyres()={
      println("This car is four tubeless tyres")
    }
  }
  trait car{
    def break()
    def tyres()={
      println("this car is having 4 tyres")
    }
  }                                   //here which traits or class extended at last those methods only be executed if use super() keyword.
  class mercedes extends car with fourWheeler {  //for extending the class. unimplemented method will be implemented here.
    def break()={
      println("disk brakes")
    }

    override def tyres(): Unit = super.tyres() //if we dont want to override the method instead of that we want to use those class method
                                              //which was extended at last then we can use super keyword.
  }
  def main(args: Array[String]): Unit = {
  val m1 = new mercedes
  m1.tyres()
  m1.break()
  m1.engine()

  }
}
