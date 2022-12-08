pipeline{

    agent any

    stages {

        stage('Git Checkout'){

            steps{

                script{

                    git branch: 'eya', url: 'https://github.com/eya-abid/Veterinary_Clinic.git'
                }
            }
        }
        stage('UNIT testing'){

            steps{

                script{

                    sh 'mvn test'
                }
            }
        }
        stage('Static code analysis'){

            steps{

                script{

                    withSonarQubeEnv(credentialsId: 'sonar-api') {

                        sh 'mvn clean package sonar:sonar'
                    }
                   }

                }
            }
            stage('Quality Gate Status'){

                steps{

                    script{

                        waitForQualityGate abortPipeline: false, credentialsId: 'sonar-api'
                    }
                }
            }
        }

}