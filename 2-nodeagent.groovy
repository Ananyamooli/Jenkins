pipeline {
    agent none 
    stages {
        stage ("build") {
            agent {
                node {
                    label 'java-slave'
                    customWorkspace "/home/anu/customwork"
                }
            }
        steps {
            echo "hello!!!"
            sh 'cat anu.txt'
        }
        }
    }
    }
