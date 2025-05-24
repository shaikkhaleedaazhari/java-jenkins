pipeline {
    agent any

    stages {
        stage("Maven Install") {
            when {
                branch 'feature'
            }
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
    }
}

