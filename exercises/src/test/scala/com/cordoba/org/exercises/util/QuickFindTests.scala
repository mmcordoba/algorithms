package com.cordoba.org.exercises.util

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by manuel.cordoba on 1/26/16.
  */
@RunWith(classOf[JUnitRunner])
class QuickFindTests extends FunSuite with BeforeAndAfter {


  test("QuickFind for a 3 node")  {

    val quickFind = new QuickFind(3)

    assert(quickFind.root(0) == 0)

    quickFind.connect(0,1)
    assert(quickFind.root(0) == 1)

    assert(quickFind.isConnected(0,1))
    assert(quickFind.isConnected(1,0))
    assert(!quickFind.isConnected(1,2))

  }


  test("QuickFind for a 5 node")  {

    val quickFind = new QuickFind(5)

    assert(quickFind.root(0) == 0)

    quickFind.connect(0,1)
    assert(quickFind.root(0) == 1)

    quickFind.connect(0,2)
    quickFind.connect(2,1)

    assert(quickFind.isConnected(0,1))
    assert(quickFind.isConnected(1,0))
    assert(!quickFind.isConnected(4,2))

  }

  test("QuickFind for a 7 node")  {

    val quickFind = new QuickFindWeight(7)

    quickFind.connect(0,1)
    quickFind.connect(0,2)

    quickFind.connect(4,5)
    quickFind.connect(4,6)
    quickFind.connect(6,3)

    assert(quickFind.isConnected(4,6))
    assert(quickFind.isConnected(2,1))
    assert(quickFind.isConnected(5,3))
    assert(!quickFind.isConnected(0,5))


    quickFind.connect(1,6)
    assert(quickFind.isConnected(0,5))
  }
}
