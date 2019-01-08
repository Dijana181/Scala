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

  val arrayA:Array[Int] = Array(1, 2, 3, 1, 1, 1)

  val min = arrayA.reduceLeft( _ min _ )

  print(min)



  for(x <- arrayA) yield (x)


}
