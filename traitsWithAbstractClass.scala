object traitsWithAbstractClass {
  abstract class vehicle{
    def category()
  }
  trait fourWheeler{
    def tyres()={
      println("four tyres are present in this vehicle")
    }
  }
  trait car{
    def engine(): Unit = {
      println("Engine is 1000cc")
    }
    def break()
    def tyres()={
      println("this car is having four tyres")
    }
  }
  class mercedes extends vehicle with car with fourWheeler {   //extend first abstract class then trait class
    def category()={
      println("It is mercedes")
    }

    override def engine(): Unit = {
      println("Mercedes car is having 2000cc engine")
    }

    override def tyres(): Unit = super.tyres()

    def break(): Unit = {
      println("disk brakes")
    }
  }

  def main(args: Array[String]): Unit = {
    val m1 = new mercedes()
    m1.tyres()
    m1.engine()
    m1.break()
    m1.category()

  }

}
