object NumberCheck extends App {

  def addDigit(num1:Int): Unit ={

    var num2 = num1.toString
    var num3 = ""
    var sum = 0
    var num5 = 0

    sum += (num1 %10)

    for(i <- (num2.length-1) until 1 by -2 ) {
      num3 += num2.substring(i - 1, i)
      num5 = num3.toInt
      sum += (num5*2)
      num3 = ""
    }

    for(j <- (num2.length-2) until 0 by -2){
      num3 = num2.substring(j-1,j)
      num5 = num3.toInt
      sum += (num5)
      num3 = ""
    }
print(sum)
  }

  def valid(num:Int):Unit = {

  }
addDigit(5555555)
}


