object AbstractDemo {
  abstract class vehicle{   //you can not create a object of abstract class. this class can be used for inheritance only
  }                         //abstract class can have unimplemented methods but the class which extends this class has to implement the method
  trait fourWheeler{
  }
  trait car{
    this : fourWheeler with vehicle =>{ //if you want to force this class to extend vehicle and fourWheeler class
    }
    def engine()={
      println("This car has 2000cc engine")
    }
  }
  class mercedes extends vehicle with car with fourWheeler   //here you can not extend car alone if you want to extend car then you need to extend fourWheeler and vehicle also
  def main(args: Array[String]): Unit = {
    val m1 = new mercedes
    m1.engine()
  }
}
