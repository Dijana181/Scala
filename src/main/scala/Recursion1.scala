object Recursion1 extends App {


    def recur(count:Option[],word:String,times:Int){
      println(word)
      count=count+1
      if(count<times) recur(word,times)
    }
    recur(0,"h",5)
}
