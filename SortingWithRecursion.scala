object SortingWithRecursion {
  def sortList(list:List[Int]):List[Int]={

    def insertSort(number:Int, sortedList:List[Int]):List[Int]={
      if(sortedList.isEmpty || number <= sortedList.head) number :: sortedList
      else
        sortedList.head :: insertSort(number, sortedList.tail)
    }
    if(list.isEmpty || list.tail.isEmpty) list
    else insertSort(list.head, sortList(list.tail))
  }
  def main(args: Array[String]): Unit = {
    println(sortList(List(4,3,2,1)))
  }

}
