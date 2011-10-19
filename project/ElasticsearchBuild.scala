import sbt._
import Keys._

object ElasticsearchBuild extends Build
{
  lazy val core = Project("core", file(".")) settings(
    organization:= "com.github.ornicar",
    name := "elasticsearch",
    version := "1.0",
    scalaVersion := "2.9.1",
    libraryDependencies ++= Seq(
      "org.scala-tools.testing" %% "scalacheck" % "1.9",
      "org.scala-tools.testing" % "test-interface" % "0.5",
      "org.scalatest" % "scalatest_2.9.0" % "1.6.1"
    )
  )

  // append -deprecation to the options passed to the Scala compiler
  scalacOptions += "-deprecation"

  scalacOptions += "-unchecked"
}
