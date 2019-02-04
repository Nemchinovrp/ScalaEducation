
val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
nums.foldLeft(0) {
  (m: Int, n: Int) =>
    println("m: " + m + " n: " + n);
    m + n }

val nums2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
nums2.foldRight(0) {
  (m: Int, n: Int) =>
    println("m: " + m + " n: " + n);
    m + n }