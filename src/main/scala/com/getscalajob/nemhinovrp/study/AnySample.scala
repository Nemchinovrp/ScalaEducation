package com.getscalajob.nemhinovrp.study

object AnySample {
  def main(args: Array[String]): Unit = {
    println(f("string"))
    println(f(10))
  }

  def f(arg: Any): String = arg match {
    case k: Int => "This is int: " + (k + 1)
    case s: String => "This is String: " + s.toUpperCase
  }
}
