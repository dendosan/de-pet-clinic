#!groovy
pipeline {
  agent { dockerfile true }
  stages {
		stage('Maven Install') {
			steps {
				sh 'mvn clean install'
			}
		}
	}
}
