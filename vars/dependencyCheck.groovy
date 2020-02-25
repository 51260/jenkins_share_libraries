  
def call(Map stageParams) {
     dependencyCheck additionalArguments: ''' 
        -o "./" 
        -s "./"
        -f "ALL" 
        --prettyPrint''', odcInstallation: 'OWASP-DC'

    dependencyCheckPublisher pattern: 'dependency-check-report.xml'
    }
