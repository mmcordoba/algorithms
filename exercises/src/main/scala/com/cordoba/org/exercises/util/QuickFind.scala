package com.cordoba.org.exercises.util

/**
  * Created by manuel.cordoba on 1/26/16.
  */
class QuickFind(val size: Integer) {

  // Class initialization
  val store = new Array[Integer](size)
  for(i <- store.indices) store(i) = i

  def root(i: Integer) : Integer = {

    var currentIndex = i
    var root = store(currentIndex)
    while (root != currentIndex) {
      currentIndex = root
      root = store(currentIndex)
    }
    root
  }


  def connect(i: Integer, j: Integer) = if (!isConnected(i,j)) store(i) = root(j)


  def isConnected(i: Integer, j: Integer) : Boolean = root(i) == root(j)

}
