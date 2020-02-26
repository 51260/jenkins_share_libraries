def call(Map config=[:], Closure body={}) {
    stage("SonarQube Code Analysis") {            
        sh "mvn sonar:sonar"         
        echo "SONARQUBE ANALYSIS DONE"
    }
    body()
}
