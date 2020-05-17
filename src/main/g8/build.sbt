import Dependencies._

lazy val root = (project in file(".")).
  enablePlugins(CucumberPlugin).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scala_version$",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "$name$"
  )
  // test dependencies
  .settings(
    libraryDependencies ++= bdd,
    libraryDependencies ++= tdd,
    CucumberPlugin.monochrome := false,
    CucumberPlugin.glues := List("classpath:features"),
    CucumberPlugin.features := List("classpath:features"),
    CucumberPlugin.mainClass := "io.cucumber.core.cli.Main"
  )
