import scala.io.Source
import scala.collection.mutable.ArrayBuffer

object BrokenKeyboard extends App {

  def getWord(readlines:String) {
    var ArrayofWords = Source.fromFile("/Users/Admin/Documents/DijanR/scala/enable1.txt").getLines.toArray
  }

  def anagram (letters:String): Unit = {
    var readlines = "abcd"
    var count: Int = 0
    val keyboards = ArrayBuffer[String]()

      for (i <- 0 until letters.length; j <- 0 until readlines.length) {
        if (letters.substring(i, i + 1) == readlines.substring(j, j + 1)) count += 1
      }
      if (count == readlines.length) {
        keyboards.append(readlines)
      }
      println(keyboards.sortBy(_.length).last)
    }
  anagram("abcd")
}





