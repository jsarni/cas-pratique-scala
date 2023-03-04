scalaVersion := "2.13.10"

name := "cas-pratique-scala"

version := "1.0.0"

organization := "io.github.jsarni"
homepage := Some(url("https://github.com/jsarni/cas-pratique-scala"))

// Dependencies
val scalaTest = "org.scalatest" %% "scalatest" % "3.2.7" % Test

lazy val casPratiqueScala = (project in file("."))
  .settings(
    libraryDependencies += scalaTest
  )