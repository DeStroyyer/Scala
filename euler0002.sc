def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)
val fibs = fibFrom(1, 2).takeWhile(_ < 4000000)
fibs.toList.filter((c: Int) => c % 2 == 0).sum
