package br.net.carloseugenio.gradle.tomcat

import org.gradle.api.Project

class TomcatExtension {

	String server = "localhost"
	Integer port = 8080
	String user = "tomcat"
	String password = "tomcat"
	File contextFile
	String baseDir = "build/"
	List<String> runtimePaths = ["classes/java/main", "classes/groovy/main", "classes/groovy/generated", "resources/main"]

	TomcatExtension(Project project) {

	}

}
