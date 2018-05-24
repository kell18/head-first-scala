package ru.itclover.scala101.snippets

import ru.itclover.scala101.utils.Enum


sealed trait Severity

object Severity extends Enum[Severity] {
  case object Fatal extends Severity
  case object Major extends Severity
  case object Low   extends Severity
}
