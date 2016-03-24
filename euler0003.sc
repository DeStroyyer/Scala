def primeFactor (i: Long) : List [Long] = (2 to math.sqrt(i).toInt).find(i % _ == 0).fold(List(i))(j => j.toLong :: primeFactor(i / j))
val r = primeFactor(600851475143L).last
