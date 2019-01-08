object arrays extends App{

 //First method

 // val arrayA:Array[Int] = Array(1, 2, 3, 1, 1, 1)

 // val min = arrayA.reduceLeft( _ min _ )

 // print(min)

  //for(x <- arrayA) if(x > min) print (x)


  //Second method

  //val arrayA:Array[Int] = Array(1, 2, 3, 4, 5)

  //var list:List = []

  //for(i<- arrayA.tail)
    //if(arrayA.head != i) {
    //list = list + arrayA.head
  //}

  val arrayA:Array[Int] = Array(1, 2, 3, 1, 1)

  for(i <- 0 to 4 ; j <- 0 to 4) {
      if(i != j ) clash(arrayA(i), arrayA(j))
      }



  def clash(num1:Int, num2:Int){
    if (num1 == num2) {
      print(num1)
      sys.exit()
    }

  }



}
