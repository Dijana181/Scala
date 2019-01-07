object TooHot extends App{

  def climate (temperature:Int, isSummer:Boolean):String = {
    if (isSummer==true && temperature > 60 ) print("true")
    else if (isSummer==false && temperature >60 ) print("true")
    else print("false")
  }
  climate(100,true)
}
