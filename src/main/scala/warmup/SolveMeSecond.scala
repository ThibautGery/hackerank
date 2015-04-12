package warmup

import scala.io.StdIn

object SolveMeSecond extends App{
  val n  = StdIn.readInt()
  (1 to n).map(i => StdIn.readLine().split(" ").map(_.toInt).sum).foreach(println)
}
