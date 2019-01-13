object Lumberjacks extends App {

  var Row1 = Array(1,1,1)
  var Row2 = Array(2,1,3)
  var Row3 = Array(1,4,1)
  var Storage = Array(Row1, Row2, Row3)
  var logs = 5
  var min = 1

  while(min<=9){
    stock()
    min = min + 1

  }


def stock(){
  for (row <- Storage) {
    for (i <- 0 until row.length) {
      if (row(i) == min) {
        if(logs > 0) {
          row(i) += 1
          logs -=1
        }
      }
    }
  }

}

  for(i <- 0 until Row1.length) print(Row1(i))
  print("\n")
  for(i<- 0 until Row2.length) print(Row2(i))
  print("\n")
  for(i <- 0 until Row3.length) print(Row3(i))


}
