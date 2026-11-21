pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Code checked out from GitHub successfully!'
            }
        }
        stage('Build') {
            steps {
                sh 'echo "Building the project..."'
                sh 'ls -la'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Running automated checks..."'
                sh 'test -f README.md && echo "README.md exists - Test Passed!"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploying build #$BUILD_NUMBER..."'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline completed successfully!'
        }
        failure {
            echo 'CI/CD Pipeline failed!'
        }
    }
}
