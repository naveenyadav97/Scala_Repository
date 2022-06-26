import java.io.{FileReader,FileNotFoundException,IOException}
import java.lang.ArrayIndexOutOfBoundsException

object exceptionHandling {
  def main(args: Array[String]): Unit = {
  try{
    val f = new FileReader("C:\\Users\\000CJM744\\Documents\\Dec_Salary_Slip.pdf")
    val array1 = Array(10,12,4,4)
    println(array1(11))
  }
  catch
    {
      case e : FileNotFoundException =>
        {
          println("file not found. Exception received")
        }
      case e : IOException => {
        println("Error while reading file - Exception received")
      }
      case e : ArrayIndexOutOfBoundsException =>{
        println("Array out of Bound exception received")
      }
//      case _ : Exception =>{
//        println("It will catch all undefined exception")
//      }

    }
  finally {
    println("This block will always execute irrespective of any exception")
  }
  }
}
