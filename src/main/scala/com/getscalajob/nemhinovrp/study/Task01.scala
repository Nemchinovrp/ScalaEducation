package com.getscalajob.nemhinovrp.study

object Task01 extends App {
  val x = 0

  def f(y: Int) = y + 1

  val result = {
    val x = f(3)
    x * x
  } + x
  println(result)
}
