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
		stage("build docker artifact") {
			agent any
			steps {
				script {
					def build_image = docker.build("akshayjedhe/myjavaapp:${env.BUILD_ID}","-f=./docker/Dockerfile ./docker/")
				}
				sh label: '', script: 'echo "image: akshayjedhe/myjavaapp:${env.BUILD_ID} build"'
			}
		}
		stage("push the docker artifact") {
			agent any
			steps {
				script {
					docker.withRegistry("https://index.docker.io/v1/","docker-id") {
						 build_image.push()
					}
				}
				sh label: '', script: 'echo "image: akshayjedhe/myjavaapp:${env.BUILD_ID} pushed"'
			}
		}
		
	}
}
