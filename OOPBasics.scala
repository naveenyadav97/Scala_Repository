object OOPBasics extends App{
class Novelwriter(fname:String, lname:String, val year:Int){

  def fullname():String = fname + " " + lname
}
class Novel(name:String, YOR:Int,author:Novelwriter){
def authorAge = YOR -author.year

  def isWrittenBy(author:Novelwriter) = author == this.author

  def copy(newYear:Int):Novel = new Novel(name, newYear, author)

}
  class counter
  val author = new Novelwriter("Naveen", "Yadav", 1997)
  val novel = new Novel("Great Expectations",2000, author)
  println(novel.authorAge)
}
