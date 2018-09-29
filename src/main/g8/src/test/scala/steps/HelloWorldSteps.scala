package steps

import example.Greeter
import steps.StatefulSteps._

class HelloWorldSteps extends StatefulSteps[HelloWorldState] {

  var state: HelloWorldState = HelloWorldState()

  Given("""^my name is "([^"]*)"$""") { name: String =>
    state = state.copy(name = Some(name))
  }

  When("""^I pass it to the greeter$""") { () =>
    val name = state.name.get
    val message = Greeter.greet(name)
    state = state.copy(message = Option(message))
  }

  Then("""^the greeter should have returned "([^"]*)"$""") { expectedMessage: String =>
    val returnedMessage = state.message.get
    returnedMessage shouldBe expectedMessage
  }

}
