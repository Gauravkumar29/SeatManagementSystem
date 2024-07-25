pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and JDK configured as "JDK11" in Jenkins
        maven "M3"
        jdk "JDK11"
    }

    environment {
        // Set up any necessary environment variables
        MVN_HOME = tool name: 'M3', type: 'maven'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/your-username/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                // Run the Maven build
                sh "${MVN_HOME}/bin/mvn clean install"
            }
        }
        stage('Test') {
            steps {
                // Run the Maven tests
                sh "${MVN_HOME}/bin/mvn test"
            }
        }
        stage('Archive') {
            steps {
                // Archive the built artifacts
                archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            // Clean up the workspace after the build
            cleanWs()
        }
        success {
            // Notify the success
            echo 'Build and tests succeeded.'
        }
        failure {
            // Notify the failure
            echo 'Build or tests failed.'
        }
    }
}
