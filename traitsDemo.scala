object traitsDemo {
  trait car{         //trait is there for multi class inheritance
   def engine() ={
     println("Engine is 1000 CC")
   }
    def break()     //it can have undefined method also but the class which inherit this method has to implement it there

    def tyres()
  }

  class mercedes extends car{
    def break()={       //trait class method are defined here, you can override method also here if you want
      println("It has disk brakes ")
    }
    def tyres()={
      println("Tubeless tyres")
    }

  }
  def main(args: Array[String]): Unit = {
    val m1  = new mercedes
    m1.break()
    m1.tyres()
    m1.engine()
  }

}
