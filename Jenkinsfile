pipeline {
	agent none
	stages {
		stage("build java artifact") {
			agent {
				docker {
    					image 'maven:3.5.3-alpine'	
				}
			}
			steps {
				sh label: '', script: 'mvn package'	
			}	
		}
		stage("build  docker artifact") {
			agent any
			steps {
				script {
					 image =  docker.build("akshayjedhe/myjavaapp:${env.BUILD_ID}","-f=./docker/Dockerfile ./docker/") 
				}	
			}
		}
		stage("push docker artifact") {
			agent any
			steps {
				script {
					docker.withRegistry("https://index.docker.io/v1/","docker-id") {
                                                image.push("${env.BUILD_ID}")
                                        }
				}
			}
		}
	}
}
