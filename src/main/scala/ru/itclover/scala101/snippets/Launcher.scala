package ru.itclover.scala101.snippets

import SimpleDomain._
import ru.itclover.scala101.snippets.Error

object SimpleDomain {
  type Response = List[Byte]
  type Message = String

  def sendRequest(userName: String, password: Password): Either[Error, Response] = ???

  def parseResponse(response: Response): Either[Error, Message] = ???

  def notifyUser(msg: String): Unit = ???
}


// Composability
object Main extends App {

  val message = requestMessage("clover", "clover123") match {
    case Right(msg) => msg

    case Left(PasswordError(cause)) => notifyUser(s"Incorrect password, $cause")

    case Left(DnsError(details)) =>
      throw new RuntimeException(s"Dns error occurred while requesting msg, $details")
  }


  def requestMessage(userName: String, password: String): Either[Error, Message] = for {
    password <- Password.create(password)
    response <- sendRequest(userName, password)
    message <- parseResponse(response)
  } yield message
}

// Monads composition can become cumbersome at some point,
// read about monad transformers.
// For example here - https://blog.buildo.io/monad-transformers-for-the-working-programmer-aa7e981190e7