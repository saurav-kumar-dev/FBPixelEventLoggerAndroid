pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                git branch: 'main', url: 'https://github.com/saurav-kumar-dev/FBPixelEventLoggerAndroid.git'
            }
        }

        stage('Build APK') {
            steps {
                echo 'Building APK using Gradle wrapper...'
                bat 'gradlew.bat clean assembleDebug'
            }
        }

        stage('Archive APK') {
            steps {
                echo 'Archiving APK...'
                archiveArtifacts artifacts: '*/build/outputs/apk/debug/.apk', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
