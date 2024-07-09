pipeline {
    agent any 
    stages {
        stage ('Build') {
            steps {
                retry(2) {
                    echo "welcome to jenkins pipeline"
                    error "testing the retry block"
                }
                 echo "after 2 retry"
            }
        }
    }
}