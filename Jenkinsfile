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

        stage('Debug APK Path') {
            steps {
                echo 'Listing APK path for verification...'
                bat 'dir /s /b app\\build\\outputs\\apk\\debug'
            }
        }

        stage('Archive APK') {
            steps {
                echo 'Archiving APK...'
                archiveArtifacts artifacts: 'app/build/outputs/apk/debug/app-debug.apk', fingerprint: true
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
