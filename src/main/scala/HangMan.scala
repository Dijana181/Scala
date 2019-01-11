import scala.io.Source
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object HangMan extends App {

  def getWord():String = {
    val random = new Random
    val wordArray = Source.fromFile("/Users/Admin/Documents/DijanR/scala/enable1.txt").getLines.toArray
    val word = wordArray(random.nextInt(wordArray.length))
    word
  }



  def correctLetter (letter:String, word:String): Unit = {
    var correctLetters = ""
    for (i <- 0 until word.length) {
      if (i == letter) {
        correctLetters += letter
        attempts(true, word)
      }
      else attempts(false, word)
    }
    print(correctLetters, word)
  }

  def printer(letters:String, word:String):Unit= {
    for(i <- 0 until letters.length; j<- 0 until word.length){
      if(letters.substring(i,i+1) == word.substring(j,j+1)){
        print(letters.substring(i+i+1))
      }
      else{
        print("_")
      }
    }
  }


  def attempts(correct:Boolean, word:String): Boolean = {
    var count = 5
    if (!correct) count - 1
    if (count > 1) {
      print(s"You have $count more attempts")
      true
    }
    else {
      print(s"Sorry you have lost the game. The word was $word")
      false
    }
  }

def guess (letter:String): Unit ={
  var word = getWord()
  println(s"Please guess the following word")
  println("_ "*(word.length))

  correctLetter(letter,word)
}

  guess
}
