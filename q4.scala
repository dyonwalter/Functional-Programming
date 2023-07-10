object q4 {
  def isEven(n: Int): Boolean = {
    if (n == 0) true
    else isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = {
    if (n == 0) false
    else isEven(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println(isEven(7)) //output : false
    println(isEven(12)) //output : true
    println(isOdd(7)) //output : true
    println(isOdd(12)) //output : false
  }

}
