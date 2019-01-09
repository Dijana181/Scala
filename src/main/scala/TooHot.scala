object TooHot extends App{

  def climate (temperature:Int, isSummer:Boolean):Unit = {
    val temp = temperature > 60
    if (isSummer && temp && temperature<=100) print("true")
    else if (!isSummer && temp && temperature<=90 ) print("true")
    else print("false")
  }
  climate(100,true)
}
