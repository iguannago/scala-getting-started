object rationals {
  val x1 = new Rational(1, 2)
  x1.numer
  x1.denom

  class Rational(x: Int, y: Int) {
    require(y != 0, "denom must be nonzero")
    private val g = gcd(x, y)

    def numer = x / g

    def denom = y / g

    def add(r: Rational) =
      new Rational(numer * r.denom + r.numer * denom,
        denom * r.denom)

    def neg = new Rational(-numer, denom)

    def sub(r: Rational) = add(r.neg)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a
    else gcd(b, a % b)

    def less(r: Rational) = numer * r.denom < r.numer * denom

    def max(r: Rational) = if (this.less(r)) r else this

    override def toString = numer + "/" + denom

  }


  val r = new Rational(1, 3)
  r.neg

  val s = new Rational(2, 4)
  r.add(s).toString()

  r.sub(s)

  new Rational(1, 2).add(new Rational(2, 3)).toString()


  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x.sub(y).sub(z)
  y.add(y)

  x.less(y)
  x.max(y)

  val strange = new Rational(1, 0)
  strange.add(strange)


}

