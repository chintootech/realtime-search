name := "realtime-search"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  ws,
  "org.elasticsearch" % "elasticsearch" % "0.90.1",
  "commons-io" % "commons-io" % "2.4",
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars" % "angularjs" % "1.4.7",
  "org.webjars" % "bootstrap" % "3.3.5"
)

fork in run := true