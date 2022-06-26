object stringDemo {

  def main(args: Array[String]): Unit = {

    val greetings = "Hello World"
    println(greetings)
    val greetingNew = "Hello India"
    println(greetingNew)
    val lengthOfString = greetings.length()  //for getting the length of the string
    println("Length of the string is " +lengthOfString)
    var var1 = "Hello"
    var var2 = "World"

    println(var1+var2) //for concatenation
    println(var1.concat(var2))  //another way of concatenation

    println(var1 == var2)  //it will return true if both strings are same
    println(var1.equals(var2))  //another way of doing same thing

    var nameOfCar = "Mercedes"
    var cost = 50000
    var mileage = 8.5

    printf("The name of the car is %s and cost of the car is %d and mileage is %f",nameOfCar,cost,mileage)
    //here printf is used because, %d=int %f=float %s=string

  }

}
