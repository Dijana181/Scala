object Bottles extends App {



  def lyrics(count:Int=100, num1:Int=100){
    if(count>0) {
      println(s" $num1 bottles of beer on the wall, $num1 bottles of beer. Take one down, pass it around, ${num1-1} bottles of beer on the wall")
      lyrics(count-1, num1-1)
    }
  }

  lyrics()

}
