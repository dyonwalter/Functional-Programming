object q5 {
  def sumEven(n: Int): Int = {
    def sumEvenHelper(current: Int, acc: Int): Int = {
      if (current >= n) acc
      else if (current % 2 == 0) sumEvenHelper(current + 2, acc + current)
      else sumEvenHelper(current + 1, acc)
    }

    sumEvenHelper(0, 0)
  }

  def main(args: Array[String]): Unit = {
    println(sumEven(10)) // sample
  }

}
