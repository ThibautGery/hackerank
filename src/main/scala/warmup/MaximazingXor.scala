package warmup

import scala.io.StdIn

trait MaximazingXor {

  def maxXor(l: Int, r: Int): Long = {

    val xors = for (a <- l to r;
                    b <- l to r)
      yield xor(a, b)

    val test = for (a <- l to r;
                    b <- l to r)
      yield (a, b)

    max(xors)
  }

  def max(xs: IndexedSeq[Long]) = {
    if (xs.isEmpty) throw new NoSuchElementException
    xs.reduceLeft((x, y) => if (x > y) x else y)
  }

  def xor(l: Int, r: Int): Long = {
    l ^ r
  }

  def solve() {
    var left: Int = StdIn.readInt()
    var right: Int = StdIn.readInt()


    val res = maxXor(left, right)
    println(res)


  }
}
