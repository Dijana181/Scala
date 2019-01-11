object Factor extends App {

  def factorial(limit:Int): Unit ={
    var num = 1

    for (i <- 1 to 20){
      num = num * i
      check(i, num, limit)
    }
  }

  def check(factorial:Int, num:Int, limit:Int): Unit ={
    if(num>limit) {
      print("Invalid factorial")
      sys.exit()}
    if(num==limit){
      print(s"$factorial !")
      sys.exit()
    }
  }

  factorial(479001600)

  }
