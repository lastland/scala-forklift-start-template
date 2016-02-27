// uncomment this to enable snapshot versions
//resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.1.1"
  ,"com.typesafe.slick" %% "slick-codegen" % "3.1.1"
  ,"com.typesafe.slick" %% "slick-hikaricp" % "3.1.1"
  ,"org.scala-lang" % "scala-compiler" % "2.11.7"
  ,"com.h2database" % "h2" % "1.4.190"
  ,"com.liyaos" %% "scala-forklift-slick" % "0.2.1"
)
