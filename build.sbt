val scala3Version = "3.1.3"

inThisBuild(
  List(
    semanticdbEnabled := true
  )
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    scalacOptions += "-Xcheck-macros",

  )
