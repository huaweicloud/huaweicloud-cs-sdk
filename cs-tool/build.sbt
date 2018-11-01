name := "cs-tool"
organization := "com.huaweicloud"
version := "0.1"
scalaVersion := "2.12.7"

val root = (project in file(".")).enablePlugins(JavaServerAppPackaging, RpmPlugin, SystemVPlugin)
libraryDependencies ++= Seq(
  "com.huaweicloud.dis" % "huaweicloud-sdk-java-dis" % "1.3.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)


//**************************************************************************//

//  RPM package build configuration
rpmVendor := "HuaweiCloud"
packageName in Rpm := "cs-tool"
version in Rpm := version.value
rpmRelease := "1"
packageArchitecture in Rpm := "x86_64"
packageSummary in Rpm := "CloudStream Producer"
packageDescription in Rpm := "csproducer is a example tool for sending local sample data to HuaweiCloud DIS, and then consumed by CloudStream Service."
rpmUrl := Some("https://github.com/huaweicloud/huaweicloud-cs-sdk")
rpmLicense := Some("Apache V2")

//**************************************************************************//

// main class
mainClass in Compile := Some("com.huaweicloud.cs.tool.ProducerToolMain")


javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions += "-target:jvm-1.8"