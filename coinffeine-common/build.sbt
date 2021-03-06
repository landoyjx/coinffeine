name := "Coinffeine Common"

ScoverageKeys.excludedPackages in ScoverageCompile :=
  "scalaxb;soapenvelope11;.*generated.*;.*protobuf.*"

libraryDependencies ++= Dependencies.akka ++ Seq(
  Dependencies.bitcoinj,
  Dependencies.h2 % "test",
  Dependencies.dispatch,
  Dependencies.jodaConvert,
  Dependencies.netty,
  Dependencies.protobufRpc,
  Dependencies.reflections % "test"
)
