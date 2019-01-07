object Recursion3 extends App {
  var count = 1

  def recur(three:String,five:String,times:Int){
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
      count += 1
    }
    recur(three,five,times)
  }

  recur("three","five",15)

}
