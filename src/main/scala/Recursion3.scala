object Recursion3 extends App {

  def recur(three:String,five:String,times:Int, count:Int=1){
    if(count<=times){
      println(count)
      if(count%3==0||count%5==0){
        if(count%3==0 && count%5!=0){
          println(three)
        }
        else if(count%3!=0 && count%5==0){
          println(five)
        }
        else if(count%3==0 && count%5==0){
          println(three+five)
        }
      }
      recur(three,five,times, count+1)
    }

  }

  recur("three","five",15)

}
