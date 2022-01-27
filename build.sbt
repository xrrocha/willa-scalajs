val scala3Version = "3.1.1"

testFrameworks += new TestFramework("utest.runner.Framework")

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "willa-scalajs",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    scalaJSUseMainModuleInitializer := true,
    // mainClass in Compile := Some(Main)

    libraryDependencies ++= Seq(
        "com.lihaoyi" %%% "utest" % "0.7.10" % "test"
    )
  )
