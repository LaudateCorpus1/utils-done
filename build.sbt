lazy val root = (project in file(".")).settings(
  commonSettings,
  scalaSettings,
  name := "utils-done"
)

lazy val commonSettings = Seq(
  organization := "com.avast.utils2",
  version := sys.env.getOrElse("VERSION", "0.1-SNAPSHOT"),
  description := "Type Done",
  licenses += "MIT" -> url("https://github.com/avast/scala-fp-toolbox/blob/master/LICENSE"),

  publishArtifact in Test := false,

  bintrayOrganization := Some("avast"),
  bintrayPackage := "utils-done",

  pomExtra :=
    <scm>
      <url>git@github.com:avast/utils-done.git</url>
      <connection>scm:git:git@github.com:avast/utils-done.git</connection>
    </scm>
      <developers>
        <developer>
          <id>avast</id>
          <name>Jakub Janecek, Avast Software s.r.o.</name>
          <url>https://www.avast.com</url>
        </developer>
      </developers>
)

lazy val scalaSettings = Seq(
  scalaVersion := "2.12.8",
  crossScalaVersions := List("2.12.8", "2.13.0"),
  scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-Xlint", "-Xfatal-warnings", "-Ywarn-value-discard")
)
