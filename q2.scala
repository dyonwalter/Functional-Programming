import scala.io.StdIn.readLine
object q2 {
  def PatternMatching(n:Int) : Unit = {
    if (n<=0){
      print ("Negative/Zero number")
    }
    else if (n%2==0){
      print ("Even number")
    }
    else{
      print ("Odd number")
    }
  }

  def main(args: Array[String]): Unit = {
    print ("Enter number : ")
    val n = readLine().toInt
    PatternMatching(n)
  }
}
