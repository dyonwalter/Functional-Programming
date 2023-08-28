object q1 {
  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9 / 5) + 32)
    val sumOfTemperatures = fahrenheitTemperatures.reduce(_ + _)

    sumOfTemperatures / temperatures.length
  }
  def main(args: Array[String]): Unit = {
    val temperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}