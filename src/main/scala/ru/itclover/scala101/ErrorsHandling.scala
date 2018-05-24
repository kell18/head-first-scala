/*
package ru.itclover.scala101

import snippets.Enum

/**
  * Task - ...
  *
  */

// Right way - Either, not use Try (throwable is hard dep, harder to compose)
// Exp from cram

/** Errors ADT */

sealed trait Severity

object Severity extends Enum[Severity] {
  case object Fatal extends Severity
  case object NonFatal extends Severity
}


trait ExecutionError {
  def severity: Severity
}

case class EnvironmentError(msg: String) extends ExecutionError {
  override def severity: Severity = Severity.Fatal
}

case class ParsingError(msg: String, severity: Severity) extends ExecutionError

// ... Mb make it on real example of ETL
// batch streaming (for pr-ka) mb with pluginization of extraction
*/
