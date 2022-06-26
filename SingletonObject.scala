
object SingletonObject {    //here instead of defining class we have defined as object

  object singleObject{
    val a = 10
    val b = 20

    def sum():Int=a+b
  }

  def main(args: Array[String]): Unit = {
    val a = 20                //here we don't define new keyword because it is already a object so we cannot create object of object
    println(singleObject.a)   //accessing variable by the objectName.variableName
    println(a)
    println(singleObject.sum())

  }

}
