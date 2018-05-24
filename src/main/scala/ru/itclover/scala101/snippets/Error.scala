package ru.itclover.scala101.snippets

sealed trait Error extends Product with Serializable {
  def severity: Severity
}

case class PasswordError(cause: String) extends Error {
  override def severity = Severity.Major
}

case class ParsingError(cause: String) extends Error {
  override def severity = Severity.Low
}


sealed trait NetworkError extends Error {
  override def severity = Severity.Fatal
}

case class DnsError(details: String) extends NetworkError
