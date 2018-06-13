package com.getscalajob.nemhinovrp.study

object FactorialInt {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(factorial(2))
    println(factorial(4))
  }

  def factorial(n: Int): Int = {
    if (n == 0) {
      1
    }
    else {
      n * factorial(n - 1)
    }
  }
}
