object Recursion2 extends App {

  var count = 0

  def recur(word:String,times:Int){
    println(word*times)
    count +=1

    if(count<times){
      recur(word,times)
    }
  }

  recur("h",5)

}
