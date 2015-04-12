package warmup

import org.specs2._


class MaximizingXorTest extends mutable.SpecificationWithJUnit with MaximazingXor{
  "maxXor between 10 and 15" should {
    "return 7" in {
      maxXor(10, 15) === 7
    }
  }

  "maxXor between 1 and 1000" should {
    "return 1023" in {
      maxXor(1, 1000) === 1023
    }
  }

  "maxXor between 1 and 4" should {
    "return 7" in {
      maxXor(1, 4) === 7
    }
  }

  "xor between 10 and 10" should {
    "return 0" in {
      xor(10, 10) === 0
    }
  }


  "xor between 10 and 15" should {
    "return 5" in {
      xor(10, 15) === 5
    }
  }

  "xor between 60 and 13" should {
    "return 49" in {
      xor(60, 13) === 49
    }
  }

  "xor between 11 and 12" should {
    "return 7" in {
      xor(11, 12) === 7
    }
  }


}
