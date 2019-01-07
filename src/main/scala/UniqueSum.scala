object UniqueSum extends App {

  def uniqueSum(num1:Int, num2:Int, num3:Int){
    var sum = num1

    if(num1 != num2){
      sum += num2
    }
    if(num1 != num3 && num2 != num3){
      sum += num3
    }

    print(sum)

  }

  uniqueSum(1,1,2)

}
