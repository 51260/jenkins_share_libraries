  
def call() {
     dependencyCheck
    dependencyCheckPublisher pattern: 'dependency-check-report.xml'
    }
