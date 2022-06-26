object constructorDemo {
  class constructClass(val x:Int, val y: Int){  //parameterized constructor
    var z = 10

    def adding():Unit={    //here x,y,z variables are known as closure
      println(x+y+z)
    }


  }
  def main(args: Array[String]): Unit = {
   val newObject = new constructClass(4, 6)  //here we are creating instance of class by passing values
    newObject.adding()

  }

}
