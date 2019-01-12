import helpers.UnitSpec
import org.scalatest.{FeatureSpec, FlatSpec}
import org.scalatest


class CalculatorTest extends UnitSpec {

  "A Calculator" should "add values together" in {

    assert(Calculator.add(15,15) == 30)
    assert(Calculator.add(40,30)==30)

  }

}
