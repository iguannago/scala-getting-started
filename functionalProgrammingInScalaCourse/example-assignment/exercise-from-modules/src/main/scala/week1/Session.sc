object session {

  def abs(x: Double): Double = if (x < 0) -x else x

  abs(-1)
  abs(1)

  def sqrt(x: Double): Double = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double = {
      (guess + x / guess) / 2
    }
    sqrtIter(1.0)
  }

  sqrt(2)
  sqrt(9)
  sqrt(4)
  sqrt(5)
  sqrt(1e-60)
  sqrt(1e60)


  //Some recursive functions

  /*
  gcd(a,b)
   */
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) b
    else gcd(b, a % b)
  }

  gcd(4, 8)

  /*
  factorial
   */
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  factorial(0)
  factorial(1)
  factorial(3)

}
