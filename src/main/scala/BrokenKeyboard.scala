object BrokenKeyboard extends App {

  def availableKeys (letters:String): Unit ={
    for(i <- 0 to letters.length-1) letters(i)
  }

  def anagram (word:String, letters:String): Unit ={
    var count = 0
    var index = availableKeys(letters)

    for(j <- 0 to word.length-1){

      if(word.substring(j,j+1)== index){
        count = count+1
      }
      if (count == word.length){
        print("true")
      }


    }
    anagram("abcd", "abcd")


  }

  def longestWord (): Unit ={

  }

}
