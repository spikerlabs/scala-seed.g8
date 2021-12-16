import Dependencies._

lazy val root = (project in file("."))
  .enablePlugins(CucumberPlugin)
  .settings(
    inThisBuild(
      List(
        organization := "$organization$",
        scalaVersion := "$scala_version$",
        version := "0.1.0-SNAPSHOT"
      )
    ),
    name := "$name$"
  )
  // test dependencies
  .settings(
    libraryDependencies ++= bdd,
    libraryDependencies ++= tdd,
    CucumberPlugin.monochrome := false,
    CucumberPlugin.glues := List("classpath:features"),
    CucumberPlugin.features := List("classpath:features"),
    CucumberPlugin.mainClass := "io.cucumber.core.cli.Main",
    CucumberPlugin.envProperties := Map(
      "CUCUMBER_PLUGINS" -> "json:target/cucumber/report.json,html:target/cucumber/report.html"
    ),
    CucumberPlugin.plugin := {
      import com.waioeka.sbt.Plugin._
      val cucumberDir = CucumberPlugin.cucumberTestReports.value
      List(
        PrettyPlugin,
        HtmlPlugin(new File(cucumberDir, "cucumber.html")),
        JsonPlugin(new File(cucumberDir, "cucumber.json")),
        JunitPlugin(new File(cucumberDir, "junit-report.xml"))
      )
    }
  )
