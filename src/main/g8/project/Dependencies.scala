import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "$scalacheck_version$" % Test
  lazy val cucumber = Seq(
    "io.cucumber" % "cucumber-core",
    "io.cucumber" %% "cucumber-scala",
    "io.cucumber" % "cucumber-jvm",
    "io.cucumber" % "cucumber-junit",
  ).map(_ % "$cucumber_version$" % Test)
}
