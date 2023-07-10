object q1 {
  def prime(n: Int): Boolean = {
    def isDivisibleBy(m: Int, divisor: Int): Boolean = {
      if (divisor <= 1) false
      else if (m % divisor == 0) true
      else isDivisibleBy(m, divisor - 1)
    }

    if (n <= 1) false
    else !isDivisibleBy(n, Math.floor(Math.sqrt(n)).toInt)
  }

  def main(args: Array[String]): Unit = {
    println(prime(8)) //sample
  }
}