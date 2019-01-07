object Bucksfizz extends App{
  def Bucksfizz(three:String, five:String, times:Int ){
    for(i<-1 to times){
      println(i)

      if(i%3==0||i%5==0){
        if(i%3==0 && i%5!=0) println(three)
        else if(i%5==0 && i%3!=0) println(five)
        else if(i%3==0 && i%5==0) println(three+five)
      }

    }
  }
  Bucksfizz("Three","Five",15)
}
