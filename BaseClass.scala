
object BaseClass {
  class myclass{
   private val cost = 10   //here we have defined the variable as private

    def getCost () = println(cost)   //for accessing the private variable outside the class
  }

  def main(args: Array[String]): Unit = {
    val costing  = new myclass
    costing.getCost()   //here we are accessing the private variable with the help of method
    //costing.cost   //we can not access like this because variable was defined as a private
  }

}
