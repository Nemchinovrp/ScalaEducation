package com.getscalajob.nemhinovrp.study

object Expression {
  def main(args: Array[String]): Unit = {
    f(0, 0)
  }
  def f(x: Int, y: Int) = {
    if (x > y)
      for (k <- Array(x, y)) yield println(k * k)
    else x + y match {
      case 0 => "A"
    }
  }
}
