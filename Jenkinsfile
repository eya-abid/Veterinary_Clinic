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

                    bash 'mvn test'
                }
            }
        }
        stage('Maven build'){

            steps{

                script{

                    bash 'mvn clean install'
                }
            }
        }
        stage('Static code analysis'){

            steps{

                script{

                    withSonarQubeEnv(credentialsId: 'sonar-api') {

                        bash 'mvn clean package sonar:sonar'
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