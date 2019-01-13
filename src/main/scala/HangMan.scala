import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import scala.io.Source

object HangMan extends App {

  def getWord():String = {
    val random = new Random
    val wordArray = Source.fromFile("/Users/Admin/Documents/DijanR/scala/enable1.txt").getLines.toArray
    val word = wordArray(random.nextInt(wordArray.length))
    word
  }

  var word = getWord()
  println(s"Please guess the following word")
  var arraya = ArrayBuffer[String]()
  for (i <- 0 until word.length) {
    arraya += "_ "
  }
  println(arraya)
  println(("\n")*4)
  guess()

  def guess(word:String=word): String ={
    var letter = readLine("Insert your letter: ")
    printer(word,letter)
    letter
  }

 def printer(word:String=word, letter:String=guess()){
   var correct = false
    for (i <- 0 until word.length) {
      if (word.substring(i,i+1) == letter){
        arraya(i) = letter
      correct = true}
    }
    print(arraya)
   attempts(correct, word)
  }
  def attempts(correct:Boolean, word:String): Unit = {
    var count = 5
    if (!correct){
      (count=count-1)
      if (count > 0) {
      println(s"You have $count more attempts")
      count
    } else {
      println(s"Sorry you have lost the game. The word was $word")
      sys.exit()
    }}

    guess()
  }


}


