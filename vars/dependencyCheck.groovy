def call() {
    sh 'mvn dependency-check:check'
    dependencyCheckPublisher pattern: 'dependency-check-report.xml'
    }
