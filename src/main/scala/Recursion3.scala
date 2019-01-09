object Recursion3 extends App {

  def recur(three:String,five:String,times:Int, count:Int=1){
    if(count<=times){
      println(count)
      val mod3 = count%3==0
      val mod5 = count%5==0
      if(mod3 || mod5){
        if(mod3 && !mod5){
          println(three)
        }
        else if(!mod3 && mod5){
          println(five)
        }
        else if(mod3 && mod5){
          println(three+five)
        }
      }
      recur(three,five,times, count+1)
    }

  }

  recur("three","five",15)

}
