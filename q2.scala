object q2 {
  def main(args: Array[String]): Unit = {
    println("Please provide a single integer input.")
    val input = scala.io.StdIn.readInt()

    val message = input match {
      case n if n <= 0 => "Negative/Zero input"
      case n if n % 2 == 0 => "Even number is given"
      case n => "Odd number is given"
    }

    println(message)
  }
}
