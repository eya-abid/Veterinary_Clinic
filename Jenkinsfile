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
	}
}