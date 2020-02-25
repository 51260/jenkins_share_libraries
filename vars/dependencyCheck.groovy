  
def call() {
     dependencyCheck additionalArguments: -o "./" -s "./" -f "ALL" --prettyPrint''', odcInstallation: 'OWASP-DC'
    dependencyCheckPublisher pattern: 'dependency-check-report.xml'
    }
