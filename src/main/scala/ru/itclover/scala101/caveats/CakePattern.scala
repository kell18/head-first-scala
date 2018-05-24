package ru.itclover.scala101.caveats

trait A {
  def f: Unit
}

// More often is better to have dependency in arguments, rather that in trait body
class ModuleA(sender: Unit) {

  def sendReques: Unit = ???
}

trait ModuleB {
  def sendResponse: Unit = ???
}


class Main extends ModuleB {
  val m1 = new ModuleA(())
}
