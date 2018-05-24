package ru.itclover.scala101.snippets



final case class Password private(value: String) extends AnyVal {
  override def toString: String = value.map(_ => '*')
}
// Performance, readability (List[String] and List[Password]?)

// Correctness:
object Password {
  def create(s: String): Either[Error, Password] = s match {
  	case candidate if candidate.length < 8 => Left(PasswordError("Minimum password length has to be 8"))
    case valid => Right(Password(valid))
	}
}

