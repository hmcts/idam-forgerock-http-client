lazy val root = (project in file(".")).
  settings(
    organization := "io.swagger",
    name := "swagger-java-client",
    version := "1.0.0",
    scalaVersion := "2.13.13",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.6.13" % "compile",
      "io.github.openfeign" % "feign-core" % "13.2.1" % "compile",
      "io.github.openfeign" % "feign-jackson" % "13.2.1" % "compile",
      "io.github.openfeign" % "feign-slf4j" % "13.2.1" % "compile",
      "io.github.openfeign.form" % "feign-form" % "3.8.0" % "compile",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.16.1" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.16.1" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.16.1" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.16.1" % "compile",
      "org.apache.oltu.oauth2" % "org.apache.oltu.oauth2.client" % "1.0.2" % "compile",
      "com.brsanthu" % "migbase64" % "2.2" % "compile",
      "junit" % "junit" % "4.13.2" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test"
    )
  )
