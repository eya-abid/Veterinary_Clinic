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

						stage('Upload war file to nexus'){
                            steps {
                            script{

                            		nexusArtifactUploader artifacts: [
                            			[
                            			    artifactId: 'spring-boot-starter-parent',
                            				classifier: '',
                            				file: 'target/demo.jar',
                            				type: 'jar']
                            				],
                            				credentialsId: '',
                            				groupId: 'com.example',
                            				nexusUrl: 'localhost:8081',
                            				nexusVersion: 'nexus3',
                            				protocol: 'http',
                            				repository: 'demo',
                            				version: '0.0.1-SNAPSHOT'
                            							}
                            }

						}

        }

}