lazy val root = (project in file(".")).settings(
  name := "scala-bdd-seed.g8",
  test in Test := {
    val _ = (g8Test in Test).toTask("").value
  },
  scriptedLaunchOpts ++= List(
    "-Xms1024m",
    "-Xmx1024m",
    "-XX:ReservedCodeCacheSize=128m",
    "-Xss2m",
    "-Dfile.encoding=UTF-8"
  ),
  scriptedBufferLog := false,
  logLevel := Level.Info,
  resolvers += Resolver.url(
    "typesafe",
    url("https://repo.typesafe.com/typesafe/ivy-releases/")
  )(Resolver.ivyStylePatterns)
)
