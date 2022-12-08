pipeline {
	agent any
	stages{
		stage('Git Checkout'){
			steps{
				git branch: 'eya', url: 'https://github.com/eya-abid/Veterinary_Clinic.git'
			}
		}
		stage('Unit Testing'){
        			steps{
        				sh 'mvn test'
        			}
        		}
        stage('Integration Testing'){
                			steps{
                				sh 'mvn verify -DskiUnitTests'
                			}
                        }
        stage('Maven Build'){
           steps {
            sh 'mvn clean install'
           }
        }
	}
}}