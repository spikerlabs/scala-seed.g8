package example

object Greeter {
  lazy val greet: String = "Hello!"
  def greet(name: String): String = s"Hello, \$name!"
}
