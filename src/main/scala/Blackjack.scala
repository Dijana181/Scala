object Blackjack extends App {

  def choice(num1:Int, num2:Int):Unit= {
    if(num1>21 || num2>21)
      print(0)
    else {
      if(21-num1>21-num2) print(num2)
      else print(num1)
    }
  }
  choice(22,22)
}
