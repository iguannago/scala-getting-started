package com.rockthejvm

object Basics extends App {
  val meaningOfLife: Int = 43
  val aBoolean = true
  val aString = "I love Scala"
  val aComposedString = "I" + "love" + "Scala"
  val aInterpolatedString = s"The meaning of life is $aString"

  println(aInterpolatedString)

}
