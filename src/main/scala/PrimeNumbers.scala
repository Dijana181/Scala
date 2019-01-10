object PrimeNumbers {

  def Prime (num1:Int): Unit ={
    var check = 0
    var count = 0
    for(i <- 0 to num1){
      if(num1 % i == 0) check+=1
    }
    if(count==2) {
      count+=1
      PrimeCount(num1)
    }
  }
  def PrimeCount(x:Int): Unit ={

  }
Prime(5)
}
