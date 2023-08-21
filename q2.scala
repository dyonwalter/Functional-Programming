class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numerator: Int = n / gcdValue
  val denominator: Int = d / gcdValue

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numerator, denominator)

  override def toString: String = s"$numerator / $denominator"

  def sub(other: Rational): Rational = {
    new Rational(
      numerator * other.denominator - other.numerator * denominator,
      denominator * other.denominator
    )
  }
}

object q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)

    println(s"x: $x")
    println(s"y: $y")
    println(s"z: $z")
    println(s"xy - z: $result")
  }
}