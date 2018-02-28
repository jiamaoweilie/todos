pipeline {
  agent any
  stages {
    stage('test') {
      parallel {
        stage('test') {
          steps {
            sh 'echo "Testing"'
          }
        }
        stage('TES1') {
          steps {
            sh 'echo "Testing"'
          }
        }
      }
    }
  }
}