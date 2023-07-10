object q6 {
  def fibonacci(n: Int): Unit = {
    def fibonacciHelper(current: Int, a: Int, b: Int): Unit = {
      if (current <= n) {
        println(a)
        fibonacciHelper(current + 1, b, a + b)
      }
    }
    fibonacciHelper(1, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    fibonacci(10) //sample
  }

}
