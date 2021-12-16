package features.steps

import example.Greeter
import features.state.GreeterState

trait GreeterSteps extends Steps:

  val state: GreeterState

  Given("""^my name is "([^"]*)"\$""") { (name: String) =>
    state.name(name)
  }

  When("""^I pass it to the greeter\$""") { () =>
    val name = state.name.get
    val message = Greeter.greet(name)
    state.message(message)
  }

  When("""^I run greeter without a name\$""") { () =>
    val message = Greeter.greet
    state.message(message)
  }

  Then("""^the greeter should have returned "([^"]*)"\$""") { (expectedMessage: String) =>
    val returnedMessage = state.message.get
    returnedMessage shouldBe expectedMessage
  }

