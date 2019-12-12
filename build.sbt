name := "QuadSetTimer"

version := "0.1"

scalaVersion := "2.13.1"

enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
