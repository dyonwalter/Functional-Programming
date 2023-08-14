object q1 {
  def calculateInterest(depositAmount: Double): Double = {
    val interestRate = depositAmount match {
      case amount if amount <= 20000 => 0.02
      case amount if amount <= 200000 => 0.04
      case amount if amount <= 2000000 => 0.035
      case _ => 0.065
    }

    val interest = depositAmount * interestRate
    interest
  }

  def main(args: Array[String]): Unit = {
    //sample values
    val deposit1 = 15000.0
    val deposit2 = 100000.0
    val deposit3 = 500000.0
    val deposit4 = 2500000.0

    val interest1 = calculateInterest(deposit1)
    val interest2 = calculateInterest(deposit2)
    val interest3 = calculateInterest(deposit3)
    val interest4 = calculateInterest(deposit4)

    println(s"Interest for deposit Rs. $deposit1: Rs. $interest1")
    println(s"Interest for deposit Rs. $deposit2: Rs. $interest2")
    println(s"Interest for deposit Rs. $deposit3: Rs. $interest3")
    println(s"Interest for deposit Rs. $deposit4: Rs. $interest4")
  }
}
