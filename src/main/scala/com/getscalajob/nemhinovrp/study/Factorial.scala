package com.getscalajob.nemhinovrp.study
import java.math.BigInteger


object Factorial {
  def main(args: Array[String]): Unit = {
    val b = new BigInteger("5")
    println(factorial(b))
  }

  def factorial(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial(x.subtract(BigInteger.ONE)))
}
