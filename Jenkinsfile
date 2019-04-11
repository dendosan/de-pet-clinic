#!groovy
pipeline {
  // Assign to docker slave(s) label, could also be 'any'
  agent {
    label 'docker'
  }
  stages {
		stage('Maven Install') {
			agent {
				docker {
          // Set both label and image
          label 'docker'
					image 'maven:3-alpine'
					args '-v /root/.m2:/root/.m2'
				}
			}
			steps {
				sh 'mvn clean install'
			}
		}
	}
}
