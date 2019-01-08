object Recursion1 extends App {


    def recur(word:String,times:Int, count:Int=0){
    println(word)
      count = count +1
     if(count<times) recur(word,times)
    }

   recur("h",5)
}
