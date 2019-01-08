object Bottles extends App {

  var count = 100
  var num1 = 100

  def lyrics(){

    count = count - 1
    num1 = num1 -1
    var num2 = num1-1

    if(count>0) {
      println(s" $num1 bottles of beer on the wall, $num1 bottles of beer. Take one down, pass it around, $num2 bottles of beer on the wall")
      lyrics()
    }

  }

  lyrics()

}
