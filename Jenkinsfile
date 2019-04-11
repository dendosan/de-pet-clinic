#!groovy
pipeline {
	agent none
	stages {
		stage('Maven Install') {
			agent {
				docker {
					image 'maven:3.6.0-jdk-11-slim'
					args '-v /root/.m2:/root/.m2'
				}
			}
			steps {
				sh 'mvn clean install'
			}
		}
	}
}
