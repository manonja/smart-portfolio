name := "smart-portfolio"
organization in ThisBuild := "org.smartportfolio"
scalaVersion in ThisBuild := "2.12.8"


lazy val root = (project in file("."))
  .settings(settings)
  .aggregate(server)//, client)

lazy val server = (project in file("server"))

//lazy val client = (project in file("client"))

