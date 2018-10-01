package example

import org.scalacheck.Gen
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.prop.PropertyChecks

class GreeterSpec extends FlatSpec with Matchers with PropertyChecks {

  it should "greet by name" in {
    Greeter.greet("Bob") shouldBe "Hello, Bob!"
  }

  it should "greet by any word" in {
    forAll(Gen.alphaLowerStr) { word =>
      Greeter.greet(word) shouldBe s"Hello, \$word!"
    }
  }

}
