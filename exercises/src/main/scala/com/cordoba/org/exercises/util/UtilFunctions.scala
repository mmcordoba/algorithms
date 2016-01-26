package com.cordoba.org.exercises.util

/**
  * Created by manuel.cordoba on 1/18/16.
  */
class UtilFunctions {

  def reverse(s: String) : String =
    (for (i <- s.length -1 to 0 by -1 ) yield s(i)).mkString

  def count(s: String, c: Char) =
    s.filter( (actual: Char) => actual.equals(c)).length


  def concatReverse(s1: String, s2: String) : String  = {
    val s1Reversed = reverse (s1)
    val s2Reversed = reverse (s2)
    s1Reversed + s2Reversed
  }

}
