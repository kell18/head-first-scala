package ru.itclover.scala101.snippets

import scala.concurrent.Future


final case class Password private(value: String) extends AnyVal

object Password {
  def create(value: String): Either[Error, Password] = value match {
    case "vasia_pupkin" => Left(PasswordError("Too weak password"))
    case v if v.length < 8 => Left(PasswordError("Too short password"))
    case v => Right(Password(v))
  }
}


object Domain {
  type Response = List[Byte]
  type Message = String

  def sendAsyncRequest(host: String): Future[Message] = ???


  getMessage match {
    case Right(x) => println()
    case Left(error) =>
  }

  def getMessage: Either[Error, Message] = for {
    password <- Password.create("qwertyu123")
    response <- sendRequest("0.0.0.0", "Vasia", password)
    message <- parseResponse(response)
  } yield message


  def sendRequest(host: String, userName: String, password: Password): Either[Error, Response] = ???

  def parseResponse(response: Response): Either[Error, Message] = ???

  def notifyUser(msg: String): Unit = ???

  // sendRequest()
}

