val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

val numbersList = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

val numbersSet = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

val result = List(1, 2, 3).zip(List("a", "b", "c").zip(List("r", "n", "b")))

for (e <- result) yield println(e)

val numbersPartition = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

numbersPartition.partition(_ % 2 == 0)

