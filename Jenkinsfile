pipeline {
  agent any
  stages {
    stage('Test 2') {
      parallel {
        stage('Test 2') {
          steps {
            sh 'echo "hello"'
          }
        }
        stage('Test 3 ') {
          steps {
            sh 'echo "hello"'
          }
        }
      }
    }
    stage('Test 1') {
      steps {
        sh 'echo "hello"'
      }
    }
  }
}