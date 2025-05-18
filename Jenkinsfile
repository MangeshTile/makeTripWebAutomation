pipeline {
    agent any

    tools {
        maven 'Maven-3.9.6'   // The name you gave in Global Tool Config
        jdk 'JDK-17'          // The name you gave for JDK
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/MangeshTile/makeTripWebAutomation.git', branch: 'MAIN'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test Report') {
            steps {
                junit 'test-output/testng-results.xml'
            }
        }
    }
}
