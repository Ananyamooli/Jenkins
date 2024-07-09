pipeline {
    agent any 
        stages {
            stage ('build') {
                steps {
                    timeout (time:5, unit:'SECONDS') {
                        echo "sleeping for 20 seconds"
                        sleep 20
                    }
            }
        }
    }
}