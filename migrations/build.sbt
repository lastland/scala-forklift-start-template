// uncomment this to enable snapshot versions
//resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= List(
  "com.liyaos" %% "scala-forklift-slick" % "0.2.1"
  ,"com.typesafe.slick" %% "slick-hikaricp" % "3.1.1"
  ,"com.h2database" % "h2" % "1.4.190"
)
