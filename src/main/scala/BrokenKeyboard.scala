import scala.io.Source
import scala.collection.mutable.ArrayBuffer

object BrokenKeyboard extends App {

  def getWords() = {
    Source.fromFile("/Users/Admin/Documents/DijanR/scala/enable1.txt").getLines.toArray
  }

  def anagram (letters:String): Unit = {
    val arrayofWords = getWords()
    var count: Int = 0
    val keyboards = ArrayBuffer[String]()

    for (word <- arrayofWords) {
      for (i <- 0 until letters.length; j <- 0 until word.length) {
        if (letters.substring(i,i+1) == word.substring(j, j+1)) count += 1
      }
      if(count == word.length){
        keyboards.append(word)
      }
      count = 0
    }
    print(s"$letters = ")
    println(keyboards.sortBy(_.length).last)
  }
  anagram("abcdefg")
}

