object Numbers extends App {

  val num = BigInt(1234567891)
  val numString = num.toString()

  def tens(num:String): Unit ={
    val hundreds = num.substring(num.length-3, num.length)
    val thousands = num.substring(num.length-6, num.length-3)

  }


 // def translator(num:String): Unit ={
    //num match{
      //case 6 => println(s"")
      //case 9 =>
      //case 12 =>
      //case 15 =>
      //case 18 =>
      //case 21 =>
      //case _ =>
   // }
  //}



}
