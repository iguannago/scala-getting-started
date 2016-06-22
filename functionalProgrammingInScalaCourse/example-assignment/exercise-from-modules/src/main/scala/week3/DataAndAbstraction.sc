object intsets {
  println("Welcome to the Week3")

}

abstract class IntSets {
  def incl(x: Int): IntSets

  def contains(x: Int): Boolean
}

class Empty extends IntSets {
  override def incl(x: Int): IntSets =
    new NonEmpty(x, new Empty, new Empty)

  override def contains(x: Int): Boolean = false

  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSets, right: IntSets) extends IntSets {
  override def incl(x: Int): IntSets = if (x < elem) new NonEmpty(elem, left incl x, right)
  else if (x > elem) new NonEmpty(elem, left, right incl x)
  else this

  override def contains(x: Int): Boolean = if (x < elem) left contains x
  else if (x > elem) right contains x
  else true

  override def toString = "{" + left + elem + right + "}"
}

val t1 = new NonEmpty(3, new Empty, new Empty)
val t2 = t1 incl 4



