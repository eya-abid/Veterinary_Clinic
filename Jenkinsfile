pipeline{

    agent any

    stages {

        stage('Git Checkout'){

            steps{

                script{

                   git branch: 'achraf', url: 'https://github.com/eya-abid/Veterinary_Clinic.git'
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

        stage('Integration testing'){

            steps{

                script{

                    sh 'mvn verify -DskipUnitTests'
                }
            }
        }
        stage('Maven build'){

            steps{

                script{

                    sh 'mvn clean install'
                }
            }
        }



        stage('Static code analysis'){

            steps{

                script{

                    withSonarQubeEnv(credentialsId: 'dd') {


                        sh 'mvn clean package sonar:sonar'
                    }
                   }

                }
            }




        stage('Quality Gate Status'){

            steps{

                script{

                    waitForQualityGate abortPipeline: false, credentialsId: 'dd'
                }
            }
        }

        stage('upload jar file to nexus'){

            steps{

                script{

                  nexusArtifactUploader artifacts:
                   [                   [
                       artifactId: 'demo',
                        classifier: '', file:
                        'target/demo.jar',
                         type: 'jar'
                   ]]  ,
                    credentialsId: 'nexus-auth',
                        groupId: 'com.example',
                         nexusUrl: 'localhost:8081',
                          nexusVersion: 'nexus3',
                           protocol: 'http',
                            repository: 'vet-release',
                             version: '0.0.3'
                }
            }
        }









    }




}