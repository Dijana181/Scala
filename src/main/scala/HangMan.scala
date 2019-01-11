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
  println("_ "*(word.length))
  println(("\n")*4)

  guess()

  def guess(word:String=word): Unit ={
    var letter = readLine("Insert your letter: ")
    correctLetter(word,letter)
  }

  def correctLetter (letter:String, word:String): Unit = {
    var correctLetters = " "
    for (i <- 0 until word.length) {
      if (word.substring(i, i + 1) == letter) {
        correctLetters += letter
      }
    }
      printer(correctLetters, word)
  }

  def printer(letters:String, word:String):Unit= {
    var correct = false
    for(i <- 0 until letters.length; j<- 0 until word.length){
      if(letters.substring(i,i+1) == word.substring(j,j+1)){
        print(letters.substring(i,i+1))
        print(" ")
        correct = true
      }
      else{
        print("_ ")
      }
    }
    println("")
    attempts(correct,word)
  }

  def attempts(correct:Boolean, word:String): Unit = {
    var count = 5
    if (!correct) (count=count- 1)

    if (count > 1) {
      println(s"You have $count more attempts")
      count
    }
    else {
      println(s"Sorry you have lost the game. The word was $word")
      sys.exit()
    }
    guess()
  }


}
