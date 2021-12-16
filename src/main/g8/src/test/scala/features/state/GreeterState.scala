package features.state

trait GreeterState:

  def name(newName: String): Unit
  def name: Option[String]

  def message(newMessage: String): Unit
  def message: Option[String]