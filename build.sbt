lazy val proj = project.in(file("."))
  .settings(
    scalaVersion := "2.13.12",
    scalacOptions += "-Vimplicits",
  )
