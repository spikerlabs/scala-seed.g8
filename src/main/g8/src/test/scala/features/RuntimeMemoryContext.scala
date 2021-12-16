package features

import features.state.GreeterState
import features.steps.GreeterSteps

class RuntimeMemoryContext extends GreeterSteps:

  val state = new GreeterState:

    private var maybeName: Option[String] = None;
    def name(newName: String) = this.maybeName = Some(newName)
    def name: Option[String] = this.maybeName

    private var maybeMessage: Option[String] = None;
    def message(newMessage: String) = this.maybeMessage = Some(newMessage)
    def message: Option[String] = this.maybeMessage
