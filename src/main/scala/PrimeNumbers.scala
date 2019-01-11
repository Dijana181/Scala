object PrimeNumbers extends App {

  var count = 0

  def Prime (num1:Int): Unit ={
    var check = 0
    for(i <- 1 to num1){
      if(num1 % i == 0) check+=1
    }
    if(check==2) count+=1
    println(s"There are $count prime numbers")
  }


Prime(23)
}
