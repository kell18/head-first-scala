package ru.itclover.scala101.caveats

case class Data(x: Int, y: Int) {
  var z = 0

  override def toString = {
    z = 1
    "x, y"
  }
}

object CaseClassMutations extends App {

  val a = Data(1, 2)
  val b = Data(1, 2)

  a.toString

  println(a == b) // true, but supposed to be false.
}