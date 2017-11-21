name := """stu_manage"""
organization := "stu.manage.com"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.39"
