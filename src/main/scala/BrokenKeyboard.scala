object BrokenKeyboard extends App {

  def getWord() {
    // val source = io.Source.fromFile("Users/Admin/Documents/DijanR/scala/enable1.txt")
    //for(item <- source)
    //for (r <- 0 until readlines.length) yield (r)
  }


  def anagram (letters:String, count:Int = 0): Unit = {
    val readlines = List("abcd", "abcd", "abcd")
    for (k<- 0 until readlines.length; j <- 0 until readlines(k).length; i <- 0 until letters.length) {
      if (readlines(k).substring(j, j+1) == letters.substring(i,i+1)) count+1

      if (count == readlines(k).length) {
        true
        print(s"$readlines(k), ")
        longestWord(readlines(k))
      }
    }
  }

  def longestWord(word:String):Unit ={
    var maxWord = ""
    if(word.length > maxWord.length){
      maxWord = word
    }
    print(s"The longest word is $maxWord")
  }

  anagram("abcd")


}
