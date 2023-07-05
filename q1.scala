object q1 {
  def interest (amount:Double):Double = {
    amount match {
      case amount if amount <= 20000 => amount * 0.02;
      case amount if amount <= 200000 => amount * 0.04;
      case amount if amount <= 2000000 => amount * 0.035;
      case amount => amount * 0.065;
    }
  }
  def main(args:Array[String]):Unit={
    println("Enter a Amount =");
    val amount =scala.io.StdIn.readDouble();
    val b = interest(amount)
    println(s"Deposit amount =$amount")
    println(s"Interest that the money earns in a year = $b")
  }
}


