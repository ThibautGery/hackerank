package warmup

import org.specs2._


class UtopianTreeTest extends mutable.SpecificationWithJUnit with UtopianTree{
  "growEachTree with 0 cycle" should {
    "mesure 1 meters" in {
      growEachTree(0) === 1
    }
  }

  "growEachTree with 1 cycle" should {
    "mesure 2 meters" in {
      growEachTree(1) === 2
    }
  }

  "growEachTree with 4 cycle" should {
    "mesure 7 meters" in {
      growEachTree(4) === 7
    }
  }
}
