package warmup

import scala.io.StdIn

trait MaximazingXor {

  def maxXor(l: Int, r: Int): Int = {

    var max : Int = 0
    for( a <- l to r;
        b <- l to r) {
      val tmp = xor(a, b)
      if(tmp > max)
        max = tmp
    }
    max
  }

  def xor(l: Int, r: Int): Int = {
    l.toByte ^ r.toByte
  }

  def solve() {
    var left: Int = StdIn.readInt()
    var right: Int = StdIn.readInt()


    val res = maxXor(left, right)
    println(res)


  }
}
