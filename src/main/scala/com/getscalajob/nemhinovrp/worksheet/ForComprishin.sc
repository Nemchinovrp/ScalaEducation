var fruits = scala.collection.mutable.ArrayBuffer[String]()
fruits += "apple"
fruits += "banana"
fruits += "orange"

val out = for (e <- fruits) yield e.reverse


val a = for (i <- 1 to 5) yield i

print(a.toString())

val b = for (i <- 1 to 5) yield i % 2

print(b)


val arr = Array(1, 2, 3, 4, 5)

for (e <- a) yield e * 2

