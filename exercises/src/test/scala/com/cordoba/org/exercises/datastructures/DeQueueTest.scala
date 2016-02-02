package com.cordoba.org.exercises.datastructures

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

/**
  * Created by manuel.cordoba on 2/1/16.
  */
@RunWith(classOf[JUnitRunner])
class DeQueueTest extends FunSuite with BeforeAndAfter {

  test(" add some and print") {

    var queue = new DeQueue[Integer]
    queue.addFirst(1).addFirst(2).addFirst(3).printQueue

    queue = new DeQueue[Integer]
    queue.addFirst(1).addLast(4).addFirst(2).addLast(6).printQueue


    queue = new DeQueue[Integer]
    queue.addFirst(1).addLast(4).addFirst(2).addFirst(60).addLast(6).addLast(22).printQueue

    queue.removeFirst
    queue.removeLast
    queue.printQueue

    queue.removeLast
    queue.removeLast
    queue.printQueue

    queue.removeFirst
    queue.removeFirst
    queue.printQueue

    queue.removeFirst
    queue.removeLast
    queue.printQueue
  }
}
