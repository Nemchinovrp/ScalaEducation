package getscalajob.nemhinovrp.study

object Fibonachi {
  def main(args: Array[String]) {
    println(fib(3))
  }

  def fib(n: Int): Int = {
    var a = 0
    var b = 1
    var i = 0
    while (i < n) {
      val prev_a = a
      a = b
      b = prev_a + b
      i = i + 1
    }
    a
  }

}
