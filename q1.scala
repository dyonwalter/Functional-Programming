class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numerator: Int = n / gcdValue
  val denominator: Int = d / gcdValue

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numerator, denominator)

  override def toString: String = s"$numerator / $denominator"
}

object q1 {
  def main(args: Array[String]): Unit = {
    //sample
    val x = new Rational(3, 5)
    val negX = x.neg

    println(s"x: $x")
    println(s"negX: $negX")
  }
}
