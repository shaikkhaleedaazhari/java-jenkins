pipeline{

    agent any

        stages{

           

            stage('docker build and push'){

                steps{

                    script{

                        sh 'docker build -t shaikkhaleedaazhari/java-jen .'

                        withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'pass_word', usernameVariable: 'user_name')]) {

    sh 'docker login -u "$user_name" -p "$pass_word" '

}

                        sh 'docker push shaikkhaleedaazhari/java-jen'

                    }

                }

            }

       

              

        }

    }

 
