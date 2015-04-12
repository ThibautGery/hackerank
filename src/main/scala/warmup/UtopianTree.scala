package warmup

import scala.io.StdIn

trait UtopianTree {
  def solve() = {
    val n  = StdIn.readInt()
    (1 to n).map( i => growEachTree(StdIn.readInt()) ).foreach(println)
  }

  def growEachTree(cycle: Int) = {
    var height = 1

    (1 to cycle).foreach({
      i => if (i % 2 == 0) height = height + 1 else height = height*2
    })
    height
  }
}
