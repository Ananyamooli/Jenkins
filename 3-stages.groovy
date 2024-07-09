pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                echo "buliding the stage"
                sh 'hostname -i'
            }

        }
    }
}