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







        }




}