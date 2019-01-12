import PrimeNumbers.count
import helpers.UnitSpec

class PrimeNumbersTest extends UnitSpec {

  "A prime number" should "only be divisible by the number one and itself" in {

    assert(PrimeNumbers.prime(5) == 1)
  }

}
