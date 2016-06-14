object rationals {
  val x = new Rational(1, 2)
  x.numer
  x.denom

  class Rational(x: Int, y: Int) {
    def numer = x

    def denom = y
  }

  def addRational(r: Rational, s: Rational): Rational =
    new Rational(r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)

  def makeString(r: Rational) = r.numer + "/" + r.denom

  val r = new Rational(1, 3)
  val s = new Rational(2, 4)

  makeString(addRational(r, s))



}

