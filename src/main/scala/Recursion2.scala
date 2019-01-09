object Recursion2 extends App {


  def recur(word:String,times:Int, count:Int=0){
    println(word*times)


    if(count<times){
      recur(word,times, count+1)
    }
  }

  recur("h",5)

}
