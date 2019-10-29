package example

import org.scalacheck.Gen
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.prop.PropertyChecks

class GreeterSpec extends FlatSpec with Matchers with PropertyChecks {

  it should "green genericly without a name" in {
    Greeter.greet shouldBe "Hello!"
  }

  it should "greet by name" in {
    Greeter.greet("Bob") shouldBe "Hello, Bob!"
  }

  it should "greet by any word" in {
    forAll(Gen.alphaLowerStr) { word =>
      Greeter.greet(word) shouldBe s"Hello, \$word!"
    }
  }

}
