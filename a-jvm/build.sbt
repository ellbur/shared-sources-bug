
organization := "com.github.ellbur"

name := "a-jvm"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

scalaSource in Compile <<= baseDirectory(_ / "src")

