pipeline {
    agent {
        label 'java-slave'
    }
    stages {
        stage ("BUILD") {
            echo "helloworld !!!"
        }
    }
}