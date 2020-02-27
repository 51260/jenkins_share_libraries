def call(Map config=[:], Closure body={}) {
    stage("OWASP DC") {
    dependencycheck additionalArguments: ''' 
    -o "./" 
    -s "./"
    -f "ALL" 
    --prettyPrint''', odcInstallation: 'OWASP-DC'
    dependencyCheckPublisher pattern: 'dependency-check-report.xml',failedTotalCritical: 3,unstableTotalCritical: 3
    }
    body()
}
