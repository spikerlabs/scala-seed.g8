package features.state

trait GreeterState {

  def name(newName: String)
  def name: Option[String]

  def message(newMessage: String)
  def message: Option[String]

}
