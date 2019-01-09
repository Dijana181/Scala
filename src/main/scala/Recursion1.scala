object Recursion1 extends App {


    def recur(word:String,times:Int, count:Int=0){
    println(word)

     if(count<times) recur(word,times, count+1)
    }

   recur("h",5)
}
