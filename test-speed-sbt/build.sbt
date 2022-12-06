ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.13"

lazy val root = (project in file("."))
  .settings(
    name := "test-speed-sbt"
  )

libraryDependencies += "org.specs2" %% "specs2-core" % "4.16.1" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")