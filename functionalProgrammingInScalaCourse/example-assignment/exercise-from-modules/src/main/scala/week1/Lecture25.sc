object rationals {
  val x1 = new Rational(1, 2)
  x1.numer
  x1.denom

  class Rational(x: Int, y: Int) {
    def numer = x

    def denom = y

    def add(r: Rational) =
      new Rational(numer * r.denom + r.numer * denom,
        denom * r.denom)

    def neg = new Rational(-numer, denom)

    def sub(r: Rational) = add(r.neg)

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


}

