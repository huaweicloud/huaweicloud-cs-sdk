name := "cs-tool"
organization := "com.huaweicloud"
version := "0.1"
scalaVersion := "2.12.7"

val root = (project in file(".")).enablePlugins(JavaServerAppPackaging, RpmPlugin, SystemVPlugin, JDKPackagerPlugin)
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

lazy val iconGlob = sys.props("os.name").toLowerCase match {
  case os if os.contains("mac") => "*.icns"
  case os if os.contains("win") => "*.ico"
  case _ => "*.png"
}

jdkAppIcon := (sourceDirectory.value ** iconGlob).getPaths.headOption.map(file)

jdkPackagerType := "exe"

jdkPackagerJVMArgs := Seq("-Xmx1g")

jdkPackagerProperties := Map("app.name" -> name.value, "app.version" -> version.value)

jdkPackagerAppArgs := Seq(maintainer.value, packageSummary.value, packageDescription.value)

//jdkPackagerAssociations := Seq(
//  FileAssociation("foobar", "application/foobar", "Foobar file type"),
//  FileAssociation("barbaz", "application/barbaz", "Barbaz file type", jdkAppIcon.value)
//)

// Example of specifying a fallback location of `ant-javafx.jar` if plugin can't find it.
(antPackagerTasks in JDKPackager) := (antPackagerTasks in JDKPackager).value orElse {
  for {
    f <- Some(file(sys.props("java.name") + "/lib/ant-javafx.jar")) if f.exists()
  } yield f
}

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions += "-target:jvm-1.8"