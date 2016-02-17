
organization := "com.github.ellbur"

name := "a-js"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

enablePlugins(ScalaJSPlugin)

scalaSource in Compile <<= baseDirectory(_ / "src")

