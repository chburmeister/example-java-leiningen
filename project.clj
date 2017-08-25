(defproject eu.christophburmeister.playground/spring-boot-example "0.0.1-SNAPSHOT"
  :description "spring-boot-sample project"
  :url "http://christoph-burmeister.eu"
  :min-lein-version "2.0.0"
  :plugins [
	[lein-pprint "1.1.1"]
	]
  :dependencies [
	[org.springframework.boot/spring-boot-starter-web "1.5.6.RELEASE"]
	[org.springframework.boot/spring-boot-starter-parent "1.5.6.RELEASE" :extension "pom"]
	]
  :repositories [["repo1" "http://repo1.maven.org/maven2"]]

  :java-source-paths ["src/main/java"]
  :resource-paths ["src/main/resources"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  :main eu.christophburmeister.playground.Application
  :jar-name "spring-boot-example.jar"
  :uberjar-name "spring-boot-example-standalone.jar"
  :auto-clean true
)
