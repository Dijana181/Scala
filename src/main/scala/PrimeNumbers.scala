object PrimeNumbers extends App {

  def Prime (num1:Int): Unit ={
    var check = 0
    var count = 0
    for(i <- 1 to num1){
      if(num1 % i == 0) check+=1
    }
    if(check==2) {
      count+=1
      PrimeCount(num1)
    }
  }

  def PrimeCount(x:Int): Unit ={
    var count = 0
    count += 1
    println(s"There are $count prime numbers")


  }
Prime(5)
}
