val one: PartialFunction[Int, String] = {
  case 1 => "one"
  case 2 => "two"
}

one.isDefinedAt(1)

one.isDefinedAt(2)

val partial = one

print(partial(1))


val sum: (Int, Int, Int) => Int = _ + _ + _
val sumCurried: Int => Int => Int => Int =  sum.curried

val res = sumCurried(1)(2)

print(res)

var result = sumCurried(5)
var result2 = result(5)
var res3 = result2(10)