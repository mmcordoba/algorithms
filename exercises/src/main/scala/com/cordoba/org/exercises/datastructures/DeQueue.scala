package com.cordoba.org.exercises.datastructures

/**
  * Created by manuel.cordoba on 2/1/16.
  *
  * public class Deque<Item> implements Iterable<Item> {
   public Deque()                           // construct an empty deque
   public boolean isEmpty()                 // is the deque empty?
   public int size()                        // return the number of items on the deque
   public void addFirst(Item item)          // add the item to the front
   public void addLast(Item item)           // add the item to the end
   public Item removeFirst()                // remove and return the item from the front
   public Item removeLast()                 // remove and return the item from the end
   public Iterator<Item> iterator()         // return an iterator over items in order from front to end
   public static void main(String[] args)   // unit testing
}
  *
  *
  */
class DeQueue[T] {

  private class Node[N](in : N) {
    var next : Node[N] = null
    var front : Node[N] = null
    val value = in
  }

  private var head : Node[T] = null
  private var tail : Node[T] = null
  var size = 0

  def isEmpty : Boolean = size == 0

  def addFirst(first: T) : DeQueue[T] = {addFirst(new Node[T](first)); this}

  def addLast(last: T) : DeQueue[T] = {addLast(new Node[T](last)); this}

  private def addFirst(first : Node[T]) = {
    if (head == null) {
      head = first
      tail = first

    } else {

      head.front = first
      first.next = head

      head = first
    }

    size = size + 1
  }

  private def addLast(last: Node[T]) = {
    if (last == null) {
      head = last
      tail = last
    } else {
      tail.next = last
      last.front = tail

      tail = last
    }

    size = size + 1
  }


  def removeFirst() : T = {
    var ret : T = null.asInstanceOf[T]

    if (size == 1) {
      ret = head.value

      head = null
      tail = null
      size = size - 1
    } else if (size > 1) {
      val aux = head.next
      ret = head.value

      head = aux
      head.front = null

      size = size - 1

    }
    ret

  }

  def removeLast() : T = {

    var ret : T = null.asInstanceOf[T]

    if (size == 1) {
      ret = tail.value

      head = null
      tail = null
      size = size - 1
    } else if (size > 1) {
      val aux = tail.front
      ret = tail.value

      tail = aux
      tail.next = null

      size = size - 1
    }
    ret
  }

  def printQueue() = {
    var actual = Option(head)
    System.out.print( "Queue(" + size + ") :: ")
    while (actual.isDefined) {
      System.out.print(actual.get.value + " -> ")
      actual = Option(actual.get.next)
    }
    System.out.println(" null")
  }


}
