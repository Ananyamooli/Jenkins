pipeline {
    agent any 
    stages {
        stage ('build') {
            steps {
                echo 'hello build'
            }
        }
        stage ('groovy stage') {
            steps {
                script {
                    def course = "k8s"
                    if (course == "k8s")
                       println ("Thanks for enrolling k8s")
                    else 
                       println ("Do learn k8s")   
                }
            }
        }
    }
}