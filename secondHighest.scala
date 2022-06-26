object secondHighest {

  def main(args: Array[String]): Unit = {

    val numbers = Array(12,34,65,23,56,34)
    var numbers1 = numbers.sorted
    println(numbers1(numbers1.length-2))
    var large1 = 0
    var large2 = 0
    var count = 0

    large1 = numbers(0)

    while(count < numbers.length){

      if(large1 < numbers(count)){
        large2 = large1
        large1 = numbers(count)

      }
      else if(large2 < numbers(count)){
        large2 = numbers(count)

      }
     count = count+1
    }
    println("The second highest number is " +large2)

  }



}
