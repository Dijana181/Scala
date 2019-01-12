object PrimeNumbers extends App {

  var count = 0

  def prime (num1:Int): Int ={
    var check = 0
    for(i <- 1 to num1){
      if(num1 % i == 0) check+=1
    }
    if(check==2) count+=1
    count
  }


prime(23)
}
