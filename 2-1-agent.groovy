pipeline {
    agent {
        label 'java-slave'
    }
    stages {
        stage ("Build") {
            steps {
               echo "helloworld!!!!!!!!"
            }
            
        }
    }
}