case class car(name: String, model: String){
var carName = name
val carModel = model
  def printDetails(): Unit = {
    println(s"car name is : ${carName} and car Model is ${model}")
  }
}
object caseClass {
  def main(args: Array[String]): Unit = {
    val bmw = car("BMW", "500") //no need to write new keyword in case class while creating object, since "apply" method is auto generated in the case class
    bmw.printDetails()
    //bmw.carName = "B.M.W." //you can not change the name because by default constructor parameter defined as val
    bmw.carName = "B.M.W" //but like this you can change
    bmw.printDetails()

    bmw match {
      case car(a, b) => println(a, b)
    }

    val mercedes = bmw.copy(name = "Mercedes")  //it auto generates copy method. here you could have changed the model name also but then there no need to copy method.
    mercedes.printDetails()

    println(bmw==mercedes)  //autogenerates equals and hashcode method

    println(bmw)  //toString method is auto implemented. here bmw is object but it is auto converted into String.
  }
}