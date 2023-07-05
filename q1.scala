import scala.io.StdIn.readLine
object q1 {

  def Interest(n: Double): Unit = {
    var interest =0.0
    if (n > 2000000) {
      interest = (0.065 * n)
    }
    else if (n > 200000) {
      interest = 0.035 * n
    }
    else if (n > 20000) {
      interest = 0.04 * n
    }
    else {
      interest = 0.02 * n
    }
    print("Amount of interest: " + interest + " Rupees")
  }

  def main(args: Array[String]): Unit = {
    print("Enter deposit amount: ")
    val m = readLine().toDouble
    Interest(m)
  }
}