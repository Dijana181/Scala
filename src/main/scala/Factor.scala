object Factor extends App {

  def factorial (limit:Int): Unit = {
    var num = 1
    for (i <- 1 to limit) {
      num = num * i
      num
    }

  }

    def cap(): Unit ={
      var limit = 120
      var count = 1
      var x = factorial(count)

      while( x <=limit) {

        count = count + 1
      }
      print(count)

    }



  cap()

}
