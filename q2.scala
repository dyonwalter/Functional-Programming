object q2 {
  def isPrime(num: Int): Boolean = {
    def isDivisibleBy(divisor: Int): Boolean = {
      if (divisor <= 1) false
      else if (num % divisor == 0) true
      else isDivisibleBy(divisor - 1)
    }

    if (num <= 1) false
    else !isDivisibleBy(Math.floor(Math.sqrt(num)).toInt)
  }

  def primeSeq(n: Int, current: Int = 2): Unit = {
    if (current < n) {
      if (isPrime(current)) print(s"$current ")
      primeSeq(n, current + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(primeSeq(8)) //sample
  }

}
