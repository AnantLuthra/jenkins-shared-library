#!/user/bin/env groovy

def call() {
    echo "Building the application by shared function ..."
    sh 'mvn package'
}