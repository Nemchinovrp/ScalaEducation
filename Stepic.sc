val add1 = (_: Int) + 1

val calc42 = (f: Int => Int) => f(42)

calc42(add1)

def sumTo(x : Int): Int = if (x == 0) 0 else x + sumTo(x - 1)

calc42(sumTo)

def fix(f : (=> Int => Int) => Int => Int): Int => Int = f(fix(f))

calc42(fix(rec => x => if(x == 0) 0 else x + rec(x -1)))
