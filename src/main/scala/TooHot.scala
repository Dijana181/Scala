object TooHot extends App{

  def climate (temperature:Int, isSummer:Boolean):Unit = {
    if (isSummer==true && temperature > 60 && temperature<=100) print("true")
    else if (isSummer==false && temperature >60 && temperature<=90 ) print("true")
    else print("false")
  }
  climate(100,true)
}
