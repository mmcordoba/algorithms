package com.cordoba.org.exercises.scala

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSuite}

@RunWith(classOf[JUnitRunner])
class CountTest extends FunSuite with BeforeAndAfter {

  var utilFunctions = new UtilFunctions


  test("Should Return Zero") {
    val s = ""
    assert(0 == utilFunctions.count(s, 'a'))
  }

  test("Should count 3") {
    val s = "a casa is not in the prire"
    assert(3 == utilFunctions.count(s, 'a'))
  }

}
