object q3 {
  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val toUpper: String => String = str => str.toUpperCase
    val toLower: String => String = str => str.toLowerCase

    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    for (name <- names) {
      val formattedUpper = formatNames(name, toUpper)
      val formattedLower = formatNames(name, toLower)

      println(s"Original: $name")
      println(s"To Upper: $formattedUpper")
      println(s"To Lower: $formattedLower")
      println()
    }
  }
}
