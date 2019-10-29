package steps

import example.Greeter

object RuntimeMemoryContext {
  case class HelloWorldState(name: Option[String] = None, message: Option[String] = None)
  var state: HelloWorldState = HelloWorldState()
}

class RuntimeMemoryContext extends Context {

  import RuntimeMemoryContext._

  Given("""^my name is "([^"]*)"\$""") { name: String =>
    state = state.copy(name = Some(name))
  }

  When("""^I pass it to the greeter\$""") { () =>
    val name = state.name.get
    val message = Greeter.greet(name)
    state = state.copy(message = Option(message))
  }

  When("""^I run greeter without a name\$""") { () =>
    val message = Greeter.greet
    state = state.copy(message = Option(message))
  }

  Then("""^the greeter should have returned "([^"]*)"\$""") { expectedMessage: String =>
    val returnedMessage = state.message.get
    returnedMessage shouldBe expectedMessage
  }

}
