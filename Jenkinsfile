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

        stage('Docker Image Build'){

            steps{

                script {
                    sh 'docker image build -t $JOB_NAME:v1.$BUILD_ID .'
                    sh 'docker image tag $JOB_NAME:v1.$BUILD_ID bkmd100/$JOB_NAME:v1.$BUILD_ID'
                    sh 'docker image tag $JOB_NAME:v1.$BUILD_ID bkmd100/$JOB_NAME:latest'
                }
            }
        }

        stage('push image to the dockerHUb'){

            steps{

                script{

                   withCredentials([string(credentialsId: 'dockerhub_creds', variable: 'dockerhub_creds')]) {

                        sh 'docker login -u bkmd100 -p ${dockerhub_creds}'
                        sh 'docker image push bkmd100/$JOB_NAME:v1.$BUILD_ID'
                        sh 'docker image push bkmd100/$JOB_NAME:latest'
                 }
                }
            }
        }





    }




}