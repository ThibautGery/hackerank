package warmup

import scala.annotation.tailrec
import scala.io.StdIn

trait UtopianTree {
  def solve() = {
    val n = StdIn.readInt()
    (1 to n).map(i => growEachTree(StdIn.readInt())).foreach(println)
  }

  def growEachTree(cycle: Int) = {
    val initialHeight = 1

    @tailrec
    def growEachTree(curCycle: Int, maxCycle: Int , acc: Int): Int = {
      if(curCycle == maxCycle) return acc
      curCycle % 2 match {
        case 0 => growEachTree(curCycle + 1,maxCycle, acc * 2)
        case 1 => growEachTree(curCycle + 1,maxCycle, acc + 1)
      }
    }
    growEachTree(0, cycle, initialHeight)
  }
}
