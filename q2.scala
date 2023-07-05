object q2 {
  def main(args:Array[String]):Unit={
    println("Enter a Number = ");
    val a =scala.io.StdIn.readInt();
    val b= evenorodd(a);
    println(b)
  }
  def evenorodd(a:Int):String={
    a match{
      case a if a<=0 => "negative/zero"
      case a if a%2==0 => "even"
      case a  => "odd"
    }
  }
}
