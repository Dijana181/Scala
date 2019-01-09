object NumberCheck extends App {

  def addDigit(num1:String): Unit ={

    var num2 = num1.toString
    var num3 = ""
    var num4 = ""
    var sum = 0

    for(i <- 0 until num2.length by -2){
      num3 =  num2.substring(i,i+1)
      num3.toInt
      sum = sum +(num3)
      num3 =0
    }

    for(j <- 0 until num2.length by -2){
      num4 = num2.substring(j,j+1)
      num4.toInt
      sum =sum+(num4*2)
    }
    print(sum)
  }
addDigit(5555555)
}
