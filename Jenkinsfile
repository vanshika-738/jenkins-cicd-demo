pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo "Compiling Java application and tests..."'
                sh 'javac Calculator.java CalculatorTest.java'
            }
        }
        stage('Automated Test') {
            steps {
                sh 'echo "Running automated unit tests..."'
                sh 'java CalculatorTest'
            }
        }
        stage('Package Artifact') {
            steps {
                sh 'echo "Packaging executable JAR artifact..."'
                sh 'jar cfe calculator-app.jar Calculator Calculator.class'
                archiveArtifacts artifacts: 'calculator-app.jar', fingerprint: true
            }
        }
        stage('Deploy & Smoke Test') {
            steps {
                sh 'echo "Deploying artifact to target environment..."'
                sh 'mkdir -p /var/jenkins_home/deployed_app'
                sh 'cp calculator-app.jar /var/jenkins_home/deployed_app/'
                sh 'echo "Running post-deployment smoke test..."'
                sh 'java -jar /var/jenkins_home/deployed_app/calculator-app.jar'
            }
        }
    }

    post {
        success {
            echo 'Build, Automated Tests, Packaging, and Deployment ALL SUCCEEDED!'
        }
        failure {
            echo 'Pipeline FAILED! Deployment was blocked by the Quality Gate.'
        }
    }
}
