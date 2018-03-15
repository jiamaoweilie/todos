pipeline {
  agent any
  stages {
    stage('Test 2') {
      parallel {
        stage('Test 2') {
          steps {
            sh 'echo "hello"'
            sh 'echo "hello world"'
          }
        }
        stage('Test 3 ') {
          steps {
            sh 'echo "hello"'
            input 'aaaa'
          }
        }
      }
    }
    stage('Test 1') {
      steps {
        sh 'echo "hello"'
        sleep 1
      }
    }
    stage('Test 4') {
      parallel {
        stage('Test 4') {
          steps {
            sleep 2
          }
        }
        stage('Test 5') {
          steps {
            sh 'echo "testing 111"'
          }
        }
      }
    }
    stage('Test 6') {
      steps {
        echo 'hello world'
      }
    }
  }
}