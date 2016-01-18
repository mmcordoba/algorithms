package com.cordoba.org.exercises.util

import org.junit.runner.RunWith
import org.scalatest.{FunSuite, BeforeAndAfter}
import org.scalatest.junit.JUnitRunner

/**
  * Created by manuel.cordoba on 1/18/16.
  */
@RunWith(classOf[JUnitRunner])
class UtilTest extends FunSuite with BeforeAndAfter {


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
