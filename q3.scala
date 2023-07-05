object q3 {
  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatter: String => String): String = formatter(name)

  def main(args: Array[String]): Unit = {

    println(formatNames("Benny")(toUpper(_)));
    println(formatNames("Ni")(toUpper(_)) + "roshan");
    println(formatNames("Saman")(toLower(_)));
    println("Kumar" + formatNames("a")(toUpper(_)));

  }
}
