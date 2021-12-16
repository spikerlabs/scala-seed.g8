import sbt._

object Dependencies {
  lazy val tdd = Seq(
    "org.scalatest" %% "scalatest" % "$scalatest_version$",
    "org.scalatestplus" %% "scalacheck-1-15" % "$scalatest_scalacheck_version$",
    "org.scalacheck" %% "scalacheck" % "$scalacheck_version$"
  ).map(_ % Test)
  lazy val bdd = Seq(
    "io.cucumber" % "cucumber-core",
    "io.cucumber" %% "cucumber-scala",
    "io.cucumber" % "cucumber-jvm",
    "io.cucumber" % "cucumber-junit",
  ).map(_ % "$cucumber_version$" % Test)
}
