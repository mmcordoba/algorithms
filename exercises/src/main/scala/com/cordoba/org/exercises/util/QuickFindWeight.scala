package com.cordoba.org.exercises.util

/**
  * Created by manuel.cordoba on 1/26/16.
  */
class QuickFindWeight(val size: Integer) {

  // Class initialization
  val store = new Array[Integer](size)
  val storeWeight = new Array[Integer](size)

  for(i <- store.indices)
  {
    store(i) = i
    storeWeight(i) = 1
  }


  def root(i: Integer) : Integer = {
    var currentIndex = i
    var root = store(currentIndex)
    while (root != currentIndex) {
      currentIndex = root
      root = store(currentIndex)
    }
    root
  }


  def connect(i: Integer, j: Integer) =  {
    if (!isConnected(i,j))  {
      val rootI = root(i)
      val rootJ = root(j)

      val weightI = storeWeight(rootI)
      val weightJ = storeWeight(rootJ)

      if (weightI > weightJ) {
        store(rootJ) = rootI
      } else {
        store(rootI) = rootJ
      }

    }
  }


  def isConnected(i: Integer, j: Integer) : Boolean = root(i) == root(j)

}
