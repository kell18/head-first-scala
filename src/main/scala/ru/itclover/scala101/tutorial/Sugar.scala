package ru.itclover.scala101.tutorial

import scala.annotation.tailrec

object Sugar extends App {

  type Error = String

  def div(x: Int, y: Int): Either[Error, Double] = y match {
    case 0 => Left("Division by zero.")
    case nonZero => Right(x / nonZero)
  }

  def add(x: Int)(y: Int): Int = x + y


}
