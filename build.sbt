name := "Quad Set Timer"

version := "0.1"

scalaVersion := "2.12.8"

lazy val CirceVersion = "0.11.0" // Options and java-8 modules are preventing me from further upgrades

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
