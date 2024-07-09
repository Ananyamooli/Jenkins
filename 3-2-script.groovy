pipeline {
    agent any
    stages {
        stage ('build stage') {
            steps {
                echo "building the build stage"
                sh 'hostname -i'
            }
        }
        stage ('groovy stage') {
            steps {
                 echo "Building the groovy stage"
                script {
                    def course = "Devops"
                    if (course == "Devops")
                     println ("Thanks for enrolling to ${course}")
                      else
                       println ("Do learn ${course}")
                }
            }
        }
    }
}