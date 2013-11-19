import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "play-japid-template"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "japid42" % "japid42_2.10" % "0.9.14.1"
    )

      val main = play.Project(appName, appVersion, appDependencies).settings(

         resolvers += Resolver.url("Japid on Github", url("http://branaway.github.io/releases/"))(Resolver.ivyStylePatterns)
                      ,ebeanEnabled := false


      )

}
