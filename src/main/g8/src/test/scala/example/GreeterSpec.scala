package example

import org.scalacheck.Gen
import org.scalatest.matchers.should.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class GreeterSpec
    extends AnyFlatSpec
    with Matchers
    with ScalaCheckDrivenPropertyChecks:

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
