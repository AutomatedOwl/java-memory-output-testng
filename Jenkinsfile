pipeline {
    agent {
        kubernetes {
            label "jenkins-prod-jenkins-slave"
        }
    }
    stages {
        /*
        stage('Git Status') {
            steps {
                sh 'git status'
                echo 'Received Git Status.'
            }
        }*/
        stage("Prerequisites") {
            steps {
                container('automation-slave') {
                    sh """
                       apt-get -y update && apt-get -y install maven git
                    """
                }
            }
        }
        stage("Build Default") {
            steps {
                container('automation-slave') {
                    sh "mvn test"
                }
            }
        }
    }
    post {
        always {
            script {
                allure([
                        includeProperties: false,
                        jdk              : '',
                        properties       : [],
                        reportBuildPolicy: 'ALWAYS',
                        results          : [[path: 'target/allure-results']]
                ])
            }
        }
    }
}
