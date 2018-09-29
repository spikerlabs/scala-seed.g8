package example

import org.scalatest.{FlatSpec, Matchers}

class GreeterSpec extends FlatSpec with Matchers {

  it should "greet by name" in {
    Greeter.greet("Bob") shouldBe "Hello, Bob!"
  }

}
