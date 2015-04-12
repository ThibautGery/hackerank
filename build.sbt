name := "hackerank"


scalaVersion := "2.11.5"

version := "3.3.1"

resolvers ++=
  Seq(Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots"),
    Resolver.typesafeRepo("releases"),
    "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases")


libraryDependencies <++= version { version =>
  Seq(
    "org.specs2"      %% "specs2-core"         ,
    "org.specs2"      %% "specs2-matcher-extra",
    "org.specs2"      %% "specs2-scalacheck"   ,
    "org.specs2"      %% "specs2-mock"         ,
    "org.specs2"      %% "specs2-junit"
  ).map(_ % version)
}


logBuffered := false

mainClass in Compile := Some("Runner.Main")
